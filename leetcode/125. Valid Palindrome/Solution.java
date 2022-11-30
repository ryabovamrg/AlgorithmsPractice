// Complexity: O(n), n = string length
// Memory: O(n) of given string and O(1) of used data structures

// Idea: using two pointers go through the string: leftPtr goes from the start, rightPtr goes from the end
// Pointers go with different speed comparing only valid symbols, that are found in the given alphabet
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        HashSet <Character> alphabet = new HashSet<Character>(Arrays.asList(
            'a','b','c','d','e','f','g',
            'h','i','j','k','l','m','n',
            'o','p','q','r','s','t','u',
            'v','w','x','y','z','0','1',
            '2','3','4','5','6','7','8','9'));
       
        char[] sArray = s.toCharArray();
        int leftPtr   = 0;
        int rightPtr  = sArray.length - 1;

        while (leftPtr < rightPtr){

            while(!alphabet.contains(sArray[leftPtr]) && leftPtr < rightPtr )
                leftPtr++;
            while(!alphabet.contains(sArray[rightPtr]) && leftPtr < rightPtr )
                rightPtr--;

            if (sArray[leftPtr] == sArray[rightPtr]){
                leftPtr++;
                rightPtr--;
            } else
                return false;        
        }
        return true;
    }
}