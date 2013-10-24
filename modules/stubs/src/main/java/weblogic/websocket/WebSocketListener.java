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
public interface WebSocketListener {
    void init(weblogic.websocket.WebSocketContext webSocketContext);

    void destroy();

    boolean accept(weblogic.websocket.WSHandshakeRequest wsHandshakeRequest, weblogic.websocket.WSHandshakeResponse wsHandshakeResponse);

    void onOpen(weblogic.websocket.WebSocketConnection webSocketConnection);

    void onMessage(weblogic.websocket.WebSocketConnection webSocketConnection, java.lang.String s);

    void onMessage(weblogic.websocket.WebSocketConnection webSocketConnection, byte[] bytes);

    void onFragment(weblogic.websocket.WebSocketConnection webSocketConnection, boolean b, java.lang.String s);

    void onFragment(weblogic.websocket.WebSocketConnection webSocketConnection, boolean b, byte[] bytes);

    void onPing(weblogic.websocket.WebSocketConnection webSocketConnection, byte[] bytes);

    void onPong(weblogic.websocket.WebSocketConnection webSocketConnection, byte[] bytes);

    void onTimeout(weblogic.websocket.WebSocketConnection webSocketConnection);

    void onError(weblogic.websocket.WebSocketConnection webSocketConnection, java.lang.Throwable throwable);

    void onClose(weblogic.websocket.WebSocketConnection webSocketConnection, weblogic.websocket.ClosingMessage closingMessage);
}
