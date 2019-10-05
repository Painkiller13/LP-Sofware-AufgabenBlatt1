package Aufgabenblatt1;

public class Buch extends Medium {

    protected int Erscheinungsjahr;
    protected String Verlag;
    protected String ISBN;
    protected String Verfasser;

    public Buch(int Erscheinungsjahr, String Verlag, String ISBN, String Verfasser, String Titel){
        super(Titel);
        this.Erscheinungsjahr=Erscheinungsjahr;
        this.Verlag=Verlag;
        this.ISBN=ISBN;
        this.Verfasser=Verfasser;
        setISBN(ISBN);
    }

    public int getErscheinungsjahr() {
        return Erscheinungsjahr;
    }

    public void setErscheinungsjahr(int erscheinungsjahr) {
        Erscheinungsjahr = erscheinungsjahr;
    }

    public String getVerlag() {
        return Verlag;
    }

    public void setVerlag(String verlag) {
        Verlag = verlag;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        //Erstellen einer Variable zur Speicherung der Länge der ISBN und Erstellung eines Arrays mit der gespeicherten Länge
        int StringLaenge = this.ISBN.length();
        int []ISNBArray;
        ISNBArray = new int[StringLaenge];

        //zeichenweises auslesen und abspeichern der ISBN in ein Array
        for (int i=0;i<StringLaenge;i++){
            ISNBArray[i]=ISBN.charAt(i);
        }
        //Prüfen on die ISBN korrekt ist und Fehlerausgabe fals ISBN falsch ist
        if (checkISBN10(ISNBArray)==true || checkISBN13(ISNBArray)==true){
            this.ISBN=ISBN;
        }else {
            throw new IllegalArgumentException("Dies ist keine gültige ISBN!");
        }
    }

    public String getVerfasser() {
        return Verfasser;
    }

    public void setVerfasser(String verfasser) {
        Verfasser = verfasser;
    }

    @Override
    public String toString() {
        return String.format("Titel: "+super.toString()+"%n"+"Erscheinungsjahr: "+Erscheinungsjahr+"%n"+"Verlag: "+Verlag+"%n"+"ISBN: "+ISBN+"%n"+"Verfasser: "+Verfasser);
    }

    public static Buch calculateRepresentation(Buch a){
        return new Buch (a.Erscheinungsjahr, a.Verlag,a.ISBN, a.Verfasser,a.Titel);

    }
    //Prüfroutinen für ISBN10
    public static boolean checkISBN10(int[] isbn) {
        int sum = 0;
        for (int i = 1; i <= isbn.length; i++) {
            sum += i * isbn[i - 1];
        }
        if (sum % 11 == 0) {
            return true;
        } else {

            return false;
        }
    }

    //Prüfroutinen für ISBN13
    public static boolean checkISBN13(int[] isbn) {
        int sum = 0;
        for (int i = 1; i < isbn.length; i++) {
            if (i % 2 == 0) {
                sum += isbn[i - 1] * 3;
            } else {
                sum += isbn[i - 1];
            }
        }
        int lastDigit = sum % 10;
        int check = (10 - lastDigit) % 10;

        if (isbn[isbn.length - 1] == check) {
            return true;
        } else {
            return false;
        }
    }
}
