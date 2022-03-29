package com.claireyurev;

public class Main {

    public static void main(String[] args) {
        String message = new String("Hello world!");
        String anotherMessage = "Hello World";

        String messageTwo = "Hello World" + "!!";
        System.out.println(messageTwo.replace("!", "X"));



        messageTwo.endsWith("!");
        System.out.println(messageTwo.endsWith("!"));
        messageTwo.length();
        System.out.println(messageTwo.length());
        messageTwo.startsWith("!");
        System.out.println(messageTwo.startsWith("H"));
        messageTwo.indexOf("H");
        System.out.println(messageTwo.indexOf("H"));
        messageTwo.indexOf("e");
        System.out.println(messageTwo.indexOf("e"));
        messageTwo.indexOf("l");
        System.out.println(messageTwo.indexOf("l"));
        messageTwo.indexOf("sky");
        System.out.println(messageTwo.indexOf("sky"));
    }
}
