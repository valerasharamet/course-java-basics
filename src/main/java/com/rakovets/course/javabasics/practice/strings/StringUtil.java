package com.rakovets.course.javabasics.practice.strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
     // task1
     public String concatString(String str1, String str2) {
          return str1.concat(str2);
     }

     //task2
     public int findIndex(String str1, char yourChar) {
          if (str1.indexOf(yourChar) != 1) {
               return str1.indexOf(yourChar);
          } else
               return -1;
     }

     //task3
     public boolean stringEquals(String str1, String str2) {
          return (str1.equals(str2));
     }

     //task4
     public String deleteBlankSpace(String str1) {
          str1 = str1.trim();
          return str1.toLowerCase();
     }

     //task5
     public String extractSubstring(String str1) {
          if (str1.length() < 10) {
               return "there is no decision";
          } else {
               String strRet = str1.substring(10);
               if (strRet.length() > 23)
                    return strRet.substring(0, 23);
               return strRet;
          }
     }

     //task6
     public String replaceCharter(String str1) {
          return str1 = str1.replace(":(", ":)");
     }

     //task7
     public boolean startsAndEndsWith(String str, String word) {
          return str.startsWith(word) && str.endsWith(word);
     }

     //task8
     public int getVowels(String str1) {
          Pattern p = Pattern.compile("[aoeiyuAOEIYU]");
          Matcher m = p.matcher(str1);
          int i = 0;
          while (m.find()) {
               i++;
          }
          return i;
     }

     //task9
     public int getDotCommaExclamationmark(String str1) {
          Pattern p = Pattern.compile("[.,!]");
          Matcher m = p.matcher(str1);
          int f = 0;
          while (m.find()) {
               f++;
          }
          return f;
     }

     //task10
     public boolean getStringReverse(String str1) {
          StringBuffer buf = new StringBuffer(str1);
          buf = buf.reverse();
          String str2 = buf.toString();
          if (str1.equals(str2)) {
               return true;
          } else
               return false;
     }

     //task11
     public String[] getStringArray(String str1, int n) {
          if (str1.length() % n != 0) {
               return null;
          }
          int num = str1.length() / n;
          String[] arrStr = new String[num];
          for (int i = 0; i < num; i ++) {
               arrStr[i]=  str1.substring(0,n);
               str1=str1.substring(n,str1.length());
              // arrStr[num] = str1.substring(i, i + n);
             //  num++;
          }
          return arrStr;
     }
     //task12
     public int getNumberWords(String str1) {
          str1 = str1.trim();
          int count = str1.split(" +").length;
          return count;
     }
     //task13
     public String getInitials(String str1) {
          str1 = str1.trim();
          String[] strArr = str1.split(" +");
          String result = "";
          for(String s : strArr) {
               result = result + s.charAt(0) + ".";
          }
          return result.toUpperCase();
     }
     //task14
     public String getDigitsInText (String str1) {
          char[] str1arr = str1.toCharArray();
          String result = "";
          for (char digit : str1arr) {
               if (Character.isDigit(digit))
                         result = result + digit;
               }
               return result;
     }
     //task15
     public String getCharNonRecurring(String str1, String str2) {
          String result = "";

          int j = 0;
          for(int i =0;i<str1.length();i++)
          {
               for(j=0;j<str2.length();j++)
               {
                    if(str1.charAt(i)==str2.charAt(j))
                         break;
               }
               if (j==str2.length()) result= result+str1.charAt(i);
          }
          for(int i =0;i<str2.length();i++)
          {
               for(j=0;j<str1.length();j++)
               {
                    if(str2.charAt(i)==str1.charAt(j))
                         break;
               }
               if (j==str1.length()) result= result+str2.charAt(i);
          }
          return result;
     }
     //task16
     public boolean get (String[] str1, String[] str2) {
          if(str1.length != str2.length)
               return false;

          return false;
     }
}




