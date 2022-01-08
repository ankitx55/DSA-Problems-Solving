import java.util.Scanner;

public class userInput
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();
        in.nextLine(); //this enables below line to take input from the user
        String str = in.nextLine();
        System.out.println(str);
        System.out.println(inp);
    }
}
