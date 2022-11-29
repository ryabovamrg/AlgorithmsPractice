class Solution {
    public int climbStairs(int n) {
        

        // n = 4
        // n = 3 ---> 3
        // n = 2 ---> 2

        // n = 4:  n-1 + (n-2) = 5



        /*
            n = 3
            1 step + 1 step + 1 step
            1 step + 2 steps
            2 steps + 1 step
        */

        /*
            n = 4

            1 step + 1 step  + 1 step +  1 step

            2 steps + 1 step + 1 step  
            1 step + 2 steps + 1 step   
            1 step + 1 step  + 2 steps 
            
            2 steps + 2 steps  
        */

        /*
            n = 5
            1 step + 1 step + 1 step + 2
            1 step + 2 steps         + 2
            2 steps + 1 step         + 1

            1 step + 1 step  + 1 step +  1 step + 1
            2 steps + 1 step + 1 step           + 1
            1 step + 2 steps + 1 step           + 1
            1 step + 1 step  + 2 steps          + 1
            2 steps + 2 steps                   + 1

        // n = 5:  5 + 3 = 8
        */
 
        // n =  n-1 + (n-2)

        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
            

        int currSteps = 0;
        int n_1Steps = 1;
        int n_2Steps = 2;


        for (int i = 2; i < n; i++){
            currSteps = n_1Steps + n_2Steps;
            n_1Steps = n_2Steps;
            n_2Steps = currSteps;
        }

        return currSteps;


    }
}