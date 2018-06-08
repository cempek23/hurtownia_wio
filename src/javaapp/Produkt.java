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
class Produkt {
        int pro_Id;
        String pro_nazwa;
        String pro_typ;        
        String pro_opis;        
        String pro_cena_netto;        
        String pro_ilosc;        
        String pro_jm;        
        String pro_data_przydatnosci; 
        int poz_magazyn_poz_mag_Id;
        
        
        Produkt(int pro_Id, String pro_nazwa, String pro_typ, String pro_opis, String pro_cena_netto, String pro_ilosc, String pro_jm, String pro_data_przydatnosci, int poz_magazyn_poz_mag_Id ) {
            this.pro_Id = pro_Id;
            this.pro_nazwa = pro_nazwa;
            this.pro_typ = pro_typ;
            this.pro_opis = pro_opis;
            this.pro_cena_netto = pro_cena_netto;
            this.pro_ilosc = pro_ilosc;
            this.pro_jm = pro_jm;
            this.pro_data_przydatnosci = pro_data_przydatnosci;
            this.poz_magazyn_poz_mag_Id = poz_magazyn_poz_mag_Id;

        }

    Produkt(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        private int getpro_Id(){
            return pro_Id;
        }
        private String pro_nazwa(){ 
            return pro_nazwa;
        }
        private String getpro_typ(){ 
            return pro_typ;
        }
        private String getpro_opis(){
            return pro_opis;
        }
        private String getpro_cena_netto(){ 
            return pro_cena_netto;
        }
        private String getpro_ilosc(){
            return pro_ilosc;
        }
        private String getpro_jm(){ 
            return pro_jm;
        }
        private String getpro_data_przydatnosci(){
             return pro_data_przydatnosci;
         }
        private int getpoz_magazyn_poz_mag_Id(){
            return poz_magazyn_poz_mag_Id;
        }
}
