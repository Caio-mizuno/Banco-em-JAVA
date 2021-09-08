/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.ArrayList;


/**
 *
 * @author Caio
 */
public class Cliente {
    //ATRIBUTO----------------------------------------------------------------------------
    
    private String nomecliente;
    private int cpf;
    private String telef;
    private String endere;
    private final ArrayList<Conta> contas;
    private final ArrayList<Emprestimo> emprestimo;
   
    //-----------------------------------------------------------------------------
    //MÉTODOS

   public void RemoverEmprestimo(Emprestimo emp){
       this.emprestimo.remove(emp);
   }
   public void RemoverConta(Conta contas){
       this.contas.remove(contas);
   }
   public void alterarConta(Conta contas,int numero,int tipo){
       contas.setNumero(numero);
       contas.setTipo(tipo);
   }
   
   public void adicionarConta(Conta contas){
       this.contas.add(contas);
    
   }
   
    //MÉTODO CONSTRUTOR-------------------------------------------------------------------------
    public  Cliente() {
       contas = new ArrayList<>();
       emprestimo = new ArrayList<>();
    }
   //MÉTODOS ESPECIAIS--------------------------------------------------------

    public String getNomeCliente() {
        return nomecliente;
    }

    public void setNomeCliete(String nome) {
        this.nomecliente = nome;
    }


    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public void setEndere(String endere) {
        this.endere = endere;
    }

    public void setContas(Conta contas) {
        this.contas.add(contas);
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo.add(emprestimo);
    }

    public String getEndere() {
        return endere;
    }


    public int getCpf() {
        return cpf;
    }

    public String getTelef() {
        return telef;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public ArrayList<Emprestimo> getEmprestimo() {
        return emprestimo;
    }
    
   
}
