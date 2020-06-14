package Pessoa;

import Contato.*;

public abstract class Pessoa implements Comunicavel {

    protected String nome;
    protected Contato contato;

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean comunicavel() {
        return this.contato != null;
    }

}
