package leetcode;

import java.util.HashMap;
import java.util.Map;

// 哈希表
// 因为只有26个字母，所以用数组应该会快很多

class Solution1160 {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<chars.length(); i++) {
            Integer val = map.get(chars.charAt(i));
            map.put(chars.charAt(i), val==null ? 1 : val+1);
        }
        
        int count = 0;
        
        for (int i=0; i<words.length; i++) {
            Map<Character,Integer> tmap = new HashMap<Character, Integer>(map);
            boolean isOK = true;
            for (int j=0; j<words[i].length(); j++) {
                char c = words[i].charAt(j);
                Integer val = tmap.get(c);

                if (val==null || val==0) {
                    isOK = false;
                    break;
                }
                else {
                    tmap.put(c, val-1);
                }
            }
            count += isOK ? words[i].length() : 0;
        }
        
        return count;
    }
}

public class Q1160_Find_Words_That_Can_Be_Formed_by_Characters {
    public static void main(String[] args) {
        Solution1160 s = new Solution1160();
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        int count = s.countCharacters(words, chars);
        System.out.println(count);
        System.out.println(s.countCharacters(
                new String[] {"hello","world","leetcode"},
                "welldonehoneyr"));
    }
}
