package ejercicios.uva1.ejercicio3;

public class motor {
    
    String marca;
    float hp; //caballos de fuerza
    float empuje; //en libras
    boolean encendido;
    

    public motor(String marca, float hp, float empuje, boolean encendido) {
        this.marca = marca;
        this.hp = hp;
        this.empuje = empuje;
        this.encendido = encendido;
    }

    public motor() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getEmpuje() {
        return empuje;
    }

    public void setEmpuje(float empuje) {
        this.empuje = empuje;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

   
}
