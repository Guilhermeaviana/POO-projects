
package exerciciocontrole;

public class ControleRemotoo implements Controladorr {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemotoo(){
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
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

    @Override
    public void ligar() {
        if (this.getLigado() == false) {
        this.setLigado(true);
        }
    }

    @Override
    public void desligar() {
        if(this.getLigado()){
        this.setLigado(false);
        }
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
        System.out.println("Esta ligado: " + this.getLigado());
        System.out.println("Esta tocando: " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i += 5){
            System.out.print("[]");
        }
        }
    }

    @Override
    public void fecharMenu() {
     System.out.print("Fechando menu..");

    }

    @Override
    public void maisVolume() {
        if (this.getLigado() && this.getTocando()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() && this.getTocando()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
    if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
}
        
        
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
    }
    }     
}
