import java.util.*;
public class beautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[5][5];
        int a=-1, b=-1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
//                System.out.print("Enter element at position (" + (i+1) + ", " + (j+1) + "): ");
                matrix[i][j] = scanner.nextInt();
                if(matrix[i][j]>0){
                    a=i+1;
                    b=j+1;
                }
            }
        }
        scanner.close();


        int distance = (Math.abs(a-3)) + (Math.abs(b-3));
        System.out.println(distance);


    }

}
