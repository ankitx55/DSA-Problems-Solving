public class FinalValueofVariableAfterPerformingOperations {

//    https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

    public static void main(String[] args) {

        String[] operations ={"--X","X++","X++"};
        String[] cases = {"++X","X++", "--X","X--"};
        int num =0;

        for(int i = 0; i< operations.length; i++)
        {
//            in java we can not directly compare the string array element
//            so the equal method is used at that time

            if (operations[i].equals(cases[0]))
                num++;
            else if(operations[i].equals(cases[1]))
                num++;
            else if (operations[i].equals(cases[2]))
                num--;
            else if(operations[i].equals(cases[3]))
                num--;

        }

        System.out.println(num);

    }


}
