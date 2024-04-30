package com.nextLine.nextLine.users;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import java.util.List;
@Service
public class UsersService {


    @Value("${supabase.url}")
    private String supabaseUrl;

    @Value("${supabase.key}")
    private String supabaseKey;


    private final RestTemplate restTemplate = new RestTemplate();



    public  List<Users>  getUsers() {
        String endpoint = supabaseUrl + "/rest/v1/users";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("apikey", supabaseKey);  // Setting the API key correctly
        HttpEntity<String> entity = new HttpEntity<>(headers);


        ResponseEntity<List<Users>> response = restTemplate.exchange(
                endpoint,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<Users>>() {}
        );


        return response.getBody();
    }

    public Users createUser(Users user) {
        String endpoint = supabaseUrl + "/rest/v1/users";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("apikey", supabaseKey);
        HttpEntity<Users> entity = new HttpEntity<>(user, headers);


        Users createdUser = restTemplate.postForObject(endpoint, entity, Users.class);


        return createdUser;

    }
}
