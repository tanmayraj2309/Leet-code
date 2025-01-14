class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n= A.length;
        int[] c= new int[n];
        HashSet<Integer> seenA= new HashSet<>();
        HashSet<Integer> seenB= new HashSet<>();
         
         int comcount=0;
        for(int i=0;i<n;i++){

            if(seenB.contains(A[i])){
                comcount++;
            }

            seenA.add(A[i]);

            if(seenA.contains(B[i])){
                comcount++;
            }

            seenB.add(B[i]);

            c[i]=comcount;
        }
        return c;
    }
}