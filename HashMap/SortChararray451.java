package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortChararray451 {
     
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character, Integer>> list =
        new ArrayList<>(map.entrySet());

        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

         StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {

            char ch = entry.getKey();
            int freq = entry.getValue();

            while (freq > 0) {
                sb.append(ch);
                freq--;
            }
        }

        return sb.toString();
    }
}

