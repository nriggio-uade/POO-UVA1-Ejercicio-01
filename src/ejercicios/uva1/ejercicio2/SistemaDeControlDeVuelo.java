package ejercicios.uva1.ejercicio2;



public class SistemaDeControlDeVuelo {
    
    String fabricante;
    int modo;
    String tipo; //Manual o Automático
    
    public SistemaDeControlDeVuelo(String fabricante, int modo, String tipo) {
        this.fabricante = fabricante;
        this.modo = modo;
        this.tipo = tipo;
    }

    

    public SistemaDeControlDeVuelo() {
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
