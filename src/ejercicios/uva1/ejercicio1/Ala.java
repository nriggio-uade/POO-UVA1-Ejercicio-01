package ejercicios.uva1.ejercicio1;

public class Ala {
    
    String envergadura;
    String color;
    String material; //Aluminio, compuesto, etc
    boolean flap;
    
    
    public Ala(String envergadura, String color, String material) { //constructor de Ala completo
        this.envergadura = envergadura;
        this.color = color;
        this.material = material;
        this.flap = false;
    }

    public Ala() { //constructor de Ala sin atributos
    }

    public String getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(String envergadura) {
        this.envergadura = envergadura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isFlap() {
        return flap;
    }

    public void setFlap(boolean flap) {
        this.flap = flap;
    }

}
