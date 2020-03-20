package leetcode;

public class Tools {
//    public static Integer[][] parseIntGrid(String s){
//        
//    }
    
    
    private static int parseInt(String s, int p){
        int i = 0;
        int val = 0;
        boolean isMinus = false;
        if (s.charAt(p)=='-') {
            isMinus = true;
            i++;
        }
        for (; i<s.length(); i++) {
            int n = s.charAt(p+i)-'0';
            if (n<0 || n>9) break;
            val = val*10 + n;
        }
        return isMinus ? -val : val;
    }
    
    public static int test(Integer in) {
        ;
        return in;
    }
    
    public static void main(String[] args) {
        Integer x = 1;
        test(x);
        System.out.println(x);
    }
}