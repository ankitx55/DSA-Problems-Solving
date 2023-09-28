public class recursion1 {
    public static void main(String[] args) {
        int x = 5;
        hiFunc(x);
        fun2(x);

    }


    static void hiFunc(int x){
        while(x>0) {
            System.out.println("Hello" + x);
            x--;
        }

    }

    static void fun2(int x){
        hiFunc(x-1);
    }

}
