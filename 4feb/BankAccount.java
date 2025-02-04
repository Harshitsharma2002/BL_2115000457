import java.util.*;
public class BankAccount{
private static String bankName="State Bank of India";
private String accountHolderName;
final private long accountNumber;
private static int totalAccounts=0;
public BankAccount(String accountHolderName, long accountNumber){
this.accountHolderName=accountHolderName;
this.accountNumber=accountNumber;
totalAccounts++;
}
static int getTotalAccounts(){
return totalAccounts;
}
public void Display(){
System.out.println("Bank Name: "+bankName);
System.out.println("Account Number: "+accountNumber);
System.out.println("Account Holder: "+accountHolderName);
}
public static void main(String [] args){
BankAccount b=new BankAccount("Harshit",1234567890);
System.out.println(b instanceof BankAccount);
System.out.println(b.getTotalAccounts());
b.Display();
}
}