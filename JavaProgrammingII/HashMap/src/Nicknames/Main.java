package Nicknames;

import java.util.HashMap;

/*
Create a hashmap, add elements to the hashmap, and retrieve and print the nickname using key.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        System.out.println(nicknames.get("matthew"));
    }
}
