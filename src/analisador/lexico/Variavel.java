package analisador.lexico;

public class Variavel {
    
    Boolean usado;
    String nome;
    String tipo;
    String valor;
    String indicador;

    public Variavel(String nome, String tipo, String indicador) {
        this.usado = false;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = "0";
        this.indicador = indicador;
    }
    
    public void setUsado(){
        usado = true;
    }

    public Boolean getUsado() {
        return usado;
    }

    public void setUsado(Boolean usado) {
        this.usado = usado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }
    
    public String print(){
        String a = "Nome: " + nome + " Valor: " + valor + " Tipo: " + tipo + " Indicador: " + indicador + " Usado: " + usado;
        return a;
    }
   
    
}
