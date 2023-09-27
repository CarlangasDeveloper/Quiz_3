/**
 * Clase Proteina
 */
public class Proteina {
    /**
     * Atributos:
     */
    String prote;
    String kcal;

    /**
     * Constructor de la clase
     * @param prote Nombre de la proteina
     * @param kcal Contenido calorico
     */
    Proteina(String prote, String kcal){
        this.prote = prote;
        this.kcal = kcal;
    }

    /**
     * Método que imprime la información alimenticia de las proteinas
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    void info() {
        System.out.println("La proteina: "+prote+" tiene "+kcal+" calorias");
    }
}
