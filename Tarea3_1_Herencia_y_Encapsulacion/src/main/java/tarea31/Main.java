package tarea31;

/**
 * Clase principal para probar AutoMovil y HondaCivic.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA DE LA CLASE AUTOMOVIL =====");
        AutoMovil auto = new AutoMovil();
        auto.setMarca("Toyota");
        auto.setModelo("Corolla");
        auto.setAnio(2023);
        auto.setColor("Blanco");

        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Año: " + auto.getAnio());
        System.out.println("Color: " + auto.getColor());
        auto.encender();
        auto.acelerar();
        auto.frenar();
        auto.apagar();

        System.out.println();
        System.out.println("===== PRUEBA DE LA CLASE HONDACIVIC =====");
        HondaCivic honda = new HondaCivic();
        honda.setMarca("Honda");
        honda.setModelo("Civic");
        honda.setAnio(2024);
        honda.setColor("Rojo");

        System.out.println("Marca: " + honda.getMarca());
        System.out.println("Modelo: " + honda.getModelo());
        System.out.println("Año: " + honda.getAnio());
        System.out.println("Color: " + honda.getColor());
        honda.encender();      // Método sobrescrito
        honda.acelerar();      // Método sobrescrito
        honda.frenar();        // Método heredado
        honda.apagar();        // Método heredado
    }
}
