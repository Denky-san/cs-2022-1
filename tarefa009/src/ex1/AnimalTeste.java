package ex1;

public class AnimalTeste {

    public static void main(String[] args) {
        Animal animal1 = new Cachorro("Toto", 1);
        Animal animal2 = new Cavalo("Pocoto", 5);
        Animal animal3 = new Preguica("Flecha", 2);

        System.out.println("Animal 1= " + animal1.emitirSom());
        System.out.println("Animal 2: " + animal2.emitirSom());
        System.out.println("Animal 3: " + animal3.emitirSom());

        System.out.println("\nAnimais após serem examinados:");

        Veterinario vet = new Veterinario();
        System.out.println("Animal 1: " + vet.examinar(animal1));
        System.out.println("Animal 2: " + vet.examinar(animal2));
        System.out.println("Animal 3: " + vet.examinar(animal3));

        System.out.println("\nAnimais do zoologico:");
        Zoologico zoo = new Zoologico();

        zoo.setJaulas(new Jaula(new Cachorro("Toto",1)));
        zoo.setJaulas(new Jaula(new Cachorro("Doguin",1)));
        zoo.setJaulas(new Jaula(new Cachorro("Lua",1)));
        zoo.setJaulas(new Jaula(new Cachorro("Mel",1)));
        zoo.setJaulas(new Jaula(new Cavalo("Fogo",1)));
        zoo.setJaulas(new Jaula(new Cavalo("Ponyta",1)));
        zoo.setJaulas(new Jaula(new Cavalo("Zeus",1)));
        zoo.setJaulas(new Jaula(new Preguica("Flecha",1)));
        zoo.setJaulas(new Jaula(new Preguica("Veloz",1)));
        zoo.setJaulas(new Jaula(new Preguica("Toovao",1)));

        for(int i = 0; i < zoo.getJaulas().size(); i++){
            System.out.println("Animal " + i + ": " + zoo.getJaulas().get(i).getAnimal().emitirSom());
        }
    }

}