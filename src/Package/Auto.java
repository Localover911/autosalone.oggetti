package Package;

public class Auto {
    private String modello;
    private String marca;
    private String prezzo;

    public Auto (){
        modello = "nessun modello";
        marca = "nessuna marca";
        prezzo = "nessun prezzo";
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

    public void setAll (String mrc, String mdl, String prz){
        marca = mrc;
        modello = mdl;
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
