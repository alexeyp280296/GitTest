public class FactorialRecursion {
    public static void main(String[] args) {
        Factorial f1 = new Factorial();
        System.out.println(f1.fact(4));
    }
}

class Factorial {
    int fact (int n){
        int result;

        if (n==1) return 1;
        result = fact(n-1)*n;
        System.out.println(result);
        return result;
    }
}