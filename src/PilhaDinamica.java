public class PilhaDinamica<T> implements StackADT<T> {
    private No inicio;
    private No fim;
    private int tamanho;

    public PilhaDinamica(){
        this.inicio = this.fim = null;
        this.tamanho = 0;
    }

    public No getFim() {
        return fim;
    }

    @Override
    public boolean push(T elemento){
        No novo = new No(elemento);
        if(this.fim == null){
            this.inicio = this.fim = novo;
        } else {
            this.fim.setProximo(novo);
            novo.setAnterior(this.fim);
            this.fim = novo;
        }
        this.tamanho++;
        return true;
    }

    @Override
    public T pop(){
        if(isEmpty()){return null;}
        T atendido = (T) this.fim.getElemento();
        this.fim = this.fim.getAnterior();
        this.fim.setProximo(null);
        this.tamanho--;
        return  atendido;
    }

    @Override
    public T peek(){return (this.inicio == null) ? null : (T)this.inicio.getElemento();}

    @Override
    public boolean isEmpty(){return this.inicio == null;}

    @Override
    public int size(){return this.tamanho;}

    @Override
    public void clear(){
        this.inicio = this.fim = null;
        this.tamanho = 0;
    }

    @Override
    public int search(T item){
        int posicao = 1;
        for(No<T> atual = this.inicio; atual != null; atual = atual.getProximo()){
            if(atual.getElemento().equals(item))
                return posicao;
            posicao++;
        }
        return -1;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[Início] ");
        for (No atual = this.inicio; atual != null; atual = atual.getProximo()){
            sb.append(atual.getElemento());
            if(atual.getProximo() != null) sb.append(", ");
        }
        return sb.append(" [Fim]").toString();
    }
}
