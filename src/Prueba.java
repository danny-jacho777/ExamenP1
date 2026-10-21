public class Prueba {
    void main() {
        Dispositivo d1 = new Dispositivo(1, "Sensor A");
        System.out.println("Resumen: " + d1.obtenerResumen());

        Dispositivo d2 = new Dispositivo(-2, " "); // Se debe ejecutar el error  controlado por los datos inválidos
        System.out.println("Resumen: " + d2.obtenerResumen());

        System.out.println("Contador: " +Dispositivo.getCont());


    }
}
