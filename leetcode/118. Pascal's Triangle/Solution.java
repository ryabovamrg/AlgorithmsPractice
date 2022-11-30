class Solution {
    /*
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        // initial cases: numRows == 1 or  numRows == 2 
        // 1
        ArrayList<Integer> zeroRow = new ArrayList<>();
        zeroRow.add(1);
        triangle.add(zeroRow);
        if (numRows == 1)
             return triangle;
        
        // 1
        // 1 1
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1); firstRow.add(1);
        triangle.add(firstRow);
        if (numRows == 2)
             return triangle;

        // general cases: numRws > 2
        int currRowIdx = 2;
        ArrayList<Integer> currRow = new ArrayList<>();
        while (currRowIdx < numRows){
            // calculte values for currRow and add them
            currRow.add(triangle.get(currRowIdx-1).get(0));
            for (int i = 0; i < currRowIdx - 1; i++){
                int currValue = triangle.get(currRowIdx-1).get(i) + triangle.get(currRowIdx-1).get(i + 1);
                currRow.add(currValue);
            }
            currRow.add(triangle.get(currRowIdx-1).get(currRowIdx-1));

            // add curr row to the triangle
            triangle.add(currRow);
            // reset currRow
            currRow = new ArrayList<>();
            // move row ptr
            currRowIdx++;
        }     
        return triangle;
    }
}