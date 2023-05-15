package io.testable.example;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class JUnitSampleTest {

    @Test
    public void testSampleQuote() throws IOException {
        URL url = new URL("http://sample.testable.io/stocks/IBM");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        Reader streamReader = new InputStreamReader(con.getInputStream());
        BufferedReader in = new BufferedReader(streamReader);
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        int status = con.getResponseCode();
        assertEquals("status code incorrect", status, 200);
        con.disconnect();
        System.out.println("JUNIT");
        System.out.println(content);
    }

}
