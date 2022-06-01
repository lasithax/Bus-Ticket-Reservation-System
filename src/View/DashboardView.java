package View;

import Model.Tools;

public class DashboardView extends javax.swing.JFrame {

    public DashboardView() {
        initComponents();
        this.setTitle("Dashboard");
        setLocationRelativeTo(null);
        Tools obj=new Tools();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        searchBtn = new javax.swing.JButton();
        bookTicketsBtn = new javax.swing.JButton();
        viewTicketsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchBtn.setBackground(new java.awt.Color(0, 51, 255));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search Bus");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 233, 55));

        bookTicketsBtn.setBackground(new java.awt.Color(0, 51, 255));
        bookTicketsBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookTicketsBtn.setForeground(new java.awt.Color(255, 255, 255));
        bookTicketsBtn.setText("Book Tickets");
        bookTicketsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTicketsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(bookTicketsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 233, 55));

        viewTicketsBtn.setBackground(new java.awt.Color(0, 51, 255));
        viewTicketsBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewTicketsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewTicketsBtn.setText("View Booked tickets");
        viewTicketsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTicketsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewTicketsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 233, 55));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 650, 680));

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");

        jMenuItem1.setText("Add Bus");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        SearchBusView newWindow=new SearchBusView();
        newWindow.setVisible(true);
        newWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void bookTicketsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTicketsBtnActionPerformed
        BookTicketView newWindow=new BookTicketView();
        newWindow.setVisible(true);
        newWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_bookTicketsBtnActionPerformed

    private void viewTicketsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTicketsBtnActionPerformed
        BookedTicketView newWindow=new BookedTicketView();
        newWindow.setVisible(true);
        newWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_viewTicketsBtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       AddBusView obj=new AddBusView();
       obj.setVisible(true);
       obj.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookTicketsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton viewTicketsBtn;
    // End of variables declaration//GEN-END:variables
}
