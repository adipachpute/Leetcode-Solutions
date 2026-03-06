class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits[digits.length - 1] < 9){
            digits[digits.length - 1]++;
            return digits;
        }
        
        else{
            int i = digits.length - 1;
            while(i >= 0 && digits[i] == 9){
                digits[i] = 0;
                i--;
            }

            if(i >= 0){
                digits[i]++;
                return digits;
            }
            
            else{
                int myDigits[] = new int[(digits.length+1)];
                myDigits[0] = 1;
                return myDigits;
            }
        }
    }
}