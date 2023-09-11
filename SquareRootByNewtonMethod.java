public class SquareRootByNewtonMethod {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(int n){
        double root;
        double  x = n;
        int i=0;
        while (true) {
            root = 0.5 * (x + (n / x));
            i++;
            if (Math.abs(root-x)<0.5){
                break;
            }
            x=root;
        }
//        To see the numbers of times the loop ran
        System.out.println(i);
        return root;
    }
}
