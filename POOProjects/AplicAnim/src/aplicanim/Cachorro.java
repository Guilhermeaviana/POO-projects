
package aplicanim;

public class Cachorro extends Mamifero {
    
    public void reagir(String frase){
    if (frase == "Agradavel"){
    System.out.println("Abanar e latir");
    } else{
    System.out.println("Rosnar");
    }
    
    }
    
    public void reagir(float hora, float  min){
    if(hora > 12){
    System.out.println("Abanar");
   
    } if else(hora > 17){}
    }
    
    public void reagir(boolean dono){
    if(dono){
    System.out.println("Abanar");
    } else{
    System.out.println("Rosnar e latir");
    }
    }
    
}
