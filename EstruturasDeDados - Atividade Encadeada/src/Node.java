public class Elemento<T> {
    private T valor;
    @SuppressWarnings("rawtypes")
    private Elemento proximo;

    public Elemento(T valor) {
        this.valor = valor;
        this.proximo = null;
    }

    @SuppressWarnings("unchecked")
    public Elemento<T> getProximo() {
        return this.proximo;
    }

    @SuppressWarnings("rawtypes")
    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public T getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.valor.toString();
    }

    public void setValor(T novoValor) {
        throw new UnsupportedOperationException("Método 'setValor' não implementado.");
    }
}
