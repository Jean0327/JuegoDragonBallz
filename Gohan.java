
package DragonBall;

public class Gohan extends Personaje {
    public Gohan() {
        super("Gohan",  new Kamekameha());
    }

    @Override
    public void transformar(String forma) {
        switch (forma.toUpperCase()) {
            case "SSJ1":
                setNivelPoder(200);
                setpuntosVida(350);
                setTransformacionActual("Super Saiyajin Fase 1");
                break;
            case "SSJ2":
                setNivelPoder(300);
                setpuntosVida(450);
                setTransformacionActual("Super Saiyajin Fase 2");
                break;
            case "ULTIMATE":
                setNivelPoder(400);
                setpuntosVida(550);
                setTransformacionActual("Ultimate Gohan");
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
