/**
 * Semplice classe per interagire con la classe Vettore3D
 */

public class VettoreTester {

    public static void main(String[] args) {
        Vettore3D a = new Vettore3D(1, -1, 2);
        Vettore3D b = new Vettore3D(1, 2, 3);
        Vettore3D d = new Vettore3D(a);
        // prova toString e norma
        System.out.println(a.toString());
        System.out.println(a.modulo());
        // prova copia-costruttore
        System.out.println("Vettore d copiato : " + d.toString());
        // prova somma
        Vettore3D c = a.add(b);
        System.out.println(c.toString());
        // prova prodotto per scalare
        Vettore3D prodottoPerScalare = a.scalare(4);
        System.out.println(prodottoPerScalare.toString());
        // prova prodoto scalare tra due vettori
        float prodottoScalare = a.prodottoScalare(b);
        System.out.println(String.format("%.2f", prodottoScalare));
        // prova angolo tra due vettori
        float testAngolo = a.angolo(b);
        System.out.println(String.format("%.2f", testAngolo));
        // prova prodotto vettoriale
        System.out.println(a.prodottoVettoriale(b));
    }
}
