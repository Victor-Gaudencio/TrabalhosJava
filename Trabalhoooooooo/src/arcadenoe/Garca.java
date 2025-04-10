package arcadenoe;

public class Garca extends Animal{
    public Garca(String nome, char genero, String especie){
        super(nome, genero, especie);
    }
    
    public void alimentar(){
        System.out.println("Peixios");
    }
    
    public void emitirSom(){
        System.out.println("cocooo cocoooo");
    }
    
    public void locomover(){
        System.out.println("Andar e avuar");
    }
}
