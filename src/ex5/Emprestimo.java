package ex5;

public class Emprestimo {
//ATRIBUTOS-------------------------------------------------------------    
    private int numeroEmprestimo,tipo, qtParcela;
    private String dataContrato;
    private float parcela;
    private float valorTotal,saldoRestante;
    protected Conta contaRetirada;
//MÉTODO CONSTRUTOR--------------------------------------------------------------------

    public  Emprestimo() {
            
        }
   
    
//MÉTODOS Principais-----------------------------------------------------------------------
  
   
   public void pagarParcela(Conta conta){      
        setSaldoRestante();//SETA O SALDO RESTANTE DO EMPRESTIMO
        conta.setSaldo(conta.getSaldo()- this.parcela);//FAZ A MUDANÇA NO SALDO DA CONTA
        setQtParcela(getQtParcela()-1);//DIMINUI 1 PARCELA
        System.out.println("CONTA PAGA");
   }
   
   public void quitarEmprestimo(Conta conta){//Pega o SALDO e tira o valor TOTAL PENDENTE
       conta.setSaldo(conta.getSaldo()- getSaldoRestante());
       setSaldoTodo();
       setQtParcela(0);// zera quantidade de parcelas
        System.out.println("CONTA PAGA");
   }
   
   
//GETTERS E SETTERS--------------------------------------------------------------
   public void setSaldoTodo(){
       this.saldoRestante = 0;
       
   }  
   public int getNumeroEmprestimo() {
       
       return numeroEmprestimo;
    }

    public int getQtParcela() {
        return qtParcela;
    }

    public void setQtParcela(int qtParcela) {
        this.qtParcela = qtParcela;
    }
    
    public int getTipo() {
        return tipo;
    }
    public void setSaldoRestanteInicial() {
        this.saldoRestante = getValorTotal();//SALDO ATUAL COM BASE NA CONTA
    }
    public void setSaldoRestante() {
        if(this.saldoRestante<=0){
            this.saldoRestante = 0; 
        }else{ this.saldoRestante = this.saldoRestante - this.parcela;}//SALDO ATUAL COM BASE NA CONTA
    }

    public float getSaldoRestante() {
        return saldoRestante;
    }

    public String getDataContrato() {//INFORMA A DATA
        return dataContrato;
    }

    public float getParcela() {// INFORMA O VALOR DA PARCELA
        return parcela;
    }

    public float getValorTotal() {//IMFORMA O VALOR TOTAL
        return valorTotal;
    }

    public Conta getContaRetirada() {
        return contaRetirada;
    }
    public void setNumeroEmprestimo(int n) {
        if(n != 0 ){
        numeroEmprestimo = n + 1;
        
        }else if(n==0 ){ numeroEmprestimo = 1;}
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setDataContrato(String dataContrato) {
        this.dataContrato = dataContrato;
    }

    public void setParcela(float parcela) {
        this.parcela = this.valorTotal/this.qtParcela;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    

    public void setContaRetirada(Conta contaRetirada) {
        this.contaRetirada = contaRetirada;
    }

    

   
}

