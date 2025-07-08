public class Pelicula {
    
    private String titulo;
    private String director;
    private int duracion; 

    
    public Pelicula() {
        this.titulo = "Título desconocido";
        this.director = "Director desconocido";
        this.duracion = 0;
    }

    
    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = 0;
    }

    
    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    
    public void mostrarInfo() {
        System.out.println("Película: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("-----------------------------");
    }
}