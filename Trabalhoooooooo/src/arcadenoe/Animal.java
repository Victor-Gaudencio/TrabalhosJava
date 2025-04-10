package arcadenoe;


public abstract class Animal implements ComportamentoAnimal {
    protected String nome;
    protected char genero;
    protected String especie;
    
    public Animal(String nome, char genero, String especie){
        this.nome = nome;
        this.genero = genero;
        this.especie = especie;
    }
    
    @Override
    public void alimentar(){
        System.out.println("comida generica");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som generico");
    }
    
    @Override
    public void locomover() {
        System.out.println("Estoi mexendo genericamente");
    }
}
