class Solution {
    public String longestDiverseString(int a, int b, int c) {
         int maxlen= a+b+c;
         int ca=0;
         int cb=0;
         int cc=0;
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<maxlen;i++){
            if((a>=b && a>=c && ca!=2)|| (cb==2 && a>0)||(cc==2 &&a>0)){
                sb.append("a");
                a=a-1;
                ca=ca+1;
                cb=0;
                cc=0;
         }

         else if((b>=a && b>=c && cb!=2)|| (ca==2&& b>0)|| (cc==2 && b>0)){
            sb.append("b");
            b=b-1;
            cb=cb+1;
            ca=0;
            cc=0;
         }
         else if((c>=a && c>=b && cc!=2) || (ca==2 && c>0)|| (cb==2&&c>0)){
            sb.append("c");
            c=c-1;
            cc=cc+1;
            ca=0;
            cb=0;
         }
         else {
            break;
         }
         }
         return sb.toString();
        
    }
}