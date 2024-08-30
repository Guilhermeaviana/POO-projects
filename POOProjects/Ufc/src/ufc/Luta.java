
package ufc;
import java.util.Random;
public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;         
    private boolean aprovada;        
            
        

    public void marcarLuta(Lutador l1, Lutador l2){
        
        if(l1.getCategoria().equals(l2.getCategoria())){
        this.aprovada = true;
        this.desafiado = l1;
        this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
          
    }
    
    
    public void lutar(){
    if(this.aprovada){
     System.out.println("#######DESAFIADO######");
   
     this.desafiado.apresentar();
     System.out.println("#######DESAFIANTE######");

     
     this.desafiante.apresentar();
     
    Random aleatorio = new Random();
    
    int vencedor = aleatorio.nextInt(3);
    
    switch(vencedor){
       
        case 0 -> { 
            System.out.println("A luta empatou");
            this.desafiado.empatarLuta();
            this.desafiante.empatarLuta();
            }
            
        case 1 -> {     
            System.out.println("O vencedor é: " + this.desafiado.getNome());
            this.desafiado.ganharLuta();
            this.desafiante.perderLuta();
            }
            
        case 2 -> { 
            System.out.println("O vencedor é: " + this.desafiante.getNome());
            this.desafiante.ganharLuta();
            this.desafiado.perderLuta();
            }
            
    }   
    } else {
            System.out.println("Esta luta nao pode acontecer");
            }
        
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
