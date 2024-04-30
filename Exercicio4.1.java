import java.util.HashMap;
import java.util.Map;

public class FibonacciRecursivoComMemoizacao {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int resultado;
        if (n <= 1) {
            resultado = n;
        } else {
            resultado = fibonacci(n - 1) + fibonacci(n - 2);
        }
        
        memo.put(n, resultado);
        return resultado;
    }

    public static void main(String[] args) {
        int n = 10;
        int resultado = fibonacci(n);
        System.out.println("O número de Fibonacci na posição " + n + " é: " + resultado);
    }
}
