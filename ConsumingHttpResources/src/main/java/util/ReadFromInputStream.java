package util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@Slf4j
@Service
public class ReadFromInputStream {
    // method  to read response data from input stream

    public String getResponseBody(HttpURLConnection connection){
        StringBuilder jsonArrayStr = new StringBuilder();

        try {
            // get the input stream from the response
            InputStream inputStream = connection.getInputStream();
            // read the  the data in the input steam to the buffer
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            // read each line of the response data from the buffer
            String line =  bufferedReader.readLine();
            // continue to read each line until we have gotten to the end of the data
            while (line != null){
                line = line.trim();
                jsonArrayStr.append(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
           log.warn(e.getMessage());
        } finally {
            // close the connection
            connection.disconnect();
        }

        return jsonArrayStr.toString();
    }
}
