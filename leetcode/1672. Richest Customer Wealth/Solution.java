class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxCustumerWealth = 0;
        int currCustumerWealth = 0;
        for (int i = 0; i < accounts.length; i++){
            for (int j = 0; j < accounts[i].length; j++){
                currCustumerWealth += accounts[i][j];
            }
            if(currCustumerWealth > maxCustumerWealth)
                maxCustumerWealth = currCustumerWealth;

            currCustumerWealth = 0;
        }

        return maxCustumerWealth;
    }
}