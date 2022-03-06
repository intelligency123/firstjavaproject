package com.company;

public class string {
    public static void main(String[] args) {
        System.out.println("feature");
       String str = "he";
        String a = str.substring(0,2);
        String b = a+a+a;
        System.out.println(b);
        System.out.println(str.length());
//
//        String b = str.substring(2+1);
        char last = str.charAt(str.length()-1);
//        char first = str.charAt(0);


//
//
//        System.out.println(e);
//        String f = e.replace((e.charAt(str.length()-1)),first);
//        System.out.println(e.charAt(str.length()-1));

        char[] c = str.toCharArray();

// Replace with a "swap" function, if desired:
        char temp = c[0];
        c[0] = c[str.length()-1];
        c[str.length()-1] = temp;

        String swappedString = new String(c);

        System.out.println(str);
        System.out.println(swappedString);

    }
}
