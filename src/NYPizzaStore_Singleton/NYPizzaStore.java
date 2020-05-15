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
public class NYPizzaStore {
       private static NYPizzaStore instance;
    int count=0;
    protected NYPizzaStore(){
        
    }
    public static NYPizzaStore createInstance(){
        if(instance==null)
            instance= new NYPizzaStore();
            return instance;        
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    } 
}
