/*
 * Copyright 2013 Jeanfrancois Arcand
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package weblogic.websocket;

/** Weblogic stubs for compilation. Do not use this jar **/
public interface ClosingMessage {
    int NO_STATUS_CODE = -1;
    int SC_NORMAL_CLOSURE = 1000;
    int SC_GOING_AWAY = 1001;
    int SC_PROTOCOL_ERROR = 1002;
    int SC_UNSUPPORTED_DATA = 1003;
    int SC_INVALID_FRAME_PAYLOAD_DATA = 1007;
    int SC_POLICY_VOILATION = 1008;
    int SC_MESSAGE_TOO_BIG = 1009;
    int SC_INTERNAL_SERVER_ERROR = 1011;

    int getStatusCode();

    java.lang.String getReason();
}
