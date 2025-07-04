public abstract class Vehiculo {
    private String patente;
    private int año;
    private String dueño;

    public Vehiculo(String patente, int año, String dueño){
        this.patente = patente;
        this.año = año;
        this.dueño = dueño;
    }

    public void mostrarDatos(){
        System.out.println("patente = "+ patente);
        System.out.println("año = "+ año);
        System.out.println("dueño = "+ dueño);
    }

    public abstract double calcularImpuesto();
}