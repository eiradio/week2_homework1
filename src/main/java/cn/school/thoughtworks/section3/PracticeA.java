package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : collectionA.keySet()){
            if (object.get("value").contains(s)){
                result.put(s, collectionA.get(s) - 1);
            }
            else {
                result.put(s, collectionA.get(s));
            }
        }


        return result;
    }
}
