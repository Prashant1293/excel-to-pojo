package com.example.demo;

import com.example.demo.model.PersonEntity;
import com.poiji.bind.Poiji;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Component
public class ExcelToPojoConverter {
    public List<PersonEntity> getPersonMappedFromExcel() {
        File file = new File("src/main/resources/Persons.xlsx");
        List<PersonEntity> personEntities = Poiji.fromExcel(file, PersonEntity.class);
        
        try {
            personEntities.stream().forEach(person -> System.out.println("Person entity values = " + person));
        } catch (Exception e) {
            System.out.println("Hello Exception..." + e.getMessage());
        }
        return personEntities;
    }
}
