import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExecutorDeDisco {

    public Integer voltagem;
    public Integer voltagemInterna;
    public Disco[] bandeja;
    public Disco discoSelecionado;
    public Integer volume;

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

    public Boolean indiceValido(Integer indice) {
        //Seria o mesmo que um if para checar a condição
        Boolean valido = indice > -1 && indice < bandeja.length;
        return valido;
    }

    public void selecionarDisco(Integer posicao) {
        indiceValido(posicao);
        discoSelecionado = bandeja[posicao];
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
