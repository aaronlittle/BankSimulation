package bankapplication;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class SavingsAccount extends Account {
    private int annualWithdraw = 0;
    private int interest=0;
    public SavingsAccount(){
        //default constructor
    }  
    public SavingsAccount(String fn, String ln, int bal){
        super(fn,ln,bal);            
    }
    
    public boolean balanceErrors(int amount){
        //check that balance doesnt fall below 100
        boolean error=false;
        if (amount<100){
            error = true;
        }
        else{
            error=false;   
        }
        return error;
    }
    
    public void transaction(int rand,int month){  
        //implementation of abstract method in Account class
        setMessage(null);
        Random random = new Random();
        int num = random.nextInt(1000)+1;
        String inOrOut="";
        int currentBalance = getBalance();

        switch(rand){//rand = either 1 or 2 (deposit or withdrawal)
            case 1:   
                inOrOut="In";
                if(balanceErrors(getBalance()+num)==false){
                    if (month==1){
                        num = currentBalance;
                        setBalance(currentBalance);
                        setSuccessful(month, inOrOut, num, getBalance());
                    }
                    else{
                        if(balanceLimit(getBalance()+num)==true){
                            setMessage("Maximum account balance reached");
                        }
                        else{
                            setBalance(getBalance()+num);    
                            setTotDeposit(getTotDeposit()+num);
                            setSuccessful(month, inOrOut, num, getBalance()); //add to successful transactions array   
                        }
                    }                   
                }                                
                break;
            case 2:
                inOrOut="Out";
                if(balanceErrors(getBalance()-num)==true){
                    setBalance(currentBalance); 
                    setMessage("Error! Invalid Funds, transaction rejected");
                }
                else if(balanceErrors(getBalance()-num)==false){
                    annualWithdraw++;
                    if(checkWithdrawal(month)==true)
                    {
                        setMessage("Maximum annual withdrawals made(2)");
                        setBalance(currentBalance);
                    }
                    else{
                        setBalance(getBalance()-num);
                        setTotWithdraw(getTotWithdraw()+num);
                    }
                    setSuccessful(month, inOrOut, num, getBalance()); //add to successful transactions array   
                }          
                break;                                                                       
        }
        if(month!=1){
            interest = interest + ((getBalance()/100)*3);
            addInterest(month);
        }
        if(month%12==0){
            annualWithdraw=0;
        }

        setTransaction(month, inOrOut, num, getBalance());//add transaction to transaction array whether successfor or not
    }
    
    private boolean checkWithdrawal(int month){   //stop user from withdrawing more than twice in a year
        boolean error=false;
        if(annualWithdraw>2){
            error=true;
        }
        else{
           error = false;
        }
        return error;
    }
    
    private void addInterest(int month){//add interest after every year
        if(month %12==1){
            setBalance(getBalance()+interest);
            interest =0;
            setMessage("3% interest added");
        }
    }           
}
