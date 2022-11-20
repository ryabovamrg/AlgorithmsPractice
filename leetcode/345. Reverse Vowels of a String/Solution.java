class Solution {
      public char[] SwapChars (char[] arr, int idx1, int idx2){
        char tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
        return  arr;
    }

    public boolean isVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U')
            return true;
        else
            return false;
    }

    public String reverseVowels(String s) {
        char[] sArray = s.toCharArray();
        int idx1 = 0;
        int idx2 = sArray.length - 1;

        while(idx1 < idx2 && idx1 <= (sArray.length - 1) && idx2 > 0){

             while (idx1 <= (sArray.length - 1) && !isVowel(sArray[idx1]))
                idx1++;

            while (idx2 >= 0 && !isVowel(sArray[idx2]))
                idx2--;

            if (idx1 < idx2 && isVowel(sArray[idx1]) && isVowel(sArray[idx2]))
                sArray = SwapChars(sArray, idx1, idx2);
            idx1++;
            idx2--;

        }
        return new String(sArray);
    }


}