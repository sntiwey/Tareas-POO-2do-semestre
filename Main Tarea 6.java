
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Automovil Ejercicio");
    Automovil auto1 = new Automovil("TESLA", "Roaster", (byte)36, "Rojo");
        System.out.println(auto1);
        auto1.prender();
        auto1.recorrido();
        auto1.apagar();

        //Siguiente Tarea 6

        System.out.println("");
        System.out.println("Monitor Ejercicio");
        Monitor monit0r = new Monitor(24, "BENQ", "GW2480", "LED", 4799);
        System.out.println(monit0r);
        monit0r.encender();
        monit0r.Andar();
        monit0r.apagar();

        //Siguiente Tarea 6

        System.out.println("");
        System.out.println("Personas Ejercicio");
        Personas perso = new Personas(19, "Santiago", 1.70, 56, "masculino");
        System.out.println(perso);
        perso.comer();
        perso.Banando();
        perso.tomar();

        //Siguiente Tarea 6

        System.out.println("");
        System.out.println("Mis Gustos Ejercicio");
        Gustos gus = new Gustos("RainbowSix", "PS4", 6900, "LogitechG733", 4999);
        System.out.println(gus);
        gus.miJuego();
        gus.consola();
        gus.precioConsola();
        gus.modeloAudifonos();
        gus.precioAudifonos();
    }
}
