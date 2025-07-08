public class Main {
    public static void main(String[] args) {
        
        Pelicula p1 = new Pelicula();  
        Pelicula p2 = new Pelicula("Piratas del caribe", "Lionel Messi");  
        Pelicula p3 = new Pelicula("rapidos y furiosos 8", "vin diesel", 90);  

        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
    }
}