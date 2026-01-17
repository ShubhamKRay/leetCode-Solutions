class Solution {
    public int[] sortArray(int[] a) {
      
        int n =a.length;
        for (int i=n/2-1; i>=0; i--)
            heapify(a,i,n);
        //loop
        for (int i=n-1; i>=0; i--){
            swap(a,0,i);
            heapify(a,0,i);

        }
        return a;
    }

    public static void heapify(int [] a, int i, int n){
        int largest=i, left=2*i+1, right=2*i+2;
        if(left<n && a[left]>a[largest])
            largest=left;
        if(right<n && a[right]>a[largest])
            largest=right;
        if (i!=largest){
            swap(a,largest,i);
            heapify(a,largest,n);
        }
    }

    public static void swap(int [] a , int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    }
