/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.util.Random;

/**
 *
 * @author Wral
 */
public class CurrentAccount extends Account {
    private String msg = "";
    public CurrentAccount()
    {
    }   
    public CurrentAccount(String fn, String ln, int bal)
    {
        super(fn,ln,bal);
    }    
    public String errors(int amount)
    {
        String error=null;
        if(super.getBalance()<-1000)
        {
            error = "Error! Invalid Funds, transaction rejected";
        }
        else
        {
            error=null;
        }
        return error;
    }
     
    public void transaction(int rand,int month)
    {
        setMessage(null);
        Random random = new Random();
        int num = random.nextInt(1000)+1;
        String inOrOut="";
        int currentBalance=getBalance();
        int saveTranCount=0;               
        switch(rand)
        {
            case 1:      
                if(errors(getBalance()+num)!=null)
                {
                    setBalance(currentBalance); 
                    setMessage("Error! Invalid Funds, transaction rejected");
                }
                else
                {
                    if(month==1&&getBalance()>=500)
                    {
                        num=currentBalance;
                        setBalance(getBalance()+10);
                        setMessage("£500 deposited in first month, rewarded £10");                       
                    }
                    else if(month==1)
                    {
                        num=currentBalance;
                        setBalance(currentBalance);
                    }
                    else
                    {
                        setBalance(getBalance()+num);
                        setTotDeposit(getTotDeposit()+num);
                    }
                }                
                inOrOut="In";
                break;
            case 2:
                if(errors(getBalance()-num)!=null)
                {
                    setBalance(currentBalance); 
                    setMessage("Error! Invalid Funds, transaction rejected");
                }
                else
                {
                    setBalance(getBalance()-num);
                    setTotWithdraw(getTotWithdraw()+num);
                } 
                inOrOut="Out";
                break;                                                                       
        }
        setTransaction(month, inOrOut, num, getBalance());
    }        
}
