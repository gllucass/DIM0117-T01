public class FibonacciIterativo {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        int fibNMinus2 = 0;
        int fibNMinus1 = 1;
        int fibN = 0;
        
        for (int i = 2; i <= n; i++) {
            fibN = fibNMinus1 + fibNMinus2;
            fibNMinus2 = fibNMinus1;
            fibNMinus1 = fibN;
        }
        
        return fibN;
    }

    public static void main(String[] args) {
        int n = 10;
        int resultado = fibonacci(n);
        System.out.println("O número de Fibonacci na posição " + n + " é: " + resultado);
    }
}
