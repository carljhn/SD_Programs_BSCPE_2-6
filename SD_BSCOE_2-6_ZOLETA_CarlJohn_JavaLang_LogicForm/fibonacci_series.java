public class fibonacci_series {
    public static void main(String[] args) {
        int t1 = 0;
        int t2 = 1;
        int num = 10;
        int t3;

        System.out.println("First " + num + " terms: ");
        System.out.println(t1);
        System.out.println(t2);

        // Implementing for loop to obtain the fibonacci sequence 
        for(int i = 1; i < num; i++){
            t3 = t1 + t2;
            System.out.println(t3);
            t1 = t2;
            t2 = t3;
        }
    }
}