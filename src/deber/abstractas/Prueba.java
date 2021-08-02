package deber.abstractas;

public class Prueba {

    public static void main(String[] args) {
        AnimalCarnivoro lobo = new AnimalCarnivoro("Lobo");
        AnimalHerbivoro oveja = new AnimalHerbivoro("Oveja");
        Planta girasol = new Planta("Girasol");
        System.out.println("Como se alimenta:");
        lobo.alimentarse();
        oveja.alimentarse();
        girasol.alimentarse();
    }
    
}
