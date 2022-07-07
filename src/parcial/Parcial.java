
package parcial;

  import Bicicleta;
  
import Bicicleteria;
import java.util.ArrayList;


public class Parcial {

    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Bicicleta bici1 = new Bicicleta("1001", "montanbike", 2020, 50000);
        Bicicleta bici2 = new Bicicleta("2001", "cross", 2022, 250000);
        Bicicleta bici3 = new Bicicleta("3001", "stree", 2022, 15000);
        Bicicleta bici4 = new Bicicleta("1002", "montanbike", 2021, 75000);
        System.out.println("-------------------------------------------");
        
        System.out.println(bici1.getModelo());
        System.out.println(bici1.getPrecio());
        System.out.println(bici1.getNro_serie());
        System.out.println("-------------------------------------------");
        
        System.out.println(bici2.getModelo());
        System.out.println(bici2.getPrecio());
        System.out.println(bici2.getNro_serie());
        System.out.println("-------------------------------------------");
        
        System.out.println(bici3.getModelo());
        System.out.println(bici3.getPrecio());
        System.out.println(bici3.getNro_serie());
        System.out.println("-------------------------------------------");
        
        System.out.println(bici4.getModelo());
        System.out.println(bici4.getPrecio());
        System.out.println(bici4.getNro_serie());
        System.out.println("-------------------------------------------");
        
        ArrayList<Bicicleta> bicicletas_b1 = new ArrayList<>();
                
        bicicletas_b1.add(bici1);
        bicicletas_b1.add(bici2);
        bicicletas_b1.add(bici3);
                
        Bicicleteria b1 = new Bicicleteria(bicicletas_b1, 1000000,0);
        System.out.println("-------------------------------------------");
        System.out.println(b1.getGanacias());
        System.out.println("-------------------------------------------");
        b1.comprar_Bicicleta(bici4);
        System.out.println(b1.getGanacias());
        System.out.println("-------------------------------------------");
        
        b1.vender_bicicleta(bici1);
        System.out.println(b1.getGanacias());
        System.out.println("-------------------------------------------");
        
        b1.vender_bicicleta(bici2);
        System.out.println(b1.getGanacias());
        System.out.println("-------------------------------------------");
        
        b1.vender_bicicleta(bici3);
        System.out.println(b1.getGanacias());
        System.out.println("-------------------------------------------");
        
        b1.vender_bicicleta(bici4);
        System.out.println(b1.getGanacias());
        System.out.println("-------------------------------------------");
        
        }
    }
