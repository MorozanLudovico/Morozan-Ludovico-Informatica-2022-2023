import java.util.*;
public class Contatoregas{
    private String marca;
    private String modello;
    private String classe;
    private int annodifabbr;
    private double portataminima;
    private double portatamassima;
    private double consumo;
    private boolean acceso;
    public Contatoregas (String m, String mod, String c){
        if (m!=null){
            this.marca = m;
        }else{
            this.marca = "anonimo";
        }
        if (mod!=null){
            this.modello = mod;
        }else{
            this.modello = "anonimo";
        }
        if (c!=null){
            this.classe = c;
        }else{
            this.classe = "anonimo";
        }
        this.annodifabbr = 0;
        this.portataminima = 0.0;
        this.portatamassima = 0.0;
        this.consumo = 0.0;
        this.acceso = false;
    }
    //02
    public void accendi(){
        this.acceso = true;
    }
    public void spegni(){
        this.acceso = false;
    }
    //03
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String m){
        if(m != null){
            this.marca = m;
        }
    }
    //04
    public String getModello(){
        return this.modello;
    }
    public void setModello(String mod){
        if(mod != null){
            this.modello = mod;
        }
    }
    //05
    public String getClasse(){
        return this.classe;
    }
    public void setClasse(String c){
        if(c != null){
            this.modello = c;
        }
    }
    //06
    public int getAnnodifabbr(){
        return this.annodifabbr;
    }
    public void setAnnodifabbr(int annodifabbr){
        if(annodifabbr > 2005){
            this.annodifabbr = annodifabbr;
        }
    }
    //07
    public double getPortataminima(){
        return this.portataminima;
    }
    public void setPortataminima(double portataminima){
        if(portataminima > 3.5 && portataminima < 5.0){
            this.portataminima = portataminima;
        }
    }
    //08
    public double getPortatamassima(){
        return this.portatamassima;
    }
    public void setPortatamassima(double portatamassima){
        if(portatamassima < 7.0 && portatamassima > portataminima){
            this.portatamassima = portatamassima;
        }
    }
    //09
    public double getConsumo(){
        return this.consumo;
    }
    public void setConsumo(double consumo){
        if(consumo > portataminima && consumo < portatamassima){
            this.consumo = consumo;
        }
    }
    //
    public String toString(){
        String out = "Marca: " + this.marca + "\n";
        out += "Modello: " + this.modello + "\n";
        out += "Classe: " + this.classe + "\n";
        out += "Anno di fabbricazione: " + this.annodifabbr + "\n";
        out += "Portata minima: " + this.portataminima + "\n";
        out += "Portata massima: " + this.portatamassima + "\n";
        out += "Consumo: " + this.consumo + "\n";
        if(acceso){
            out += "è acceso" + "\n";
        }else{
            out += "è spento" + "\n";
        }
        return out;
    }
}
