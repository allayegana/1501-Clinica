package CadastroPet;

public class Resronsable {
    private String nome;
   private String sobrenome;
    private String cep;
   private String numeroResisdencial;
   private int idade;
   private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroResisdencial() {
        return numeroResisdencial;
    }

    public void setNumeroResisdencial(String numeroResisdencial) {
        this.numeroResisdencial = numeroResisdencial;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    private String telephone;

    public Resronsable(String nome, String sobrenome, String cep, String numeroResisdencial, int idade, String email, String telephone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.numeroResisdencial = numeroResisdencial;
        this.idade = idade;
        this.email = email;
        this.telephone = telephone;
    }


    public String retornarTodosDados() {
        return "Resronsable{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cep='" + cep + '\'' +
                ", numeroResisdencial='" + numeroResisdencial + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public void retornardadosBasicos() {
        if (nome == "nenette") {
            System.out.println("elle est une femme bonne");
            System.out.println("Nome: " + nome + "\n" + "email: " + email);
        }


    }
}