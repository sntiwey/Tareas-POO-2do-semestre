import java.util.ArrayList;
import java.util.Arrays;

public class Automovil {
    private String marca;
    private String subMarca;
    private byte modelo; // 2000 + byte
    private  String color;

    public Automovil() {      //Constructor por defecto
    }


    public Automovil(String marca, String subMarca, Byte modelo, String color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        ArrayList<String> marcas = new ArrayList<>();
        marcas.add("VW");
        marcas.add("HONDA");
        marcas.add("TESLA");
        marcas.add("NISSAN");
        marcas.add("MITSUBISHI");
        marcas.add("TOYOTA");

        if(marcas.contains(m.toUpperCase())){
            this.marca = m;
        } else {
            System.out.println("Esa marca no existe carnal lo siento");
        }
        this.marca = m;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public byte getModelo() {
        return modelo;
    }

    public void setModelo(byte modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", modelo=" + modelo +
                ", color='" + color + '\'' +
                '}';
    }

    public boolean prender(){
        System.out.println("Encender Autow, este carro es un: " + marca);
        return true;
    }
    public boolean recorrido(){
        System.out.println("Este carro va a una velocidad de 15km por hora " + marca);
        return true;
    }
    public boolean apagar(){
        System.out.println("Este carro se va a pagar en 3...2...1 " + marca);
        return true;
    }
}