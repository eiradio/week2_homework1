package cn.school.thoughtworks.section1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result = new LinkedList<>();
        for (String s : collection1){
            for (List<String> list : collection2){
                if (list.contains(s)){
                    result.add(s);
                }
            }
        }

        return result;
    }
}
