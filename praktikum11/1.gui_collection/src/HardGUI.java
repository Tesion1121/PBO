/*
 * Nama File : HardGUI.java
 * Deskripsi : Proyek 4. Berlatih menyimpan ke dan mengambil dari: List, Set, dan Map
 * Pembuat : Khairiya fatih izzudin emarin/24060123140166
 * Tanggal : 28 Mei 2025
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.DefaultListModel;
import java.util.*;

/**
 *
 * @author Victus
 */
public class HardGUI extends javax.swing.JFrame {

    DefaultListModel<String> dlm;
    List<String> itemsList = new ArrayList<>();
    Map<Integer, String> itemsmap = new HashMap<Integer, String>();
    Set<String> itemsset = new HashSet<String>();

    /**
     * Creates new form HardGUI
     */
    public HardGUI() {
        initComponents();
        this.dlm = new DefaultListModel<>();
        this.jListItem.setModel(dlm);
    }

    private void updateJumDataTersimpan() {
    }

    private void addItem(String namaItem) {
        dlm.addElement(namaItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdd = new javax.swing.JButton();
        jLabelJumlahDataList = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonSaveDataSet = new javax.swing.JButton();
        jButtonInsertDataSet = new javax.swing.JButton();
        jLabelJumlahDataSet = new javax.swing.JLabel();
        jButtonSaveDataMap = new javax.swing.JButton();
        jButtonInsertDataMap = new javax.swing.JButton();
        jButtonSaveDataList = new javax.swing.JButton();
        labelsave2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList<>();
        jLabelJumlahDataMap = new javax.swing.JLabel();
        jTextFieldNamaItem = new javax.swing.JTextField();
        jButtonInsertDataList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAdd.setBackground(new java.awt.Color(153, 153, 153));
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabelJumlahDataList.setText("Data Tersimpan = ");

        jButtonUpdate.setBackground(new java.awt.Color(153, 153, 153));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(153, 153, 153));
        jButtonClear.setText("Clear All");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonSaveDataSet.setBackground(new java.awt.Color(153, 153, 153));
        jButtonSaveDataSet.setText("Save To Set ->");
        jButtonSaveDataSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveDataSetActionPerformed(evt);
            }
        });

        jButtonInsertDataSet.setBackground(new java.awt.Color(153, 153, 153));
        jButtonInsertDataSet.setText("<- Insert data Set");
        jButtonInsertDataSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataSetActionPerformed(evt);
            }
        });

        jLabelJumlahDataSet.setText("Data Tersimpan = ");

        jButtonSaveDataMap.setBackground(new java.awt.Color(153, 153, 153));
        jButtonSaveDataMap.setText("Save To Map ->");
        jButtonSaveDataMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveDataMapActionPerformed(evt);
            }
        });

        jButtonInsertDataMap.setBackground(new java.awt.Color(153, 153, 153));
        jButtonInsertDataMap.setText("<-  Insert data Map");
        jButtonInsertDataMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataMapActionPerformed(evt);
            }
        });

        jButtonSaveDataList.setBackground(new java.awt.Color(153, 153, 153));
        jButtonSaveDataList.setText("Save To List ->");
        jButtonSaveDataList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveDataListActionPerformed(evt);
            }
        });

        labelsave2.setText("Item name :  ");

        jScrollPane1.setViewportView(jListItem);

        jLabelJumlahDataMap.setText("Data Tersimpan = ");

        jTextFieldNamaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaItemActionPerformed(evt);
            }
        });

        jButtonInsertDataList.setBackground(new java.awt.Color(153, 153, 153));
        jButtonInsertDataList.setText("<- Insert data List");
        jButtonInsertDataList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addComponent(jButtonInsertDataList,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                132, Short.MAX_VALUE)
                                                                        .addComponent(jButtonSaveDataSet,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(jButtonSaveDataList,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addGap(9, 9, 9)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(jLabelJumlahDataSet))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabelJumlahDataList)
                                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(labelsave2)
                                                                                        .addComponent(
                                                                                                jTextFieldNamaItem,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                107,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jButtonSaveDataMap,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                                .addGap(9, 9, 9)))
                                                                .addComponent(jLabelJumlahDataMap))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButtonAdd,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonUpdate)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonDelete))
                                                        .addComponent(jButtonInsertDataMap)
                                                        .addComponent(jButtonInsertDataSet,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 132,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 133,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(54, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonSaveDataList)
                                                        .addComponent(jLabelJumlahDataList))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonInsertDataList)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonSaveDataSet)
                                                        .addComponent(jLabelJumlahDataSet))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonInsertDataSet)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonSaveDataMap)
                                                        .addComponent(jLabelJumlahDataMap))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonInsertDataMap)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelsave2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldNamaItem,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonClear)
                                        .addComponent(jButtonAdd)
                                        .addComponent(jButtonUpdate)
                                        .addComponent(jButtonDelete))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateJumDataListTersimpan() {
        jLabelJumlahDataList.setText("Data tersimpan = " + itemsList.size());
    }

    private void updateJumDataSetTersimpan() {
        jLabelJumlahDataSet.setText("Data tersimpan = " + itemsset.size());
    }

    private void updateJumDataMapTersimpan() {
        jLabelJumlahDataMap.setText("Data tersimpan = " + itemsmap.size());
    }

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        addItem(jTextFieldNamaItem.getText());
        jTextFieldNamaItem.setText("");
    }// GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        int index = jListItem.getSelectedIndex();
        String selected = jTextFieldNamaItem.getText();
        dlm.setElementAt(selected, index);
        jTextFieldNamaItem.setText("");
    }// GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        dlm.clear();
    }// GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int index = jListItem.getSelectedIndex();
        dlm.removeElementAt(index);
        jTextFieldNamaItem.setText("");
    }// GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonSaveDataSetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSaveDataSetActionPerformed
        // TODO add your handling code here:
        if (!itemsset.isEmpty()) {
            itemsset.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++) {
            itemsset.add(dlm.getElementAt(i));
        }
        updateJumDataSetTersimpan();
    }// GEN-LAST:event_jButtonSaveDataSetActionPerformed

    private void jButtonInsertDataSetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonInsertDataSetActionPerformed
        // TODO add your handling code here:
        for (String item : itemsset) {
            dlm.addElement(item);
        }
    }// GEN-LAST:event_jButtonInsertDataSetActionPerformed

    private void jButtonSaveDataMapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSaveDataMapActionPerformed
        // TODO add your handling code here:
        itemsmap.clear();
        for (int i = 0; i < dlm.getSize(); i++) {
            String value = dlm.getElementAt(i);
            int key = i + 1;
            itemsmap.put(key, value);
        }
        updateJumDataMapTersimpan();
    }// GEN-LAST:event_jButtonSaveDataMapActionPerformed

    private void jButtonInsertDataMapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonInsertDataMapActionPerformed
        // TODO add your handling code here:
        dlm.clear();
        for (Map.Entry<Integer, String> entry : itemsmap.entrySet()) {
            dlm.addElement(entry.getValue());
        }
    }// GEN-LAST:event_jButtonInsertDataMapActionPerformed

    private void jButtonSaveDataListActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSaveDataListActionPerformed
        if (!itemsList.isEmpty()) {
            itemsList.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++) {
            itemsList.add(dlm.getElementAt(i));
        }

        updateJumDataListTersimpan();
    }// GEN-LAST:event_jButtonSaveDataListActionPerformed

    private void jTextFieldNamaItemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldNamaItemActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldNamaItemActionPerformed

    private void jButtonInsertDataListActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonInsertDataListActionPerformed
        for (String item : itemsList) {
            dlm.addElement(item);
        }
    }// GEN-LAST:event_jButtonInsertDataListActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HardGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertDataList;
    private javax.swing.JButton jButtonInsertDataMap;
    private javax.swing.JButton jButtonInsertDataSet;
    private javax.swing.JButton jButtonSaveDataList;
    private javax.swing.JButton jButtonSaveDataMap;
    private javax.swing.JButton jButtonSaveDataSet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelJumlahDataList;
    private javax.swing.JLabel jLabelJumlahDataMap;
    private javax.swing.JLabel jLabelJumlahDataSet;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNamaItem;
    private javax.swing.JLabel labelsave2;
    // End of variables declaration//GEN-END:variables
}
