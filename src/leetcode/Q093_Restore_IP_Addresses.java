package leetcode;

import java.util.LinkedList;
import java.util.List;

class Solution93 {
    List<String> ips;

    public List<String> restoreIpAddresses(String s) {
        ips = new LinkedList<String>();
        restore(s, "", 0, 0);
        return ips;
    }
    
    public void restore(String s, String seg, int p, int depth) {
        if (depth==4) {
            ips.add(seg);
//            System.out.println(seg);
            return;
        }
        if (depth<3) {
            for (int i=1; i<=3; i++) {
                if (isValid(s, p, i)) {
                    String tmp = seg + s.substring(p, p+i) + '.';
                    restore(s, tmp, p+i, depth+1);
                }
            }
        }
        else {  //depth==4
            if (isValid(s, p, s.length()-p)) {
                String tmp = seg + s.substring(p);
                restore(s, tmp, p, depth+1);
            }
        }
    }
    
    /**
     * 判断截取的字符串是否符合ipv4点分十进制的要求
     */
    public boolean isValid(String s, int p, int n) {
        if (p+n>s.length()) return false;           //数组越界的情况
        if (n<=0 || n>3) return false;              //大于三位的一定大于255
        if (s.charAt(p)=='0' && n!=1) return false; //0 开头的不行
        
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res * 10 + s.charAt(p + i) - '0';
        }
        return 0 <= res && res <= 255;
    }
}

public class Q093_Restore_IP_Addresses {
    public static void main(String[] args) {
        Solution93 s = new Solution93();
        String w = "010010";
        System.out.println(s.restoreIpAddresses(w));
    }
}
