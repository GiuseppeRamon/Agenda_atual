package Contato;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Contato {
  
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    protected String dataCadastro = sdf.format(new Date());
   
    
    private String email;
    private String telefone;

    public Contato(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataCadastro() {
        return this.dataCadastro;
    }

}
