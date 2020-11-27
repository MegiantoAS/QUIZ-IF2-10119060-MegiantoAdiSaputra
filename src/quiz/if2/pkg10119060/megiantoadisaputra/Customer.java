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
public abstract class Customer implements ServiceItem {
private String name;
private String email;
private boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean isMember(){
    return false;  
    }
    
    public void setMmember(boolean member){
        
    }
    
    public String currentTime(){
    return null;
        
    }
}
    

