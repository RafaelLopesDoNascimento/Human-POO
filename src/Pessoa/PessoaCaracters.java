package Pessoa;

public class PessoaCaracters {
    public String nome;
    public int idade;
    public double altura;
    public boolean casado;

    public String falar;


//    metodos abaixo

    public void  ver() {

    }
    public void  andar() {
        System.out.println(nome + " esta andando");
    }

    public String correndo() {


        return nome + " esta correndo";
    }

public String comprimetarPessoa(String acao) {
    if (acao.equals("Ola") || acao.equals("Oi")) {
        this.falar = "ola, tudo bem ?";

    } else {
        this.falar = "";
    }
    return falar;
}
}