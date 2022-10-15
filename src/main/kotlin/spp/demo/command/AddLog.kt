package spp.demo.command

import org.slf4j.LoggerFactory
import java.util.concurrent.ThreadLocalRandom

/**
 *
 * This class is used to demonstrate the `Add Log` command.
 *
 * **Usage:**
 * Open the Source++ Command Palette with `Ctrl+Shift+S` and search for `Add Log`.
 *
 * **Command source code:**
 * [Add Log](https://github.com/sourceplusplus/jetbrains-commander/blob/master/resources/.spp/plugins/add-log/plugin.kts)
 *
 */
class AddLog {

    companion object {
        private val log = LoggerFactory.getLogger(AddLog::class.java)
    }

    /**
     * Execute the **Add Log** command with your cursor on line 34 to set up a live log
     * **before** the execution of that line. This will open the log configuration inlay. This inlay
     * allows you to input a new log message to output. You can use the "$" symbol to reference
     * variables in the current scope. You can also use the "Ctrl+Space" shortcut to see a list of
     * available variables. Try outputting the following message:<br></br>
     * **Random number: $randomNumber - Even: $isEven**
     */
    fun simpleLog() {
        val randomNumber = ThreadLocalRandom.current().nextInt()
        val isEven = randomNumber % 2 == 0
    }

    /**
     * The **Add Log** command can also be used with the **Tail Logs** command. Execute the
     * **Tail Logs** command with your cursor between or on lines 42-44. Then execute the
     * **Add Log** command with your cursor on line 45. Try outputting the following message:<br></br>
     * **And is even: $isEven**
     */
    fun simpleLogWithTailLogs() {
        val randomNumber = ThreadLocalRandom.current().nextInt()
        val isEven = randomNumber % 2 == 0
        log.info("Random number: {}", randomNumber)
    }
}