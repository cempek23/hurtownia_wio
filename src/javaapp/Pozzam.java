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
class Pozzam {
        String zamowienia_zam_Id;
        String pro_nazwa;
        String zam_poz_ilosc;
        String zam_poz_jm;        
        String zam_poz_cena_netto; 
        String zam_poz_vat; 
        String zam_poz_cena_brutto;
        
        Pozzam(String zamowienia_zam_Id, String pro_nazwa, String zam_poz_ilosc, String zam_poz_jm, String zam_poz_cena_netto, String zam_poz_vat, String zam_poz_cena_brutto ) {
            this.zamowienia_zam_Id = zamowienia_zam_Id;
            this.pro_nazwa = pro_nazwa;
            this.zam_poz_ilosc = zam_poz_ilosc;
            this.zam_poz_jm = zam_poz_jm;
            this.zam_poz_cena_netto = zam_poz_cena_netto;
            this.zam_poz_vat = zam_poz_vat;
            this.zam_poz_cena_brutto = zam_poz_cena_brutto;
            
        }
        private String getzamowienia_zam_Id(){
            return zamowienia_zam_Id;
        }
        private String getpro_nazwa(){
            return pro_nazwa;
        }
        private String getzam_poz_ilosc(){ 
            return zam_poz_ilosc;
        }
        private String getzam_poz_jm(){ 
            return zam_poz_jm;
        }
        private String getzam_poz_cena_netto(){
            return zam_poz_cena_netto;
        }
        private String getzam_poz_vat(){ 
            return zam_poz_vat;
        }
        private String getzam_poz_cena_brutto(){
            return zam_poz_cena_brutto;
        }      
}