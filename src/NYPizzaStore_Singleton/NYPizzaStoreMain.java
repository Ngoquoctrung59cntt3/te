/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NYPizzaStore_Singleton;

/**
 *
 * @author Trung_PC
 */
public class NYPizzaStoreMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NYPizzaStore s1= NYPizzaStore.createInstance();
        NYPizzaStore s2= NYPizzaStore.createInstance();
        s1.setCount(2);
        System.out.println("So pizza newyork nhap lan 1:"+s1.getCount());
        s2.setCount(3);
        System.out.println("So pizza newyork nhap lan 2:"+ s2.getCount());
        System.out.println("So pizza newyork nhap lan 1:"+s1.getCount());
    }
    
}
