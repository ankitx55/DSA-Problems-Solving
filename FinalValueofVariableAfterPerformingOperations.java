public class FinalValueofVariableAfterPerformingOperations {

    public static void main(String[] args) {

        String[] operations ={"--X","X++","X++"};
        String[] cases = {"++X","X++", "--X","X--"};
        int num =0;

        for(int i = 0; i< operations.length; i++)
            if (operations[i] == cases[0] || operations[i] == cases[1])
                num += 1;
            else if (operations[i] == cases[2] || operations[i] == cases[3])
                num -= 1;

        System.out.println(num);

    }


}
