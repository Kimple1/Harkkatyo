package com.example.harkkatylogin;

import java.util.HashMap;
import java.util.Map;

public class Favorites {
    // Class saves the favorite player of the user in hashmap
    private HashMap<String, String> hashmapFavorites = new HashMap<String, String>();

    public void addFavorites(String username, String favoritePLayer){
        hashmapFavorites.put(username, favoritePLayer);
    }

    public boolean checkUsername(String username){
        return hashmapFavorites.containsKey(username);
    }
    // Loading credentials from map to hashmap
    public void loadFavorites(Map<String, ?> preferencesMap){
        for(Map.Entry<String, ?> entries : preferencesMap.entrySet()){ {
                hashmapFavorites.put(entries.getKey(), entries.getValue().toString());
            }
        }
    }

}
