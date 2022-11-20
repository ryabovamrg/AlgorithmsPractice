class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        int tmp = num;
        while(tmp > 0) {
            if (tmp % 2 == 0) {
                tmp /= 2;
            }else{
                tmp -= 1;
            }
            steps++;
        }

        return steps;
    }
}