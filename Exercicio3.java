public class VerificaOrdenacao {
    public static boolean estaOrdenado(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false; // Vetor não está ordenado
            }
        }
        return true; // Vetor está ordenado
    }

    public static void main(String[] args) {
        int[] vetorOrdenado = {1, 2, 3, 4, 5};
        int[] vetorNaoOrdenado = {1, 3, 2, 4, 5};
        
        System.out.println("Vetor ordenado: " + estaOrdenado(vetorOrdenado));
        System.out.println("Vetor não ordenado: " + estaOrdenado(vetorNaoOrdenado));
    }
}
