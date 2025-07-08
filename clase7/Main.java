public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Auto("BUT480", 2015, "franco", 4);
        vehiculos[1] = new Moto("XTZ250", 2020, "jere", 300);
        vehiculos[2] = new Camion("GOD234", 2012, "pepe", 10);

        for (Vehiculo v : vehiculos) {
            v.mostrarDatos();
            System.out.println("Impuesto: $" + v.calcularImpuesto());
        }
    }
}