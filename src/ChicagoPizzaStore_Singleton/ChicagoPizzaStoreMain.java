/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChicagoPizzaStore_Singleton;

/**
 *
 * @author Trung_PC
 */
public class ChicagoPizzaStoreMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChicagoPizzaStore s1= ChicagoPizzaStore.createInstance();
        ChicagoPizzaStore s2= ChicagoPizzaStore.createInstance();
        s1.setCount(2);
        System.out.println("so pizza Chicago lan 1:"+s1.getCount());
        s2.setCount(3);
        System.out.println("so pizza chicago lan 2:"+ s2.getCount());
        System.out.println("so pizza chicago lan 1:"+s1.getCount());
    }
    
}
