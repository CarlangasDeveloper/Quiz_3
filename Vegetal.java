/**
 * Clase Vegetal
 */
public class Vegetal {
    /**
     * Atributos:
     */
    String vegetales;
    String kcal;

    /**
     * Constructor de la clase
     * @param vegetales Nombre del vegetal
     * @param kcal  Contenido de calorias
     */
    Vegetal(String vegetales, String kcal){
        this.vegetales = vegetales;
        this.kcal = kcal;
    }

    /**
     * Método que imprime la información alimenticia de los vegetales
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    void info() {
        System.out.println("El vegetal: "+vegetales+" tiene "+kcal+" calorias");
    }
}
