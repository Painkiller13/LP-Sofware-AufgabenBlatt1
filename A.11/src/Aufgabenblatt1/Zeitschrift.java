package Aufgabenblatt1;

public class Zeitschrift extends Medium {

    protected String ISSN;
    protected int Volume;
    protected int Nummer;

    public Zeitschrift(String ISSN, int Volume, int Nummer, String Titel){
        super(Titel);
        this.ISSN=ISSN;
        this.Volume=Volume;
        this.Nummer=Nummer;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }

    public int getNummer() {
        return Nummer;
    }

    public void setNummer(int nummer) {
        Nummer = nummer;
    }

    public static Zeitschrift calculateRepresentation(Zeitschrift a){
        return new Zeitschrift (a.ISSN, a.Volume,a.Nummer, a.Titel);
    }

    @Override
    public String toString() {
        return String.format("Titel: "+super.toString()+"%n"+"ISSN: "+ISSN+"%n"+"Volume: "+Volume+"%n"+"Nummer: "+Nummer);
    }
}
