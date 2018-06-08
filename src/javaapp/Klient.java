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
class Klient {
         String kli_Id;
         String kli_imie;        
         String kli_nazwisko;        
         String kli_nazwa_firmy;        
         String kli_typ;        
         String kli_regon;        
         String kli_nip;        
         String kli_rodzaj;
         String ad_miejscowosc;        
         String ad_ulica;        
         String ad_nr_domu;
        
        Klient(String kli_Id, String kli_nazwa_firmy, String kli_typ, String kli_rodzaj, String kli_regon, String kli_nip, String kli_imie, String kli_nazwisko, String ad_miejscowosc, String ad_ulica, String ad_nr_domu) {
            this.kli_Id = kli_Id;
            this.kli_nazwa_firmy = kli_nazwa_firmy;
            this.kli_typ = kli_typ;
            this.kli_rodzaj = kli_rodzaj;
            this.kli_regon = kli_regon;
            this.kli_nip = kli_nip;
            this.kli_imie = kli_imie;
            this.kli_nazwisko = kli_nazwisko;
            this.ad_miejscowosc = ad_miejscowosc;
            this.ad_ulica = ad_ulica;
            this.ad_nr_domu = ad_nr_domu;
        }
        private String getkli_Id(){
            return kli_Id;
        }
        private String getkli_nazwa_firmy(){
            return kli_nazwa_firmy;
        }
        private String getkli_typ(){ 
            return kli_typ;
        }
        private String getkli_rodzaj(){ 
            return kli_rodzaj;
        }
        private String getkli_regon(){
            return kli_regon;
        }
        private String getkli_nip(){ 
            return kli_nip;
        }
        private String getkli_imie(){
            return kli_imie;
        }
        private String getkli_nazwisko(){ 
            return kli_nazwisko;
        }
        private String getad_miejscowosc(){
            return ad_miejscowosc;
        }
        private String getad_ulica(){ 
            return ad_ulica;
        }
        private String getad_nr_domu(){
            return ad_nr_domu;
         }
    
}
