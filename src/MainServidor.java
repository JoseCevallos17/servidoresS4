public class MainServidor {
    public static void main(String[] args) {

        Servidor s1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor s2 = new Servidor("BaseDatos", "192.168.1.30");
        Servidor s3 = new Servidor("Backup", "192.168.1.40");

        s1.activar();
        s1.activar();
        s2.activar();

        System.out.println("Total de servidores registrados: " + Servidor.getTotalServidores());
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());

        s1.desactivar();
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());
    }
}
