public class Main {

    /*Crea un programa que use constantes para almacenar información que no debe cambiar
     (como el valor de PI o el nombre de una aplicación) y variables para información que puede cambiar.
     Muestra todos los valores.*/

    static void main(String[] args) {

        final String NOMBRE_APP = "MiApp";
        System.out.println("Aplicación: "+NOMBRE_APP);

        final String VERSION = "1.00.0";
        System.out.println("Versión: "+VERSION);

        System.out.println("Valor de PI: "+Math.PI);

        String usuario = "Laura";
        System.out.println("Usuario actual: "+usuario);

        int nivel = 1;
        System.out.println("Nivel actual: "+nivel);

        int puntuacion = 0;
        System.out.println("Puntuacion: "+puntuacion);

        usuario = "Miguel";
        System.out.println("Usuario actualizado: "+usuario);

        nivel = 2;
        System.out.println("Nivel actualizado: "+nivel);

        puntuacion = 150;
        System.out.println("Puntuacion actualizada: "+puntuacion);


    }
}
