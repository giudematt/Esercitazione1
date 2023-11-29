/*
 * Questo è il primo esercizio e si riferisce principalmente al nucleo tematico che tratta (anche) il paradigma
 * di programmazione orientato agli oggetti.
 * Viene richiesto di implementare una classe java che incarni l'idea di un vettore 3D utilizzando variabili
 * di tipo float.
 * La classe dovrebbbe implementare almeno (ma si possono aggiungerne altri) i seguenti metodi:
 * - norma
 * - modulo
 * - somma di due vettori
 * - prodotto scalare
 * - prodotto vettoriale
 * Infine si aggiunga un semplice metodo main per interagire con la classe implementata.
 */

/**
 * Implementazione di un vettore tridimensionale in Java
 * 
 * @author Giuseppe De Matteis
 */

public class Vettore3D {

    // Attributi
    /** ascissa */
    private float x;
    /** ordinataa */
    private float y;
    /** quota */
    private float z;

    // Costruttori

    /**
     * Costruisce un vettore dalle sue coordinate:
     * 
     * @param x ascissa
     * @param y ordinata
     * @param z quota
     */
    public Vettore3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Crea una copia di un vettore da un altro vettore:
     * 
     * @param v : vettore che verrà copiato.
     */
    public Vettore3D(Vettore3D v) {
        x = v.x;
        y = v.y;
        z = v.z;
    }

    // Versori e vettore nullo

    /** Vettore nullo di coordinate (0,0,0) */
    public static final Vettore3D ZERO = new Vettore3D(0, 0, 0);

    /** Versore asse x, coordinate (1,0,0) */
    public static final Vettore3D VERSORE_I = new Vettore3D(1, 0, 0);

    /** Versore asse y, coordinate (0,1,0) */
    public static final Vettore3D VERSORE_J = new Vettore3D(0, 1, 0);

    /** Versore asse z, coordinate (0,0,1) */
    public static final Vettore3D VERSORE_K = new Vettore3D(0, 0, 1);

    // Metodi

    // Norma o modulo di un vettore
    /**
     * Restituisce il <b>modulo</b> di un vettore.
     * 
     * @return <I>Modulo</i> in formato <b>float</b>
     */
    public float modulo() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    // Somma di due vettori
    /**
     * Restituisce la <b>somma</b> di due vettori.
     * 
     * @param vettore : vettore da sommare al primo
     * @return <i>Vettore somma</i> di tipo <b>Vettore3D</b>
     */
    public Vettore3D add(Vettore3D vettore) {
        return new Vettore3D((x + vettore.x), (y + vettore.y), (z + vettore.z));
    }

    // Prodotto per uno scalare
    /**
     * Restituisce il <b>prodotto</b> di un vettore per uno scalare.
     * 
     * @param scalare : scalare da moltiplicare
     * @return <i>Prodoto per scalare</i> di tipo <b>Vettore3D</b>
     */
    public Vettore3D scalare(float scalare) {
        return new Vettore3D((x * scalare), (y * scalare), (z * scalare));
    }

    // Opposto di un vettore
    /**
     * Restituisce il vettore <b>opposto</b> di un vettore assegnato.
     * 
     * @param vettore : da inserire per ottenere l'opposto
     * @return <i>Prodoto per scalare</i> di tipo <b>Vettore3D</b>
     */
    public Vettore3D scalare(Vettore3D vettore) {
        return new Vettore3D((-x), -(y), (-z));
    }

    // Prodotto scalare
    /**
     * Restituisce il <b>prodotto scalare</b> di due vettori.
     * 
     * @param vettore : vettore da moltiplicare
     * @return <i>Prodoto scalare</i> di tipo <b>float</b>
     */
    public float prodottoScalare(Vettore3D vettore) {
        return x * vettore.x + y * vettore.y + z * vettore.z;
    }

    // Calcolare l'angolo convesso formato da due vettori
    /**
     * Restituisce l'<b>angolo convesso</b> tra due vettori.
     * 
     * @param vettore : secondo vettore con cui calcolare l'angolo
     * @return <i>angolo in radianti</i> di tipo <b>float</b>
     */
    public float angolo(Vettore3D vettore) {
        return (float) Math.acos((this.prodottoScalare(vettore)) / (this.modulo() * vettore.modulo()));
    }

    // DA MIGLIORARE
    // Prodotto vettoriale
    /**
     * Restituisce il <b>prodotto vettoriale</b> di due vettori.
     * 
     * @param vettore : vettore da moltiplicare
     * @return <i>Prodotto vettoriale</i> di tipo <b>Vettore3D</b>
     */
    public Vettore3D prodottoVettoriale(Vettore3D vettore) {
        return new Vettore3D(((this.y * vettore.z) - (this.z * vettore.y)),
                ((this.z * vettore.x) - (this.x * vettore.z)), ((this.x * vettore.y) - (this.y * vettore.x)));
    }

    // toString
    /**
     * Restituisce un vettore scritto.
     * 
     * @return Vettore in formato <b>String</b>
     */
    public String toString() {
        return new String("(" + x + ", " + y + ", " + z + ")");
    }
}
