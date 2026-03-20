package tarea31;

/**
 * Clase base que representa un automóvil.
 * Aplica encapsulación mediante atributos privados y acceso controlado
 * con getters y setters.
 */
public class AutoMovil {
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    public AutoMovil() {
        System.out.println("Constructor de AutoMóvil");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void encender() {
        System.out.println("El automóvil está encendiendo...");
    }

    public void apagar() {
        System.out.println("El automóvil se está apagando...");
    }

    public void acelerar() {
        System.out.println("El automóvil está acelerando...");
    }

    public void frenar() {
        System.out.println("El automóvil está frenando...");
    }
}
