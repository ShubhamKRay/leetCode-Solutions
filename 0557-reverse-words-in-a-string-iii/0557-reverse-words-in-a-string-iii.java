class Solution {
    public String reverseWords(String s) {
         String [] str=s.trim().split("\s+");
         String word="";
        for(String p : str){
             word=word+" "+new StringBuilder(p).reverse().toString();
        }
        return word.trim();
    }
}