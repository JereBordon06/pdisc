public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String patente, int año, String dueño, int cilindrada){
        super(patente, año, dueño);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularImpuesto(){
        if (cilindrada < 250) {
            return 3000;
        }
        return 6000;
        
    }
}
