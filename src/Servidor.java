public class Servidor {

    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;

    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    public Servidor(String nombre, String direccionIP) {
        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false; // Comienza apagado
    }

    public void activar() {
        if (!this.activo) {
            this.activo = true;
            servidoresActivos++;
            System.out.println("Servidor " + this.nombre + " activado.");
        } else {
            System.out.println("El servidor " + this.nombre + " ya se encuentra activo.");
        }
    }

    public void desactivar() {
        if (this.activo) {
            this.activo = false;
            servidoresActivos--;
            System.out.println("Servidor " + this.nombre + " desactivado.");
        } else {
            System.out.println("El servidor " + this.nombre + " ya está apagado.");
        }
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public boolean isActivo() {
        return activo;
    }

    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }
}
