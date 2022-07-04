package ex1;
import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Jaula> jaulas = new ArrayList<Jaula>();

    public ArrayList<Jaula> getJaulas() {
        return jaulas;
    }

    public void setJaulas(Jaula jaulas) {
        this.jaulas.add(jaulas) ;
    }
}
