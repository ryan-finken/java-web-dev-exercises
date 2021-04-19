package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else  if (lang.equals("en")){
            return "Hello, World!";
        } else if (lang.equals("nonsense")) {
            return "Floobly croobly droo!";
        } else {
            return "No language specified. No hello for you.";
        }
    }
}
