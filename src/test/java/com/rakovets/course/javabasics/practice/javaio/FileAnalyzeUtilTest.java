package com.rakovets.course.javabasics.practice.javaio;

import com.rakovets.course.javabasics.practice.javaio.FileAnalyzer.FileAnalyzeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class FileAnalyzeUtilTest {
    String str = "C:\\home\\dev\\course-java-basics\\src\\main\\resources\\taskIO.txt";
    FileAnalyzeUtil fileAnalyzeUtil = new FileAnalyzeUtil();

    @Test//task2
    public void returnListStrTest()  {
        List<String> exp = new ArrayList();
        exp.add("I was made for lovin' you baby");
        exp.add("You were made for lovin' me");
        exp.add("And I can't get enough of you baby");
        exp.add("Can you get enough of me");
        Assertions.assertEquals(exp, fileAnalyzeUtil.returnListStr(str));
    }

    @Test
    public void returnListVowelTest() {
        List<String> exp = new ArrayList();
        exp.add("you");
        exp.add("You");
        exp.add("And");
        exp.add("I");
        exp.add("enough");
        exp.add("of");
        exp.add("you");
        exp.add("you");
        exp.add("enough");
        exp.add("of");
        Assertions.assertEquals(exp,fileAnalyzeUtil.returnListVowel(str));
    }
}
