package cn.school.thoughtworks.section1;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> result = new LinkedList<>();
        for (String s : collection1){
            if (collection2.get("value").contains(s)){
                result.add(s);
            }
        }

        return result;
    }
}
