class Solution {
    public int reverse(int x) {

        long num = x;
        boolean neg = false;

        if(num < 0){
            neg = true;
            num = -num;
        }

        long rev = Long.parseLong(
            new StringBuilder(String.valueOf(num))
            .reverse()
            .toString()
        );

        if(neg){
            rev = -rev;
        }

        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE){
            return 0;
        }

        return (int)rev;
    }
}