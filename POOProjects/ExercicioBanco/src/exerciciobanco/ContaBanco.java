
package exerciciobanco;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("---------------");
        System.out.println("Numero da conta:" + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
        
        System.out.println("Sua conta esta aberta");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){ 
            System.out.print("Sua conta ainda tem dinheiro");
        } else if (this.getSaldo() < 0){
           System.out.print("Sua conta esta em debito"); 
        } else {
            this.setStatus(false);
            System.out.print("Sua conta foi fechada com sucesso");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
        } else {
            System.out.print("Impossivel depositar");
        }
        
        
    }
    
    public void sacar(float v){
        if (this.getStatus()){
          if(this.getSaldo() >= v) {
          this.setSaldo(this.getSaldo() - v);
          }  else {
              System.out.print("Impossivel realizar o saque");
                      
          }
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (getStatus()) {
            if (getSaldo() > 0){
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.print("Saldo insuficiente ");
            }
               
        }
        else {
                 System.out.print("Impossivel pagar");   
                    }  
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public float getSaldo(){
        return this.saldo;
    } 
    
    public void setStatus(boolean s){
        this.status = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    
    
    
    
}



