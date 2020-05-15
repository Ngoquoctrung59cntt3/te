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
public class ChicagoPizzaStore {
     private static ChicagoPizzaStore instance;
    int count=0;
    protected ChicagoPizzaStore(){
        
    }
    public static ChicagoPizzaStore createInstance(){
        if(instance==null)
            instance= new ChicagoPizzaStore();
            return instance;        
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
