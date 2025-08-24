package org.example.scabrandms.api;

import org.example.scabrandms.model.Student;
import org.example.scabrandms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/students",produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentApi {

    @Autowired
    private StudentService studentService;
    @GetMapping("/id/{id}")
    public ResponseEntity<Map<String,Object>> findById(@PathVariable Integer id){
        Student student = this.studentService.findById(id);
        return ResponseEntity.ok(Map.of("success",true,"data",student));
    }

}
