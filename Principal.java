import java.util.Scanner;

/**
 * Primera clase que es ejecutada
 */
public class Principal {
    /**
     *Primer método que se ejecuta en mi aplicación
     *
     * @param args
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- VEGETAL/KCAL ---");
        Vegetal veg = new Vegetal(sc.next(), sc.next());
        System.out.println("--- CARBOHIDRATO/KCAL ---");
        Carbos carb = new Carbos(sc.next(), sc.next());
        System.out.println("--- PROTEINA/KCAL ---");
        Proteina prote = new Proteina(sc.next(), sc.next());

        veg.info();
        carb.info();
        prote.info();
    }
}
