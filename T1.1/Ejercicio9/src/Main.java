public class Main {

    static void main(String[] args) {
        String nombre = "Auriculares Bluetooth";
        double precio = 29.99;
        String codigo = "aur-2023";
        boolean disponibilidad = true;
        System.out.printf("""
                Información del producto:
                Nombre: %s
                Precio: %.2f$
                Codigo de producto: %s
                Disponibilidad: %b""",nombre,precio,codigo,disponibilidad);

    }
}
