package gestaoepi;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
    protected String nome;
    protected int matricula;
    protected List<EPI> listaEPI;
    
    
     public Funcionario(String nome, int matricula){
         this.nome = nome;
         this.matricula = matricula;
         this.listaEPI = new ArrayList<>();
    }
    
     public void adicionarEPI(EPI epi){
         listaEPI.add(epi);
    }
     
     public void listarEPI(){
         System.out.println("Equipamentos de proteção:");
         for (EPI epi : listaEPI) {
             System.out.println("equipamento: " + this.nome);
         }
     }
}

