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
public interface WebSocketConnection {
    void send(java.lang.String s) throws java.io.IOException, java.lang.IllegalStateException;

    void send(byte[] bytes) throws java.io.IOException, java.lang.IllegalStateException;

    void sendPing(byte[] bytes) throws java.io.IOException, java.lang.IllegalStateException;

    void sendPong(byte[] bytes) throws java.io.IOException, java.lang.IllegalStateException;

    void stream(boolean b, java.lang.String s) throws java.io.IOException, java.lang.IllegalStateException;

    void stream(boolean b, byte[] bytes, int i, int i1) throws java.io.IOException, java.lang.IllegalStateException;

    void close(int i) throws java.io.IOException;

    void close(int i, java.lang.String s) throws java.io.IOException;

    boolean isOpen();

    boolean isSecure();

    java.lang.String getRemoteAddress();

    int getRemotePort();

    java.lang.String getRemoteUser();

    java.lang.String getRequestURI();

    java.security.Principal getUserPrincipal();

    weblogic.websocket.WebSocketContext getWebSocketContext();
}
