public class Main {

    static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = (celsius*9/5)+32;
        System.out.printf("""
                Temperatura en Celsius: %.0f
                Temperatura en Fahrenheit: %.0f
                """,celsius,fahrenheit);

    }
}
