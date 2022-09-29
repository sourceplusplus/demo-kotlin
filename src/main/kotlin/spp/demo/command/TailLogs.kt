package spp.demo.command

import org.slf4j.LoggerFactory

/**
 * This class is used to demonstrate the `Tail Logs` command.
 *
 * **Usage:**
 * Open the Source++ Command Palette with `Ctrl+Shift+S` and search for `Tail Logs`.
 *
 * **Command source code:**
 * [Tail Logs](https://github.com/sourceplusplus/jetbrains-commander/blob/master/resources/.spp/plugins/tail-logs/plugin.kts)
 */
class TailLogs {

    private val log = LoggerFactory.getLogger(TailLogs::class.java)

    /**
     * Execute the `Tail Logs` command with your cursor on line 22 to see logs for this whole class.
     */
    fun tailClassLogs() {
        Math.random()
    }

    /**
     * Execute the `Tail Logs` command with your cursor on line 29 to see logs for this whole method.
     */
    fun tailMethodLogs() {
        val randomNumber1 = Math.random()
        val randomNumber2 = Math.random()
        log.info("Tailing method logs. First random number: {}", randomNumber1)
        log.info("Tailing method logs. Second random number: {}", randomNumber2)
    }

    /**
     * Execute the `Tail Logs` command with your cursor on line 40 to see logs for that specific statement.
     */
    fun tailStatementLogs() {
        val randomNumber = Math.random()
        log.info("Tailing statement logs. Random number: {}", randomNumber)
    }
}
