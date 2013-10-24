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
public interface WebSocketContext {
    javax.servlet.ServletContext getServletContext();

    java.lang.String[] getPathPatterns();

    int getTimeoutSecs();

    void setTimeoutSecs(int i);

    int getMaxMessageSize();

    void setMaxMessageSize(int i);

    int getMaxConnections();

    void setMaxConnections(int i);

    java.util.Set<weblogic.websocket.WebSocketConnection> getWebSocketConnections();

    java.util.Set<java.lang.Integer> getSupportedVersions();
}
