package deber.abstractas;

public class AnimalHerbivoro extends Animal {
    private final String nombre;

    public AnimalHerbivoro(String nombre) {
        this.nombre = nombre;
    }
   

    @Override
    public void alimentarse() {
        System.out.println("El/La "+nombre+" se alimenta de hierba.");
    }

}
