public class Dispositivo {

    // Atributos de instancia
    private final int id;
    private String nombre;
    private boolean activo;

    // Atributos de clase (compartidos)
    private static int cont;

    // Constructor
    public Dispositivo(int id, String nombre) {
        if (id > 0 && nombre!=null && !nombre.trim().isBlank()){
            this.id = id;
            this.nombre = nombre;
            this.activo = true;
            cont++;
        }else{
            // Lanzar error controlado
            throw new IllegalArgumentException("Datos inválidos.");
        }
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public static int getCont() {
        return cont;
    }

    // SETTERS

    public void setNombre(String nombre) {
        if (nombre!=null && !nombre.trim().isBlank()){
        this.nombre = nombre;
        }else{
            // Lanzar error controlado
            throw new IllegalArgumentException("Datos inválidos.");
        }
    }

    // Métodos utilitarios
    public boolean desactivar(){
        if(activo){
            activo = false;
            System.out.println("Desactivado con éxito.");
            return true;
        }else{
            System.out.println("ERROR: El dispositivo ya estaba desactivado.");
            return false;
        }
    }

    public String obtenerResumen(){
        if (activo){
            return id + " | " + nombre + " | " + "Activo";
        }else {
            return id + " | " + nombre + " | " + "Inactivo";
        }
    }


}
