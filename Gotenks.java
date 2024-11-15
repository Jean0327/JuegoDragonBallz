
package DragonBall;

public class Gotenks extends Personaje {
    public Gotenks() {
        super("Gotenks",  new Kamekameha());
    }

    @Override
    public void transformar(String forma) {
        switch (forma.toUpperCase()) {
            case "SSJ1":
                setNivelPoder(200);
                setpuntosVida(150);
                setTransformacionActual("SSJ1");
                break;
            case "SSJ2":
                setNivelPoder(300);
                setpuntosVida(250);
                setTransformacionActual("SSJ2");
                break;
            case "SSJ3":
                setNivelPoder(400);
                setpuntosVida(350);
                setTransformacionActual("SSJ3");
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
