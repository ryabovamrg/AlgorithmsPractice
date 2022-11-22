class Solution {

    public int getPositiveNumberLength (int x) {
        int len = 0;

        while (x >= 10){
            x /= 10;
            len++;
        }
        len++;
        return len;
    }


    public boolean isPalindrome(int x) {
        if ( x < 0)
            return false;

        int len = getPositiveNumberLength(x);
        int inverted = 0;
        int input = x;

        while(len > 0){
            inverted = inverted + (input%10) * (int)Math.pow(10,len-1);
            len--;
            input /= 10;
        }

        if (x == inverted)
            return true;
        else
            return false;
    }
}