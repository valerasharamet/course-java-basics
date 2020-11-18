package com.rakovets.course.javabasics.practice.javaio.FileAnalyzer;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {
    public List<String> returnListStr(String path) {
        List<String> listStr = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(path))) {
            listStr = br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listStr;
    }

    public List<String> returnListVowel(String path) {
        List<String> listStr = new ArrayList<>();
        String str = null;
        try (BufferedReader buffer = new BufferedReader(new FileReader(path))) {
            int c;
            while ((c = buffer.read()) != -1) {
                str += (char) c;
            }
            if (str != null) {
                for (String word : str.split("\\W")) {
                    if (word.matches("[aeiouyAEIOUY](.*)")) {
                        listStr.add(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listStr;
    }
}