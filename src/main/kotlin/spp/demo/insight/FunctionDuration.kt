package spp.demo.insight

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

/**
 * This class is used to demonstrate the `Function Duration` insight.
 *
 * Add modifications to the `slowFunction` and `fastFunction` functions below. The function duration
 * insight will show the predicted duration of the modified code compared to the deployed code.
 *
 * Supported control flow structures: function calls, counting loops, & literal branching
 */
@Controller("/insight")
class FunctionDuration {

    @Get("/slow-function")
    fun slowFunction() {
        Thread.sleep(500)
    }

    @Get("/fast-function")
    fun fastFunction() {
        Thread.sleep(5)
    }
}
