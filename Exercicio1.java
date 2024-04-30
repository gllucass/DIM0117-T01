public class Main {
    public static int buscaSequencialRecursiva(int[] vetor, int x, int indice) {
        if (indice == vetor.length) {
            return -1;
        }
        if (vetor[indice] == x) {
            return indice;
        }
        return buscaSequencialRecursiva(vetor, x, indice + 1);
    }

    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9, 11, 15, 20,};
        int x = 15;
        int indice = buscaSequencialRecursiva(vetor, x, 0);
        if (indice != -1) {
            System.out.println("O elemento " + x + " está no índice " + indice + ".");
        } else {
            System.out.println("O elemento " + x + " não foi encontrado no vetor.");
        }
    }
}
