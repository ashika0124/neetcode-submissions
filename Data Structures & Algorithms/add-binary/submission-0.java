class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while(i >= 0 || j >= 0 || carry > 0){
            int A = i >= 0 ? a.charAt(i) - '0' : 0;
            int B = j >= 0 ? b.charAt(j) - '0' : 0;
            int total = A + B +carry;
            res.append(total % 2);
            carry = total / 2;
            i--;
            j--;
        }
        return res.reverse().toString();
    }
}