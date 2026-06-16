/*
 * strings.java
 * Topic: String handling & manipulation
 * Concepts: String pool vs new String, common String methods, reversing,
 * palindrome checks, frequency counts, anagram checks, trimming and splitting.
 * How to run: javac strings.java && java strings
 * Notes: Includes several algorithms useful for string interview questions.
 */
import java.util.*;

public class strings {
    public static void main(String[] args) {
        // Declaring a String
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        System.out.println(a == b);// same objects in pool
        System.out.println(a == c);// different objects
        System.out.println(a.equals(b));// always use .equals to compare String
        System.out.println(a.equals(c));
        String d = new String("hello");
        System.out.println(c.equals(d));
        System.out.println(c == d);// different objects

        // useful String methods

        String s = "Hardik";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.codePointAt(0));// gives the Ascii values
        System.out.println(s.codePointBefore(2));
        System.out.println(s.contains("Hard"));
        System.out.println(s.endsWith("ik"));
        System.out.println(s.indexOf("M"));
        System.out.println(s.substring(0, 3));

        String e = "Hello";
        System.out.println(a == e);

        // reverse a String

        String str = "madam";
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);

        }
        System.out.println(str1);

        // check weather a string is palindrome or not

        if (str.equalsIgnoreCase(str1)) {
            System.out.println("the string is palindrome");
        } else {
            System.out.println("the string is not pladinrome");
        }

        // counts vowels consonants digits and spaces

        String s1 = "ab 1 1raca3  abra";
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int space = 0;

        for (int i = 0; i < s1.length(); i++) {
            char elm = s1.charAt(i);
            if ((int) elm == 32) {
                space += 1;
            } else if ((int) elm > 47 && (int) elm < 58) {
                digits += 1;
            } else if ("aeiouAEIOU".indexOf(elm) != -1) {
                vowels += 1;
            } else {
                consonants += 1;
            }
        }

        System.out.println("the no of digits in the string is " + digits);
        System.out.println("the no of vowels in the string is " + vowels);
        System.out.println("the no of consonants in the string is " + consonants);
        System.out.println("the no of space in the string is " + space);

        // find the frequency of each character

        HashMap<Character, Integer> myMap = new HashMap<>();
        String s2 = "  @sd feea9  *&@KLmndyu  )(#^&~  ";
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            myMap.put(ch, myMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> e1 : myMap.entrySet()) {
            System.out.print(e1.getKey() + " " + "-->" + e1.getValue() + " ");
        }

        // Method 2 for finding the freq of each character
        int[] a1 = new int[256];
        for (int i = 0; i < s2.length(); i++) {
            char el = s2.charAt(i);
            a1[el]++;
        }

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] > 0) {
                System.out.println("the char is " + (char) i + " " + a1[i]);
            }
        }
        // remove spaces from a String
        String s3 = "  o   k h e l l o  k";
        String s4 = "";
        for (int i = 0; i < s3.length(); i++) {
            if ((int) s3.charAt(i) == 32) {
                continue;
            } else {
                s4 += s3.charAt(i);
            }
        }
        System.out.println(s4);

        // convert lowerCase to upperCase without using built-in periods.

        String s5 = "aeiouABCdE";
        String s6 = "";
        for (int i = 0; i < s5.length(); i++) {
            int element = s5.charAt(i);
            if (element > 96 && element < 123) {
                s6 += (char) (element - 32);
            } else {
                s6 += (char) element;
            }
        }
        System.out.println(s6);

        // check weather two strings are anagrams

        // Method 1
        String s7 = "sisten";
        String s8 = "silent";

        s7 = s7.toLowerCase();
        s8 = s8.toLowerCase();

        if (s7.length() != s8.length()) {
            System.out.println("the given String are not anagrams");
        }

        HashMap<Character, Integer> f1 = new HashMap<>();
        HashMap<Character, Integer> f2 = new HashMap<>();

        for (int i = 0; i < s7.length(); i++) {
            f1.put(s7.charAt(i), f1.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < s8.length(); i++) {
            f2.put(s8.charAt(i), f1.getOrDefault(i, 0) + 1);
        }
        System.out.println(f1);
        System.out.println(f2);
        if (f1.equals(f2)) {
            System.out.println("the given string are anagram");
        }

        // Method 2

        int[] checkAnagram = new int[26];

        for (int i = 0; i < s7.length() && i < s8.length(); i++) {
            checkAnagram[s7.charAt(i) - 'a']++;
            checkAnagram[s8.charAt(i) - 'a']--;
        }

        for (int i = 0; i < checkAnagram.length; i++) {
            if (checkAnagram[i] != 0) {
                System.out.println("the strings are not anagram");
            }
        }

        // Method 3

        char[] c1 = s7.toCharArray();
        char[] c2 = s8.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)) {
            System.out.println("the String are anagrams");
        } else {
            System.out.println("the Strings are not anagrams");
        }

        // find the longest word in a sentence
        String s9 = "  Hello My  name is   Hardik ";
        String longest = "";
        s9 = s9.trim();
        String[] a2 = s9.split("\\s+");
        for (int i = 0; i < a2.length; i++) {
            if (a2[i].length() >= longest.length()) {
                longest = a2[i];
            }
        }
        System.out.println("the longest word in the string is " + longest);

        // find occurences of a substring
        String s10 = "myName hellosdfde  hello fsdfa hello hello shsf hello";
        int index = s10.indexOf("hello");
        int cnt = 0;
        while (index != -1) {
            System.out.println(index);
            cnt++;
            index = s10.indexOf("hello", index + 1);
        }
        System.out.println(cnt);

        // find the first non-repeating character

        String s11 = "aabbcde";

        HashMap<Character, Integer> h1 = new HashMap<>();

        for (int i = 0; i < s11.length(); i++) {
            h1.put(s11.charAt(i), h1.getOrDefault(s11.charAt(i), 0) + 1);
        }

        System.out.println(h1);

        for (int i = 0; i < s11.length(); i++) {
            char c8 = s11.charAt(i);
            if (h1.get(c8) == 1) {
                System.out.println("the first non repeating characte is " + c8);
                break;
            }
        }
    }
}
