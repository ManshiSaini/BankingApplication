

public class BankingApplication {

    public static void main(String[] args) {
        // TODO code application logic here
        bankaccount abj1;
        abj1 = new bankaccount("Manshi Saini",123,9528);
abj1.show ();
 }
}

class bankaccount {
    int balance;
String customerName;
int customerId;
int previousTransaction;
long mobileNumber;
   
bankaccount(String customerName,int customerId,long mobileNumber){
    this.customerName = customerName;
    this.customerId  = customerId;
this.mobileNumber = mobileNumber;}


void deposite(int amount)
{
if(amount!=0)
    {
balance = balance+amount;
previousTransaction=+amount;
  }
    }
    void withdraw(int amount)
{
    if (amount==0)
{
  } else {
        balance=balance-amount;
        previousTransaction=-amount;
        }
}
    void getPreviousTransaction()
{
if (previousTransaction>0)
{
System.out.println("deposite:"+previousTransaction);
}
else if (previousTransaction<0)
{
    System.out.println("withdraw:"+Math.abs(previousTransaction));
}
else
{
System.out.println(" No Transaction accourd");
  }
}
void show ()
{
java.util.Scanner scanner = new java.util.Scanner(System.in);
char option;
System.out.println("State Bank Of India");
System.out.println("***********************");
System.out.println("WELCOME TO OUR BANK:"+customerName);
System.out.println("your Id is:"+customerId);
System.out.println("Your mobilenumber is:"+mobileNumber);
System.out.println("................................");
System.out.println("A.check balance");
System.out.println("B.deposite");
System.out.println("C.withdraw");
System.out.println("D.PreviousTransaction");
System.out.println("E.exit");
do
{
System.out.println("====================");
System.out.println("enter an option");
System.out.println("====================");
option = scanner.next().charAt(0);
switch(option)
{
case'A':   
System.out.println("====================");
System.out.println("balance="+balance);
break;
case'B':
System.out.println("====================");
System.out.println("enter an amount to deposite:");
System.out.println("====================");
int amount=scanner.nextInt();
deposite(amount);
break;
case'C':
System.out.println("====================");
System.out.println("enter an amount to withdraw:");
System.out.println("====================");
int amount2=scanner.nextInt();
withdraw(amount2);
break;
case'D':
System.out.println("====================");
getPreviousTransaction();
System.out.println("====================");

break;

case'E':

System.out.println("********");
break;
default:
System.out.println("ivalid option!!.please enter again");
}
}
while(option!='E');
System.out.println("Thank you for using our Service");
  } 
}


