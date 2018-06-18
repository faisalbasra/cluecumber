<#import "macros/page.ftl"as page>
<#import "macros/scenario.ftl" as scenarioMacros>
<#import "macros/navigation.ftl" as navigation>

<@page.page base=".." links=["tag_summary", "scenario_summary"]>
    <div class="row">
        <@page.card width="12" title="Feature Summary Result Chart" subtitle="">
            <div id="canvas-holder" class="w-100 text-center">
                <canvas id="chart-area" class="w-100"></canvas>
            </div>
        </@page.card>
    </div>

    <div class="row">
        <@page.card width="12" title="Feature Summary" subtitle="">
            FEATURE SUMMARY
        </@page.card>
    </div>
</@page.page>
