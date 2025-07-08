public class Diseñador extends Empleado {
    public Gerente(String nombre, String rol) {
        super(nombre, rol);
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + "esta trabajando.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("hola, me llamo" + nombre + ", y soy" + rol);
    }
}