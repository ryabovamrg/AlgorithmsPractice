class Solution {
        
    public int romanToInt(String s) {
        
        int result = 0;
        char[] romanChars = s.toCharArray();

        for (int i = 0; i < romanChars.length; i++){
             int j = i+1;
            
            // s contains only the characters 'I', 'V', 'X', 'L', 'C', 'D', 'M'.
            switch (romanChars[i]){
                case 'I':
                    if(j < romanChars.length && romanChars[j] == 'V'){
                        result += 4;
                        i = ++j;
                    }
                    else if(j < romanChars.length && romanChars[j] == 'X') {
                        result += 9;
                        i++;
                    }
                    else
                        result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if(j < romanChars.length && romanChars[j] == 'L'){
                        result += 40;
                        i++;
                    }
                    else if(j < romanChars.length && romanChars[j] == 'C') {
                        result += 90;
                        i++;
                    }
                    else
                        result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if(j < romanChars.length && romanChars[j] == 'D'){
                        result += 400;
                        i++;
                    }
                    else if(j < romanChars.length && romanChars[j] == 'M') {
                        result += 900;
                        i++;
                    }
                    else
                        result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    break;
            }
        }
        return result;       
    }
}
