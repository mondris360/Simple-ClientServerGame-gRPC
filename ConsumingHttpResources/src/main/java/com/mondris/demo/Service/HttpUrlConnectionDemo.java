package Service;

import com.mondris.demo.PostDto;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class HttpUrlConnectionDemo {

    public static void getPosts(){
        List<PostDto>  posts = null;
        StringBuilder stringBuilder = null;
        try {
            // create a url object to connect to
            URL url =  new URL("https://jsonplaceholder.typicode.com/posts");
            // establish a connection to the remote server
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // set the request method and other properties
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Content-Type", "application/json");
            // check if the resource was returned
            if (connection.getResponseCode() == 200){
                // get the response input stream
                InputStream  inputStream = connection.getInputStream();
                // read the inputStream to a buffer
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                // read each line of the response data from the buffer
                stringBuilder =  new StringBuilder();
                String line =  bufferedReader.readLine();
                while (line != null){
                    stringBuilder.append(line);
                    line = bufferedReader.readLine();
                }
            }
            System.out.println(stringBuilder);
        }catch(Exception  e) {
            System.out.println(e.getMessage());
        }
    }
}
