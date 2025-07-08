public abstract class Empleado {
    private String nombre;
    private String rol;

    public Empleado(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public abstract void trabajar();

    public abstract void mostrarDatos();
}