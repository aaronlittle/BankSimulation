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
public abstract class Account {
   // private String errorMsg="";
    private String fName = "";
    private String lName = "";
    private String msg="";
    private int balance = 0;
    private int totWithdraw = 0;
    private int totDeposit = 0;

    private ArrayList<Transaction>transList = new ArrayList<Transaction>();
    //private Transaction[] transList = new Transaction[19];
            
    public Account ()
    {
        
    }
    
    public Account (String firstName, String lastName, int bal)
    {
        
        this.balance = bal;
        this.fName = firstName;
        this.lName = lastName;
    }

    public int getTotWithdraw()
    {
        return totWithdraw;
    }
    public void setTotWithdraw(int value)
    {
        this.totWithdraw=value;
    }
    public int getTotDeposit()
    {
        return totDeposit;
    }
    public void setTotDeposit(int value)
    {
        this.totDeposit=value;
    }
    public String getMessage()
    {
    return this.msg;
    }
    public void setMessage(String value)
    {
        this.msg = value;
    }
    public ArrayList<Transaction> getTransaction()
    {
        return transList;
    }
    public void setTransaction(int count, int month, String inOrOut, int num, int bal)
    {
        
        transList.add (new Transaction(month, inOrOut, num, bal));
    }

    public void setFName(String value)
    {
        this.fName = value;
    }
    public String getFName()
    {
        return this.fName;
    }

    public void setLName(String value)
    {
        this.lName = value;
    }
    public String getLName()
    {
        return this.lName;
    }

    public void setBalance(int value)
    {
        this.balance = value;
    }
    public int getBalance()
    {
        return this.balance;
    }      
    public String errors(int amount)
    {
        return null;
    }

    public void message(int x)
    {

    }
    public int findMax()
    {
        int max = transList.get(0).getBalance();
        
        for(int i = 0; i<transList.size();i++)
        {
            if(transList.get(i).getBalance()> max)
            {
                max=transList.get(i).getBalance();
            }
        }
        return max;
    }
    public int findMin()
    {
        int min = transList.get(0).getBalance();
        for(int i = 0; i<transList.size();i++)
        {
            if(min>transList.get(i).getBalance())
            {
                min=transList.get(i).getBalance();
            }
        }
        return min;
    }

    public void transaction(int rand, int count, int month)
    {

    }
    }
