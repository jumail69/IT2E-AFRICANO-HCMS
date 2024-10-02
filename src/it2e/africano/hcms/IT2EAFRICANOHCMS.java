
package it2e.africano.hcms;

import java.util.Scanner;


public class IT2EAFRICANOHCMS {

    
   public void addCustomer(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print("Customer First Name: ");
        String fname = sc.next();
        System.out.print("Customer Last Name: ");
        String lname = sc.next();
        System.out.print("Customer Email: ");
        String email = sc.next();
        System.out.print("Customer Status: ");
        String status = sc.next();

        String sql = "INSERT INTO table_customer (c_fname, c_lname, c_email, c_status) VALUES (?, ?, ?, ?)";

        

        conf.addRecord(sql, fname, lname, email, status);


    }

    
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
            
        System.out.println("Enter action:");
        int action = sc.nextInt();
        IT2EAFRICANOHCMS test =new IT2EAFRICANOHCMS();
               test.addCustomer();
          
         switch (action){
            case 1:
               
               test.addCustomer();
          
            break;
    
         
    }
    

    }
}