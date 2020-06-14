package Contato;

import java.util.ArrayList;

import Pessoa.Pessoa;

public class Agenda {
   
    public ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Agenda (){
    }

    public void addPessoa(Pessoa pessoa){
        if(pessoa.comunicavel()){
            pessoas.add(pessoa);
        }else{
            System.out.println("Não é comunicável");
        }
    }
public ArrayList<Pessoa> getPessoas(){
        return this.pessoas;
    }
    public void removePessoa(Pessoa pessoa){
        pessoas.remove(pessoa);
    }
}