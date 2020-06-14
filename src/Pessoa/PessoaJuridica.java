package Pessoa;

public class PessoaJuridica extends Pessoa {

    protected String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super.nome = nome;
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }


}