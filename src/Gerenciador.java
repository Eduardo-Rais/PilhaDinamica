import filas.FilaDinamica;

public class Gerenciador {
    public FilaDinamica<Posto> fila = new FilaDinamica<>();

    public FilaDinamica<Posto> getFila() {
        return fila;
    }

    public void setFila(FilaDinamica<Posto> fila) {
        this.fila = fila;
    }

    public boolean inserirPosto(Posto posto) {
        if (fila.size() < 5 || fila.isEmpty()) {
            fila.enqueue(posto);
            return true;
        }
        System.out.println("Erro ao inserir posto, limite de 5 postos atingido");
        return false;
    }


    public void menu(){
        System.out.println("O que você deseja fazer?");
        System.out.println("1. Senha normal");
        System.out.println("2. Senha prioritária");
        System.out.println("0. Sair");
    }
}
