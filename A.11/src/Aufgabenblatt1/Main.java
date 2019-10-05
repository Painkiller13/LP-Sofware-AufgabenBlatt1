//Sven Heinze 17520

package Aufgabenblatt1;

public class Main {

    public static void main(String[] args) {
        /*int[] isbn10 = new int[] { 3, 8, 6, 6, 8, 0, 1, 9, 2 };
        System.out.println(checkISBN10(isbn10));
        int[] isbn13 = new int[] { 9, 7, 8, 3, 7, 6, 5, 7, 2, 7, 8, 1, 8 };
        System.out.println(checkISBN13(isbn13));*/

        //Erstellung der unterschiedlichen Medien
        Buch Duden01 =new Buch(2004, "Bibliographisches Institut, Mannheim","3411040130","-","Duden 01. Die deutsche Rechtschreibung");
        CD One = new CD("Apple (Bea (EMI)","The Beatles","1");
        Zeitschrift DerSpiegel =new Zeitschrift("0038-7452",54,6,"Der Spiegel");
        ElektronischesMedium HochschuleStralsund = new ElektronischesMedium("http://www.hochschule-stralsund.de ","Hochschule Stralund");

        //Erstellen des Bibiliotheks Arrays und Seicherung der Medien in diesem
        Main[] BibliothekArr =new Main[4];

        BibliothekArr[0]= Duden01;
        BibliothekArr[1]= One;
        BibliothekArr[2]= DerSpiegel;
        BibliothekArr[3]=HochschuleStralsund;

        //Realisierung der Ausgabe der Medien
        for (int i=0; i<4;i++){
            System.out.println(BibliothekArr[i].toString());
            System.out.println("------------------------------------------------------");
        }
    }
}

