package ua.zp.brainacad.one;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class IpInfo {


    public static void main(String[] args) throws Exception {

        URL google = new URL("http://www.google.com");
        System.out.println("Protocol: " + google.getProtocol());
        System.out.println("Port: " + google.getPort());
        System.out.println("Host: " + google.getHost());
        System.out.println("Ext: " + google.toExternalForm());


        int c;
        URL myUrl = new URL("https://api.2ip.ua/geo.json");
        URLConnection httpURLConnection = myUrl.openConnection();
        httpURLConnection.connect();

        System.out.println("Date: " + httpURLConnection.getDate());
        System.out.println("Type: " + httpURLConnection.getContentType());
        System.out.println("Exp: " + httpURLConnection.getExpiration());

        System.out.println("Last Modify: " + LocalDateTime
                .ofEpochSecond(httpURLConnection.getLastModified(), 0, ZoneOffset.UTC));
        System.out.println("Length: " + httpURLConnection.getContentLength());
        if (httpURLConnection.getContentLength() > 0) {
            System.out.println("=== Content ===");
            try (InputStream input = httpURLConnection.getInputStream()) {
                int i = httpURLConnection.getContentLength();
                while (((c = input.read()) != -1) && (--i > 0)) {
                    System.out.print((char) c);
                }
            }
        } else {
            System.out.println("No Content Available");
        }
    }
}
