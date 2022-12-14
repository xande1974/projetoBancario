package com.mycompany.bancario;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    
    @Override
    public String toString() {
        return "ContaCliente{" + "numConta=" + numConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo + ", status=" + status + '}';
    }
    
    
    
    
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if ("CC".equals(tipo)){
            this.setSaldo(50);
        }
        else if ("CP".equals(tipo)){
            this.setSaldo(150);
            
            System.out.println("conta aberta");
        }
        
    }
    public void fecharConta(){
        if (this.getSaldo()> 0){
            System.out.println("tem dinheiro na conta");
        }else if (this.getSaldo()< 0){
            System.out.println("conta negativa");
        }else{
            this.setStatus(false);
            System.out.println("contafechada");
        }
        
    }
    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("deposito concluido");
            
        }else{
            System.out.println("voce nao pode depositar");
        }
        
    }
    public void sacar(float valor){
        if (this.getStatus()&& (this.getSaldo()> valor)){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("saque liberado");
            
        }else{
            System.out.println("voce nao pode sacar");
        }
        
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo()== "CC"){
            v = 12;
        }else if(this.getTipo()== "CP"){
            v = 20;
            
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("mensalidade paga com sucesso");
        }else {
            System.out.println("conts fechada impossivel pagar");
        }
    }

   public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
        
}
