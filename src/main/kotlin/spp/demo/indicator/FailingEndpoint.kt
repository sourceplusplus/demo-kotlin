package spp.demo.indicator

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

/**
 * This class is used to demonstrate the `Failing Endpoint` indicator. This indicator will be automatically added
 * to endpoints that are actively failing and is visible in the gutter to the left of the editor.
 *
 * **Usage:**
 * N/A (automatically added)
 *
 * **Indicator source code:**
 * [Failing Endpoint](https://github.com/sourceplusplus/jetbrains-commander/blob/master/resources/.spp/plugins/failing-endpoint/plugin.kts)
 */
@Controller("/indicator")
class FailingEndpoint {

    /**
     * Hover your mouse over the bug icon on line 24 to see the error rate (100%).
     */
    @Get("/fail-100-percent")
    fun fail100Percent(): HttpResponse<Void> {
        return HttpResponse.serverError()
    }

    /**
     * Hover your mouse over the bug icon on line 32 to see the error rate (~50%).
     */
    @Get("/fail-50-percent")
    fun fail50Percent(): HttpResponse<Void> {
        return if (Math.random() > 0.5) {
            HttpResponse.serverError()
        } else HttpResponse.ok()
    }
}