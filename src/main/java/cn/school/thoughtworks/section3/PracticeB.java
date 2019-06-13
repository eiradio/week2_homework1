package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : collectionA.keySet()){
            int num = collectionA.get(s);
            if (object.get("value").contains(s)){
                result.put(s, num - (num / 3));
            }
            else {
                result.put(s, num);
            }
        }


        return result;
    }
}
