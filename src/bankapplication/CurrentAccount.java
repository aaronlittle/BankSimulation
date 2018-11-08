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
        super.setBalance(bal);
        super.setFName(fn);
        super.setLName(ln);
        //super.setErrorMessage(errorMsg);
    }
    
   /* public String getErrorMessage()
    {
        return this.errorMsg;
    }
*/
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
    
    public void message(int x)
    {
        
        if (x==1)
        {
            setMessage("Error! Invalid Funds, transaction rejected");
        }
        else if (x==2)
        {
            setMessage("£500 deposited in first month, rewarded £10");         
        }
       
    }
    
    public void transaction(int rand, int count, int month)
    {
        setMessage(null);
        Random random = new Random();
        int num = random.nextInt(1000)+1;
        String inOrOut="";
        int currentBalance=getBalance();
        //int currentBalance = account.getBalance();
        int saveTranCount=0;
        
        
        switch(rand)
        {
            case 1:      
                if(errors(getBalance()+num)!=null)
                {
                    setBalance(currentBalance); 
                    message(1);
                }
                else
                {
                    if(month==1&&getBalance()>=500)
                    {
                        num=currentBalance;
                        setBalance(getBalance()+10);
                        message(2);                       
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
                    message(1);
                }
                else
                {
                    setBalance(getBalance()-num);
                    setTotWithdraw(getTotWithdraw()+num);
                } 
                inOrOut="Out";
                break;                                                                       
        }
        setTransaction(count,month, inOrOut, num, getBalance());
        //getTransaction()[count] = new Transaction(month, inOrOut, num, getBalance());
    }
    
    
}
