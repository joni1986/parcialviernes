package parcial;

import java.util.List;


public class Bicicleteria {
    private List<Bicicleta> bicicletas;
    private float ganacias;
    private int cantidad_de_ventas;

    public Bicicleteria(List<Bicicleta>  bicicletas, float ganacias, int cantidad_de_ventas) {
        this.bicicletas = bicicletas;
        this.ganacias = ganacias;
        this.cantidad_de_ventas = cantidad_de_ventas;
    }

    public Bicicleteria() {
    }

    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(List<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    public float getGanacias() {
        return ganacias;
    }

    public void setGanacias(float ganacias) {
        this.ganacias = ganacias;
    }

    public int getCantidad_de_ventas() {
        return cantidad_de_ventas;
    }

    public void setCantidad_de_ventas(int cantidad_de_ventas) {
        this.cantidad_de_ventas = cantidad_de_ventas;
    }
    
    public void vender_bicicleta (Bicicleta bicicleta){
        this.cantidad_de_ventas +=1;
        this.bicicletas.remove(bicicleta);
        this.ganacias += bicicleta.precio;
        System.out.println("Se vendió la bicicleta");
    }
    
    public void comprar_Bicicleta(Bicicleta bicicleta){
        this.bicicletas.add(bicicleta);
        this.ganacias -= bicicleta.precio;
        System.out.println("Se compró la bicicleta");
    }
}
