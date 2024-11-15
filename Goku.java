
package DragonBall;

public class Goku extends Personaje {
    public Goku() {
        super("Goku",  new Kamekameha());
    }

    @Override
    public void transformar(String forma) {
        switch (forma.toUpperCase()) {
            case "SSJ3":
                setNivelPoder(200);
                setpuntosVida(500);
                setTransformacionActual("Super Saiyajin Fase 3");
                break;
            case "SSD":
                setNivelPoder(300);
                setpuntosVida(800);
                setTransformacionActual("Super Saiyajin Fase Dios");
                break;
            case "ULTRA":
                setNivelPoder(400);
                setpuntosVida(1000);
                setTransformacionActual("Migatte no Gokui");
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
