package com.example.bootest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    
    @Test
    void testStudent_GetterSetter(){
        Student s1 = new Student();
        Assertions.assertEquals(0,s1.getId());
        s1.setId(25);
        Assertions.assertEquals(25, s1.getId());

    }
    @Test
void testStudent_Constructor(){
    Student s1 = new Student("peter", 255);
    Student s2 = new Student("apple", 21123);
    Assertions.assertEquals(s1, s2);
}

}
