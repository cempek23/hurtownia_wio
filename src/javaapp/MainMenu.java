/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.PopupMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author Wojtek
 */
public class MainMenu extends javax.swing.JFrame {


    

        Connection conn = new DBConnection().connect();
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        
        initComponents();
        

    }
 
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dod_pro = new javax.swing.JButton();
        us_pro = new javax.swing.JButton();
        szcz_zam = new javax.swing.JButton();
        klient = new javax.swing.JButton();
        produkt = new javax.swing.JButton();
        zamowienia = new javax.swing.JButton();
        dodaj_zam = new javax.swing.JButton();
        dod_klien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Menu Główne");

        jButton1.setText("Wyjście");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dod_pro.setText("Dodaj produkt");
        dod_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dod_proActionPerformed(evt);
            }
        });

        us_pro.setText("Usuń produkt");
        us_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                us_proActionPerformed(evt);
            }
        });

        szcz_zam.setText("Szczegóły zamówienia");
        szcz_zam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szcz_zamActionPerformed(evt);
            }
        });

        klient.setText("Klienci");
        klient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klientActionPerformed(evt);
            }
        });

        produkt.setText("Produkty");
        produkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produktActionPerformed(evt);
            }
        });

        zamowienia.setText("Zamówienia");
        zamowienia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zamowieniaActionPerformed(evt);
            }
        });

        dodaj_zam.setText("Dodaj zamówienie");
        dodaj_zam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodaj_zamActionPerformed(evt);
            }
        });

        dod_klien.setText("Dodaj klienta");
        dod_klien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dod_klienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(195, 195, 195))
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zamowienia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dodaj_zam, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(szcz_zam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dod_pro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(us_pro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(produkt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(klient, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dod_klien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dodaj_zam, szcz_zam, zamowienia});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dod_pro, produkt, us_pro});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(klient)
                    .addComponent(produkt)
                    .addComponent(zamowienia))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dod_pro)
                    .addComponent(szcz_zam)
                    .addComponent(dod_klien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(us_pro)
                    .addComponent(dodaj_zam))
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dod_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dod_proActionPerformed
        dodaj_pro dpro = new dodaj_pro();
                dpro.show();
    }//GEN-LAST:event_dod_proActionPerformed

    private void us_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_us_proActionPerformed
        usun_pro upro = new usun_pro();
                upro.show();
// TODO add your handling code here:
    }//GEN-LAST:event_us_proActionPerformed

    private void szcz_zamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szcz_zamActionPerformed
        szczegoly_zam sz_zam = new szczegoly_zam();
                sz_zam.show();
    }//GEN-LAST:event_szcz_zamActionPerformed

    private void klientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klientActionPerformed
      Klienci kli = new Klienci();
      kli.show();
    }//GEN-LAST:event_klientActionPerformed

    private void produktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produktActionPerformed
       Produkty pro = new Produkty();
      pro.show();
    }//GEN-LAST:event_produktActionPerformed

    private void dodaj_zamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodaj_zamActionPerformed
        Dzamowienia dzam = new Dzamowienia();
      dzam.show();
    }//GEN-LAST:event_dodaj_zamActionPerformed

    private void zamowieniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zamowieniaActionPerformed
      Zamowienia dodzam = new Zamowienia();
      dodzam.show();
    }//GEN-LAST:event_zamowieniaActionPerformed

    private void dod_klienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dod_klienActionPerformed
        Dod_kli dk = new Dod_kli();
        dk.show();
    }//GEN-LAST:event_dod_klienActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dod_klien;
    private javax.swing.JButton dod_pro;
    private javax.swing.JButton dodaj_zam;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton klient;
    private javax.swing.JButton produkt;
    private javax.swing.JButton szcz_zam;
    private javax.swing.JButton us_pro;
    private javax.swing.JButton zamowienia;
    // End of variables declaration//GEN-END:variables

    private PopupMenu tab1(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}