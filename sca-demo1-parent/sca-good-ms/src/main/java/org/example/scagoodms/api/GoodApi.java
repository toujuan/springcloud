package org.example.scagoodms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/goods",produces = MediaType.APPLICATION_JSON_VALUE)
public class GoodApi {

    //private RestClient restClient;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<Map> findById(){
        String url="http://brand-api/api/v1/students/id/{id}";
        ResponseEntity<Map> resp=restTemplate.getForEntity(url,Map.class,50);
        return resp;
    }
}
