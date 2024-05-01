import java.util.Scanner;

public class userInput
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();     // Storing input in Integer inp.
        in.nextLine();              // this enables below line to take input from the user
        String str = in.nextLine(); // Storing inputs in String type str variable.
        System.out.println(str);
        System.out.println(inp);
    }
}
