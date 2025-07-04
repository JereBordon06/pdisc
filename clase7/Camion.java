public class Camion extends Vehiculo {
    private int cargaMaxima;

    public Camion(String patente, int año, String dueño, int cargaMaxima){
        super(patente, año, dueño);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public double calcularImpuesto(){
        return 8000 + 100 * cargaMaxima;
    }
}
