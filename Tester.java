public class Tester{
  public static void main (String[] args){
    BankAccount test = new BankAccount(214817, "mypassword");

    System.out.println(test.getBalance());      //0.0
    System.out.println(test.getAccountID());    //214817
    test.setPassword("secure");                 //"mypassword" changed to "secure"

    System.out.println(test.deposit(-23.7));    //false
    System.out.println(test.getBalance());      //0.0
    System.out.println(test.deposit(58));       //true
    System.out.println(test.getBalance());      //58.0
    System.out.println(test.deposit(704.2));    //true
    System.out.println(test.getBalance());      //704.2
  }
}
