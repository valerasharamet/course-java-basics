package wordsMonitoring;

import java.util.*;

public class TextMonitoring {
    private Map<String, Integer> ttex = new HashMap<String, Integer>();

    public Map<String, Integer> researchText (String text) {
        Set<String> setStr = new HashSet<String>();
        String[] words = text.split(" ");
        for (String word : words) {
            setStr.add(word);
        }

        for (String x : setStr) {
            int i = 0;
            for (String j: words) {
                if(j.equals(x))
                    i++;
            }
            ttex.put(x, i);
        }
        return ttex;
    }

    public int getCountUniqueWords () {
        return ttex.size();
    }

    public Set<String> getUniqueWords () {
        return ttex.keySet();
    }

    public int getWord (String word) {
        if(ttex.containsKey(word)) {
            return ttex.get(word);
        } else {
            return -1;
        }
    }

    public Map<String, Integer> getWordFrequencyDesc(boolean isAscendingFrequency) {

        if(isAscendingFrequency) {
            IsAscendingFrequencyComparatorTrue comparatorTrue = new IsAscendingFrequencyComparatorTrue(ttex);
            Map<String, Integer> newMap = new TreeMap<String, Integer>(comparatorTrue);
            newMap.putAll(ttex);
            return newMap;
        } else {
            IsAscendingFrequencyComparatorFalse comparatorFalse = new IsAscendingFrequencyComparatorFalse(ttex);
            Map<String, Integer> newMap = new TreeMap<String, Integer>(comparatorFalse);
            newMap.putAll(ttex);
            return newMap;
        }
    }

    @Override
    public String toString() {
        String str = "";
        Set<Map.Entry<String, Integer>> set;
        set = ttex.entrySet();
        for (Map.Entry<String, Integer> item : set)
        {
           str = str + item.getKey() + " ";
        }
        return str;
    }




}
