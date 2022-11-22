class Solution {
    public boolean isValid(String s) {
         if (s.length() == 0)
            return true;
        if (s.length() % 2 != 0)
            return false;

        char[] sArray = s.toCharArray();
        LinkedList<Character> wantedBrackets = new LinkedList<>();

        HashMap <Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');

        // { [ ] } ---> } ]
        for (int i = 0 ; i < sArray.length; i++){
            if (brackets.containsKey(sArray[i]))
                wantedBrackets.push(brackets.get(sArray[i]));
            else {
                if (wantedBrackets.isEmpty())
                    return false;
                char currChar = wantedBrackets.pop();
                if (currChar != sArray[i])
                    return false;
            }
        }

        if (wantedBrackets.isEmpty())
            return true;
        else
            return false;
    }
}