public class Disco {

    //Atributos ou propriedades descrevem as caracteristicas de um objeto
    public String nome;
    public String autor;
    public String genero;
    public Integer anoLancamento;
    public Integer numeroFaixas;
    public String subtitulo;
    public String participacoes;

    //Assinatura de método (nome + parametros)
    public Disco(
            String nome,
            String autor,
            String genero,
            Integer anoLancamento,
            Integer numeroFaixas
    ) {
        this(nome, autor, genero, anoLancamento, numeroFaixas, null, null);
    }

    public Disco(
            String nome,
            String autor,
            String genero,
            Integer anoLancamento,
            Integer numeroFaixas,
            String subtitulo,
            String participacoes
    ) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.numeroFaixas = numeroFaixas;
        this.subtitulo = subtitulo;
        this.participacoes = participacoes;
    }

    // Acoes são descritas como métodos
    // Visibilidade + tipo de retorno + nome do método
    public String fornecerDados() {
        return "la la la la la la la la";
    }

}
