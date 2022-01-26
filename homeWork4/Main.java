package ru.geekbrains.javacore.qa.homeWork4;

public class Main {

    public static void main(String[] args) {
        doPhoneDirectory();
        WordsArray wordsArray = new WordsArray(createArrayWords());
        wordsArray.doArrayWords();
    }

    private static void doPhoneDirectory() {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.addElementPhoneDirectory("Sun","89670049109");
        phoneDirectory.addElementPhoneDirectory("Sun","89670049110");
        phoneDirectory.addElementPhoneDirectory("Sun","89670049111");

        phoneDirectory.addElementPhoneDirectory("Art","1111111");
        phoneDirectory.addElementPhoneDirectory("Art","1234567");
        phoneDirectory.addElementPhoneDirectory("Art","1111111");
        phoneDirectory.addElementPhoneDirectory("Art","1111111");
        phoneDirectory.addElementPhoneDirectory("Art","111111 1 ");
        phoneDirectory.addElementPhoneDirectory("Art","1 1 1 111  ");

        System.out.println("Sun: " + phoneDirectory.getPhonesByName("Sun"));
        System.out.println("Art: " + phoneDirectory.getPhonesByName("Art"));
        System.out.println("Alex: " + phoneDirectory.getPhonesByName("Alex"));
        System.out.println("Nikto: " + phoneDirectory.getPhonesByName("Nikto"));
    }

    private static String[] createArrayWords() {
        String [] strings = new String[10];
        strings[0] = "Mom";
        strings[1] = "Dad";
        strings[6] = "Cat";
        strings[7] = "Dog";
        strings[8] = "Daughter";
        strings[9] = "Son";
        return strings;
    }

}
