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
        Assertions.assertEquals(test.researchText("FIFA will never FIFA regret it fifa").get("FIFA"),2);
        Assertions.assertEquals(test.getCountUniqueWords(),6);
        Assertions.assertEquals("[never, fifa, will, regret, it, FIFA]",test.getUniqueWords().toString());
        Assertions.assertEquals(test.getWord("FIFA"),2);
        Assertions.assertEquals(-1,test.getWord("Word"));
        Assertions.assertEquals("{never=1, fifa=1, will=1, regret=1, it=1, FIFA=2}",test.getWordFrequencyDesc(true).toString());
        Assertions.assertEquals("{FIFA=2, never=1, fifa=1, will=1, regret=1, it=1}", test.getWordFrequencyDesc(false).toString());




    }
}
