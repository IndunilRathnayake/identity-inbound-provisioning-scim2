/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.inbound.provisioning.scim2.common.utils;

/**
 * This class is to be used as a Util class for SCIM common things.
 */
public class SCIMCommonUtils {

    public static void init() {
        //to initialize scim urls once.
//        if (scimUserLocation == null || scimGroupLocation == null || scimServiceProviderConfig == null) {
//            String portOffSet = ServerConfiguration.getInstance().getFirstProperty("Ports.Offset");
//            int httpsPort = 9443 + Integer.parseInt(portOffSet);
//            String scimURL = "https://" + ServerConfiguration.getInstance().getFirstProperty("HostName")
//                    + ":" + String.valueOf(httpsPort) + "/wso2/scim/v2/";
//            scimUserLocation = scimURL + SCIMCommonConstants.USERS;
//            scimGroupLocation = scimURL + SCIMCommonConstants.GROUPS;
//            scimServiceProviderConfig = scimURL + SCIMCommonConstants.SERVICE_PROVIDER_CONFIG;
//            scimResourceType = scimURL + SCIMCommonConstants.RESOURCE_TYPE;
//        }
    }

    public static String getSCIMUserURL() {
        return SCIMCommonConstants.USERS_LOCATION;
    }

    public static String getSCIMGroupURL() {
        return SCIMCommonConstants.GROUPS_LOCATION;
    }

    public static String getSCIMServiceProviderConfigURL() {
        return SCIMCommonConstants.SERVICE_PROVIDER_CONFIG_LOCATION;
    }

    public static String getSCIMResourceTypeURL() {
        return SCIMCommonConstants.RESOURCE_TYPE_LOCATION;
    }

}
