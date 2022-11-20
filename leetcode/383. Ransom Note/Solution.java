class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomCharArr   = ransomNote.toCharArray();
        char[] magazineCharArr = magazine.toCharArray();

        Arrays.sort(ransomCharArr);
        Arrays.sort(magazineCharArr);

        int r;
        int m = 0;

        for (r = 0; r < ransomNote.length(); r++){

            if (m < magazineCharArr.length && ransomCharArr[r] < magazineCharArr[m])
                return false;
            if (m < magazineCharArr.length && ransomCharArr[r] > magazineCharArr[m]){
                while (m < magazineCharArr.length && ransomCharArr[r] != magazineCharArr[m])
                    m++;
            }
            if (m >= magazineCharArr.length)
                return false;
            if(m < magazineCharArr.length && ransomCharArr[r] == magazineCharArr[m]) {
                m++;
            }
        }
        return true;

    }
}