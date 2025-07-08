public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = {
        new Gerente("jere", "gerente");
        new Programador("juan", "programador");
        new Diseñador("pepe", "diseñador");
        }

        for (Empleado e : empleados) {
            e.mostrarDatos();
            e.trabajar();
            System.out.println("--------------");
        }
    }
}
