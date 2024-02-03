public class MainDisco {

    public static void main(String[] args) {
        Disco disco = new Disco(
                "Iron man",
                "Toddynho",
                "Forró",
                2000,
                12
        );
        disco.fornecerDados();

        Disco discoDois = new Disco(
                "Iron man",
                "Toddynho",
                "Forró",
                2000,
                12,
                "Avioes",
                "Wesley"
        );

        ExecutorDeDisco executor = new ExecutorDeDisco(110, 30);
        executor.ligar();
        executor.executarFaixa();
    }

}
