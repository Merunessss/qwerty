package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpTest {

 @Test
    void   testDecode(){
     Exp exp = new Exp();
     String row="qwerty";
     String  result="йцукен";
     assertEquals(result,exp.codeDecode(row));
 }

}