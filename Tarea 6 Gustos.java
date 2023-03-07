
public class Gustos {
    private String Juego;
    private String consola;
    private double precioConsola;
    private String modeloAudifonos;
    private double precioAudifonos;

    public Gustos() {
    }

    public Gustos(String juego, String consola, double precioConsola, String modeloAudifonos, double precioAudifonos) {
        Juego = juego;
        this.consola = consola;
        this.precioConsola = precioConsola;
        this.modeloAudifonos = modeloAudifonos;
        this.precioAudifonos = precioAudifonos;
    }

    public String getJuego() {
        return Juego;
    }

    public void setJuego(String juego) {
        Juego = juego;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public double getPrecioConsola() {
        return precioConsola;
    }

    public void setPrecioConsola(double precioConsola) {
        this.precioConsola = precioConsola;
    }

    public String getModeloAudifonos() {
        return modeloAudifonos;
    }

    public void setModeloAudifonos(String modeloAudifonos) {
        this.modeloAudifonos = modeloAudifonos;
    }

    public double getPrecioAudifonos() {
        return precioAudifonos;
    }

    public void setPrecioAudifonos(double precioAudifonos) {
        this.precioAudifonos = precioAudifonos;
    }

    @Override
    public String toString() {
        return "Gustos{" +
                "Juego='" + Juego + '\'' +
                ", consola='" + consola + '\'' +
                ", precioConsola=" + precioConsola +
                ", modeloAudifonos='" + modeloAudifonos + '\'' +
                ", precioAudifonos=" + precioAudifonos +
                '}';
    }

    public void miJuego(){

        System.out.println("Mi juego favorito es rainbow six");
    }
    public void consola(){

        System.out.println("Juego en: " + consola);
    }
    public void precioConsola(){

        System.out.println("Su precio es de:" + precioConsola);
    }
    public void modeloAudifonos(){

        System.out.println("Mis audifonos son: " + modeloAudifonos);
    }
    public void precioAudifonos(){
        System.out.println("Su precio es de: " + precioAudifonos);
    }
}
