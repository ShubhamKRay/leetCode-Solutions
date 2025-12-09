class Solution {
    public String reverseWords(String s) {
         String word="", temp="";
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c!=' ')
            temp=temp+c;
            if((c==' ' || i==s.length()-1) && temp.length() > 0){
                word = temp+" "+word;
                temp="";
            }
        }
        return word.trim();
    }
}
