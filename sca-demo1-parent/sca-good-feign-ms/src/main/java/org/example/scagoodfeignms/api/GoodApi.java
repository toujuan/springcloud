package org.example.scagoodfeignms.api;

import org.checkerframework.checker.units.qual.A;
import org.example.scagoodfeignms.service.BrandServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/goods",produces = MediaType.APPLICATION_JSON_VALUE)
public class GoodApi {
    @Autowired
    private BrandServiceFeign brandServiceFeign;
    @GetMapping
    public ResponseEntity<Map<String,Object>> findById(){
        ResponseEntity<Map<String,Object>> resp=brandServiceFeign.findById(50);
        return resp;
    }
}
