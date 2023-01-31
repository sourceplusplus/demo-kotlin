package spp.demo

import io.micronaut.runtime.Micronaut
import spp.demo.command.AddBreakpoint
import spp.demo.command.AddLog
import spp.demo.command.TailLogs
import java.net.URL
import java.util.concurrent.Executor
import java.util.concurrent.Executors

object Main {

    private val executor: Executor = Executors.newCachedThreadPool()

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.run(Main::class.java, *args)

        while (true) {
            executeDemos()
            Thread.sleep(1000)
        }
    }

    private fun executeDemos() {
        triggerAddBreakpoint()
        triggerAddLog()
        triggerTailLogs()
        triggerEndpoints()
    }

    private fun triggerAddBreakpoint() {
        AddBreakpoint().apply {
            simpleBreakpoint()
            breakpointWithRedactedData()
        }
    }

    private fun triggerAddLog() {
        val addLog = AddLog()
        addLog.simpleLog()
        addLog.simpleLogWithTailLogs()
    }

    private fun triggerTailLogs() {
        val tailLogs = TailLogs()
        tailLogs.tailClassLogs()
        tailLogs.tailMethodLogs()
        tailLogs.tailStatementLogs()
    }

    private fun triggerEndpoints() {
        //view activity command
        callEndpoint("/command/view-activity")

        //view traces command
        callEndpoint("/command/view-traces")

        //failing endpoint indicator
        callEndpoint("/indicator/fail-100-percent")
        callEndpoint("/indicator/fail-50-percent")

        //slow endpoint indicator
        callEndpoint("/indicator/slow-2000ms")
        callEndpoint("/indicator/slow-1000ms")

        //high load endpoint indicator
        for (i in 0..3) {
            callEndpoint("/indicator/high-load-four-per-second")
        }
        for (i in 0..1) {
            callEndpoint("/indicator/high-load-two-per-second")
        }
    }

    private fun callEndpoint(endpoint: String) {
        executor.execute {
            try {
                URL("http://localhost:8080$endpoint").openStream().close()
            } catch (ignore: Exception) {
            }
        }
    }
}
