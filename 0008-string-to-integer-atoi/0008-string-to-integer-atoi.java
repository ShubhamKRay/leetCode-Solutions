class Solution {
    public int myAtoi(String s) {
        
        int i=0, ans=0, sign=1;
        while(i<s.length() && s.charAt(i) ==' ')
        i++;
        if(i==s.length())
        return 0;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;

        } else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int number = s.charAt(i) - '0';
            i++;
            if(ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && number > Integer.MAX_VALUE %10)){
                if(sign == -1)
                return Integer.MIN_VALUE;
                else
                return Integer.MAX_VALUE;
            }
            ans = ans * 10 + number;
        }
        return sign * ans;
    }
}