public class ListaUniBH<T extends Comparable<T>> {
    private No<T> primeiroNo;
    private int quantidadeElementos;

    public void adicionarNoInicio(T valor) {
        No<T> novoNo = new No<>(valor);
        novoNo.setProximo(primeiroNo);
        primeiroNo = novoNo;
        quantidadeElementos++;
    }

    public void adicionarNoFinal(T valor) {
        No<T> novoNo = new No<>(valor);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
        } else {
            No<T> atual = primeiroNo;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
        quantidadeElementos++;
    }

    public boolean procurar(T valor) {
        No<T> atual = primeiroNo;
        while (atual != null) {
            if (atual.getValor().equals(valor)) return true;
            atual = atual.getProximo();
        }
        throw new RuntimeException("Elemento não encontrado na lista.");
    }

    public void removerPorValor(T valor) {
        if (primeiroNo == null) throw new RuntimeException("Lista vazia.");
        if (primeiroNo.getValor().equals(valor)) {
            primeiroNo = primeiroNo.getProximo();
            quantidadeElementos--;
            return;
        }
        No<T> atual = primeiroNo;
        while (atual.getProximo() != null && !atual.getProximo().getValor().equals(valor)) {
            atual = atual.getProximo();
        }
        if (atual.getProximo() == null) throw new RuntimeException("Elemento não encontrado na lista.");
        atual.setProximo(atual.getProximo().getProximo());
        quantidadeElementos--;
    }

    public boolean estaVazia() {
        return quantidadeElementos == 0;
    }

    public void inserirDepois(int indice, T valor) {
        if (indice < 0 || indice >= quantidadeElementos) throw new RuntimeException("Índice fora dos limites.");
        No<T> novoNo = new No<>(valor);
        No<T> atual = primeiroNo;
        for (int i = 0; i < indice; i++) {
            atual = atual.getProximo();
        }
        novoNo.setProximo(atual.getProximo());
        atual.setProximo(novoNo);
        quantidadeElementos++;
    }

    public void removerNo(int indice) {
        if (indice < 0 || indice >= quantidadeElementos) throw new RuntimeException("Índice fora dos limites.");
        if (indice == 0) {
            primeiroNo = primeiroNo.getProximo();
        } else {
            No<T> atual = primeiroNo;
            for (int i = 0; i < indice - 1; i++) {
                atual = atual.getProximo();
            }
            atual.setProximo(atual.getProximo().getProximo());
        }
        quantidadeElementos--;
    }

    public int tamanho() {
        return quantidadeElementos;
    }

    public void alterarElemento(T valorAntigo, T valorNovo) {
        No<T> atual = primeiroNo;
        while (atual != null) {
            if (atual.getValor().equals(valorAntigo)) {
                atual.setValor(valorNovo);
                return;
            }
            atual = atual.getProximo();
        }
        throw new RuntimeException("Elemento não encontrado na lista.");
    }

    public void removerNoInicio() {
        throw new UnsupportedOperationException("Método 'removerNoInicio' não implementado.");
    }
}
