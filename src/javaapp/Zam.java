/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author Wojtek
 */
class Zam {
         int zam_Id;
         String kli_nazwa_firmy;
         String zam_status;        
         String zam_data_realizacji;        
         String zam_data_wysylki;        

        
        Zam(int zam_Id, String kli_nazwa_firmy, String zam_status, String zam_data_realizacji, String zam_data_wysylki ) {
            this.zam_Id = zam_Id;
            this.kli_nazwa_firmy = kli_nazwa_firmy;
            this.zam_status = zam_status;
            this.zam_data_realizacji = zam_data_realizacji;
            this.zam_data_wysylki = zam_data_wysylki;
        }
        
        private int getzam_Id(){
            return zam_Id;
        }
        private String getkli_nazwa_firmy(){ 
            return kli_nazwa_firmy;
        }
        private String getzam_status(){ 
            return zam_status;
        }
        private String getzam_data_realizacji(){
            return zam_data_realizacji;
        }
        private String getzam_data_wysylki(){ 
            return zam_data_wysylki;
        }
}
