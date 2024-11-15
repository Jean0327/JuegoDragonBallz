
package DragonBall;

public class Kamekameha implements IHabilidad {
    private int poder;

    public Kamekameha() {
        this.poder = 20; // Poder base del KameKameha
    }

    @Override
    public int ejecutar() {
        return (int)(Math.random() * poder + 10);
    }

    @Override
    public String getNombre() {
        return "KameKameha";
    }
}
