class Solution {
    public int reverseBits(int n) {
       StringBuilder bits = new StringBuilder();
       for(int i = 0; i < 32; i++) {
            if((n & ( 1<< i )) != 0){
                bits.append("1");
            } else{
                bits.append("0");
            }
       }
       int res = 0;
       String reversed = bits.reverse().toString();
       for(int i = 0; i< 32; i++){
        if(reversed.charAt(i) == '1'){
            res |= (1 << i);
        }
       }
       return res;
    }
}
