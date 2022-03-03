/*
 * Copyright (C) 2022 Francis
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.noisivelet.destinyrandompicker.gui;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import net.noisivelet.destinyrandompicker.Main;

/**
 *
 * @author Francis
 */
public class OptionsInterface extends javax.swing.JFrame {
    
    private ArrayList<ButtonGroup> clasesElegidas;
    /**
     * Creates new form OptionsInterface
     */
    public OptionsInterface() {
        initComponents();
        clasesElegidas=new ArrayList<>();
        clasesElegidas.add(botonesJugador1);
        clasesElegidas.add(botonesJugador2);
        clasesElegidas.add(botonesJugador3);
        clasesElegidas.add(botonesJugador4);
        clasesElegidas.add(botonesJugador5);
        clasesElegidas.add(botonesJugador6);
    }
    
    private String getSelectedButton(ButtonGroup group){
        for(Enumeration<AbstractButton> buttons=group.getElements();buttons.hasMoreElements();){
            AbstractButton button=buttons.nextElement();
            
            if(button.isSelected())
                return button.getText();
        }
        
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesJugador1 = new javax.swing.ButtonGroup();
        botonesJugador2 = new javax.swing.ButtonGroup();
        botonesJugador3 = new javax.swing.ButtonGroup();
        botonesJugador4 = new javax.swing.ButtonGroup();
        botonesJugador5 = new javax.swing.ButtonGroup();
        botonesJugador6 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        caos = new javax.swing.JCheckBox();
        tituloModos = new javax.swing.JLabel();
        permisivo = new javax.swing.JCheckBox();
        tituloClases = new javax.swing.JLabel();
        cazadorJ1 = new javax.swing.JRadioButton();
        titanJ1 = new javax.swing.JRadioButton();
        hechiceroJ1 = new javax.swing.JRadioButton();
        randomJ1 = new javax.swing.JRadioButton();
        cazadorJ2 = new javax.swing.JRadioButton();
        titanJ2 = new javax.swing.JRadioButton();
        hechiceroJ2 = new javax.swing.JRadioButton();
        randomJ2 = new javax.swing.JRadioButton();
        cazadorJ3 = new javax.swing.JRadioButton();
        titanJ3 = new javax.swing.JRadioButton();
        hechiceroJ3 = new javax.swing.JRadioButton();
        randomJ3 = new javax.swing.JRadioButton();
        cazadorJ4 = new javax.swing.JRadioButton();
        titanJ4 = new javax.swing.JRadioButton();
        hechiceroJ4 = new javax.swing.JRadioButton();
        randomJ4 = new javax.swing.JRadioButton();
        cazadorJ5 = new javax.swing.JRadioButton();
        titanJ5 = new javax.swing.JRadioButton();
        hechiceroJ5 = new javax.swing.JRadioButton();
        randomJ5 = new javax.swing.JRadioButton();
        cazadorJ6 = new javax.swing.JRadioButton();
        titanJ6 = new javax.swing.JRadioButton();
        hechiceroJ6 = new javax.swing.JRadioButton();
        randomJ6 = new javax.swing.JRadioButton();
        tituloJ1 = new javax.swing.JLabel();
        tituloJ2 = new javax.swing.JLabel();
        tituloJ3 = new javax.swing.JLabel();
        tituloJ4 = new javax.swing.JLabel();
        tituloJ5 = new javax.swing.JLabel();
        tituloJ6 = new javax.swing.JLabel();
        generarRaid = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DestinyRandomPicker");
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        caos.setText("Modo Caos (Todos los exóticos pueden salir para todas las subclases)");
        caos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caosActionPerformed(evt);
            }
        });

        tituloModos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        tituloModos.setText("Modos de aleatoriedad");

        permisivo.setText("Modo Permisivo (Armas que no dan beneficio pueden salir para toda armadura)");

        tituloClases.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        tituloClases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloClases.setText("Clase de los jugadores");

        botonesJugador1.add(cazadorJ1);
        cazadorJ1.setText("Cazador");

        botonesJugador1.add(titanJ1);
        titanJ1.setText("Titán");

        botonesJugador1.add(hechiceroJ1);
        hechiceroJ1.setText("Hechicero");

        botonesJugador1.add(randomJ1);
        randomJ1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        randomJ1.setSelected(true);
        randomJ1.setText("Al azar");

        botonesJugador2.add(cazadorJ2);
        cazadorJ2.setText("Cazador");

        botonesJugador2.add(titanJ2);
        titanJ2.setText("Titán");

        botonesJugador2.add(hechiceroJ2);
        hechiceroJ2.setText("Hechicero");

        botonesJugador2.add(randomJ2);
        randomJ2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        randomJ2.setSelected(true);
        randomJ2.setText("Al azar");

        botonesJugador3.add(cazadorJ3);
        cazadorJ3.setText("Cazador");

        botonesJugador3.add(titanJ3);
        titanJ3.setText("Titán");

        botonesJugador3.add(hechiceroJ3);
        hechiceroJ3.setText("Hechicero");

        botonesJugador3.add(randomJ3);
        randomJ3.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        randomJ3.setSelected(true);
        randomJ3.setText("Al azar");

        botonesJugador4.add(cazadorJ4);
        cazadorJ4.setText("Cazador");

        botonesJugador4.add(titanJ4);
        titanJ4.setText("Titán");

        botonesJugador4.add(hechiceroJ4);
        hechiceroJ4.setText("Hechicero");

        botonesJugador4.add(randomJ4);
        randomJ4.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        randomJ4.setSelected(true);
        randomJ4.setText("Al azar");

        botonesJugador5.add(cazadorJ5);
        cazadorJ5.setText("Cazador");

        botonesJugador5.add(titanJ5);
        titanJ5.setText("Titán");

        botonesJugador5.add(hechiceroJ5);
        hechiceroJ5.setText("Hechicero");

        botonesJugador5.add(randomJ5);
        randomJ5.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        randomJ5.setSelected(true);
        randomJ5.setText("Al azar");

        botonesJugador6.add(cazadorJ6);
        cazadorJ6.setText("Cazador");

        botonesJugador6.add(titanJ6);
        titanJ6.setText("Titán");

        botonesJugador6.add(hechiceroJ6);
        hechiceroJ6.setText("Hechicero");

        botonesJugador6.add(randomJ6);
        randomJ6.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        randomJ6.setSelected(true);
        randomJ6.setText("Al azar");

        tituloJ1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tituloJ1.setText("Jugador #1");

        tituloJ2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tituloJ2.setText("Jugador #2");

        tituloJ3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tituloJ3.setText("Jugador #3");

        tituloJ4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tituloJ4.setText("Jugador #4");

        tituloJ5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tituloJ5.setText("Jugador #5");

        tituloJ6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tituloJ6.setText("Jugador #6");

        generarRaid.setText("Generar Raid aleatoria");
        generarRaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarRaidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloClases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(generarRaid))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(tituloModos)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(caos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(permisivo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tituloJ5)
                                                    .addComponent(tituloJ6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(titanJ6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cazadorJ6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(hechiceroJ6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(randomJ6))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(titanJ5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cazadorJ5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(hechiceroJ5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(randomJ5))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tituloJ1)
                                                    .addComponent(tituloJ2)
                                                    .addComponent(tituloJ3)
                                                    .addComponent(tituloJ4))
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(titanJ4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cazadorJ4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(hechiceroJ4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(randomJ4))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(titanJ3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cazadorJ3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(hechiceroJ3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(randomJ3))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(titanJ2)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(cazadorJ2)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(hechiceroJ2)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(randomJ2))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(titanJ1)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(cazadorJ1)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(hechiceroJ1)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(randomJ1))))))))
                                .addGap(0, 14, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloModos)
                .addGap(18, 18, 18)
                .addComponent(caos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permisivo)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloClases)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cazadorJ1)
                    .addComponent(titanJ1)
                    .addComponent(hechiceroJ1)
                    .addComponent(randomJ1)
                    .addComponent(tituloJ1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cazadorJ2)
                    .addComponent(titanJ2)
                    .addComponent(hechiceroJ2)
                    .addComponent(randomJ2)
                    .addComponent(tituloJ2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cazadorJ3)
                    .addComponent(titanJ3)
                    .addComponent(hechiceroJ3)
                    .addComponent(randomJ3)
                    .addComponent(tituloJ3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cazadorJ4)
                    .addComponent(titanJ4)
                    .addComponent(hechiceroJ4)
                    .addComponent(randomJ4)
                    .addComponent(tituloJ4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cazadorJ5)
                    .addComponent(titanJ5)
                    .addComponent(hechiceroJ5)
                    .addComponent(randomJ5)
                    .addComponent(tituloJ5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cazadorJ6)
                    .addComponent(titanJ6)
                    .addComponent(hechiceroJ6)
                    .addComponent(randomJ6)
                    .addComponent(tituloJ6))
                .addGap(18, 18, 18)
                .addComponent(generarRaid)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caosActionPerformed
        if(caos.isSelected()){
            permisivo.setEnabled(false);
            permisivo.setSelected(true);
        } else {
            permisivo.setEnabled(true);
            permisivo.setSelected(false);
        }
        
    }//GEN-LAST:event_caosActionPerformed

    private void generarRaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarRaidActionPerformed
        //Transformar clases elegidas a un indice
        int[] clases=new int[6];
        int i=0;
        for(ButtonGroup bg: clasesElegidas){
            String clase=getSelectedButton(bg);
            
            switch(clase){
                case "Al azar":
                    clases[i++]=3;
                    break;
                case "Hechicero":
                default:
                    clases[i++]=0;
                    break;
                case "Cazador":
                    clases[i++]=1;
                    break;
                case "Titán":
                    clases[i++]=2;
                    break;
                
            }
        }
        
        //Sacar modos:
        boolean modoCaos=caos.isSelected();
        boolean modoPermisivo=permisivo.isSelected();
        
        for(int clase : clases){
            System.out.print(clase+", ");
        }
        
        System.out.println("\n"+modoCaos+", "+modoPermisivo);
        
        GeneratedRaidJFrame resultado=Main.generarRaid(clases, modoCaos, modoPermisivo);
        resultado.setVisible(true);
    }//GEN-LAST:event_generarRaidActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarculaLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botonesJugador1;
    private javax.swing.ButtonGroup botonesJugador2;
    private javax.swing.ButtonGroup botonesJugador3;
    private javax.swing.ButtonGroup botonesJugador4;
    private javax.swing.ButtonGroup botonesJugador5;
    private javax.swing.ButtonGroup botonesJugador6;
    private javax.swing.JCheckBox caos;
    private javax.swing.JRadioButton cazadorJ1;
    private javax.swing.JRadioButton cazadorJ2;
    private javax.swing.JRadioButton cazadorJ3;
    private javax.swing.JRadioButton cazadorJ4;
    private javax.swing.JRadioButton cazadorJ5;
    private javax.swing.JRadioButton cazadorJ6;
    private javax.swing.JButton generarRaid;
    private javax.swing.JRadioButton hechiceroJ1;
    private javax.swing.JRadioButton hechiceroJ2;
    private javax.swing.JRadioButton hechiceroJ3;
    private javax.swing.JRadioButton hechiceroJ4;
    private javax.swing.JRadioButton hechiceroJ5;
    private javax.swing.JRadioButton hechiceroJ6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox permisivo;
    private javax.swing.JRadioButton randomJ1;
    private javax.swing.JRadioButton randomJ2;
    private javax.swing.JRadioButton randomJ3;
    private javax.swing.JRadioButton randomJ4;
    private javax.swing.JRadioButton randomJ5;
    private javax.swing.JRadioButton randomJ6;
    private javax.swing.JRadioButton titanJ1;
    private javax.swing.JRadioButton titanJ2;
    private javax.swing.JRadioButton titanJ3;
    private javax.swing.JRadioButton titanJ4;
    private javax.swing.JRadioButton titanJ5;
    private javax.swing.JRadioButton titanJ6;
    private javax.swing.JLabel tituloClases;
    private javax.swing.JLabel tituloJ1;
    private javax.swing.JLabel tituloJ2;
    private javax.swing.JLabel tituloJ3;
    private javax.swing.JLabel tituloJ4;
    private javax.swing.JLabel tituloJ5;
    private javax.swing.JLabel tituloJ6;
    private javax.swing.JLabel tituloModos;
    // End of variables declaration//GEN-END:variables
}