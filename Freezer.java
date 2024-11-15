
package DragonBall;

public class Freezer extends Personaje {
    public Freezer() {
        super("Freezer",  new RayoMortal());
    }

    @Override
    public void transformar(String forma) {
        switch (forma.toUpperCase()) {
            case "MECHA":
                setNivelPoder(200);
                setpuntosVida(400);
                setTransformacionActual("Mecha Freezer");
                break;
            case "BLACK":
                setNivelPoder(300);
                setpuntosVida(500);
                setTransformacionActual("Black Freezer");
                break;
            case "GOLDEN":
                setNivelPoder(400);
                setpuntosVida(600);
                setTransformacionActual("Golden Freezer");
                break;
            default:
                setNivelPoder(100);
                setpuntosVida(100);
                setTransformacionActual("Base");
        }
        System.out.println(getNombre() + " se ha transformado en " + 
                         getTransformacionActual() + " con poder " + getNivelPoder());
    }
}

