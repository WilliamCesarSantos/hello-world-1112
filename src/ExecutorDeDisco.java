public class ExecutorDeDisco {

    public Integer voltagem;
    public Integer voltagemInterna;
    public Disco[] bandeja;
    public Integer volume;

    public ExecutorDeDisco(Integer voltagem, Integer voltagemInterna) {
        this.voltagem = voltagem;
        this.voltagemInterna = voltagemInterna;
        this.bandeja = new Disco[3];
        this.volume = 0;
    }

    public void inserirDisco(Disco disco, Integer indice) {
        if (indiceValido(indice)) {
            bandeja[indice] = disco;
        }
    }

    public void removerDisco(Integer indice){
        if (indiceValido(indice)) {
            bandeja[indice] = null;
        }
    }

    public Boolean indiceValido(Integer indice) {
        //Seria o mesmo que um if para checar a condição
        Boolean valido = indice > -1 && indice < bandeja.length;
        return valido;
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
