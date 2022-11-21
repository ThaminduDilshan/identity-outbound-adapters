/*
 * Copyright (c) 2022, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.event.outbound.adapter.websubhub.util;

/**
 * Keep constants required by the WebSubHub Event Adapter.
 */
public class WebSubHubEventAdapterConstants {

    public static final String ADAPTER_MESSAGE_TENANT_DOMAIN = "tenant-domain";
    public static final String EVENT_ISSUER = "Asgardeo";
    public static final String AUDIENCE_BASE_URL = "https://websubhub/topics/";
    public static final String URL_SEPARATOR = "/";
    public static final String TOPIC_SEPARATOR = "-";
    public static final String PUBLISH = "publish";
    public static final String HUB_MODE = "hub.mode";
    public static final String HUB_TOPIC = "hub.topic";
    public static final String REGISTER = "register";
    public static final String DEREGISTER = "deregister";
    public static final String ACCEPTED = "accepted";
    public static final String RESPONSE_FOR_SUCCESSFUL_OPERATION = HUB_MODE + "=" + ACCEPTED;
    public static final String CORRELATION_ID_REQUEST_HEADER = "activityid";
    public static final String CONNECTION_POOL_MAX_CONNECTIONS = "AdaptiveAuth.MaxTotalConnections";
    public static final String CONNECTION_POOL_MAX_CONNECTIONS_PER_ROUTE = "AdaptiveAuth.MaxTotalConnectionsPerRoute";
    public static final String ADAPTER_HUB_URL_NAME = "webSubHubBaseUrl";
    public static final String ADAPTER_HUB_URL = "http://localhost:9090/hub";

    private static final String WEB_SUB_ADAPTER_ERROR_CODE_PREFIX = "WEBSUB-";

    private WebSubHubEventAdapterConstants() {

    }

    /**
     * Error codes related to websub adapter.
     */
    public enum ErrorMessages {

        //client errors.
        WEB_SUB_BASE_URL_NOT_CONFIGURED("0001", "WebSub Hub base URL is not configured.",
                "WebSub Hub base URL is not configured."),
        ERROR_PUBLISHING_EVENT_INVALID_PAYLOAD("0001", "Invalid payload provided.",
                "Event payload cannot be processed."),

        //server errors.
        ERROR_REGISTERING_HUB_TOPIC("65001", "Error registering WebSub Hub topic.",
                "Server error encountered while registering the WebSub Hub topic: %s, tenant: %s."),
        ERROR_DEREGISTERING_HUB_TOPIC("65002", "Error de-registering WebSub Hub topic.",
                "Server error encountered while de-registering the WebSub Hub topic: %s, tenant: %s."),
        ERROR_BACKEND_ERROR_FROM_WEBSUB_HUB("65003", "Backend error from WebSub Hub topic management.",
                "Backend error received from WebSubHub topic management, topic: %s, operation: %s."),
        ERROR_INVALID_RESPONSE_FROM_WEBSUB_HUB("65004", "Error response from WebSub Hub.",
                "Invalid response received from WebSub Hub, topic: %s, operation: %s, payload: %s."),
        ERROR_NO_RESPONSE_FROM_WEBSUB_HUB("65005", "No Response from WebSub Hub.",
                "Didn't receive response from WebSub Hub, topic: %s, operation: %s."),
        ERROR_GETTING_ASYNC_CLIENT("65005", "Error getting the async client to publish events.",
                "Error preparing async client to publish events, tenant: %s.");

        private final String code;
        private final String message;
        private final String description;

        ErrorMessages(String code, String message, String description) {

            this.code = code;
            this.message = message;
            this.description = description;
        }

        public String getCode() {

            return WEB_SUB_ADAPTER_ERROR_CODE_PREFIX + code;
        }

        public String getMessage() {

            return message;
        }

        public String getDescription() {

            return description;
        }
    }

}
