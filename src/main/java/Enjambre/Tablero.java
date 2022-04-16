/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enjambre;

import Treads.threadTime;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import java.util.Random;
import javax.swing.BorderFactory;

/**
 *
 * @author Ana
 */
public class Tablero extends javax.swing.JFrame {

    //DIMENSION
    private final int DIMENSION = 50;
    private final int TAMANO = 13;//650(tamaño del panel principal)/50(cantidad de casillas)

    JButton botones[][];
    threadTime thread;
    
    private ArrayList <Defensor> Defensores;
    private ArrayList <Recolector> Recolectores;
    private ArrayList <Amenaza> Amenazas;
    
    private ArrayList <Recurso> Recursos;
    private ArrayList <Obstaculo> Obstaculos;

    public Tablero() {
        initComponents();
        initTablero();
        //thread = new threadTime(this);
        //thread.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPantalla = new javax.swing.JPanel();
        pnlPantalla2 = new javax.swing.JPanel();
        continuarBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPantalla.setBackground(new java.awt.Color(153, 255, 204));
        pnlPantalla.setPreferredSize(new java.awt.Dimension(650, 650));

        javax.swing.GroupLayout pnlPantallaLayout = new javax.swing.GroupLayout(pnlPantalla);
        pnlPantalla.setLayout(pnlPantallaLayout);
        pnlPantallaLayout.setHorizontalGroup(
            pnlPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        pnlPantallaLayout.setVerticalGroup(
            pnlPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        pnlPantalla2.setBackground(new java.awt.Color(255, 255, 153));

        continuarBTN.setText("Continuar");
        continuarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPantalla2Layout = new javax.swing.GroupLayout(pnlPantalla2);
        pnlPantalla2.setLayout(pnlPantalla2Layout);
        pnlPantalla2Layout.setHorizontalGroup(
            pnlPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPantalla2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(continuarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnlPantalla2Layout.setVerticalGroup(
            pnlPantalla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPantalla2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continuarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPantalla2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPantalla2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_continuarBTNActionPerformed

    private void initTablero() {
        botones = new JButton[DIMENSION][DIMENSION];
        //pnlPantalla.setLayout(new java.awt.GridLayout(50, 50));
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                botones[i][j] = new JButton();
                botones[i][j].setBackground(Color.white);
                botones[i][j].setBounds(i*TAMANO, j*TAMANO, TAMANO, TAMANO);
                botones[i][j].setBorder(BorderFactory.createEmptyBorder());
                pnlPantalla.add(botones[i][j]);
            }
            
 
        }
        
        Obstaculos= new ArrayList();        
        for (int i = 20; i < 24; i++) {
            for (int j = 0; j <12  ; j++) {
                Obstaculo obs= new Obstaculo(i,j);
                Obstaculos.add(obs);
                botones[i][j].setBackground(Color.black);
                }
            }
        
        for (int i = 35; i < 38; i++) {
            for (int j = 40; j <50  ; j++) {
                Obstaculo obs= new Obstaculo(i,j);
                Obstaculos.add(obs);
                botones[i][j].setBackground(Color.black);
                }
            }
        
        for (int i =10; i < 13; i++) {
            for (int j = 30; j <40  ; j++) {
                Obstaculo obs= new Obstaculo(i,j);
                Obstaculos.add(obs);
                botones[i][j].setBackground(Color.black);
                }
            }
       
        for (int i =0; i < 10; i++) {
            for (int j = 30; j <32  ; j++) {
                Obstaculo obs= new Obstaculo(i,j);
                Obstaculos.add(obs);
                botones[i][j].setBackground(Color.black);
                }
            }
        
        for (int i =39; i < 43; i++) {
            for (int j = 15; j <30  ; j++) {
                Obstaculo obs= new Obstaculo(i,j);
                Obstaculos.add(obs);
                botones[i][j].setBackground(Color.black);
                }
            }
        for (int i =5; i < 25; i++) {
            for (int j = 21; j <24 ; j++) {
                Obstaculo obs= new Obstaculo(i,j);
                Obstaculos.add(obs);
                botones[i][j].setBackground(Color.black);
                }
            }
        
        Recursos= new ArrayList();
        int count= 0;
        while(count!=10){
            Random rand=new Random();
            int num_rand1= rand.nextInt(50);
            int num_rand2= rand.nextInt(50);
            if (!"java.awt.Color[r=0,g=0,b=0]".equals(botones[num_rand1][num_rand2].getBackground().toString())){
                Recurso rec=new Recurso(num_rand1,num_rand2);
                botones[num_rand1][num_rand2].setBackground(Color.yellow);
                count++;
            }
        }
        
        Amenazas= new ArrayList();
        int count2=0;
        while(count2!=5){
            Random rand=new Random();
            int num_rand1= rand.nextInt(50);
           int num_rand2= rand.nextInt(50);
           if (!"java.awt.Color[r=0,g=0,b=0]".equals(botones[num_rand1][num_rand2].getBackground().toString())) {
               if (!"java.awt.Color[r=255,g=255,b=0]".equals(botones[num_rand1][num_rand2].getBackground().toString())) {
                   Recurso rec=new Recurso(num_rand1,num_rand2);
                   botones[num_rand1][num_rand2].setBackground(Color.red);
                   count2++;
               }
            }
        
    }
        }
  

    public void setInBotonesColor(int x, int y, int selection) {
        if(selection == 0)
            botones[x][y].setBackground(Color.blue);
        else
           botones[x][y].setBackground(Color.red); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuarBTN;
    private javax.swing.JPanel pnlPantalla;
    private javax.swing.JPanel pnlPantalla2;
    // End of variables declaration//GEN-END:variables
}
