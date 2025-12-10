class Solution {
    public String removeStars(String s) {
    //     Stack<Character> st = new Stack<>();
    //     for(int i=0; i<s.length(); i++){
    //         char c = s.charAt(i);
    //         if(c != '*')
    //         st.push(c);

    //         else
    //         st.pop();
    //     }
    //     String res="";

    //      for(char c : st)
    //      res = res+c;
    // return res;






//StringBuilder
StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != '*')
            sb.append(c);

            else
            sb.deleteCharAt(sb.length()-1);
        }
        
    return sb.toString();




    }
}