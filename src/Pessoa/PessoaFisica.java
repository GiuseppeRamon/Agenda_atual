package Pessoa;


public class PessoaFisica extends Pessoa {

    protected String cpf;

    public PessoaFisica(String nome, String cpf) {
        super.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }


}