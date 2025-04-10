package arcadenoe;
import java.util.ArrayList;
import java.util.List;

public class Arca {
    private List<Animal> animais;
    
    public Arca(){
        this.animais = new ArrayList<>();
    }
    
    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }
    
    public void ListarAnimais(){
        System.out.println("Animais na arca:");
        for (Animal animal : animais) {
            System.out.println("Sou o animal " + animal.nome + " do genero " + animal.genero);
        }
    }
}
