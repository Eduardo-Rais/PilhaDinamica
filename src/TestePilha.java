public class TestePilha {
    static void main(String[] args) {
        PilhaDinamica<String> pilha = new PilhaDinamica<>();
        System.out.println(pilha.isEmpty());
        pilha.push("Jô");
        pilha.push("João");
        pilha.push("Marta");
        System.out.println(pilha.isEmpty());
        System.out.println(pilha.size());
        System.out.println(pilha);
        System.out.println(pilha.search("Marta"));
        pilha.pop();
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
        pilha.clear();
        System.out.println(pilha.search("Jô"));
    }
}
