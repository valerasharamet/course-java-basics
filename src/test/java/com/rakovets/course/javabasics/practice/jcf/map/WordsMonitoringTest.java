package com.rakovets.course.javabasics.practice.jcf.map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wordsMonitoring.TextMonitoring;

import java.util.Map;
import java.util.Set;

public class WordsMonitoringTest {
    public TextMonitoring test = new TextMonitoring();


    @Test
    void TextMonitoringTest () {
        Map<String,Integer> ttew;
        ttew = test.researchText("FIFA will never FIFA regret it fifa");
        Set<Map.Entry<String, Integer>> set;
        set = ttew.entrySet();
        //for (Map.Entry<String, Integer> item : set)
        //{
         //   System.out.print(item.getKey() + " ");
        //}
        Assertions.assertEquals(test.researchText("FIFA will never FIFA regret it fifa").get("FIFA"),2);
        Assertions.assertEquals(test.getCountUniqueWords(),6);
        Assertions.assertEquals("[never, fifa, will, regret, it, FIFA]",test.getUniqueWords().toString());
        Assertions.assertEquals(test.getWord("FIFA"),2);
        System.out.println(test.getWord("Word"));

        System.out.println(test.getWordFrequencyDesc(true));
        //Assertions.assertEquals();

    }
}
