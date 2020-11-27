/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119060.megiantoadisaputra;

/**
 *
  @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program UTS 
 */
public class ServicePrice implements ServiceItem {
    private float harga;
    private float priceservice;
    private float discount;

    public float getPriceservice() {
        return priceservice;
    }

    public void setPriceservice(float priceservice) {
        this.priceservice = priceservice;
    }
    
    @Override
    public void displayService(){
        System.out.println("#*****************************************#");
        System.out.println("#****Rock n Roll HairCut****");
        System.out.println("#****Service List****");
        System.out.println("#1. Haircut : IDR 45");
        System.out.println("#2. Haircut + hair wash : IDR 55");
        System.out.println("#3. HaiWash only : IDR 15");
        System.out.println("#1. Haircut : IDR 45");
        System.out.println("#*****************************************#");
        System.out.println("#choose 1/2/3");
    }
    
    @Override
    public float getPrice(int serviceItem){
        switch (serviceItem){
            case 1:
                harga = 45;
                break;
            case 2:
                harga = 55;
                break;
            case 3:
                harga = 15;
                break;
            default:
                break; 
        }
        return harga;
    }
    
    public boolean checkMemberStatus(String StatusMember){
       boolean status;
       status = "yes".equals(StatusMember) || "yes".equals(StatusMember);
       return status;
    }
    
    @Override
    public float getSale(boolean inMember, float parServicePrice){
        return 0;
        
    }
    
    public float getTotalPay(float priceService, float discount){
        return 0;
        
    }
}
    

