package Java_8;

// Import all utility classes (like List, Map, HashMap, Arrays, ArrayList)
import java.util.*;

// Define a public class named GroupAnagrams
public class GroupAnagrams {

    // Main method — program starts execution here
    public static void main(String[] args) {
        
        // Create an array of words to group
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art", "java"};
        
        // Call the method 'groupAnagrams' and store the result (list of anagram groups)
        List<List<String>> result = groupAnagrams(words);
        
        // Print the grouped anagrams
        System.out.println(result);
    }

    // Method to group all anagrams together
    public static List<List<String>> groupAnagrams(String[] words) {
        
        // Step 1: Create a HashMap to store grouped words
        // Key   → sorted word (e.g., "eilnst")
        // Value → list of words having that same sorted key (e.g., ["listen", "silent", "enlist"])
        Map<String, List<String>> map = new HashMap<>();
        
        // Step 2: Loop through each word in the given array
        for (String word : words) {
            
            // Convert the word to a character array so we can sort the letters
            char[] chars = word.toCharArray();
            
            // Sort the character array alphabetically
            Arrays.sort(chars);
            
            // Convert the sorted char array back to a String — this will be our 'key'
            // Example: "listen" → ['e','i','l','n','s','t'] → "eilnst"
            String key = new String(chars);
            
            // Step 3: Check if this key already exists in the map
            // If not, create a new entry with an empty list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            // Add the original word (unsorted form) to the list corresponding to this key
            // Example: key "eilnst" → add "listen", "silent", "enlist"
            map.get(key).add(word);
        }
        
        // Step 4: Convert the map values (lists of anagrams) into a single list and return it
        // map.values() → Collection<List<String>>
        // new ArrayList<>(map.values()) → convert to a List<List<String>>
        return new ArrayList<>(map.values());
    }
}

