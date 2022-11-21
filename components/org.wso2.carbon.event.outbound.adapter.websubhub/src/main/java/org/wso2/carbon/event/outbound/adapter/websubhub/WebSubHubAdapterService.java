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

package org.wso2.carbon.event.outbound.adapter.websubhub;

import org.wso2.carbon.event.outbound.adapter.websubhub.exception.WebSubAdapterException;
import org.wso2.carbon.event.outbound.adapter.websubhub.model.EventPayload;

import java.util.Map;

/**
 * The WebSubHub event adapter service is used to publish notification events into the intermediate hub.
 */
public interface WebSubHubAdapterService {

    void publish(EventPayload payload, String topicSuffix, String eventUri, Map<String, String> propertyMap) throws
            WebSubAdapterException;

    void registerTopic(String topic, String tenantDomain) throws WebSubAdapterException;

    void deregisterTopic(String topic, String tenantDomain) throws WebSubAdapterException;
}
