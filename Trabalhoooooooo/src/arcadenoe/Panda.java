package arcadenoe;

public class Panda extends Animal {
    public Panda(String nome, char genero, String especie){
        super(nome, genero, especie);
    }
    
    public void alimentar(){
        System.out.println("bambuzaoooo o-Õ");
    }
    
    public void emitirSom(){
        System.out.println("grito de baitola");
    }
    
    public void locomover(){
        System.out.println("rolada o-Õ");
    }
}
