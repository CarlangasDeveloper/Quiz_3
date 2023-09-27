/**
 * Clase Carbos
 */
public class Carbos {
    /**
     * Atributos:
     */
    String carbohidratos;
    String kcal;

    /**
     * Constructor de la clase
     * @param carbohidratos
     * @param kcal
     */
    Carbos(String carbohidratos, String kcal){
        this.carbohidratos = carbohidratos;
        this.kcal = kcal;
    }

    /**
     * Método que imprime la información alimenticia de los carbohidratos
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    void info() {
        System.out.println("El carbohidrato: "+carbohidratos+" tiene "+kcal+" calorias");
    }
}
