package tarea31;

/**
 * Clase hija que hereda de AutoMovil y sobrescribe dos métodos.
 */
public class HondaCivic extends AutoMovil {

    public HondaCivic() {
        super();
        System.out.println("Constructor de HondaCivic");
    }

    @Override
    public void encender() {
        System.out.println("El Honda Civic está encendiendo con arranque deportivo...");
    }

    @Override
    public void acelerar() {
        System.out.println("El Honda Civic acelera rápidamente...");
    }
}
