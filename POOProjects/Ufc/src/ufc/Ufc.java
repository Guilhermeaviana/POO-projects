
package ufc;

public class Ufc {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Josealdo", "Brasileiro", 33, 1.68f, 72.7f, 5, 0, 2);
        
        l[1] = new Lutador("Mcgregor", "Irlandes", 34, 1.74f, 70.4f, 7, 0, 1);
        
        l[2] = new Lutador("Borrachinha", "Brasileiro", 27, 1.80f, 76.7f, 3, 2, 3);
        
        l[3] = new Lutador("Anderson Silva", "Brasileiro", 43, 1.80f, 78.9f, 9, 4, 1);
        
        l[4] = new Lutador("Jon jones", "Americano", 37, 1.90f, 93.4f, 10, 1, 0);
        
        l[5] = new Lutador("Poatan", "Brasileiro", 39, 1.90f, 91.7f, 13, 0, 1);
        
        
       Luta Ufc01 = new Luta();
       
       Ufc01.marcarLuta(l[0],l[1]);
       Ufc01.lutar();
       l[0].status();
        
    }
    
}
