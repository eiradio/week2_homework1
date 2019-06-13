package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        PracticeB practiceB = new PracticeB();
        return practiceB.createUpdatedCollection(countSameElements(collectionA), object);
    }

    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : collection1){
            if (result.containsKey(s)){
                result.replace(s, result.get(s) + 1);
            }
            else {
                result.put(s, 1);
            }
        }

        return result;
    }
}
