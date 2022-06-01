package View;

import Control.BookedTicketControl;
import Model.TicketService;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

public class BookedTicketView extends javax.swing.JFrame {

    public BookedTicketView() {
        initComponents();
        this.setTitle("Booked Tickets");
        setLocationRelativeTo(null);
        fillBookedTicketTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookedTicketsTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        bookTicketBtn = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        searchBusBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        busNumberTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Booked Tickets");

        bookedTicketsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Reference", "Bus Number", "Number of Tickets"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bookedTicketsTable);

        jLabel4.setBackground(new java.awt.Color(255, 255, 153));
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("shortcuts :");

        bookTicketBtn.setText("Book tickets");
        bookTicketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTicketBtnActionPerformed(evt);
            }
        });

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        searchBusBtn.setText("Search bus");
        searchBusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBusBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Bus Number : ");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookTicketBtn)
                        .addGap(18, 18, 18)
                        .addComponent(homeButton)
                        .addGap(18, 18, 18)
                        .addComponent(searchBusBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(300, 300, 300)
                                    .addComponent(jLabel1)
                                    .addGap(55, 55, 55)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(busNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(busNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bookTicketBtn)
                    .addComponent(homeButton)
                    .addComponent(searchBusBtn))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fillBookedTicketTable(){
        BookedTicketControl obj=new BookedTicketControl();
        obj.fillTableData(bookedTicketsTable);
    }
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        
    }//GEN-LAST:event_homeButtonActionPerformed

    private void searchBusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBusBtnActionPerformed
        SearchBusView newWindow = new SearchBusView();
        newWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        newWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searchBusBtnActionPerformed

    private void bookTicketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTicketBtnActionPerformed
        BookTicketView newWindow = new BookTicketView();
        newWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        newWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bookTicketBtnActionPerformed

        BookedTicketControl obj=new BookedTicketControl();
    
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        int busNumber=Integer.valueOf(busNumberTxt.getText());
        try{
                if(obj.contains(busNumber)){
                    TicketService.Ticket displayObj=obj.displaySearchedTicket(busNumber);
                    String ticket="Reference : "+displayObj.getReference() + "\nBus Number :  " + displayObj.getBusNumber() + "\nNumber of Tickets :  " + displayObj.getNuOfTickets();
                    JOptionPane.showMessageDialog(rootPane, ticket,"Booked Ticket", HEIGHT);
                }
                else if(!obj.contains(busNumber)){
                    JOptionPane.showMessageDialog(null, "Error no tickets found !");
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error invalid entry !");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BookedTicketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookedTicketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookedTicketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookedTicketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookedTicketView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookTicketBtn;
    private javax.swing.JTable bookedTicketsTable;
    private javax.swing.JTextField busNumberTxt;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton searchBusBtn;
    // End of variables declaration//GEN-END:variables
}
