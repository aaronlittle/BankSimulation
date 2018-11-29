package bankapplication;

import java.util.Random;

public class CurrentAccount extends Account {
    private String msg = "";
    public CurrentAccount(){
        //default constructor
    }   
    public CurrentAccount(String fn, String ln, int bal,String type){
        super(fn,ln,bal,type);
    }    

    public boolean balanceErrors(int amount){
        //check that balance doesnt fall below -1000
        boolean error=false;
        if(amount<-1000){
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
        int currentBalance=getBalance();
        int saveTranCount=0;               
        switch(rand){//rand = either 1 or 2 (deposit or withdrawal)
            case 1:      
                if(month==1&&getBalance()>=500){
                    num=currentBalance;
                    setBalance(getBalance()+10);
                    setMessage("£500 deposited in first month, rewarded £10");                       
                }
                else if(month==1){
                    num=currentBalance;
                    setBalance(currentBalance);

                }
                else{
                    if(balanceLimit(getBalance()+num)==true){
                        setMessage("Maximum account balance reached");
                    }
                    else{
                        setBalance(getBalance()+num);
                        setTotDeposit(getTotDeposit()+num);
                    }
                }
                setSuccessful(month, inOrOut, num, getBalance()); //add to successful transactions array              
                inOrOut="In";
                break;
            case 2:
                if(balanceErrors(getBalance()-num)==true){
                    setBalance(currentBalance); 
                    setMessage("Error! Invalid Funds, transaction rejected");
                }
                else{
                    setBalance(getBalance()-num);
                    setTotWithdraw(getTotWithdraw()+num);
                    setSuccessful(month, inOrOut, num, getBalance());//add to successful transactions array      
                } 
                inOrOut="Out";
                break;                                                                       
        }
        setTransaction(month, inOrOut, num, getBalance());//add transaction to transaction array whether successfor or not
    }        
}
