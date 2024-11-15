
package DragonBall;

public abstract class Personaje {
    private String nombre;
    private int puntosVida;
    private int nivelPoder;
    protected IHabilidad habilidad;
    private String transformacionActual;

    public Personaje(String nombre,  IHabilidad habilidad) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivelPoder = 100; // Nivel de poder base
        this.habilidad = habilidad;
        this.transformacionActual = "Base";
    }

    public void atacar(Personaje objetivo) {
        int daño = habilidad.ejecutar();
        daño *= (nivelPoder / 100.0); // Aplica modificador de nivel de poder
        objetivo.recibirDaño(daño);
        System.out.println(nombre + " ataco a " + objetivo.getNombre() + 
                         " usando " + habilidad.getNombre() + 
                         " causando " + daño + " de dano!");
    }

    public abstract void transformar(String forma);

    protected void recibirDaño(int cantidad) {
        this.puntosVida -= cantidad;
        if (puntosVida < 0) {
            puntosVida = 0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public String getTransformacionActual() {
        return transformacionActual;
    }

    protected void setTransformacionActual(String forma) {
        this.transformacionActual = forma;
    }

    protected void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }
    
    protected void setpuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }
}
