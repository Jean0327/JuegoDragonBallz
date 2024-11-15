package DragonBall;

/**
 *
 * @author Julian_Garay
 */
public class RayoMortal implements IHabilidad  {
    private int poder;

    public RayoMortal() {
        this.poder = 25; // Poder base del Final Flash
    }

    @Override
    public int ejecutar() {
        return (int)(Math.random() * poder + 15);
    }

    @Override
    public String getNombre() {
        return "Rayo Mortal";
    }
}
