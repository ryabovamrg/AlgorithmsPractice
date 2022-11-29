class Solution {
   

    // 25
    // 1,  4,   8,     17,        25

    // 8
    // 1,      4        8


    public int binarySearch(int x, long leftBoarder, long rightBoarder){
        
        if (rightBoarder-leftBoarder <= 1)
            return (int)leftBoarder;

        if(leftBoarder < 0 || rightBoarder > x)
            return -1;

        long middle = (leftBoarder + rightBoarder)/2;
        
        if (middle*middle == x)
            return (int)middle;
        if (middle*middle > x)
            return binarySearch(x, leftBoarder, middle);
        if (middle*middle < x)
            return binarySearch(x, middle, rightBoarder);

        return -1;
    }

    public int mySqrt(int x) {
        
        if (x == 0) return 0;
        if (x == 1) return 1;

        int num = binarySearch (x, 0, x);

        return num;
    }
}