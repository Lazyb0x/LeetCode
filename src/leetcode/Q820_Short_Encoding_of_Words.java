package leetcode;

import java.util.HashSet;
import java.util.Set;

class Solution820 {
    public int minimumLengthEncoding(String[] words) {
        Set<String> wordSet = new HashSet<String>();
        int length = 0;
        for (int i=0; i<words.length; i++) {
            
            if (wordSet.add(words[i])) {
                length += words[i].length()+1;
            }
            else {
                //System.out.println("dupl:" + words[i]);
            }
            
            for (int j=1; j<words[i].length(); j++) {
                
                String s = words[i].substring(j);
                wordSet.add(s);
            }
        }
        
        return length;
    }
}

public class Q820_Short_Encoding_of_Words {
    public static void main(String[] args) {
        String[] words = {"time", "ime", "bell"};
        Solution820 s = new Solution820();
        System.out.println(s.minimumLengthEncoding(words));
    }
}
