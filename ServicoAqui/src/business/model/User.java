package business.model;

/**
 *
 * @author GM
 */
public abstract class User {
    
    public String login;
    public String senha;
    public String nome;
    public String endereco;
    public String telefone;
    public String cpf;
    
    public boolean equals(Object obj) { 
        if (obj == null) 
            return false; 
        if (this.getClass() != obj.getClass()) 
            return false; 
        String name = obj.toString(); 
        return this.toString().equals(name); 
    }
    
    public int hashCode() {
        return this.toString().hashCode();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String toString() { 
        return new StringBuilder 
        (this.getClass().getName()).append("#").append(this.getLogin()).toString();
    }
}
