package deber.abstractas;

public class Planta extends SerVivo {
    private final String nombre;

    public Planta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void alimentarse() {
     System.out.println("El/La "+nombre+" se alimenta a través de la fotosíntesis.");
    }
}
