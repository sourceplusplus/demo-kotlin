# ![](https://github.com/sourceplusplus/sourceplusplus/blob/master/.github/media/sourcepp_logo.svg)

![GitHub](https://img.shields.io/github/license/sourceplusplus/protocol)
![GitHub release](https://img.shields.io/github/v/release/sourceplusplus/sourceplusplus?include_prereleases)
![Uptime](https://img.shields.io/endpoint?url=https%3A%2F%2Fraw.githubusercontent.com%2Fsourceplusplus%2Fstatus%2Fmaster%2Fapi%2Fsource-cloud%2Fuptime.json)
![Uptime](https://img.shields.io/endpoint?url=https%3A%2F%2Fraw.githubusercontent.com%2Fsourceplusplus%2Fstatus%2Fmaster%2Fapi%2Fsource-cloud%2Fresponse-time.json)

## What is this?

This project holds Kotlin-based feature demonstrations for [Source++](https://github.com/sourceplusplus/sourceplusplus),
the continuous feedback platform for developers. These demonstrations are meant to be used as a reference for how to use
Source++ in your own projects.

## How to use?

Install the Source++ plugin via the JetBrains Marketplace by searching for: `Source++`.
Alternatively, you can download the Source++ plugin directly
from [here](https://plugins.jetbrains.com/plugin/12033-source-).

Once the plugin is installed, check out the demos below. Each demo contains instructions explaining how to use it.

> **Note**
>
> You do not need to run any code for these demos. This application is hosted on our publicly accessible servers.

## Demo: Live Commands

> Live Commands allow you to execute user-defined actions. These commands have access to application runtime data and
> can be used to gather metrics, trigger alerts, or perform other actions.

#### [Add Breakpoint](./src/main/kotlin/spp/demo/command/AddBreakpoint.kt)

<details>
<summary>Command Preview</summary>
<img src="https://raw.githubusercontent.com/sourceplusplus/sourceplusplus/master/.github/media/screencasts/add-breakpoint.gif"/>
</details>

This demonstration shows how to add a "non-breaking breakpoint" to a running application. The **Add Breakpoint** command
is useful for debugging production applications without impacting the end user.

#### [Add Log](./src/main/kotlin/spp/demo/command/AddLog.kt)

<details>
<summary>Command Preview</summary>
<img src="https://raw.githubusercontent.com/sourceplusplus/sourceplusplus/master/.github/media/screencasts/add-log.gif"/>
</details>

This demonstration shows how to add a log statement to a running application. The **Add Log** command is useful for
increasing the verbosity of a running application with logs that output directly into the IDE.

#### [Tail Logs](./src/main/kotlin/spp/demo/command/TailLogs.kt)

<details>
<summary>Command Preview</summary>
<img src="https://raw.githubusercontent.com/sourceplusplus/sourceplusplus/master/.github/media/screencasts/view-logs.gif"/>
</details>

This demonstration shows how to follow existing logs from a running application. The **Tail Logs** command works with
most logging frameworks, including Log4j, Logback, and SLF4J.

#### [View Activity](./src/main/kotlin/spp/demo/command/ViewActivity.kt)

<details>
<summary>Command Preview</summary>
<img src="https://raw.githubusercontent.com/sourceplusplus/sourceplusplus/master/.github/media/screencasts/view-activity.gif"/>
</details>

This demonstration shows how to view the activity of an endpoint. The **View Activity** command is useful for
monitoring the throughput, latency, and error rate of a given endpoint.

#### [View Traces](./src/main/kotlin/spp/demo/command/ViewTraces.kt)

<details>
<summary>Command Preview</summary>
<img src="https://raw.githubusercontent.com/sourceplusplus/sourceplusplus/master/.github/media/screencasts/view-traces.gif"/>
</details>

This demonstration shows how to view the traces of an endpoint. The **View Traces** command is useful for exploring
the execution path of a given endpoint.

## Demo: Live Indicators

> Live Indicators allow you to automatically display user-defined metrics in the IDE. These metrics can be used to
> monitor the health of your application or provide insight into the current state of the application.

#### [Failing Endpoint](./src/main/kotlin/spp/demo/indicator/FailingEndpoint.kt)

This demonstration shows how failing endpoints can be detected and displayed in the IDE. The **Failing Endpoint**
indicator is useful for identifying endpoints that are actively failing and require attention.

#### [High Load Endpoint](./src/main/kotlin/spp/demo/indicator/HighLoadEndpoint.kt)

This demonstration shows how high load endpoints can be detected and displayed in the IDE. The **High Load Endpoint**
indicator is useful for identifying endpoints that are experiencing high load and may require scaling.

#### [Slow Endpoint](./src/main/kotlin/spp/demo/indicator/SlowEndpoint.kt)

This demonstration shows how slow endpoints can be detected and displayed in the IDE. The **Slow Endpoint** indicator
is useful for identifying endpoints that are experiencing slow response times and may require optimization.

#### [Unused Endpoint](./src/main/kotlin/spp/demo/indicator/UnusedEndpoint.kt)

This demonstration shows how unused endpoints can be detected and displayed in the IDE. The **Unused Endpoint**
indicator is useful for identifying endpoints that are not being used and may be able to be removed.

## Bugs & Features

Bug reports and feature requests can be created [here](https://github.com/sourceplusplus/sourceplusplus/issues).
