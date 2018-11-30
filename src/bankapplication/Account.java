package bankapplication;

import java.util.ArrayList;

public abstract class Account {
    private String fName = "";
    private String lName = "";
    private String msg="";
    private int balance = 0;
    private int totWithdraw = 0;
    private int totDeposit = 0;
    private ArrayList<Transaction>transList = new ArrayList<Transaction>();//list of transactions
    private ArrayList<Transaction>successful = new ArrayList<Transaction>();//list of succesful transactions
            
    public Account (){      
    }
    public Account (String firstName, String lastName, int bal){       
        this.balance = bal;
        this.fName = firstName;
        this.lName = lastName;

    }
    public int getTotWithdraw(){
        return totWithdraw;
    }
    public void setTotWithdraw(int value){
        this.totWithdraw=value;
    }
    public int getTotDeposit(){
        return totDeposit;
    }
    public void setTotDeposit(int value){
        this.totDeposit=value;
    }
    public String getMessage(){
        return this.msg;
    }
    public void setMessage(String value){
        this.msg = value;
    }
    public ArrayList<Transaction> getSuccessful(){
        return successful;
    }
    public void setSuccessful(int month, String inOrOut, int num, int bal){
        successful.add (new Transaction(month, inOrOut, num, bal));
    }
    public ArrayList<Transaction> getTransaction(){
        return transList;
    }
    public void setTransaction(int month, String inOrOut, int num, int bal){
        transList.add (new Transaction(month, inOrOut, num, bal));
    }
    public void setFName(String value){
        this.fName = value;
    }
    public String getFName(){
        return this.fName;
    }
    public void setLName(String value){
        this.lName = value;
    }
    public String getLName(){
        return this.lName;
    }
    public void setBalance(int value){
        this.balance = value;
    }
    public int getBalance(){
        return this.balance;
    } 
    //abstract methods
    public abstract boolean balanceErrors(int amount);
    public abstract void transaction(int rand,int month);
    
    //other methods, not to be overidden 
    //these methods find the max and min values of account when simulation is stopped
    public String findMax(){
        int max = transList.get(0).getBalance();
        int month = 1;
        String foundMax = "";
        for(int i = 0; i<transList.size();i++){
            if(transList.get(i).getBalance()> max){
                max=transList.get(i).getBalance();
                month=transList.get(i).getMonth();
            }
        }
        return ("£"+Integer.toString(max)+"  Month "+Integer.toString(month));
    }
    public boolean balanceLimit(int amount){
        boolean error=false;
        if(amount>99999){
            error = true;
        }
        else{
            error=false;
        }
        return error;
    }
    public String findMin(){
        int min = transList.get(0).getBalance();
        int month=1;
        for(int i = 0; i<transList.size();i++){
            if(min>transList.get(i).getBalance()){
                min=transList.get(i).getBalance();
                month=transList.get(i).getMonth();
            }
        }
        
        return ("£"+Integer.toString(min)+"  Month "+Integer.toString(month));
    }
    //clears the list of transactions when restart simulation
    public void clearTransactions(){
        transList.clear();
    }
 }
