package Package;

public class Auto {
    private String modello;
    private String marca;
    private int prezzo;

    public Auto (){
        modello = "nessun modello";
        marca = "nessuna marca";
        prezzo = 0;
    }
    public Auto (String mrc, String mdl, int prz){
        marca = mrc;
        modello = mdl;
        if (prz < 0){
        }
        else {
            prezzo = prz;
        }
    }

    public void setModello (String mdl){
        modello = mdl;
    }
    public void setMarca (String mrc){
        marca = mrc;
    }
    public void setPrezzo (int prz){
        if (prz < 0){
        }
        else {
            prezzo = prz;
        }
    }

    public void setAll (String mrc, String mdl, int prz){
        marca = mrc;
        modello = mdl;
        if (prz < 0){
        }
        else {
            prezzo = prz;
        }
    }

    public String getModello (){
        return modello;
    }
    public String getMarca (){
        return marca;
    }
    public int getPrezzo (){
        return prezzo;
    }


}
