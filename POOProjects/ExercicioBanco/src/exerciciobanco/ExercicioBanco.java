
package exerciciobanco;


public class ExercicioBanco {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        
        p1.setNumConta(1111);
        p1.setDono("Guilherme");
        p1.setTipo("CC");
        p1.abrirConta("CC");
        p1.depositar(300);
        
        ContaBanco p2 = new ContaBanco();
        
        p2.setNumConta(5555);
        p2.setDono("Lucia");
        p2.setTipo("CP");
        p2.abrirConta("CP");
        p2.depositar(500);
        
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        
    }
    
}
