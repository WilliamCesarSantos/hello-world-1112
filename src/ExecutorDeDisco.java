public class ExecutorDeDisco {

    //Modificadores de acesso[public, private, protected, default(package)]
    // Modificador public - Todos os objetos tem acesso.
    // Modificador private - Apenas o próprio objeto tem acesso
    // Modificador protected - Tem acesso o próprio objeto, seus herdeiros e quem esta no mesmo pacote
    // Modificador default(package) - Tem acesso próprio objeto e quem estiver no mesmo pacote
    private final Integer voltagem;
    private final Integer voltagemInterna;
    private Disco[] bandeja;
    private Disco discoSelecionado;
    private Integer volume;

    public ExecutorDeDisco(Integer voltagem, Integer voltagemInterna) {
        this.voltagem = voltagem;
        this.voltagemInterna = voltagemInterna;
        this.bandeja = new Disco[3];
        this.volume = 0;
    }

    //inserirDisco+disco+integer
    //Assinatura do método é composta pelo nome + parâmetros (ordem do parâmetros é importante)
    public void inserirDisco(Disco disco, Integer indice) {
        if (indiceValido(indice)) {
            bandeja[indice] = disco;
        }
    }

    public Disco removerDisco(Integer indice) {
        Disco discoRemovido = null;
        if (indiceValido(indice)) {
            discoRemovido = bandeja[indice];
            bandeja[indice] = null;
        }
        return discoRemovido;
    }

    private Boolean indiceValido(Integer indice) {
        //Seria o mesmo que um if para checar a condição
        Boolean valido = indice > -1 && indice < bandeja.length;
        return valido;
    }

    public void selecionarDisco(Integer posicao) {
        if (indiceValido(posicao)) {
            discoSelecionado = bandeja[posicao];
        }
    }

    public void reproduzir() {
        String dados = discoSelecionado.fornecerDados();
        System.out.println("Reproduzindo: " + dados);
    }

    public void executarFaixa() {

    }

    public void proximaFaixa() {

    }

    public void faixaAnterior() {

    }

    public void aumentarVolume() {

    }

    public void diminuirVolume() {

    }

    public void ligar() {

    }

    public void desligar() {

    }

}
