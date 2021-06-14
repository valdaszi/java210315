package lt.bit.p0609;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;

public class ReadFromUrlDemo {

    static final String Address = "www.delfi.lt";
    static final int Port = 443;    // http: -> 80
    static final String Protocol = "https";

    public static void main(String[] args) {
        try {
            URL url = new URL(Protocol + "://" + Address);

            try (
                InputStream is = url.openStream();
                InputStreamReader reader = new InputStreamReader(is);
                Writer writer = new FileWriter("delfi.lt.html"); // UTF-8 , Charset.forName("ISO-8859-13"));
            ) {
                int input;
                while ((input = reader.read()) != -1) {
                    writer.write(input);
                }

//                writer.close();
//                reader.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
