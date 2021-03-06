/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lekhika
 */
public class FilterFrame extends javax.swing.JFrame {

    /**
     * Creates new form FilterFrame
     */
    public FilterFrame() {
        initComponents();
//        ipsrc.setEnabled(false);
//        macdest.setEnabled(false);
//        ipsrc.setEnabled(false);
//        macsrc.setEnabled(false);        
//        arp.setEnabled(false);
//        icmp.setEnabled(false);
//        others.setEnabled(false);
//        ip.setEnabled(false);
        udp.setEnabled(false);
        tcp.setEnabled(false);
        icmp.setEnabled(false);
        ipothers.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ip = new javax.swing.JCheckBox();
        tcp = new javax.swing.JCheckBox();
        udp = new javax.swing.JCheckBox();
        icmp = new javax.swing.JCheckBox();
        arp = new javax.swing.JCheckBox();
        ipothers = new javax.swing.JCheckBox();
        others = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        macdest = new javax.swing.JTextField();
        macsrc = new javax.swing.JTextField();
        filterbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ipsrc = new javax.swing.JTextField();
        ipdest = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder(null, "Protocols", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(89, 89, 89)))); // NOI18N

        ip.setText("IP");
        ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipActionPerformed(evt);
            }
        });

        tcp.setText("TCP");
        tcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcpActionPerformed(evt);
            }
        });

        udp.setText("UDP");

        icmp.setText("ICMP");
        icmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icmpActionPerformed(evt);
            }
        });

        arp.setText("ARP");
        arp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arpActionPerformed(evt);
            }
        });

        ipothers.setText("Others");

        others.setText("Others");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ip)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(others)
                            .addComponent(arp))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(udp)
                                    .addComponent(tcp))
                                .addGap(27, 92, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ipothers)
                                    .addComponent(icmp))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tcp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(udp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(icmp)
                .addGap(18, 18, 18)
                .addComponent(ipothers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(arp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(others)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder(null, "Mac Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(89, 89, 89)))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(160, 153, 153));

        macdest.setText("Destination");
        macdest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macdestActionPerformed(evt);
            }
        });

        macsrc.setText("Source ");
        macsrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macsrcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(macdest, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(macsrc))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(macsrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(macdest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        filterbtn.setText("Filter");
        filterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterbtnActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder(null, "Ip Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(89, 89, 89)))); // NOI18N

        ipsrc.setText("Source");
        ipsrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipsrcActionPerformed(evt);
            }
        });

        ipdest.setText("Destination");
        ipdest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipdestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ipsrc)
                    .addComponent(ipdest))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ipsrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(ipdest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(filterbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filterbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipActionPerformed
        // TODO add your handling code here:
        if (ip.isSelected()) {
            udp.setEnabled(true);
            tcp.setEnabled(true);
            icmp.setEnabled(true);
            ipothers.setEnabled(true);
        } else {
            udp.setEnabled(false);
            tcp.setEnabled(false);
            icmp.setEnabled(false);
            ipothers.setEnabled(false);
        }
    }//GEN-LAST:event_ipActionPerformed

    private void tcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcpActionPerformed

    private void icmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icmpActionPerformed

    private void arpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arpActionPerformed

    private void filterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterbtnActionPerformed
        // TODO add your handling code here:
        boolean arpval = arp.isSelected();
        boolean ipval = ip.isSelected();
        boolean udpval = udp.isSelected();
        boolean tcpval = tcp.isSelected();
        boolean icmpval = icmp.isSelected();
        boolean ipoval = ipothers.isSelected();
        boolean othersval = others.isSelected();
        String srcmac = macsrc.getText();
        String destmac = macdest.getText();
        String srcip = ipsrc.getText().toString();
        String destip = ipdest.getText().toString();
        String query = "";

        if (srcmac.equals("Source ")) {
            srcmac = "";
        }
        if (destmac.equals("Destination")) {
            destmac = "";
        }
        if (srcip.equals("Source")) {
            srcip = "";
        }
        if (destip.equals("Destination")) {
            destip = "";
        }

        if (!arpval || ipval || !othersval || srcmac != "" || destmac != "" || srcip != "" || destip != "") {

//            
            if (!srcmac.equals("")) {
                query = "select * from packets where eth_src = '" + srcmac + "'";
            }
            if (!destmac.equals("")) {
                if (query.equals("")) {
                    query = "select * from packets where eth_dest = '" + destmac + "'";
                } else {
                    query += " and eth_dest = '" + destmac + "'";
                }
            }
            if (!srcip.equals("")) {
                if (query.equals("")) {
                    query = "select * from packets where ip_src = '" + srcip + "'";
                } else {
                    query += " and ip_src = '" + srcip + "'";
                }
            }
            if (!destip.equals("")) {
                if (query.equals("")) {
                    query = "select * from packets where ip_dest = '" + destip + "'";
                } else {
                    query += " and ip_dest = '" + destip + "'";
                }
            }
            if (arpval || othersval || ipval) {
                if (query.equals("")) {
                    query = "select * from packets where protocol in (";
                } else {
                    query += " and protocol in (";
                }
                if (arpval) {
                    query = query + "'ARP',";
                }
                if (othersval) {
                    query = query + "'--',";
                }

                if (ipval) {
                    if (!ipoval && !udpval && !tcpval && !icmpval) {
                        query = query + "'TCP','ICMP','UDP','',";
                    } else {
                        if (udpval) {
                            query = query + "'UDP',";
                        }
                        if (tcpval) {
                            query = query + "'TCP',";
                        }
                        if (icmpval) {
                            query = query + "'ICMP',";
                        }
                        if (ipoval) {
                            query = query + "'',";
                        }
                    }
                    query = query.substring(0, query.length() - 1) + ")";
                }
            }
            System.out.println(query);
            ArrayList<String> str = new ArrayList<String>();
            str.add(query);
            OpFrame O = new OpFrame(query, str);
        }

    }//GEN-LAST:event_filterbtnActionPerformed

    private void macsrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macsrcActionPerformed

    }//GEN-LAST:event_macsrcActionPerformed

    private void macdestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macdestActionPerformed
//        macdest.setText(null); 
    }//GEN-LAST:event_macdestActionPerformed

    private void ipsrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipsrcActionPerformed
//        ipsrc.setText(null); 
    }//GEN-LAST:event_ipsrcActionPerformed

    private void ipdestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipdestActionPerformed
//        ipdest.setText(null); 
    }//GEN-LAST:event_ipdestActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FilterFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilterFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilterFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilterFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox arp;
    private javax.swing.JButton filterbtn;
    private javax.swing.JCheckBox icmp;
    private javax.swing.JCheckBox ip;
    private javax.swing.JTextField ipdest;
    private javax.swing.JCheckBox ipothers;
    private javax.swing.JTextField ipsrc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField macdest;
    private javax.swing.JTextField macsrc;
    private javax.swing.JCheckBox others;
    private javax.swing.JCheckBox tcp;
    private javax.swing.JCheckBox udp;
    // End of variables declaration//GEN-END:variables
}
