package ru.geekbrains.javacore.qa.homeWork4;

import java.util.HashMap;
        import java.util.HashSet;
        import java.util.Set;

public class PhoneDirectory {
    private HashMap<String, HashSet<String>> phoneDirectory = new HashMap<>();

    public void addElementPhoneDirectory(String name, String phone) {
        HashSet<String> phones;
        if (phoneDirectory.containsKey(name)) {
            phones = phoneDirectory.get(name);
        }
        else {
            phones = new HashSet<>();
        }
        phones.add(phone.replaceAll(" ",""));
        phoneDirectory.put(name,phones);
    }

    public Set<String> getPhonesByName (String name){
        return phoneDirectory.get(name);
    }

}
