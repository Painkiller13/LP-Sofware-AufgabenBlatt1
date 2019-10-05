package Aufgabenblatt1;

public class CD extends Medium {

    protected String Label;
    protected String Kuenstler;

    public CD(String Label, String Kuenstler, String Titel){
        super(Titel);
        this.Label =Label;
        this.Kuenstler=Kuenstler;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public String getKuenstler() {
        return Kuenstler;
    }

    public void setKuenstler(String kuenstler) {
        Kuenstler = kuenstler;
    }

    public static CD calculateRepresentation(CD a) {
        return new CD(a.Label, a.Kuenstler,a.Titel);
    }

    @Override
    public String toString() {
        return String.format("Titel: "+super.toString()+"%n"+"Label: "+Label+"%n"+"Kuenstler: "+Kuenstler);
    }
}
