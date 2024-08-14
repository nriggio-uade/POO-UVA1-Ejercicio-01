package ejercicios.uva1.ejercicio1;

/*Ejercicio 1: 
-Crear la clase Ala para un avión. OK
Esta clase debe tener atributos como la envergadura, el color y el tipo de material 
(aluminio, compuesto, etc.). OK
- Un comportamiento común de cualquier ala es “flap”. (FALTA ESTE PUNTO)
- Desarrolla una clase de prueba con un método “main” para construir dos alas, usar los flap 
y muestra algunos de sus datos en la consola. (FALTA ESTE PUNTO)

*/

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
