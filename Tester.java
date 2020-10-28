public class Tester{
  public static void main (String[] args){
    BankAccount test = new BankAccount(214817, "mypassword");

    System.out.println(test.getBalance());      //0.0
    System.out.println(test.getAccountID());    //214817
    test.setPassword("secure");                 //"mypassword" changed to "secure"

    System.out.println(test.deposit(0));        //true
    System.out.println(test.deposit(-23.7));    //false
    System.out.println(test.deposit(58));       //true
    System.out.println(test.getBalance());      //58.0
    System.out.println(test.deposit(704.2));    //true
    System.out.println(test.getBalance());      //762.2 = 58.0 + 704.2

    System.out.println(test.withdraw(0));       //true
    System.out.println(test.withdraw(-11));     //false
    System.out.println(test.withdraw(5));       //true
    System.out.println(test.getBalance());      //757.2 = 76.2 - 5
    System.out.println(test.deposit(100));      //true
    System.out.println(test.withdraw(99));      //true
    System.out.println(test.getBalance());      //758.2 = 757.2 + (100 - 9)
    System.out.println(test.withdraw(800));     //false

    System.out.println(test.toString());        //214817  758.2
    System.out.println(test.withdraw(200));     //true
    System.out.println(test.toString());        //214817  558.2
  }
}
