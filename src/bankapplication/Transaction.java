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
public class Transaction {
    
    private int month =0;
    private String inOrOut = "";
    private int amount;
    private int balance;
   
    public void setMonth(int value)
    {
        this.month = value;
    }
    public int getMonth()
    {
        return this.month;
    }
    
    public void setBalance(int value)
    {
        this.balance = value;
    }
    public int getBalance()
    {
        return this.balance;
    }
    
    public int getAmount()
    {
        return this.amount;
    }
    
    public void setAmount(int value)
    {
        this.amount = value;
    }
    public void setInOrOut(String value)
    {
        this.inOrOut = value;
    }
    public String getInOrOut()
    {
        return this.inOrOut;
    }
          
    public Transaction()
    {
        
    }
    
    public Transaction(int mnth, String inOr, int amnt, int bal)
    {
        month = mnth;
        inOrOut = inOr;
        amount = amnt;
        balance = bal;
    }
    
}
