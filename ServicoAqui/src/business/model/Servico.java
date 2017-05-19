package business.model;

/**
 *
 * @author GM
 */
public class Servico {
    
    private String nomeServico, colaborador, descricao, tipo;
    private boolean atendimento;
    private double preco, avaliacao;
    
    public Servico(String nomeServico, String colaborador, String tipo, 
            double preco, String descricao, double avaliacao, boolean atendimento){
        
        super();
        this.nomeServico = nomeServico;
        this.colaborador = colaborador;
        this.tipo = tipo;
        this.preco = preco;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
        this.atendimento = atendimento;
    }
    
    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAtendimento() {
        return atendimento;
    }

    public void setAtendimento(boolean atendimento) {
        this.atendimento = atendimento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString(){
        return ("Serviço: " + nomeServico + "\tColaborador: " + colaborador + "\tTipo de Serviço: " + tipo + 
                "\tValor: " + preco + "\tDescrição: " + descricao + "\tQualidade: " + avaliacao + "\tFinal de Semana: " + atendimento);
    }
}
