package ch10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by apple on 9/25/15.
 */
public class Solution02 {

    public static void main(String[] args) {
        String[] array = {"car", "rac", "wind", "acr", "dwin"};
        ArrayList<String> result = groupAnagram(array) ;
        System.out.println(result);

    }

    public static ArrayList<String> groupAnagram(String[] array){
        ArrayList<String> result = new ArrayList<String>();
        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();

        // go through the original array.
        //by sorting, find sorted format for all string.

        // these with same sorted format is anagram of each other.

        // use a HashMap to store all the permutation of a sorted string.
        for (String s: array){
            String key = getKey(s);
            if (map.containsKey(key)) map.get(key).add(s);
            else{
                ArrayList<String> value = new ArrayList<String>();
                value.add(s);
                map.put(key,value);
            }
        }
        //go through HashMap to put string into a new ArrayList one by one.
        //this time we could assure that anagram is grouped near each other.
        for (String key: map.keySet()){
            ArrayList<String> list = map.get(key);
            for (String s:list)
                result.add(s);
        }
        return result;
    }

    // sort string to get its sorted format.
    public static String getKey(String s){
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        return new String(sChar);
    }


}
