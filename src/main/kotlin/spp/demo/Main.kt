package spp.demo

import spp.demo.command.TailLogs

object Main {
    private val tailLogs = TailLogs()

    @JvmStatic
    fun main(args: Array<String>) {
        while (true) {
            executeDemos()
            Thread.sleep(1000)
        }
    }

    private fun executeDemos() {
        triggerTailLogs()
    }

    private fun triggerTailLogs() {
        tailLogs.tailClassLogs()
        tailLogs.tailMethodLogs()
        tailLogs.tailStatementLogs()
    }
}
