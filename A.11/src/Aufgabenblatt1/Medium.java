package Aufgabenblatt1;

public abstract class Medium extends Main {

    protected String Titel;

    public Medium(String Titel){
        this.Titel=Titel;
    }

    public String getTitel() {
        return Titel;
    }

    public String setTitel(String titel) {
        return Titel = titel;
    }

    @Override
    public String toString() {
        return Titel;
    }



}
