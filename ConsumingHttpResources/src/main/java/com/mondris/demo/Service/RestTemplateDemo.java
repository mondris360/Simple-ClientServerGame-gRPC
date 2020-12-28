package Service;

import com.mondris.demo.PostDto;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@Service
@Slf4j
public class RestTemplateDemo {
    @Autowired
    private RestTemplate restTemplate;
    private  String baseUrl = "https://jsonplaceholder.typicode.com/";

    // method to get all posts
    public List<PostDto> getPosts(){
        ResponseEntity<PostDto[]> responseEntity  = null;
        List<PostDto> posts = null;
        String url =  baseUrl+"posts";
        // create a new http request headers
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        // create a response entity
        try{
           responseEntity = restTemplate.exchange(
                    url,
                    HttpMethod.GET,
                    requestEntity,
                    PostDto[].class
            );
           posts =  Arrays.asList(responseEntity.getBody());
        } catch (Exception e) {
            log.info(e.getMessage());
        }
        // check if the request was returned
        if(responseEntity.getStatusCode() != HttpStatus.OK) {
           log.warn("an unknown error has occurred");
        }  else {
            log.info("Response From API");
            log.info(String.valueOf(responseEntity.getBody()));
        }
        return posts;
    }


    // method post by id
    public PostDto getPostId(long id){
        String url =  baseUrl + "posts/" + id;
        ResponseEntity<PostDto> responseEntity = null;
        PostDto post =  null;

        HttpHeaders requestHeader =  new HttpHeaders();
        requestHeader.add("Accept", MediaType.APPLICATION_JSON_VALUE);

        // create a request entity
        HttpEntity<String> requestEntity =  new HttpEntity<>(requestHeader);
        // define a response entity
        try{
            responseEntity =  restTemplate.exchange(url, HttpMethod.GET, requestEntity, PostDto.class);
            post = responseEntity.getBody();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return  post;

    }



    // method  to create a new post
    public PostDto createANewPost(PostDto newPost){
        String url =  baseUrl+"/posts";
        PostDto createdPost =  null;

        HttpHeaders requestHeader =  new HttpHeaders();
        requestHeader.setContentType(MediaType.APPLICATION_JSON);

        // create the request body/ request payload
        PostDto post =  new PostDto();
        post.setTitle(newPost.getTitle());
        post.setBody(newPost.getBody());
        post.setUserId(newPost.getUserId());

    try {
        //create a request entity
        HttpEntity<PostDto> requestEntity =  new HttpEntity<PostDto>(post, requestHeader);
        // create a response entity
        ResponseEntity<PostDto> responseEntity = responseEntity =  restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                PostDto.class
        );
        createdPost =  responseEntity.getBody();
    } catch (Exception e){
        log.info(e.getMessage());
    }

        return  createdPost;
    }


    // method to update a post
    public PostDto updatePost(PostDto post) {
        String url =  baseUrl+"posts/" + post.getId();
        PostDto response =  null;
        // create a request header
        HttpHeaders requestHeaders =  new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        //create request header
        HttpEntity<String> requestEntity =  new HttpEntity<>(requestHeaders);
        try {
            ResponseEntity<PostDto> responseEntity =  restTemplate.exchange(
                    url,
                    HttpMethod.PUT,
                    requestEntity,
                    PostDto.class
            );
            response =  responseEntity.getBody();
        }catch (Exception e){
            log.info(e.getMessage());
        }
        return  response;
    }

}
