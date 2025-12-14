class Solution {
    public int[] getConcatenation(int[] a) {
        int [] b = new int[a.length*2];
        for(int i=0; i<a.length; i++){
            b[i]=a[i];
            b[a.length+i] = a[i];
        }
        return b;
    }
}