class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];

        Arrays.sort(strs);

        char[] prefix = new char[200];
        int prefixLen = 0;
        for(int j = 0; j < strs[0].length(); j++){
            if(strs[0].charAt(j) == strs[1].charAt(j)){
                prefix[j] = strs[0].charAt(j);
                prefixLen++;
            }
            else
                break;
        }

        for (int i = 2; i < strs.length && prefixLen > 0; i++){

            if(prefixLen > strs[i].length())
                prefixLen = strs[i].length();
           while (prefixLen > 0 && strs[i].charAt(prefixLen-1) != prefix[prefixLen-1])
               prefixLen--;
        }
        if (prefixLen < 1)
            return "";

        return new String(prefix,0, prefixLen);
    }
}