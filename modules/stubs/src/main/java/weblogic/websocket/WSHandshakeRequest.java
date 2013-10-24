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
public class WSHandshakeRequest extends javax.servlet.http.HttpServletRequestWrapper {
    private static final java.lang.String ORIGIN_HEADER = "Origin";
    static final java.lang.String SEC_WS_PROTOCOL = "Sec-WebSocket-Protocol";
    static final java.lang.String SEC_WS_EXTENSIONS = "Sec-WebSocket-Extensions";
    static final java.lang.String SEC_WS_VERSION = "Sec-WebSocket-Version";
    private java.lang.String origin;
    private java.lang.String resourcePath;
    private java.lang.String[] subProtocols;
    private java.lang.String[] extensions;
    private int version;

    public WSHandshakeRequest(weblogic.websocket.WebSocketContext context, javax.servlet.http.HttpServletRequest request) { 
       super(request);   
    }

    public java.lang.String getOrigin() { return null; }

    public java.lang.String getResourcePath() { return null; }

    public java.lang.String[] getSubProtocols() { return null; }

    public java.lang.String[] getExtensions() { return null; }

    public int getVersion() { return 0; }

    static java.lang.String[] split(java.lang.String header, java.lang.String delimiter) { return null; }
}
