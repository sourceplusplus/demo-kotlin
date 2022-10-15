package spp.demo.indicator

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

/**
 * This class is used to demonstrate the `Unused Endpoint` indicator. This indicator will be automatically added to
 * endpoints with no traffic and is visible in the gutter to the left of the editor.
 *
 * **Usage:**
 * N/A (automatically added)
 *
 * **Indicator source code:**
 * [Unused Endpoint](https://github.com/sourceplusplus/jetbrains-commander/blob/master/resources/.spp/plugins/unused-endpoint/plugin.kts)
 */
@Controller("/indicator")
class UnusedEndpoint {

    /**
     * Hover your mouse over the cloud icon on line 24 to see the unused URL.
     */
    @Get("/unused-endpoint")
    fun unused(): HttpResponse<Void> {
        return HttpResponse.ok()
    }
}
