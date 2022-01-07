import java.util.Arrays;

public class plusDigit
{
    public static void main(String[] args)
    {
        int[] digits ={9,8,7,6,5,4,3,2,1,0};
        int n= digits.length;
//        converting the array element to a decimal digit
        int digit=0;
        int temp = 0;
        for(int i=0; i<digits.length; i++)
        {
            temp = (int) (digits[i]* Math.pow(10, n-1-i));
            digit = digit + temp;
            System.out.println(digit);
        }
//         incrementing the converted digit by 1
        digit++;
        System.out.println(digit);
        int num = digit;
        int[] digitArray = Integer.toString(num).chars().map(c -> c-'0').toArray();
        for(int d : digitArray)
            System.out.print(d);


        int count = 0;
        int newTemp = digit;
        for (; newTemp != 0; newTemp /= 10, ++count){}


        // now converting the incremented digit back to an array
        int[] digitPlusOne = new int[count];
        int temp2 =0;
        System.out.println(digit);
        for(int i=0; i<count; i++){

            temp2 = (int) (Math.pow(10,i+1));
            digitPlusOne[count-1-i]=digit%temp2;
            digit =(digit - digitPlusOne[count-1-i])/10;
//            System.out.println(digitPlusOne[i]);
        }


        System.out.println("The array is "+ Arrays.toString(digitArray));

    }


}
