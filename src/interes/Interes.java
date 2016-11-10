/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interes;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Interes {

    
    public static ArrayList<Familia> personas1 = new ArrayList<Familia>();
    public static ArrayList<Familia> personas2 = new ArrayList<Familia>();
    
    
    public static void rellenarDatos() {

        Familia f1;//preparo contacto vamos le ponemos un nombre para grabarlo
        for (int i = 0; i < 10; i++) {
            f1 = new Familia();//lo creo
            f1.setNombre(" ladrones españoles " + i);//le meto los datos 
           
            f1.setCapital(i * 100);
            personas1.add(f1);//lo  grabo  en la caja vamos en el vector 
        }
        
         Familia f2;//preparo contacto vamos le ponemos un nombre para grabarlo
        for (int i = 0; i < 10; i++) {
            f2 = new Familia();//lo creo
            f2.setNombre(" ladrones españoles " + i);//le meto los datos 
           
            f2.setCapital(i * 500);
            personas2.add(f2);//lo  grabo  en la caja vamos en el vector 
        }
        
        
        
        
    }
   public static Familia casar(Familia f, Familia f2) {
   
   
       Familia nuevafamilia = new Familia();//creo el nuevo banco que es juntar dos de ellos 
        nuevafamilia.setNombre("nuevo familia");//nombre del la fusion de los dos bancos
        nuevafamilia.setCapital(f.getCapital()+ f2.getCapital());//juntamos los valores de ambos bancos
       
     

      personas1.add(nuevafamilia);//lo grabamos en en nuevo banco que hemos hecho
      personas2.add(nuevafamilia); 
       return nuevafamilia;
       
   } 
   
   
    public static Familia casar(Familia f, Familia f2)
    {
    
    
    
    
    
    }
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         rellenarDatos();
         
        Familia family = casar (personas1.get(1),personas2.get(1));
        
        personas1.remove(1);
         personas2.remove(2);
         
         
         
         
        
    }
    
}
