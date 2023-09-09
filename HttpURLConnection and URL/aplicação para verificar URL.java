import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class testandoHttp {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.apple.com");//url site
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        System.out.println("Código: "+connection.getResponseCode());
        System.out.println("Status: "+connection.getResponseMessage());

        System.out.println("Site of authority: "+url.getAuthority());
        System.out.println("Type of Protocol: "+url.getProtocol());
    }
}
