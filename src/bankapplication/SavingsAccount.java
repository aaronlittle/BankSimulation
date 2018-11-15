/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author Wral
 */
public class SavingsAccount extends Account {
    private int annualWithdraw = 0;
    private int interest=0;
    public SavingsAccount()
    {
    }  
    public SavingsAccount(String fn, String ln, int bal)
    {
        super(fn,ln,bal);            
    }
    
    public String errors(int amount)
    {
        String error=null;
       
        if (amount<100)
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
        int currentBalance = getBalance();
        
        String err1 = errors(getBalance()+num);
        String err2 = errors(getBalance()-num);
        switch(rand)
        {
            case 1:      
                if(err1!=null)
                {
                    setBalance(currentBalance); 
                    setMessage(err1);
                }
                else
                {
                    if (month==1)
                    {
                        num = currentBalance;
                        setBalance(currentBalance);
                    }
                    else
                    {
                        setBalance(getBalance()+num);    
                        setTotDeposit(getTotDeposit()+num);
                        interest = interest + ((getBalance()/100)*3);
                        addInterest(month);
                    }
                }                
                inOrOut="In";
                break;
            case 2:
                if(err2!=null)
                {
                    setBalance(currentBalance); 
                    setMessage(err2);
                }
                else
                {
                    annualWithdraw = annualWithdraw +1;
                    if(checkWithdrawal(annualWithdraw, month)==true)
                    {
                        setMessage("Maximum annual withdrawals made(2)");
                        setBalance(currentBalance);
                    }
                    else
                    {
                        setBalance(getBalance()-num);
                        setTotWithdraw(getTotWithdraw()+num);
                        interest = interest + ((getBalance()/100)*3);
                        addInterest(month);
                    }
                    
                } 
                inOrOut="Out";
                break;                                                                       
        }
        
        setTransaction(month, inOrOut, num, getBalance());
    }
    
    public boolean checkWithdrawal(int withdrawCount, int month)
    {   
        boolean error = false;
        if (month %12 == 1)
        {
            annualWithdraw = 0;
                error=false;
            /*if(month %12 == 1)
            {               
                annualWithdraw = 0;
                error=false;
            }
            //else */
        } else {
             if (withdrawCount>2)
            {
                error= true;
            }   
        }        
        return error;
    }
    
    public void addInterest(int month)
    {
        if(month %12==1)
        {
            setBalance(getBalance()+interest);
            interest =0;
            setMessage("3% interest added");
        }
    }           
}
