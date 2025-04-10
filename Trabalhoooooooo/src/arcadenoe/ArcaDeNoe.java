package arcadenoe;

public class ArcaDeNoe {
    public static void main(String[] args){
        Macaco Plinio = new Macaco("Macaco", 'M', "primata");
        Panda Po = new Panda("Panda", 'M', "urso");
        LouvaDeus tiao = new LouvaDeus("Louva-a-Deus", 'M', "inseto");
        Cobra suamae = new Cobra("Cobra", 'F', "Serpente");
        Tigre feminista = new Tigre("Tigre", 'F', "Felino");
        Garca priquito = new Garca("garca", 'M', "Ave");
        
        
        Arca arcaNoe = new Arca();
        arcaNoe.adicionarAnimal(Plinio);
        arcaNoe.adicionarAnimal(suamae);
        arcaNoe.adicionarAnimal(Po);
        arcaNoe.adicionarAnimal(tiao);
        arcaNoe.adicionarAnimal(feminista);
        arcaNoe.adicionarAnimal(priquito);
        
        
        arcaNoe.ListarAnimais();
    }
    
  
}
    
    

