package ejercicios.uva1.ejercicio2;

/*
Ejercicio 2: 
- Desarrolla la clase SistemaDeControlDeVuelo. OK
- Un sistema de control de vuelo típico tiene atributos como el fabricante, el número de modos
 y el tipo de sistema (manual o pilotoAutomatico). CREO QUE OK
- Normalmente, al sistema de control de vuelo se le “cambian” los modos. Representa un comportamiento
 para cambiar de modo. Crea un “main” que construya diferentes tipos de sistemas de control de vuelo 
 con diferentes características e imprime algunos de los valores más significativos de sus 
 componentes (como el fabricante y el modo actual). ESTO FALTA
 */

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
