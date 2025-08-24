package org.example.scagoodfeignms.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient("brand-api")

public interface BrandServiceFeign {
    @GetMapping("/api/v1/students/id/{id}")
    ResponseEntity<Map<String,Object>> findById(@PathVariable Integer id);
}
