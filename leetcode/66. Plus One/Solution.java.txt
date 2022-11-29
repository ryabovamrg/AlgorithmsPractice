/*
 [1,2,3] + 1 = [1,2,4]

 [4,3,2,1] + 1 = [4,3,2,2]

 [9] + 1 = [1, 0]

 [1,2,9] + 1 = [1, 3, 0]

 [9,9] + 1 = [1, 0, 0]

 [8,9] + 1 = [9, 0]
*/

class Solution {
    public int[] plusOne(int[] digits) {
        boolean needToIncrement = false;

        for (int i = digits.length - 1; i >= 0; i--){
            if (needToIncrement){
                // 0-8 --> 1-9
                // 9  ---> 0 & needToIncrement after
                if(digits[i] < 9){
                    digits[i]++;
                    needToIncrement = false;
                    break;
                }else if(digits[i] == 9){
                    digits[i] = 0;
                    needToIncrement = true;
                }
            }

            if(digits[i] < 9 && !needToIncrement){
                digits[i]++;
                break;
            }

            needToIncrement = true;
            digits[i] = 0;
        }

        if (needToIncrement){
            // return [1] + digits
            int[] updatedDigits = new int[digits.length+1];
            updatedDigits[0] = 1;
            System.arraycopy(digits, 0, updatedDigits, 1, digits.length);
            return updatedDigits; 
        }else{
            return digits;
        }
        
    }
}