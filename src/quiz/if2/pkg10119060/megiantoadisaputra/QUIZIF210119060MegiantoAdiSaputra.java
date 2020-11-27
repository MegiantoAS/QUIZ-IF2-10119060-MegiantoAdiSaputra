/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119060.megiantoadisaputra;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class QUIZIF210119060MegiantoAdiSaputra {

    /**
     @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program UTS 
     */
   public static void main(String[] args) {
        int serviceItem;
        boolean isMember;
        float price, discount;
        
        Scanner scanner = new Scanner(System.in);
        ServicePrice sp = new ServicePrice();
        Customer cst    = new Customer();
        
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name \t : ");
        cst.setNama(scanner.next());
        System.out.print("Customer Email \t : ");
        cst.setEmail(scanner.next());
        
        sp.displayService();
        serviceItem = scanner.nextInt();
        sp.setPriceService(sp.getPrice(serviceItem));
        
        System.out.print("Are you Member (yes/no) : ");
        isMember = sp.checkMemberStatus(scanner.next());
        
         //DISKON
        discount = sp.getSale(isMember, sp.getPriceService());
   
                    System.out.println("\n");
                    System.out.println("#**********#");
                    System.out.println("#**********#");
                    System.out.println("Date Transaction : " + cst.currentTime());
                    System.out.println("Service Price : " + sp.getPriceService());
                    System.out.println("Discount : " + discount);
                    System.out.println("Total Pay : " + sp.getTotalPay(sp.getPriceService(), discount));
    }
    
}
      
  
