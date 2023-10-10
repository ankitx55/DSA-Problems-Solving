public class reverseString {
    public static void main(String[] args) {
        char[] s = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(s);
        System.out.println("reversed String would look like this: ");
        revString(s);
        System.out.println(s);

    }

    static void revString(char[] s){
        int i = 0;
        int r = s.length - 1;
        char temp=0;

        while (i < r) {
            temp = s[i];
            s[i] = s[r];
            s[r] = temp;
            i++;
            r--;
        }
    }
}
