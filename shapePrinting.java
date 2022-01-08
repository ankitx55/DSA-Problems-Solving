public class shapePrinting
{

    public static void main(String[] args)
    {
        int n= 5;
//        {
//            for(int i=1; i<=n; i++)
//            {
//        for(int j=1;j<=i; j++)
//        {
//            for(int k=n; k>0; k--)
//            {
//                System.out.print(" ");
//            }
//            System.out.print("#");
//        }
//        System.out.println();
//    }

        for(int i=n; i>0; i--)
        {
            for(int j=n; j>i; j--)
            {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println("###");

    }
}
