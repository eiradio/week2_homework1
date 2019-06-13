package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : collection1){
            int index = s.lastIndexOf('-');
            String key = s;
            int num = 1;
            if (index > 0){
                key = s.substring(0, index);
                num = Integer.parseInt(s.substring(index + 1));
            }
            if (result.containsKey(key)){
                result.replace(key, result.get(key) + num);
            }
            else {
                result.put(key, num);
            }
        }

        return result;
    }
}
