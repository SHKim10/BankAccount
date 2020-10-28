public class Tester{
  public static void main (String[] args){
    BankAccount account = new BankAccount(214817, "mypassword");
    System.out.println(account.getBalance());      // should return 0.0
    System.out.println(account.getAccountID());    // should return 95
  }
}
