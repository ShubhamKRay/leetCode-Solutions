class Solution {
    
        static int[] fibMemory;
        public int fib(int n){
            if(n<2)
            return n;
            fibMemory=new int [n+1];
            fibMemory[0]=0;
            fibMemory[1]=1;
            return getFib(n);
        }
        public int getFib(int n){
            if(n==0 || n==1)
            return n;
            if(fibMemory[0]!=0)
            return fibMemory[0];
            fibMemory[n]=getFib(n-1)+getFib(n-2);
            return fibMemory[n];
        }
    }
