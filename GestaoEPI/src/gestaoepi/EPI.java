package gestaoepi;
import java.util.Date;
public class EPI {
    private String nome;
    private int codigo;
    private Date DataVal;
    
    public void EPI(String nome, int codigo, Date DataVal){
        this.nome = nome;
        this.codigo = codigo;
        this.DataVal = DataVal;
    }
    
    public String GetNome(){
        return this.nome;
    }
    
    public int GetCod(){
        return this.codigo;
    }
    












}

