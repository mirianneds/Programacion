import java.util.Scanner;

public class EjerciciosT2 {

    public static void ejercicio1 (){
        /* Crea un programa que pida al usuario dos números enteros por consola
        y muestre el resultado de las cinco operaciones aritméticas básicas:
        suma, resta, multiplicación, división y módulo (resto).

        Ejemplo de salida por consola:
        Introduce el primer número: 15
        Introduce el segundo número: 4
        Suma: 19
        Resta: 11
        Multiplicación: 60
        División: 3
        Módulo (resto): 3 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.println("Introduce el segundo número: ");
        int segundoNumero = scanner.nextInt();

        int suma = primerNumero + segundoNumero;
        int resta = primerNumero - segundoNumero;
        int multiplicacion = primerNumero * segundoNumero;
        int division = primerNumero - segundoNumero;
        int modulo = primerNumero % segundoNumero;

        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("División: "+division);
        System.out.println("Modulo: "+modulo);

    }

    public static void ejercicio2 (){
        /*Escribe un programa que pida dos números al usuario y
        muestre el resultado de todas las comparaciones relacionales entre ellos
        (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).

        Ejemplo de salida por consola:
        Introduce el primer número: 10
        Introduce el segundo número: 10
        ¿10 es mayor que 10?: false
        ¿10 es menor que 10?: false
        ¿10 es igual a 10?: true
        ¿10 es diferente de 10?: false
        ¿10 es mayor o igual que 10?: true
        ¿10 es menor o igual que 10?: true */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.println("Introduce el segundo número: ");
        int segundoNumero = scanner.nextInt();

        System.out.println(primerNumero+" es mayor que "+segundoNumero+"?: "+ (primerNumero > segundoNumero));
        System.out.println(primerNumero+" es menor que "+segundoNumero+"?: "+(primerNumero < segundoNumero));
        System.out.println(primerNumero+" es igual a "+segundoNumero+"?: "+(primerNumero == segundoNumero));
        System.out.println(primerNumero+" es diferente de "+segundoNumero+"?: "+(primerNumero != segundoNumero));
        System.out.println(primerNumero+" es mayor o igual a "+segundoNumero+"?: "+ (primerNumero >= segundoNumero));
        System.out.println(primerNumero+" es menor o igual a "+segundoNumero+"?: "+ (primerNumero <= segundoNumero));

    }

    public static void ejercicio3 () {
        /*Crea un programa que declare una variable con valor inicial 100
        y aplique diferentes operadores de asignación compuesta (+=, -=, *=, /=).
        Muestra el valor de la variable después de cada operación.

        Ejemplo de salida por consola:
        Valor inicial: 100
        Después de sumar 50 (+=): 150
        Después de restar 30 (-=): 120
        Después de multiplicar por 2 (*=): 240
        Después de dividir entre 4 (/=): 60  */

        int valor = 100;
        System.out.println("Valor inicial: "+valor);

        valor += 50;
        System.out.println("Después de sumar 50: "+valor);

        valor -= 30;
        System.out.println("Después de restar 30: "+valor);

        valor *= 2;
        System.out.println("Después de multiplicar por 2: "+valor);

        valor /= 4;
        System.out.println("Después de sividir entre 4: "+valor);
    }

    public static void ejercicio4 (){
        /* Desarrolla un programa que pida un número al usuario y determine si es par o impar usando el operador módulo.
         Muestra el resultado por consola.

        Ejemplo de salida por consola:
        Introduce un número: 7
        El número 7 es impar (resto al dividir entre 2: 1) */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = scanner.nextInt();

        int resto = numero % 2;

        if (resto == 0){
            System.out.println("El número "+numero+" es par");
        } else {
            System.out.println("El número "+numero+" es impar");
        }

    }

    public static void  ejercicio5(){
        /* Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false).
        Usa operadores lógicos para determinar si puede alquilar un coche (debe tener 21 años o más Y tener carnet).

        Ejemplo de salida por consola:
        Introduce tu edad: 23
        ¿Tienes carnet de conducir? (true/false): true
        ¿Eres mayor de 21 años?: true
        ¿Tienes carnet?: true
        ¿Puedes alquilar un coche? (AND): true */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: " );
        int edad = scanner.nextInt();

        System.out.println("¿Tienes carnet de conducir?: ");
        boolean carnet = scanner.nextBoolean();

        boolean mayor21 = edad >= 21;
        boolean puedeAlquilar = mayor21 && carnet;

        System.out.println("¿Eres mayor de 21 años?: "+mayor21);
        System.out.println("¿Tienes carnet? "+carnet);
        System.out.println("¿Puedes alquilar un coche? "+puedeAlquilar);
    }

    public static void ejercicio6(){
        /* Escribe un programa que pida el precio de un producto y el porcentaje de descuento.
    Calcula el precio final después del descuento usando operadores aritméticos y muestra todos los pasos del cálculo.

        Ejemplo de salida por consola:
        Introduce el precio del producto: 100
        Introduce el porcentaje de descuento: 20
        Precio original: 100.0€
        Descuento (20%): 20.0€
        Precio final: 80.0€ */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.println("Introduce el porcentaje de descuento: ");
        double descuento = scanner.nextDouble();

        double precioDescuento = precio*(descuento/100);

        double precioFinal = precio - precioDescuento;

        System.out.println("Precio original "+precio+"€");
        System.out.println("Descuento "+descuento+"%");
        System.out.println("Precio final "+precioFinal+"€");
    }

    public  static void  ejercicio7(){
        /* Crea un programa que pida al usuario su edad y si es estudiante (true/false).
        Usa operadores lógicos (AND, OR, NOT) para determinar si puede acceder a diferentes descuentos:
        descuento joven (menor de 26 años), descuento estudiante, o descuento especial (menor de 26 Y estudiante)

        Ejemplo de salida por consola:
        Introduce tu edad: 24
        ¿Eres estudiante? (true/false): true
        ¿Eres menor de 26 años?: true
        ¿Eres estudiante?: true
        ¿NO eres estudiante?: false
        ¿Tienes descuento joven? (menor de 26): true
        ¿Tienes descuento estudiante?: true
        ¿Tienes descuento especial? (menor de 26 AND estudiante): true */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("¿Eres estudiante?: ");
        boolean estudiante = scanner.hasNextBoolean();

        boolean menor26 = edad <= 26;
        boolean noEstudiante = ! estudiante;
        boolean descuentoJoven = menor26;
        boolean descuentoEstudiante = estudiante;
        boolean descuentoEspecial = descuentoJoven && descuentoEstudiante;

        System.out.println("¿Eres menor de 26 años?: "+menor26);
        System.out.println("¿Eres estudiante?: "+estudiante);
        System.out.println("¿NO eres estudiante?: "+noEstudiante);
        System.out.println("¿Tienes descuento joven?: "+menor26);
        System.out.println("¿Tienes descuento estudiante?: "+estudiante);
        System.out.println("¿Tienes descuento especial?: "+descuentoEspecial);

    }

    public static void ejercicio8(){
        /* Desarrolla un programa que pida tres números al usuario y calcule:
        la suma de los tres, el promedio, el resultado de multiplicar el primero por el segundo y
        dividirlo entre el tercero. Usa paréntesis para controlar la precedencia de operadores.

        Ejemplo de salida por consola:
        Introduce el primer número: 10
        Introduce el segundo número: 5
        Introduce el tercer número: 2
        Suma de los tres números: 15
        Promedio: 5.0
        Resultado de (número1 * número2) / número3: 25.0 */

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el primer número: ");
            int primerNumero = scanner.nextInt();

            System.out.println("Introduce el segundo número: ");
            int segundoNumero = scanner.nextInt();

            System.out.println("Introduce el tercer número");
            int tercerNumero = scanner.nextInt();

            int suma =  primerNumero +segundoNumero + tercerNumero;
            double promedio =  suma / 3;

            System.out.println("Suma de los tres números: "+ suma);
            System.out.println("Promedio: "+ promedio);
            System.out.println("Resultado de primerNumero * segundoNumero)/tercerNumero:"+ (primerNumero * segundoNumero)/tercerNumero );

        }

    public static void ejercicio9(){
        /* Escribe un programa que pida al usuario la puntuación de tres exámenes.
        Calcula la nota media y usa operadores relacionales para determinar si ha aprobado (>=5),
        si tiene notable (>=7), y si tiene sobresaliente (>=9). Muestra todos los resultados.

        Ejemplo de salida por consola:
        Introduce la nota del primer examen: 8
        Introduce la nota del segundo examen: 7
        Introduce la nota del tercer examen: 9
        Nota media: 8.0
        ¿Ha aprobado? (>=5): true
        ¿Tiene notable? (>=7): true
        ¿Tiene sobresaliente? (>=9): false */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Introduce la nota del segundo examen: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Introduce la nota del segundo examen: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        boolean aprobado = media >= 5;
        boolean notable = media >= 7;
        boolean sobresaliente = media >= 9;

        System.out.println("Nota media: "+media);
        System.out.println("¿Ha aprobado? "+aprobado);
        System.out.println("¿Tiene notable? "+notable);
        System.out.println("¿Tiene sobresaliente? "+sobresaliente);
    }

    public static void  ejercicio10(){
        /*Crea un programa que pida el salario base por hora, las horas trabajadas y si ha hecho horas extra (true/false).
         Si ha hecho horas extra y trabajó más de 40 horas, las horas que excedan de 40 se pagan al doble.
         Usa operadores lógicos, relacionales y aritméticos para calcular el salario total.

        Ejemplo de salida por consola:
        Introduce el salario por hora: 10
        Introduce las horas trabajadas: 45
        ¿Has hecho horas extra? (true/false): true
        Horas normales (máximo 40): 40
        Horas extra: 5
        ¿Trabajaste más de 40 horas?: true
        ¿Tienes derecho a horas extra?: true
        ¿Se aplican horas extra? (>40 AND permitido): true
        Salario por horas normales: 400.0€
        Salario por horas extra (al doble): 100.0€
        Salario total: 500.0€ */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el salario por hora: ");
        double salarioHora = scanner.nextDouble();

        System.out.println("Introduce las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.println("¿Has hecho horas extra? (true/false): ");
        boolean realizaExtra = scanner.nextBoolean();

        int horasPermitidas = 40;

        boolean mas40 = horasTrabajadas >40;
        boolean aplicarExtras = mas40 && realizaExtra;

        int horasNormales = Math.min(horasTrabajadas , horasPermitidas);
        int horasExtra = Math.max(horasTrabajadas - horasPermitidas, 0);

        double salarioNormal = horasNormales * salarioHora;
        double salarioExtra = (horasExtra * salarioHora) * 2;
        double salarioTotal = salarioExtra + salarioNormal;

        System.out.println("Horas normales (máximo 40): " + horasNormales);
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Trabajaste más de 40 horas?: " + (horasTrabajadas > 40));
        System.out.println("Tienes derecho a horas extra?: " + (horasTrabajadas > 40));
        System.out.println("¿Se aplican horas extra?: " + aplicarExtras);
        System.out.println("¿Salario por hora normales?: " + salarioNormal + "€");
        System.out.println("¿Salario por horas extras?: " + salarioExtra + "€");
        System.out.println("¿Salario total: " + salarioTotal + "€");

    }
}

