// class Solution {
//     public String clearDigits(String s) {
        

// StringBuilder sb = new StringBuilder();

//         for(int i=0; i<s.length(); i++){
//             char c = s.charAt(i);

//             if((c>=48 && c<=57))
//             sb.append(c);

//             else
//             sb.deleteCharAt(sb.length()-1);
//         }
        
//     return sb.toString();


//     }
// }






class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                // digit → delete last character if exists
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                // letter → append
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
