public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, String p){
    accountID = a;
    password = p;
    balance = 0;
  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
  public void setPassword(String newPass){
    password = newPass;
  }
  public boolean deposit(double amount){
    if (amount < 0){
      return false;
    } else {
      balance += amount;
      return true;
    }
  }
  public boolean withdraw(double amount){
    if (amount > balance || amount < 0){
      return false;
    } else {
      balance -= amount;
      return true;
    }
  }
  public String toString(){
    return (accountID + "\t" + balance);
  }
}
