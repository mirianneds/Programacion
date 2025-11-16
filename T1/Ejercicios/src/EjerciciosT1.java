public class EjerciciosT1 {

    public static void ejercicio1 () {
        /*Crea un programa que defina tres variables: nombre, edad y ciudad.
        Asigna valores a cada una y muestra su contenido en la consola.

        Ejemplo de salida por consola:
         Ana
         25
         Madrid
         */

        String nombre = "Ana";
        int edad = 25;
        String ciudad = "Madrid";

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(ciudad);

    }

    public static void ejercicio2 (){
        /*Crea un programa que defina una variable llamada puntuación con valor inicial 0.
         Luego, modifica su valor tres veces y muestra el resultado final.

        Ejemplo de salida por consola:
        Puntuación inicial: 0
        Después de primera modificación: 5
        Después de segunda modificación: 10
        Puntuación final: 15*/

        int puntuacion = 0;
        System.out.println("Puntuación incial: "+puntuacion);
        puntuacion = 5;
        System.out.println("Depués de primera modificación: "+puntuacion);
        puntuacion = 10;
        System.out.println("Después de segunda modificación: "+puntuacion);
        puntuacion = 15;
        System.out.println("Puntuación final: "+puntuacion);

    }

    public static void ejercicio3 () {
        /*Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char)
         y muestra tanto su valor como su tipo.

        Ejemplo de salida por consola:
        Nombre: Carlos - Tipo: String
        Edad: 30 - Tipo: int
        ¿Es estudiante?: true - Tipo: boolean
        Altura: 1.75 - Tipo: double
        Inicial: C - Tipo: char */

        String nombre = "Mirianne";
        int edad = 27;
        boolean estudiante = true;
        double altura = 1.68;
        char inicial = 'M';

        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Altura: "+altura);
        System.out.println("Es estudiante?: "+estudiante);
        System.out.println("Inicial: "+inicial);

    }

    public static void ejercicio4 () {
        /*Crea un programa que simule la información de un libro usando variables con nombres descriptivos.
        Muestra toda la información del libro en la consola.

        Ejemplo de salida por consola:
        Título: Don Quijote de la Mancha
        Autor: Miguel de Cervantes
        Año de publicación: 1605
        Número de páginas: 863
        ¿Disponible en biblioteca?: true*/

        String titulo = "Don Quijote de La Mancha";
        String autor = "Miguel de Cervantes";
        int publicacion = 1605;
        int paginas = 863;
        boolean disponible = true;

        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Año de publicación: "+publicacion);
        System.out.println("Numero de páfginas: "+paginas);
        System.out.println("Disponible: "+disponible);

    }

    public static void ejercicio5 () {

        /*Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char)
        y muestra tanto su valor como su tipo.

        Ejemplo de salida por consola:
        Nombre: Carlos - Tipo: String
        Edad: 30 - Tipo: int
        ¿Es estudiante?: true - Tipo: boolean
        Altura: 1.75 - Tipo: double
        Inicial: C - Tipo: char */

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

    public static void ejercicio6 () {

       /* Escribe un programa que declare dos variables numéricas, realice las operaciones básicas
       (suma, resta, multiplicación y división) y muestre los resultados por consola.

        Ejemplo de salida por consola:
        Número 1: 10
        Número 2: 5
        Suma: 15
        Resta: 5
        Multiplicación: 50
        División: 2 */

        int numero1 = 8;
        int numero2 = 5;
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 - numero2;
        double division = numero1 / numero2;

        System.out.println("Numero 1: "+numero1);
        System.out.println("Numero 2: "+numero2);
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multilicación: "+multiplicacion);
        System.out.println("División: "+division);
    }

    public  static void ejercicio7 () {
        /*Crea un programa que almacene tu información personal (nombre, apellido, edad y ciudad)
         en variables y muestre un mensaje de presentación por consola.

         Ejemplo de salida por consola:
         ¡Hola! Me llamo Elena García.
         Tengo 24 años y vivo en Barcelona.  */

        String nombre = "Elena";
        String apellido = "Garcia";
        int edad = 24;
        String ciudad = "Barcelona";
        System.out.printf("Hola, me llamo %s %s, tengo %d años y vivo en %s", nombre, apellido,edad,ciudad);
    }

    public static void ejercicio8 () {
        /*Desarrolla un programa que calcule el área de un rectángulo.
        Declara variables para la base y la altura, y muestra el resultado del cálculo.

         Ejemplo de salida por consola:
         Base del rectángulo: 5
         Altura del rectángulo: 3
         El área del rectángulo es: 15*/

        int base = 5;
        int altura = 3;
        System.out.printf("""
                Base del rectangulo: %d
                Altura del resctangulo: %d
                El area del rectangulo es: %d
                """, base,altura,base*altura);
    }

    public static void ejercicio9 () {
       /*Escribe un programa que almacene la información de un producto (nombre, precio, código y disponibilidad)
        y muestre estos datos formateados por consola.

        Ejemplo de salida por consola:
        INFORMACIÓN DEL PRODUCTO
        --------------------------
        Nombre: Auriculares Bluetooth
        Precio: 29.99€
        Código: AUR-2023
        Disponible: true */

        String nombre = "Auriculares Bluetooth";
        double precio = 29.99;
        String codigo = "aur-2023";
        boolean disponibilidad = true;
        System.out.printf("""
                INFORMACIÓN DEL PRODUCTO
                ------------------------
                Nombre: %s
                Precio: %.2f$
                Codigo de producto: %s
                Disponibilidad: %b""",nombre,precio,codigo,disponibilidad);

    }

    public static void ejercicio10(){
        /*Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit.
        Usa una variable para la temperatura en Celsius y muestra el resultado de la conversión.
        La fórmula para convertir de Celsius a Fahrenheit es:
        F = C × 9/5 + 32

        Ejemplo de salida por consola:
        Temperatura en Celsius: 25
        Temperatura en Fahrenheit: 77 */

        double celsius = 25;
        double fahrenheit = (celsius*9/5)+32;
        System.out.printf("""
                Temperatura en Celsius: %.0f
                Temperatura en Fahrenheit: %.0f
                """,celsius,fahrenheit);
    }


    }


