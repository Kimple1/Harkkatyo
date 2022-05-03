package com.example.harkkatylogin;

import java.util.HashMap;
import java.util.Map;

public class Credentials {

    // Class handles username and password in  a hashmap
    private HashMap<String, String> hashmapCredentials = new HashMap<String, String>();

    public void addCredentials(String username, String password){
        hashmapCredentials.put(username, password);
    }
    // Checking wheter username exists
    public boolean checkUsername(String username){
        return hashmapCredentials.containsKey(username);
    }
    // Method to verify that username and password match
    public boolean verifyCredentials(String username, String password){
        if(hashmapCredentials.containsKey(username)){
            if(password.equals(hashmapCredentials.get(username))) {
                return true;
            }
        }
        return false;
    }

    // Loading credentials from map to hashmap
    public void loadCredentials(Map<String, ?> preferencesMap){
        for(Map.Entry<String, ?> entries : preferencesMap.entrySet()){
            if(!entries.getKey().equals("RememberMeCheckbox") || !entries.getKey().equals("LastSavedUsername") ||
                    !entries.getKey().equals("LastSavedPassword")){
                hashmapCredentials.put(entries.getKey(), entries.getValue().toString());
            }
        }
    }
}


