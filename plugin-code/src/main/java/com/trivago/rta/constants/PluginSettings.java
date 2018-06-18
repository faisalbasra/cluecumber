/*
 * Copyright 2018 trivago N.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.trivago.rta.constants;

/**
 * Holder class for static plugin settings
 */
public class PluginSettings {
    public PluginSettings() {
    }

    public final static String NAME = "Cluecumber Report Plugin";
    public static final String TEMPLATE_FILE_EXTENSION = ".ftl";
    public static final String HTML_FILE_EXTENSION = ".html";

    public static final String BASE_TEMPLATE_PATH = "/template";
    public static final String PAGES_DIRECTORY = "pages";

    public final static String SCENARIO_DETAIL_PAGE_NAME = "Scenario Details";
    public final static String SCENARIO_DETAIL_TEMPLATE = "scenario-detail";
    public static final String SCENARIO_DETAIL_PAGE_FRAGMENT = "/scenario-detail/scenario_";

    public final static String SCENARIO_OVERVIEW_PAGE_NAME = "Scenario Summary";
    public final static String SCENARIO_OVERVIEW_TEMPLATE = "scenario-summary";
    public final static String SCENARIO_OVERVIEW_PAGE_PATH = "index";

    public final static String TAG_SUMMARY_PAGE_NAME = "Tag Summary";
    public final static String TAG_SUMMARY_TEMPLATE = "tag-summary";
    public final static String TAG_SUMMARY_PAGE_PATH = "tag-summary";

    public final static String FEATURE_SUMMARY_PAGE_NAME = "Feature Summary";
    public final static String FEATURE_SUMMARY_TEMPLATE = "feature-summary";
    public final static String FEATURE_SUMMARY_PAGE_PATH = "feature-summary";
}