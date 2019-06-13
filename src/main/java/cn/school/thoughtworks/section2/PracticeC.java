package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();
        int[][] seps = {{'-', 0}, {':', 0}, {'[', 1}};
        for (String s : collection1){
            String key = s;
            int num = 1;
            for (int[] sep : seps){
                String[] snum = get_key_num(s, (char)sep[0], sep[1]);
                if (snum != null){
                    key = snum[0];
                    num = Integer.parseInt(snum[1]);
                    break;
                }
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

    String[] get_key_num(String s, char c, int end){
        int index = s.lastIndexOf(c);
        if (index > 0){
            String[] snum = {s.substring(0, index), s.substring(index + 1, s.length() - end)};
            return snum;
        }
        return null;
    }
}
