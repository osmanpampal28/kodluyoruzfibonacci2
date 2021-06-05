public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=0;i<7;i++){
            System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
