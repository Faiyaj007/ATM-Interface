package ATMInterfaceProject.controller;

import java.util.Scanner;

public class BankingApp
{

    public void verification()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("          WELCOME TO SKF BANK @PVT.ltd        ");
        System.out.println("Please Enter Customer_id : ");
        String customerid=sc.next();
        String verifiedid="SKF_786";
        System.out.println("Please Enter Password : ");
        String password=sc.next();
        String verifiedpass="Qwerty@213";




        if((customerid.equals(verifiedid)) && (password.equals(verifiedpass)))
        {
            Operations obj1=new Operations();
            obj1.Basicdetails();
            BankAccount obj2 = new BankAccount();
            obj2.showMenu();

        }
        else
        {
            System.out.println("Login Failed");
        }

    }

}