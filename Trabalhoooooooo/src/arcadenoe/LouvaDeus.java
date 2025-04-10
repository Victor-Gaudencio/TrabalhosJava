package arcadenoe;

public class LouvaDeus extends Animal{
    public LouvaDeus(String nome, char genero, String especie){
        super (nome, genero, especie);
    }
    
    public void alimentar(){
        System.out.println("Insetos pequeno as vezez passaros ");
        
    }
    
    public void emitirSom(){
        System.out.println("ele e burro e nao fala");
    }
    
    public void locomover(){
        System.out.println("anda e da un pulo");
    }
}
