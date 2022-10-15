package spp.demo.indicator

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

/**
 * This class is used to demonstrate the `High Load Endpoint` indicator. This indicator will be automatically added
 * to endpoints with the highest request rates and is visible in the gutter to the left of the editor.
 *
 * **Usage:**
 * N/A (automatically added)
 *
 * **Indicator source code:**
 * [High Load Endpoint](https://github.com/sourceplusplus/jetbrains-commander/blob/master/resources/.spp/plugins/high-load-endpoint/plugin.kts)
 */
@Controller("/indicator")
class HighLoadEndpoint {

    /**
     * Hover your mouse over the upwards chevron icon on line 24 to see the request rate (~4/second).
     */
    @Get("/high-load-four-per-second")
    fun highLoad4PerSecond(): HttpResponse<Void> {
        return HttpResponse.ok()
    }

    /**
     * Hover your mouse over the upwards chevron icon on line 32 to see the request rate (~2/second).
     */
    @Get("/high-load-two-per-second")
    fun highLoad2PerSecond(): HttpResponse<Void> {
        return HttpResponse.ok()
    }
}
