package bankapplication;

public class Transaction {//this class contains transaction details, a new instance will be created for each transaction
    
    private int month =0;
    private String inOrOut = "";
    private int amount;
    private int balance;
   
    public void setMonth(int value){
        this.month = value;
    }
    public int getMonth(){
        return this.month;
    }
    
    public void setBalance(int value){
        this.balance = value;
    }
    public int getBalance(){
        return this.balance;
    }
    
    public int getAmount(){
        return this.amount;
    }
    
    public void setAmount(int value){
        this.amount = value;
    }
    public void setInOrOut(String value){
        this.inOrOut = value;
    }
    public String getInOrOut(){
        return this.inOrOut;
    }
          
    public Transaction(){
        //default constructor
    }
    
    public Transaction(int mnth, String inOr, int amnt, int bal){
        month = mnth;
        inOrOut = inOr;
        amount = amnt;
        balance = bal;
    }
    
}
