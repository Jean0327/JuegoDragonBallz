
package DragonBall;

public class Vegeta extends Personaje {
    public Vegeta() {
        super("Vegeta",  new FinalFlash());
    }

    @Override
    public void transformar(String forma) {
        switch (forma.toUpperCase()) {
            case "SSJ1":
                setNivelPoder(200);
                setpuntosVida(350);
                setTransformacionActual("Super Saiyajin Fase 1");
                break;
            case "ULTRA":
                setNivelPoder(300);
                setpuntosVida(500);
                setTransformacionActual("Ultra Ego");
                break;
            case "SSB":
                setNivelPoder(400);
                setpuntosVida(800);
                setTransformacionActual("Super Saiyajin Fase Blue");
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
