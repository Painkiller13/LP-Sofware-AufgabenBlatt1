package Aufgabenblatt1;

import java.net.URL;

public class ElektronischesMedium extends Medium {

    protected static String URL;

    public ElektronischesMedium(String URL, String Titel){
        super(Titel);
        this.URL=URL;
        setURL(URL);
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        //Rückgabewerte von checkURL wird verwendet um nicht korrekte URLs abzufangen
        if (checkURL(URL)==true){
            this.URL=URL;
        }else {
            throw new IllegalArgumentException("Die ist keine gueltige URL");
        }
    }

    public static ElektronischesMedium calculateRepresentation(ElektronischesMedium a) {
        return new ElektronischesMedium(a.URL, a.Titel);
    }

    @Override
    public String toString() {
        return String.format("Titel: "+super.toString()+"%n"+"URL: "+URL);

    }
    //Prüfroutinen für die URL
    public static boolean checkURL(String urlString)
    {
        try
        {
            URL url = new URL(urlString);
            url.toURI();
            return true;
        } catch (Exception exception)
        {
            return false;
        }
    }
}
