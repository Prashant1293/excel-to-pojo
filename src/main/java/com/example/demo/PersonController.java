package com.example.demo;

import com.example.demo.model.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    ExcelToPojoConverter excelToPojoConverter;
    
    @GetMapping("persons")
    public ResponseEntity<List<PersonEntity>> getPersonsFromExcel() {
        return ResponseEntity.ok(excelToPojoConverter.getPersonMappedFromExcel());
    }
}
