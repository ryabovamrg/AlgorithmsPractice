class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
   HashMap<Integer,Integer> rowsStrengthsHashMap = new HashMap<>();

        // rows
        for (int i = 0; i < mat.length; i++){
            // elements in the row
            int rowSum = 0;
            for (int j = 0; j < mat[0].length; j++){
                rowSum += mat[i][j];
            }
            rowsStrengthsHashMap.put(i,rowSum);
        }

        int currMin = Integer.MAX_VALUE;
        int currMinRow = Integer.MAX_VALUE;
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            for(Map.Entry<Integer, Integer> entry : rowsStrengthsHashMap.entrySet()) {
                if (entry.getValue() < currMin){
                    currMin = entry.getValue();
                    currMinRow = entry.getKey();
                }
            }
            result[i] = currMinRow;
            rowsStrengthsHashMap.remove(currMinRow);
            currMin = Integer.MAX_VALUE;
            currMinRow = Integer.MAX_VALUE;
        }

        return result;
    }
}