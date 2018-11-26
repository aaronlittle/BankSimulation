/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.util.ArrayList;

/**
 *
 * @author Wral
 */
public class AccountCollection {
    private Account account;
    
    private ArrayList<Account> accounts = new ArrayList<Account>();
    
    public AccountCollection(){
        
    }
    public ArrayList<Account> getAccounts(){
        return accounts;
    }
    public void addToAccounts(Account a){
        accounts.add(a);
    }
    

    
    
    
    
    
}
