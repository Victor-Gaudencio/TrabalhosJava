package arcadenoe;

public class Tigre extends Animal{
    
    public Tigre(String nome, char genero, String especie){
        super(nome, genero, especie);
    }
    
    public void alimentar(){
        System.out.println("Carnres");
    }
    
    public void emitirSom(){
        System.out.println("roaaaaaaaaaawwwwww");
    }
    
    public void locomover(){
        System.out.println("corre de 2 ou de 4");
    }
}
