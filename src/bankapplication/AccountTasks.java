/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**
 *
 * @author Wral
 */
public interface AccountTasks {
    
    public String errors(int amount);
    public void transaction(int rand, int count, int month);
    public String findMax();
    public String findMin();
    

    
}
