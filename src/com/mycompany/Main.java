package com.mycompany;

import java.io.UnsupportedEncodingException;
import java.net.*;

public class Main {

    public static void main(String[] args) {
	String str = "file:/E:/Program Files/IBM/WebSphere/AppServer/profiles/AppSrv01/installedApps/ALPWAPGST9126Node01Cell/WebCapture_EAR.ear/WebCaptureWeb.war/WEB-INF/lib/hazelcast-all-4.2.1.jar!/META-INF/services/com.hazelcast.instance.impl.NodeExtension";

   //String str = "file:/E:/Program Files/IBM/WebSphere/AppServer/profiles/AppSrv01/installedApps/ALPWAPGST9126Node01Cell/WebCapture_EAR.ear/WebCaptureWeb.war/WEB-INF/lib/hazelcast-all-4.2.1.jar!/META-INF/services/com.hazelcast.instance.impl.NodeExtension";

        try {
            URL url = new URL(str);
            URI uri = new URI(url.getProtocol(), url.getUserInfo(),url.getHost(), url.getPort(),
                    url.getPath(), url.getQuery(), url.getRef());
            System.out.println(uri);
        } catch (Exception  e) {
            e.printStackTrace();
        }
    }
}
