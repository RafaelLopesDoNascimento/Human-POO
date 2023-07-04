import Pessoa.PessoaCaracters;

public class Main {
    public static void main(String[] args) {

        PessoaCaracters rafael = new PessoaCaracters();

        rafael.altura = 1.58;
        rafael.idade = 20;
        rafael.nome = "Rafael";
        rafael.casado = false;


      rafael.ver();
      rafael.andar();
        System.out.println(rafael.correndo());

        System.out.println(rafael.comprimetarPessoa("Ola"));
    }
}