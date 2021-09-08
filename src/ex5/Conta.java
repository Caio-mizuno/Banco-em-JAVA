package ex5;



public class Conta{
//ATRIBUTOS------------------------------------------------------------------------------------    
    private int numero, tipo;
    private float saldo;
//MÉTODO CONSTRUTOR ---------------------------------------------------------------------
    public Conta(){
      saldo = 0;    
    }
    
//SETTERS E GETTERS  --------------------------------------------------------------
   
    
    
    public float getSaldo(){return this.saldo;}//mostra o saldo
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    } 
    public int getNumero() {
        return numero;
    }
    
   public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public int getTipo() {
        return tipo;
    }

//MÉTODOS -----------------------------------------------------------------------
   
    public void Deposito(float deposito){
        
        this.saldo = saldo + deposito;  
    }
    
    
    public void Saque(Conta conta,float saque){
        if ((saque>0) && (saque<conta.getSaldo())){ conta.setSaldo(conta.getSaldo()- saque);
        System.out.println("Seu SAQUE foi realizado com SUCESSO!");}
        else{ System.out.println("SALDO INSUFICIENTE!");}
    }
    
    

}

