public class countDigits {
    public static void main(String[] args) {
        int num = 73333386;
        int count = counter(num);
        System.out.println(count);

    }

    static int counter(int num){
        int count=0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
}
