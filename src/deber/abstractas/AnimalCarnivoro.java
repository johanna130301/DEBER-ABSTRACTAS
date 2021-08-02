package deber.abstractas;

public class AnimalCarnivoro extends Animal {
    private final String nombre;

    public AnimalCarnivoro(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public void alimentarse() {
        System.out.println("El/La "+nombre+" se alimenta de Carne.");
    }

}
