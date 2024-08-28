public class Vetor {
    private String[] vetor;
    private int tamanho;

    public Vetor(int capacidade) {
        this.vetor = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(String valor) {
        if (tamanho < vetor.length) {
            vetor[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("Lista de presentes cheia.");
        }
    }

    public void remover(String valor) {
        int pos = -1;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i].equals(valor)) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            for (int i = pos; i < tamanho - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            tamanho--;
            System.out.println("Presente removido com sucesso !");
        } else {
            System.out.println("Presente não encontrado.");
        }
    }

    public void exibir() {
        if (tamanho == 0) {
            System.out.println("Não áh presentes na lista.");
        } else {
            System.out.print("Presentes na lista: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        }
    }
}