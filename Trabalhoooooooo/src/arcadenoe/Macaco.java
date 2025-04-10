package arcadenoe;

public class Macaco extends Animal {
    
    public Macaco(String nome, char genero, String especie){
        super(nome, genero, especie);
    }
    

    public void alimentar(){
        System.out.println("come banana");
    }
    public void emitirSom(){
        System.out.println("uuuaaaaaahaaaahaaaaiiiiiiiiiaaaaaaa");
    }
    
    public void locomover(){
        System.out.println("ingual o tarzan");
    }
}
