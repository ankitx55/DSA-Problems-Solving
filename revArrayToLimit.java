import java.util.Arrays;
import java.util.Scanner;

public class revArrayToLimit
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int T = inp.nextInt();

        for (int n = 0; n < T; n++)
        {
            int l = inp.nextInt();
            int d = inp.nextInt();

            int array[] = new int[l];

            //  taking input for the target array
            for (int a = 0; a < l; a++)
            {
                array[a] = inp.nextInt();
            }
//        initializing an empty array to store reversed element

            int revArray[] = new int[l];


            for (int i = 0; i < l; i++)
            {
                if (i < l - d)
                    revArray[i] = array[i + d];
                else if (i >= l - d)
                {
                    for (int j = 0; j < d; j++)
                    {
                        revArray[i + j] = array[j];
                    }
                    break;

                }
            }
            System.out.println(Arrays.toString(revArray));
        }
    }
}