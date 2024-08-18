package ejercicios.uva1.ejercicio1;

public class PruebaAla {

    public static void main(String[] args) throws Exception{

        Ala ala1 = new Ala(35.5f, "Blanco", "Aluminio");
        Ala ala2 = new Ala(35.5f, "Blanco", "Aluminio");


        System.out.println(" --- ALA 1 --- ");

        System.out.println("Envergadura del Ala: " + ala1.getEnvergadura());
        System.out.println("Color del Ala: "+ ala1.getColor());
        System.out.println("Material del Ala: " + ala1.getMaterial());
    
        ala1.flap();
        System.out.println("Flap activado: " + ala1.isFlap());
        
        ala1.unflap();
        System.out.println("Flap activado: " + ala1.isFlap());
        
        System.out.println(" ------ ");

        System.out.println(" --- ALA 2 --- ");

        System.out.println("Envergadura del Ala: " + ala2.getEnvergadura());
        System.out.println("Color del Ala: "+ ala2.getColor());
        System.out.println("Material del Ala: " + ala2.getMaterial());
    
        ala2.flap();
        System.out.println("Flap activado: " + ala2.isFlap());
        
        ala2.unflap();
        System.out.println("Flap activado: " + ala2.isFlap());
    
    
        System.out.println(" ------ ");

    }



}

