
package DragonBall;

public class FinalFlash implements IHabilidad {
    private int poder;

    public FinalFlash() {
        this.poder = 25; // Poder base del Final Flash
    }

    @Override
    public int ejecutar() {
        return (int)(Math.random() * poder + 15);
    }

    @Override
    public String getNombre() {
        return "Final Flash";
    }
}
