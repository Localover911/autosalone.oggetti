package Package;

public class Auto {
    private String modello;
    private String marca;
    private String prezzo;

    public Auto (String mrc, String mdl, String prz){
        modello = mdl;
        marca = mrc;
        prezzo = prz;
    }

    public void setModello (String mdl){
        modello = mdl;
    }
    public void setMarca (String mrc){
        marca = mrc;
    }
    public void setPrezzo (String prz){
        prezzo = prz;
    }

    public String getModello (){
        return modello;
    }
    public String getMarca (){
        return marca;
    }
    public String getPrezzo (){
        return prezzo;
    }


}
