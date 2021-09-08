/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.ArrayList;
import java.util.Scanner;
import ex5.Cliente;
import ex5.Banco;
/**
 *
 * @author Caio
 */
public class Ex5{
    
    public static void main(String[] args) {
        int op,op1,op2,op3,opcao;
        int cpf,CPF,g;
        int controle =0,controle2,controle3;
        int i=0;
        int count=0;
        int count2;
        int numero_da_conta;
        float saque,deposito;
        String nomecliente,telCliente,endCliente;
        
        
        Banco banco = new Banco("bank","inferno",333);//OBJETO BANCO
        
        
        Scanner teclado = new Scanner(System.in);
        
    do{
        
        
        
        System.out.println("--------------MENU--------------");
        System.out.println("1-Adicionar cliente\n2-Remover cliente\n3-Alterar cliente");
        System.out.println("4-ÁREA DO CLIENTE");         
        System.out.println("5-EMPRESTIMO");
        System.out.println("6-TODOS OS CLIENTES");
        System.out.println("--------------------------------");
        System.out.print("Insira a opção:");op = teclado.nextInt();
        System.out.println("--------------------------------");
        
        
        switch (op){
            //--------------------------------------------------------------------------------------------------------------------------
            case 1:
                
                Cliente cliente = new Cliente();                                //OBJETO CLIENTE   
                
                System.out.println("Digite o NOME");
                cliente.setNomeCliete(teclado.next());
                System.out.println("Digite o CPF");
                
                do{                                                             //VERIFICAÇÃO DO CPF EXISTENTE
                    controle = 1;
                    cliente.setCpf(teclado.nextInt());
                    g = cliente.getCpf();
                for(Cliente c: banco.getCliente()){  
                    if(c.getCpf()==g){
                        controle = 0;
                        System.out.println("Cpf existente!");
                        System.out.println("Digite novamente!");
                        System.out.println("--------------------------------");
                    }
                    
                 
                }
                
                
                    
                }while(controle==0);
                
                
                System.out.println("Digite o tel");
                cliente.setTelef(teclado.next());
                System.out.println("Digite o endereço");
                cliente.setEndere(teclado.next());
                
                banco.setCliente(cliente);                                      //adiciona um cliente na lista
                System.out.println("PRONTO, CLIENTE "+cliente.getNomeCliente()+" FOI ADICIONADO!");
                
                      
                
                                                                                //VERIFICAÇÃO DE CLIENTES CADASTRADOS
                System.out.println("Clientes cadastrados:");
                for(Cliente cl: banco.getCliente()){  
                    System.out.println(cl.getNomeCliente());
                    
                }
                break;
        //--------------------------------------------------------------------------------------------------------------------------        
            case 2:
              count=0;
                for(Cliente c: banco.getCliente()){                             //VERIFICAR SE ESTÁ VAZIA
                    count++;   
                }
                  
              if(count==0){System.out.println("NÃO HÁ CLIENTES");break;}
              else{
                
                  
                  do{//INICIO LACO PRA VERIFICAR A ENTRADA
                  i=0;
                System.out.println("Lista de CPF dos CLIENTES");                //MOSTRA LISTA DE CLIENTES
                
                for(Cliente c: banco.getCliente()){  
                    i++;
                    String a = Integer.toString(i);
                    System.out.println("Cliente " + a +": CPF: " + c.getCpf()+" - "+c.getNomeCliente());
                }
                //------------------------------------
                    op3=0;
                System.out.println("Qual CPF deseja continuar?");
                    opcao = teclado.nextInt();
                    for(Cliente c: banco.getCliente()){  
                                if(opcao==c.getCpf()){
                                op3++;
                                }
                            }
                    if(op3==0){System.out.println("CPF inválido, digite novamente!!");
                                System.out.println("--------------------------------");}
                }while(op3!= 1);                                                //FAZ REPETIR ATE O USUÁRIO DIGITAR O CPF CERTO
                
                
                
                   for(Cliente c : banco.getCliente()){                            //PROCURA A LISTA DE CLIENTES
                        
                       if(opcao ==c.getCpf()){
                          System.out.println("Cliente "+c.getNomeCliente()+" Foi EXCLUIDO COM SUCESSO!");
                          banco.removerCliente(c);
                          break; 
                        }
                }
                                                                                //VERIFICAÇÃO DE CLIENTES CADASTRADOS
                System.out.println("Clientes cadastrados:");
                for(Cliente cl: banco.getCliente()){  
                    System.out.println(cl.getNomeCliente());
                    
                }
            }
              break;  
        //--------------------------------------------------------------------------------------------------------------------------        
            case 3:
                count=0;
                for(Cliente c: banco.getCliente()){                             //VERIFICAR SE ESTÁ VAZIA
                    count++;   
                }
                  
              if(count==0){System.out.println("NÃO HÁ CLIENTES");break;}
              else{
                   System.out.println("Lista de CPF dos CLIENTES");             //MOSTRA LISTA DE CLIENTES
                do{
                   i=0;
                for(Cliente c: banco.getCliente()){  
                    i++;
                    String a = Integer.toString(i);
                    System.out.println("Cliente " + a +": CPF: " + c.getCpf()+" - :"+c.getNomeCliente());
                }
               //------------------------------------
                    op3=0;
                System.out.println("Qual CPF deseja continuar?");
                    opcao = teclado.nextInt();
                    for(Cliente c: banco.getCliente()){  
                                if(opcao==c.getCpf()){
                                op3++;
                                }
                            }
                    if(op3==0){System.out.println("CPF inválido, digite novamente!!");
                               System.out.println("--------------------------------");}
                }while(op3!= 1);                                                //VAI REPETIR ATÉ ELE ENTRAR COM O CPF CERTO!!!
                
                
                
                for(Cliente c : banco.getCliente()){   
                        cpf = c.getCpf();
                       if(opcao == cpf){
                           System.out.println("Entre com os DADOS:");
                           /*System.out.println("CPF:");
                           
                           do{ 
                                controle = 1;
                                CPF = teclado.nextInt();
                                 
                             for(Cliente cl: banco.getCliente()){  
                                    if(cl.getCpf()== CPF){
                                             controle = 0;
                                             System.out.println("Cpf existente!");
                                             System.out.println("DIGITE NOVAMENTE");
                                             System.out.println("--------------------------------");
                                    }
                                    
                 
                            }
                           }while(controle == 0);
                           
                           System.out.println("NOME DO CLIENTE:");
                           nomecliente = teclado.next();*/
                           System.out.println("ENDERECO DO CLIENTE:");
                           endCliente = teclado.next();
                           System.out.println("TELEFONE DO CLIENTE:");
                           telCliente = teclado.next();
                           banco.alterarCliente(c, c.getCpf(), c.getNomeCliente(), endCliente, telCliente);
                          
                       }
                } 
                                                                                //VERIFICAÇÃO DE CLIENTES CADASTRADOS
                System.out.println("Clientes cadastrados:");
                for(Cliente cl: banco.getCliente()){  
                    System.out.println(cl.getNomeCliente());
                    
                }
              }
                break;
         //--------------------------------------------------------------------------------------------------------------------------                
            case 4:
                
                count=0;
                for(Cliente c: banco.getCliente()){  //VERIFICAR SE ESTÁ VAZIA ou SE NÃO HÁ CLIENTES
                    count++;   
                }
                  
              if(count==0){System.out.println("NÃO HÁ CLIENTES");break;}
              else{
                
                do{
                 System.out.println("Lista de CPF dos CLIENTES");               //MOSTRA LISTA DE CLIENTES
                                    i=0;
                             for(Cliente c: banco.getCliente()){  
                                i++;
                             String a = Integer.toString(i);
                             System.out.println("Cliente " + a +": CPF: " + c.getCpf()+" - "+c.getNomeCliente());
                            }
                //------------------------------------
                
                    op3=0;
                System.out.println("Qual CPF deseja continuar?");
                    opcao = teclado.nextInt();
                    for(Cliente c: banco.getCliente()){  
                                if(opcao==c.getCpf()){
                                op3++;
                                }
                            }
                    if(op3==0) {System.out.println("CPF inválido, digite novamente!!");
                                System.out.println("--------------------------------");}
                }while(op3!= 1);
                
                
                
                do{
                    System.out.println("----------------------ÁREA DO CLIENTE----------------------");
                    System.out.println("0-VOLTA AO MENU ANTERIOR\n1-Adicionar conta\n2-Remover conta\n3-Alterar conta");
                    System.out.println("4-Depósito da conta\n5-Saque da conta\n6-Consultar contas");
                    System.out.println("--------------------------------");
                    System.out.print("Insira a opção:");
                    op1=teclado.nextInt();
                    System.out.println("--------------------------------");
                    
                    switch (op1){
                    //---------------------------------------------------------------------------------------------------------------------------------------------    
                        case 1:
                            Conta conta = new Conta();
                            count=0;
                            for(Cliente c: banco.getCliente()){  //VERIFICAR SE ESTÁ VAZIA
                                 count++;   
                            }
                  
                            if(count==0){System.out.println("NÃO HÁ CLIENTES");break;}
                            else{
                                for(Cliente c : banco.getCliente()){   
                                    cpf = c.getCpf();
                                    if(opcao == cpf){                                        //VERIFICA SE O CLIENTE FOI SELECIONADO 
                                    System.out.println("INSIRA o numero da NOVA conta:");
                            
                                    do{ 
                                        controle = 1;
                                        numero_da_conta = teclado.nextInt();
                                 
                                         for(Conta cont: c.getContas()){  
                                            if(cont.getNumero()== numero_da_conta){
                                            controle = 0;
                                             
                                             }
                                        }
                                         for(Cliente cl : banco.getCliente()){
                                             for(Conta b : cl.getContas()){
                                                 if(b.getNumero()== numero_da_conta){controle=0;}
                                             }
                                         }
                                         
                                         
                                         if(controle==0){
                                         System.out.println("NUMERO já existente!");
                                         System.out.println("Digite novamente!");
                                         System.out.println("--------------------------------");
                                         }
                                         
                                    }while(controle == 0);
                                    conta.setNumero(numero_da_conta);
                                    System.out.println("INSIRA o tipo da conta: 1- corrente 2-poupança");
                                    conta.setTipo(teclado.nextInt());
                                    System.out.println("O saldo inicial é:");
                                    conta.setSaldo(0);
                                    System.out.println("A conta "+conta.getNumero()+" foi adicionada com sucesso!");
                                    c.setContas(conta);
                                    }
                                }
                            }
                            break;
                    //-------------------------------------------------------------------------------------------------------------------------------------------            
                        case 2:
                           count=0;
                           for(Cliente c: banco.getCliente()){for(Conta cont : c.getContas())count++;}                    //VERIFICAR SE ESTÁ VAZIA
                                    //----------------------------
                           if(count==0){System.out.println("NÃO HÁ CONTA REGISTRADA");break;}
                           else{
                            i=0;
                            for(Cliente c : banco.getCliente()){                        //PROCURA CLIENTE
                                i++;
                                String a = Integer.toString(i);                         //TRANSFORMA NUMERO EM STRING
                                cpf = c.getCpf();                                       //JOGA O VALOR DO CPF CLIENTE EM UMA VARIÁVEL
                                if(opcao == cpf){                                        //COMPARA PARA VER SE O VALOR DIGITADO É IGUAL DO CPF EXISTENTE
                                    g=0;                                                 //VERIFICA SE O CLIENTE FOI SELECIONADO 
                                    for(Conta cont : c.getContas()){                     //PROCURA CONTAS DO CLIENTE
                                        g++;
                                        String b = Integer.toString(g);                   //TRANSFORMA O NUMERO DA CONTA EM STRING
                                        System.out.println("Cliente " + a +": CPF: " + c.getCpf() + " - " + c.getNomeCliente() + " Conta: "+ b +" - NUMERO:" + cont.getNumero());
                                    }
                                    System.out.println("Escolha o NUMERO da conta que quer EXCLUIR");
                                    controle = teclado.nextInt();                        //ESCOLHE O NUMERO DA CONTA PRA EXCLUIR
                                    for(Conta cont : c.getContas()){
                                        numero_da_conta = cont.getNumero();
                                        if(controle == numero_da_conta ){
                                            c.RemoverConta(cont);
                                            System.out.println("Conta "+cont.getNumero()+" foi EXCLUIDA com SUCESSO!");
                                            break;
                                        }
                                        
                                    }
                                    
                                }
                            }
                           }
                                break;
                    //---------------------------------------------------------------------------------------------------------------------------------------------            
                        case 3:
                            
                          count=0;
                          for(Cliente c: banco.getCliente()){for(Conta cont : c.getContas())count++;}                    //VERIFICAR SE ESTÁ VAZIA
                                    //----------------------------
                          if(count==0){System.out.println("NÃO HÁ CONTA REGISTRADA");break;}
                          else{
                               i=0;
                           
                            for(Cliente c : banco.getCliente()){                        //PROCURA CLIENTE
                                i++;
                                String a = Integer.toString(i);                         //TRANSFORMA NUMERO EM STRING
                                cpf = c.getCpf();                                       //JOGA O VALOR DO CPF CLIENTE EM UMA VARIÁVEL
                                    if(opcao == cpf){                                        //COMPARA PARA VER SE O VALOR DIGITADO É IGUAL DO CPF EXISTENTE
                                        g=0;                                                 //VERIFICA SE O CLIENTE FOI SELECIONADO 
                                        for(Conta cont : c.getContas()){                     //PROCURA CONTAS DO CLIENTE
                                            g++;
                                            String b = Integer.toString(g);                   //TRANSFORMA O NUMERO DA CONTA EM STRING
                                            System.out.println("Cliente " + a +": CPF: " + c.getCpf() + " - " + c.getNomeCliente() + " Conta: "+ b +" - NUMERO: " + cont.getNumero());
                                        }
                                        System.out.println("Escolha o NUMERO da conta que quer alterar");
                                        controle = teclado.nextInt();                        //ESCOLHE O NUMERO DA CONTA PRA ALTERAR
                                    do{controle3=1;
                                        for(Conta cont : c.getContas()){                    //PROCURA NA LISTA CONTAS O NUMERO DA CONTA
                                            numero_da_conta = cont.getNumero();
                                                if(cont.getSaldo()==0){                      //não é possivel alterar o tipo se o saldo é 0;
                                                    System.out.println("Não é possível realizar alteração pois o saldo não é 0. SALDO ATUAL:"+cont.getSaldo());
                                                }
                                                else if(controle == numero_da_conta){                 //SE O NUMERO DA ENTRADA É O MESMO DA LISTA ENTÃO FAZ A ALTERAÇÃO
                                                    System.out.println("Digite o NOVO número da conta:");
                                                    cont.setNumero(teclado.nextInt());
                                                    controle3=0;
                                                    System.out.println("Digite o NOVO valor do tipo da conta:");
                                                    cont.setTipo(teclado.nextInt());
                                                }
                                        }
                                        
                                    }while(controle3==0);
                                }
                            }
                        }  
                            break;
                        
                        
                    //---------------------------------------------------------------------------------------------------------------------------------------------            
                        case 4:
                             count=0;
                          for(Cliente c: banco.getCliente()){for(Conta cont : c.getContas())count++;}                    //VERIFICAR SE ESTÁ VAZIA
                                    //----------------------------
                          if(count==0){System.out.println("NÃO HÁ CONTA REGISTRADA");break;}
                          else{
                            i=0;
                            for(Cliente c : banco.getCliente()){                        //PROCURA CLIENTE
                                i++;
                                String a = Integer.toString(i);                         //TRANSFORMA NUMERO EM STRING
                                cpf = c.getCpf();                                       //JOGA O VALOR DO CPF CLIENTE EM UMA VARIÁVEL
                                if(opcao == cpf){                                        //COMPARA PARA VER SE O VALOR DIGITADO É IGUAL DO CPF EXISTENTE
                                    g=0;                                                 //VERIFICA SE O CLIENTE FOI SELECIONADO 
                                    for(Conta cont : c.getContas()){                     //PROCURA CONTAS DO CLIENTE
                                        g++;
                                        String b = Integer.toString(g);                   //TRANSFORMA O NUMERO DA CONTA EM STRING
                                        System.out.println("Cliente " + a +": CPF: " + c.getCpf() + " - " + c.getNomeCliente() + " Conta: "+ b +" - NUMERO: " + cont.getNumero());
                                    }
                                    System.out.println("Escolha o NUMERO da conta que DESEJA realizar o DEPÓSITO:");
                                    controle = teclado.nextInt();                        //ESCOLHE O NUMERO DA CONTA PRA FAZER DEPÓSITO
                           
                                    for(Conta cont : c.getContas()){
                                        if(controle == cont.getNumero() ){
                                            System.out.println("SALDO ATUAL: "+ cont.getSaldo());
                                            System.out.println("QUAL O VALOR DO DEPÓSITO?");
                                            deposito = teclado.nextFloat();
                                            cont.Deposito(deposito);
                                            System.out.println("Seu DEPOSITO foi realizado com SUCESSO!");
                                            System.out.println("SALDO ATUAL: "+ cont.getSaldo());break;
                                            
                                        }
                                        
                                    }
                                }
                            }
                          }
                            break;
                    //---------------------------------------------------------------------------------------------------------------------------------------------                
                        case 5:
                                                   
                            count=0;
                            for(Cliente c: banco.getCliente()){for(Conta cont : c.getContas())count++;}                    //VERIFICAR SE ESTÁ VAZIA
                            //----------------------------
                            if(count==0){System.out.println("NÃO HÁ CONTA REGISTRADA");break;}
                            else{
                                i=0;
                                 for(Cliente c : banco.getCliente()){                        //PROCURA CLIENTE
                                    i++;
                                    String a = Integer.toString(i);                         //TRANSFORMA NUMERO EM STRING
                                    cpf = c.getCpf();                                       //JOGA O VALOR DO CPF CLIENTE EM UMA VARIÁVEL
                                    if(opcao == cpf){                                        //COMPARA PARA VER SE O VALOR DIGITADO É IGUAL DO CPF EXISTENTE
                                        g=0;                                                 //VERIFICA SE O CLIENTE FOI SELECIONADO 
                                        for(Conta cont : c.getContas()){                     //PROCURA CONTAS DO CLIENTE
                                            g++;
                                            String b = Integer.toString(g);                   //TRANSFORMA O NUMERO DA CONTA EM STRING
                                            System.out.println("Cliente " + a +": CPF: " + c.getCpf() + " - " + c.getNomeCliente() + " Conta: "+ b +" - NUMERO: " + cont.getNumero());
                                        }
                                            System.out.println("Escolha o NUMERO da conta que DESEJA realizar o SAQUE:");
                                            controle = teclado.nextInt();                        //ESCOLHE O NUMERO DA CONTA PRA FAZER SAQUE
                                        for(Conta cont : c.getContas()){
                                            numero_da_conta = cont.getNumero();
                                            if(controle == numero_da_conta ){
                                            System.out.println("SALDO ATUAL: "+ cont.getSaldo());
                                            System.out.println("QUAL O VALOR DO SAQUE?");
                                            saque = teclado.nextFloat();
                                            cont.Saque(cont,saque);
                                            System.out.println("SALDO ATUAL: "+ cont.getSaldo());
                                            
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                    //---------------------------------------------------------------------------------------------------------------------------------------------
                        case 6:
                            count=0;
                            for(Cliente c: banco.getCliente()){count++;for(Conta cont : c.getContas())count++;}                    //VERIFICAR SE ESTÁ VAZIA
                            //----------------------------
                            if(count==0){System.out.println("NÃO HÁ CONTA REGISTRADA");break;}
                            else{
                                i=0;
                                for(Cliente c : banco.getCliente()){                        //PROCURA CLIENTE
                                        i++;
                                        String a = Integer.toString(i);                         //TRANSFORMA NUMERO EM STRING
                                        cpf = c.getCpf();                                       //JOGA O VALOR DO CPF CLIENTE EM UMA VARIÁVEL
                                    if(opcao == cpf){                                        //COMPARA PARA VER SE O VALOR DIGITADO É IGUAL DO CPF EXISTENTE
                                        g=0;                                                 //VERIFICA SE O CLIENTE FOI SELECIONADO 
                                        System.out.println("Cliente:" + a + ": CPF: " + c.getCpf() + " - " + c.getNomeCliente() );
                                        for(Conta cont : c.getContas()){                     //PROCURA CONTAS DO CLIENTE
                                            g++;
                                            String b = Integer.toString(g);                   //TRANSFORMA O NUMERO DA CONTA EM STRING
                                            System.out.println(" Conta: "+ b +" - NUMERO:" + cont.getNumero()+" TIPO: "+cont.getTipo()+" SALDO: "+cont.getSaldo());
                                        }//MOSTRA TODAS AS CONTAS
                                    }
                                }
                            }
               
                            break;
                    //---------------------------------------------------------------------------------------------------------------------------------------------                          
                        default:
                            System.out.println("-_-_-_-_-BACK TO MENU-_-_-_-_-");
                            break;
                            
                    }
                }while(op1!=0);
                
              }
                break;
  //---------------------------------------------------------------------------------------------------------------------------------------------          
            
            
    
          
          
                case 5:
                  count=0;
                  for(Cliente c: banco.getCliente()){count++;for(Conta cont : c.getContas())count++;}                    //VERIFICAR SE ESTÁ VAZIA
                            //----------------------------
                  if(count==0){System.out.println("NÃO HÁ CONTA REGISTRADA");break;}
                  else{
                      do{
                            System.out.println("Lista de CPF dos CLIENTES");               //MOSTRA LISTA DE CLIENTES
                            i=0;
                            for(Cliente c: banco.getCliente()){  
                                i++;
                                String a = Integer.toString(i);
                                System.out.println("Cliente " + a +": CPF: " + c.getCpf()+" - "+c.getNomeCliente());
                            }
                //------------------------------------
                
                            op3=0;
                            System.out.println("Qual CPF deseja continuar?");
                            opcao = teclado.nextInt();
                            for(Cliente c: banco.getCliente()){  
                                if(opcao==c.getCpf()){
                                op3++;
                                }
                            }
                            if(op3==0) {System.out.println("CPF inválido, digite novamente!!");
                                    System.out.println("--------------------------------");}
                        }while(op3!= 1);
                
                
                        do{
                            System.out.println("------------Área de EMPRESTIMO------------");
                            System.out.println("1-Fazer Empréstimo\n2-Consultar Empréstimo\n3-Pagar parcela\n4-Quitar Empréstimo\n5-Mudar o tipo");
                            System.out.println("--------------------------------");
                            System.out.print("Insira a opção:");
                            op2=teclado.nextInt();
                            System.out.println("--------------------------------");
                            switch(op2){
                            //---------------------------------------------------------------------------------------------------------------------------------------------   
                                case 1:
                                    count=0;
                                    for(Cliente c: banco.getCliente()){for(Conta cont : c.getContas())count++;}                    //VERIFICAR SE ESTÁ VAZIA
                            //----------------------------
                                    if(count==0){System.out.println("NÃO HÁ CONTA REGISTRADA");break;}
                                    else{
                                    Emprestimo emprestimo = new Emprestimo();
                                    
                                    for(Cliente c : banco.getCliente()){
                                        if(opcao==c.getCpf()){
                                            if(c.getEmprestimo().size()<3){
                                               
                                               controle3 = 0;
                                               controle2 = 0;
                                               for(Cliente cl : banco.getCliente()){
                                                   if(opcao==cl.getCpf()){
                                                    for(Emprestimo e : cl.getEmprestimo()){
                                                       if(e.getNumeroEmprestimo()!= 0){
                                                           controle3++;
                                                       }
                                                    }
                                                   }
                                               }
                                               if(controle3==0){emprestimo.setNumeroEmprestimo(0);}
                                               else{emprestimo.setNumeroEmprestimo(controle3); }
                                               
                                               
                                                System.out.println("Digite a data do contrato");
                                                    emprestimo.setDataContrato(teclado.next());
                                                System.out.println("Digite o valor total do emprestimo");
                                                    emprestimo.setValorTotal(teclado.nextFloat());
                                                    emprestimo.setSaldoRestanteInicial();
                                                System.out.println("Digite QUANTAS PARCELAS");
                                                    emprestimo.setQtParcela(teclado.nextInt());
                                                    emprestimo.setParcela(emprestimo.getQtParcela());
                                                    
                                                System.out.println("Digite o tipo:");
                                                    emprestimo.setTipo(teclado.nextInt());
                                                
                                                    for(Cliente c2 : banco.getCliente()){                        //PROCURA CLIENTE
                                                    i++;
                                                    String a = Integer.toString(i);                         //TRANSFORMA NUMERO EM STRING
                                                    cpf = c2.getCpf();                                       //JOGA O VALOR DO CPF CLIENTE EM UMA VARIÁVEL
                                                        if(opcao == cpf){                                        //COMPARA PARA VER SE O VALOR DIGITADO É IGUAL DO CPF EXISTENTE
                                                            g=0;                                                 //VERIFICA SE O CLIENTE FOI SELECIONADO 
                                                            System.out.println("Cliente:" + a + ": CPF: " + c2.getCpf() + " - " + c2.getNomeCliente() );
                                                            for(Conta cont : c2.getContas()){                     //PROCURA CONTAS DO CLIENTE
                                                            g++;
                                                            String b = Integer.toString(g);                   //TRANSFORMA O NUMERO DA CONTA EM STRING
                                                            System.out.println(" Conta: "+ b +" - NUMERO:" + cont.getNumero()+" TIPO: "+cont.getTipo()+" SALDO: "+cont.getSaldo());
                                                            }//MOSTRA TODAS AS CONTAS
                                                        }
                                                    }                  
                                                System.out.println("Qual conta quer vincular?");
                                                Conta aux  = new Conta();
                                                do{ 
                                                    controle = 0;
                                                    numero_da_conta = teclado.nextInt();
                                                           
                                                            for(Conta cont : c.getContas()){                     //PROCURA CONTAS DO CLIENTE
                                                                if(numero_da_conta ==  cont.getNumero()){
                                                                   if(cont.getSaldo()!=0){
                                                                       aux = cont;
                                                                       controle=1;
                                                                   }
                                                                }
                                                            }
                                                            if(controle==0)System.out.println("Não existe essa conta OU saldo insuficiente. entre com um valor válido: ");
                                                    
                                                }while(controle==0);
                                                emprestimo.setContaRetirada(aux);
                                                
                                                System.out.println("O Emprestimo:"+emprestimo.getNumeroEmprestimo()+"Foi ADICIONADO COM SUCESSO!!!");
                                                c.setEmprestimo(emprestimo);
                                            }else System.out.println("Atingiu o limite de emprestimos, no MAX 3.");
                                        }
                                    }
                                    }  
                                break;
                                //---------------------------------------------------------------------------------------------------------------------------------------------
                                case 2:
                                    count=0;
                                    for(Cliente cl:banco.getCliente()){         //VERIFICAÇÃO SE HÁ EMPRESTIMOS CADASTRADOS
                                        for(Emprestimo e: cl.getEmprestimo()){
                                            if(e.getNumeroEmprestimo()!=0){count++;}
                                        }
                                    }
                                if(count==0){System.out.println("NÃO HÁ NENHUM EMPRÉSTIMO CADASTRADO");}
                                else{
                                    for(Cliente c : banco.getCliente()){
                                        if(opcao==c.getCpf()){
                                            for(Emprestimo emp : c.getEmprestimo()){
                                                for(Conta conta : c.getContas()){
                                                    if(emp.getContaRetirada()== conta){
                                                        System.out.println("Conta :"+conta.getNumero()+" SALDO:"+conta.getSaldo());
                                                        
                                                    }
                                                
                                                }
                                                System.out.println("Numero Emprestimo:"+emp.getNumeroEmprestimo()+" Tipo:"+emp.getTipo()+" DATA do Contrato:"+emp.getDataContrato()+" Parcela:"+emp.getParcela()+" Valor Total:"+emp.getValorTotal());
                                                System.out.println("SALDO RESTANTE A PAGAR PELO EMPRESTIMO: "+emp.getSaldoRestante());
                                            }
                                        }
                                    }
                                }
                                    break;
                                    //---------------------------------------------------------------------------------------------------------------------------------------------
                                case 3:
                                        count=0;
                                        count2=0;
                                    for(Cliente cl:banco.getCliente()){         //VERIFICAÇÃO SE HÁ EMPRESTIMOS CADASTRADOS
                                        for(Emprestimo e: cl.getEmprestimo()){  //VERIFICA SE HÁ ALGUM EMPRESTIMO REALIZADO
                                            if(e.getNumeroEmprestimo()!=0){count++;}
                                        }
                                        for(Conta a : cl.getContas()){          //VERIFICA SE NA CONTA A ALGUM SALDO
                                            if(a.getSaldo()!=0){
                                                count2++;
                                            }
                                        }
                                    }
                                if(count==0){System.out.println("NÃO HÁ NENHUM EMPRÉSTIMO CADASTRADO");}
                                else if(count2==0){System.out.println("NÃO HÁ NENHUM SALDO NA CONTA");}
                                else{
                                    for(Cliente c : banco.getCliente()){
                                            if(opcao==c.getCpf()){
                                                
                                                for(Emprestimo emp : c.getEmprestimo()){
                                                    for(Conta conta : c.getContas()){
                                                        if(emp.getContaRetirada()== conta){
                                                            System.out.println("Conta :"+conta.getNumero()+" SALDO:"+conta.getSaldo());
                                                        
                                                        }
                                                
                                                    }
                                                    System.out.println("Numero Emprestimo:"+emp.getNumeroEmprestimo()+" Parcela:"+emp.getParcela()+" Valor Total:"+emp.getValorTotal());
                                                    System.out.println("SALDO RESTANTE A PAGAR PELO EMPRESTIMO: "+emp.getSaldoRestante());
                                                }
                                                for(Cliente cl : banco.getCliente()){
                                                    if(opcao==cl.getCpf()){
                                                        System.out.println("-------------------------------------------------------");
                                                        System.out.println("QUAL EMPRESTIMO DESEJA REALIZAR O PAGAMENTO DA PARCELA:");
                                                        do{
                                                           controle3 =1;
                                                            controle2=teclado.nextInt();
                                                            for(Conta v : cl.getContas()){   //VERIFICAR SE HÁ SALDO POSITIVO
                                                                if(v.getSaldo()==0){
                                                                    System.out.println("----------------");
                                                                    System.out.println("SEM SALDO ATUAL"); 
                                                                    break;
                                                                }
                                                            }
                                                            for(Emprestimo e : cl.getEmprestimo()){
                                                                if(e.getSaldoRestante()==0){
                                                                    System.out.println("--------------------------------------------------------");
                                                                    System.out.println("PARABÉNS!!!!JÁ REALIZOU O PAGAMENTO TOTAL DO EMPRESTIMO.");
                                                                    break;
                                                                }
                                                            }
                                                            for(Emprestimo emp : cl.getEmprestimo()){
                                                                if(controle2 == emp.getNumeroEmprestimo()){
                                                                    emp.pagarParcela(emp.getContaRetirada());
                                                                    controle3=0;
                                                                    if(emp.getSaldoRestante()==0){
                                                                        cl.RemoverEmprestimo(emp);
                                                                        System.out.println("--------------------------------------------------------");
                                                                        System.out.println("PARABÉNS!!!!JÁ REALIZOU O PAGAMENTO TOTAL DO EMPRESTIMO.");
                                                                        break;
                                                                
                                                                    }
                                                                }
                                                            }
                                                            if(controle3==1)System.out.println("DIGITE NOVAMENTE:");
                                                        }while(controle3==1);
                                                    
                                                    }
                                                }
                                              
                                            }
                                        }
                                }   
                                    break;
                                case 4:
                                        count=0;
                                    for(Cliente cl:banco.getCliente()){         //VERIFICAÇÃO SE HÁ EMPRESTIMOS CADASTRADOS
                                        for(Emprestimo e: cl.getEmprestimo()){
                                            if(e.getNumeroEmprestimo()!=0){count++;}
                                        }
                                    }
                                if(count==0){System.out.println("NÃO HÁ NENHUM EMPRÉSTIMO CADASTRADO");}
                                else{
                                     for(Cliente c : banco.getCliente()){
                                            if(opcao==c.getCpf()){
                                                
                                                for(Emprestimo emp : c.getEmprestimo()){
                                                    for(Conta conta : c.getContas()){
                                                        if(emp.getContaRetirada()== conta){
                                                            System.out.println("Conta :"+conta.getNumero()+" SALDO:"+conta.getSaldo());
                                                        
                                                        }
                                                
                                                    }
                                                    System.out.println("Numero Emprestimo:"+emp.getNumeroEmprestimo()+" Parcela:"+emp.getParcela()+" Valor Total:"+emp.getValorTotal());
                                                    System.out.println("SALDO RESTANTE A PAGAR PELO EMPRESTIMO: "+emp.getSaldoRestante());
                                                }
                                                for(Cliente cl : banco.getCliente()){
                                                    if(opcao==cl.getCpf()){
                                                        System.out.println("-------------------------------------------------------");
                                                        System.out.println("QUAL EMPRESTIMO DESEJA QUITAR A DÍVIDA:");
                                                        do{
                                                           controle3 =1;
                                                            controle2=teclado.nextInt();
                                                            for(Conta v : cl.getContas()){   //VERIFICAR SE HÁ SALDO POSITIVO
                                                                if(v.getSaldo()==0){
                                                                    System.out.println("----------------");
                                                                    System.out.println("SEM SALDO ATUAL"); 
                                                                    break;
                                                                }
                                                            }
                                                            for(Emprestimo e : cl.getEmprestimo()){
                                                                if(e.getSaldoRestante()==0){
                                                                    System.out.println("--------------------------------------------------------");
                                                                    System.out.println("PARABÉNS!!!!JÁ REALIZOU O PAGAMENTO TOTAL DO EMPRESTIMO.");
                                                                    break;
                                                                }
                                                            }
                                                            for(Emprestimo emp : cl.getEmprestimo()){
                                                                if(controle2 == emp.getNumeroEmprestimo()){
                                                                    emp.quitarEmprestimo(emp.getContaRetirada());
                                                                    System.out.println("O EMPRESTIMO:"+emp.getNumeroEmprestimo()+"FOI REMOVIDO!");
                                                                    cl.RemoverEmprestimo(emp);
                                                                    controle3=0;
                                                                    break;
                                                                }
                                                            }
                                                            if(controle3==1)System.out.println("DIGITE NOVAMENTE:");
                                                        }while(controle3==1);
                                                    
                                                    }
                                                }
                                              
                                            }
                                        }
                                }   
                                    break;
                                case 5:
                                       count=0;
                                    for(Cliente cl:banco.getCliente()){         //VERIFICAÇÃO SE HÁ EMPRESTIMOS CADASTRADOS
                                        for(Emprestimo e: cl.getEmprestimo()){
                                            if(e.getNumeroEmprestimo()!=0){count++;}
                                        }
                                    }
                                if(count==0){System.out.println("NÃO HÁ NENHUM EMPRÉSTIMO CADASTRADO");}
                                else{
                                    
                                    
                                    count=0;
                                    
                                    for(Cliente c : banco.getCliente()){// procura os cliente no banco
                                        if(opcao==c.getCpf()){//se a entrada for igual ao cpf do cliente segue:
                                                     
                                                for(Emprestimo emp : c.getEmprestimo()){
                                                    for(Conta conta : c.getContas()){
                                                        if(emp.getContaRetirada()== conta){
                                                            System.out.println("Conta :"+conta.getNumero()+" SALDO:"+conta.getSaldo());
                                                        
                                                        }
                                                
                                                    }
                                                    System.out.println("Numero Emprestimo:"+emp.getNumeroEmprestimo()+" Parcela:"+emp.getParcela()+" Valor Total:"+emp.getValorTotal());
                                                    System.out.println("SALDO RESTANTE A PAGAR PELO EMPRESTIMO: "+emp.getSaldoRestante());
                                                }
                                                  
                                                        for(Emprestimo e : c.getEmprestimo()){//PROCURA O NUMERO DE PARCELAS A PAGAR
                                                            if(e.getQtParcela()== 1){ //SE TIVER APENAS 1 FALTANDO É POSSIVEL REALIZAR A MUDANCA NO TIPO DE EMPRESTIMO
                                                                System.out.println("-----------------------------------------------------------");
                                                                System.out.println("QUAL MUDAR O EMPRESTIMO"+e.getNumeroEmprestimo()+" PARA QUE TIPO:");
                                                                e.setTipo(teclado.nextInt());
                                                                System.out.println("Tipo"+e.getTipo()+" alterado com SUCESSO!!");
                                                            }else{//SE NÃO O SISTEMA BRECA A CHAMADA
                                                                System.out.println("AINDA HÁ PARCELAS PARA PAGAR, TENTE NOVAMENTE QUANDO ESTIVER COM 1 PARCELA APENAS.");
                                                                break;
                                                            }
                                                        }
                                                    }
                                            }
                                       }
                                
                        
                                    break;
                            default:
                                 System.out.println("-_-_-_-_-BACK TO MENU-_-_-_-_-");
                                break;  
                            }
                    }while(op2!=0);
                    
                }
                  break;
                  
                case 6:
                    count=0;
                  for(Cliente c: banco.getCliente()){count++;for(Conta cont : c.getContas())count++;}                    //VERIFICAR SE ESTÁ VAZIA
                            //----------------------------
                  if(count==0){System.out.println("NÃO HÁ CONTA REGISTRADA");break;}
                  else{
                      for(Cliente c: banco.getCliente()){
                          System.out.println("Nome Cliente:" + c.getNomeCliente() + " CPF:" + c.getCpf() + " Telefone:" + c.getTelef() + " Endereço:" + c.getEndere());
                          for(Conta contas : c.getContas()){
                              System.out.println("Número da conta:" + contas.getNumero() + " Tipo:" + contas.getTipo() + " Saldo:" + contas.getSaldo());
                          }
                              
                        }
                  }
                    break;
            default:
                System.out.println("OBRIGADO POR UTILIZAR MEU SOFTWARE: CAIO VINICIUS ALBERTINAZI MIZUNO");
           
                break;
         }
    }while(op != 0);
     
    }
}


