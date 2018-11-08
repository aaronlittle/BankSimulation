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
    //private String errorMsg = "Error! Savings Account cannot be under £100";
    public SavingsAccount()
    {
        //connor test comment
    }
    
    public SavingsAccount(String fn, String ln, int bal)
    {
        super.setBalance(bal);
        super.setFName(fn);
        super.setLName(ln);
       // super.setErrorMessage(errorMsg);
      
        
    }
    
        
   /* public String getErrorMessage()
    {
        return this.errorMsg;
    }
    */

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
    public void message(int x)
    {
        
        if (x==1)
        {
            setMessage("Error! Invalid Funds, transaction rejected");
        }
        else if (x==2)
        {
            //msg="3% interest added";
        }
        else if(x==3)
        {
           // msg="Maximum annual transactions made(2)";
        }
     
    }
    
    public void transaction(int rand, int count, int month)
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
                        setMessage("Maximum annual transactions made(2)");
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
        
        setTransaction(count,month, inOrOut, num, getBalance());
       // getTransaction()[count] = new Transaction(month, inOrOut, num, getBalance());
    }
    
    public boolean checkWithdrawal(int withdrawCount, int month)
    {   
        boolean error = false;
        if (month %12 !=0)
        {
            if(month %12 ==1)
            {
                
                annualWithdraw = 0;
                error=false;
            }
            else if (withdrawCount>2)
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
        }
    }
    
    
    
}
