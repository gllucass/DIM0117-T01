public class BinarySearch {
    public static int buscaBinariaIterativa(int[] vetor, int x) {
        int esquerda = 0;
        int direita = vetor.length - 1;
        
        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            
            if (vetor[meio] == x) {
                return meio; // Elemento encontrado
            } else if (vetor[meio] < x) {
                esquerda = meio + 1; // Procurar na metade direita
            } else {
                direita = meio - 1; // Procurar na metade esquerda
            }
        }
        
        return -1; // Elemento não encontrado
    }

    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int x = 13;
        int indice = buscaBinariaIterativa(vetor, x);
        if (indice != -1) {
            System.out.println("O elemento " + x + " está no índice " + indice + ".");
        } else {
            System.out.println("O elemento " + x + " não foi encontrado no vetor.");
        }
    }
}
