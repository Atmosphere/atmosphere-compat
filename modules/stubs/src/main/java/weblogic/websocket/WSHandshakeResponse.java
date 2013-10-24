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
public class WSHandshakeResponse extends javax.servlet.http.HttpServletResponseWrapper {
    public WSHandshakeResponse(weblogic.websocket.WSHandshakeRequest request, javax.servlet.http.HttpServletResponse response) { super(response); }

    public void enableSubProtocol(java.lang.String protocol) { }

    public void enableExtension(java.lang.String extension) {  }

    public java.lang.String[] getEnabledSubProtocols() { return null; }

    public java.lang.String[] getEnabledExtensions() { return null; }
}
