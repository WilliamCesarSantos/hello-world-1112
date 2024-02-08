public class ExecutorDiscoVinil extends ExecutorDeDisco{

    private DiscoVinil discoVinil;

    protected ExecutorDiscoVinil(Integer voltagem, Integer voltagemInterna) {
        super(voltagem, voltagemInterna);
    }

    @Override
    public void inserirDisco(Disco disco) {
        this.discoVinil = (DiscoVinil) disco;
    }

    @Override
    public Disco removerDisco() {
        var discoRemovido = discoVinil;
        this.discoVinil = null;
        return discoRemovido;
    }

    @Override
    public void reproduzir() {
        super.reproduzir(discoVinil);
    }

}
