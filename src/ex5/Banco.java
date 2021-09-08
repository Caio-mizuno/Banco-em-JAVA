
package ex5;


import java.util.ArrayList;


public class Banco {
//ATRIBUTOS 
  private String nomebanco,endereco;
  private int cnpj;
  private final  ArrayList<Cliente> cliente;

    
  
//METODO CONSTRUTOR
    public Banco(String nom, String end,int cnp) {
        
        nomebanco = nom;
        endereco = end;
        cnpj = cnp;
        cliente = new ArrayList<>();
        
        
    }
//METODOS SETTER E GETTER

    public String getNomeBanco() {
        return nomebanco;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getCnpj() {
        return cnpj;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }
        
    public void setNomeBanco(String nome) {
        this.nomebanco = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setCliente(Cliente cliente) {
        this.cliente.add(cliente);
    }
    
//METODOS    
    public void removerCliente(Cliente cliente){
        this.cliente.remove(cliente);
    }
    public void alterarCliente(Cliente cl, int cpf, String nome, String end, String tel){
        cl.setNomeCliete(nome);
        cl.setCpf(cpf);
        cl.setEndere(end);
        cl.setTelef(tel);
        
    }
 
   
   
   
  
}
