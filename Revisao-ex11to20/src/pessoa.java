public class pessoa {
    String nome;
    int idade;
    String mensagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void mostrarDados() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
    }
    public void mostrarMensagem() {
        System.out.println("Mensagem: "+this.mensagem);
    }
}
