
package teste;

public class Controlador implements Controle {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public Controlador(int v, boolean l, boolean t) {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    
    

    @Override
    public void abrirMenu() {
        
        this.setLigado(true);
    }

    @Override
    public void fecharMenu() {
        this.setLigado(false);
    }

    @Override
    public void maisVolume() {
        
        if(this.ligado && this.tocando){
            this.setVolume(this.getVolume() + 10);
            
        
        }
    }

    @Override
    public void menosVolume() {
        if(this.ligado && this.tocando){
            this.setVolume(this.getVolume() - 10);
    }
    }
    @Override
    public void mudo() {
        if (this.ligado && this.tocando){
        this.tocando = false;
        }
        
    }

    @Override
    public void tirarMudo() {
        if (this.ligado && !this.tocando){
        this.tocando = true;
    }
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
    
}
