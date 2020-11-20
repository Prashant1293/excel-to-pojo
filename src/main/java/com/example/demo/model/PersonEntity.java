package com.example.demo.model;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

import java.util.Date;

@ExcelSheet("cousins")
public class PersonEntity {
    
    @ExcelCellName("firstName")
    private String fName;
    @ExcelCellName("lastName")
    private String lName;
    @ExcelCellName("gender")
    private String gender;
    @ExcelCellName("age")
    private int age;
    @ExcelCellName("dob")
    private Date dob;
    
    public String getfName() {
        return fName;
    }
    
    public void setfName(String fName) {
        this.fName = fName;
    }
    
    public String getlName() {
        return lName;
    }
    
    public void setlName(String lName) {
        this.lName = lName;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Date getDob() {
        return dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    @Override
    
    public String toString() {
        
        return "Person [fName = " + fName + ", lName = " + lName + ", age = " + age + "]";
        
    }
    
    
}
