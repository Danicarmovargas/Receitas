
package receitas;

import javax.swing.JOptionPane;

public class receita {
    
    public String nome;
    public int tempodepreparo;
    public int rendimento;
    public String ingredientes;
    public String mododepreparo;
    public String tipo;
    
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }
    public int getTempoDePreparo(){
        return tempodepreparo;
     
    }
    public void setTempoDePreparo(){
        this.tempodepreparo = tempodepreparo;
    }
    public int getRendimento(){
        return rendimento;
    }
    public void setRendimento(){
        this.rendimento = rendimento;
    }
    public String getIngredientes(){
        return ingredientes;
    }
    public void setIngredientes(){
        this.ingredientes = ingredientes;
    }
     public String getModoDePreparo(){
        return mododepreparo;
    }
    public void setModoDePreparo(){
        this.mododepreparo = mododepreparo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(){
        this.tipo = tipo;
    }
    
    public void editar(){

    }
    public void excluir(){
    
    }
    
}