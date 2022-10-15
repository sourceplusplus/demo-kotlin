package spp.demo.indicator

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

/**
 * This class is used to demonstrate the `Slow Endpoint` indicator. This indicator will be automatically added to
 * endpoints with the highest response times and is visible in the gutter to the left of the editor.
 *
 * **Usage:**
 * N/A (automatically added)
 *
 * **Indicator source code:**
 * [Slow Endpoint](https://github.com/sourceplusplus/jetbrains-commander/blob/master/resources/.spp/plugins/slow-endpoint/plugin.kts)
 */
@Controller("/indicator")
class SlowEndpoint {

    /**
     * Hover your mouse over the turtle icon on line 24 to see the response time (~2000ms).
     */
    @Get("/slow-2000ms")
    fun slow2000ms(): HttpResponse<Void> {
        try {
            Thread.sleep(2000)
        } catch (ignore: InterruptedException) {
        }
        return HttpResponse.ok()
    }

    /**
     * Hover your mouse over the turtle icon on line 36 to see the response time (~1000ms).
     */
    @Get("/slow-1000ms")
    fun slow1000ms(): HttpResponse<Void> {
        try {
            Thread.sleep(1000)
        } catch (ignore: InterruptedException) {
        }
        return HttpResponse.ok()
    }
}
