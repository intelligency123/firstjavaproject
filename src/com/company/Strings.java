package com.company;

public class Strings {
    public static void main(String[] args) {
        //reverse the string
        String name = "mann";
        char[] chars = name.toCharArray();
        char[] reverseArr = new char[name.length()];
        int length = chars.length;
        int lastIndex = length-1;
        for(int i=0;i<=lastIndex;i++){
            reverseArr[lastIndex-i]=chars[i];
        }
        System.out.println(reverseArr);
        String reverse = new String(reverseArr);
        if(name.equals(reverse)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
        //methods
//        String s ="kamal";
//        System.out.println(s);
//        System.out.println(s.concat(" mann"));
//        System.out.println(s);
//        System.out.println(s.substring(2));
//        System.out.println(s.substring(2,5));
//        char c = s.charAt(4);
//        System.out.println(c);
//        System.out.println(s.indexOf('a'));
//        System.out.println(s.indexOf('a', 3));
//        System.out.println(s.replace('a', '#'));
//        System.out.println(s.replaceFirst("a", "$"));
        //Integer
        int i = 12345;
        
    }



}
