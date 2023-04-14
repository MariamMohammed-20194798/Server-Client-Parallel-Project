/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parallel_project;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.NullPointerException;
/**
 *
 * @author Mariam
 */
public class Mariam extends javax.swing.JFrame {

     static Socket s;
     static BufferedReader br ;
     static DataOutputStream outToServer;
     static DataInputStream in;
    
    static double balance=500;
    static double withdrawLimit = 0;
     
    public Mariam() {
        initComponents();
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Client1");
        setResizable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jFrame5 = new javax.swing.JFrame();
        jFrame6 = new javax.swing.JFrame();
        jFrame7 = new javax.swing.JFrame();
        jFrame8 = new javax.swing.JFrame();
        jFrame9 = new javax.swing.JFrame();
        btnWithdraw = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame5Layout = new javax.swing.GroupLayout(jFrame5.getContentPane());
        jFrame5.getContentPane().setLayout(jFrame5Layout);
        jFrame5Layout.setHorizontalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame5Layout.setVerticalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame6Layout = new javax.swing.GroupLayout(jFrame6.getContentPane());
        jFrame6.getContentPane().setLayout(jFrame6Layout);
        jFrame6Layout.setHorizontalGroup(
            jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame6Layout.setVerticalGroup(
            jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame7Layout = new javax.swing.GroupLayout(jFrame7.getContentPane());
        jFrame7.getContentPane().setLayout(jFrame7Layout);
        jFrame7Layout.setHorizontalGroup(
            jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame7Layout.setVerticalGroup(
            jFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame8Layout = new javax.swing.GroupLayout(jFrame8.getContentPane());
        jFrame8.getContentPane().setLayout(jFrame8Layout);
        jFrame8Layout.setHorizontalGroup(
            jFrame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame8Layout.setVerticalGroup(
            jFrame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame9Layout = new javax.swing.GroupLayout(jFrame9.getContentPane());
        jFrame9.getContentPane().setLayout(jFrame9Layout);
        jFrame9Layout.setHorizontalGroup(
            jFrame9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame9Layout.setVerticalGroup(
            jFrame9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 51, 102));
        setForeground(java.awt.Color.blue);
        setLocation(new java.awt.Point(0, 0));

        btnWithdraw.setBackground(new java.awt.Color(0, 0, 0));
        btnWithdraw.setForeground(new java.awt.Color(255, 255, 255));
        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        btnDeposit.setBackground(new java.awt.Color(0, 0, 0));
        btnDeposit.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnCheck.setBackground(new java.awt.Color(0, 0, 0));
        btnCheck.setForeground(new java.awt.Color(255, 255, 255));
        btnCheck.setText("Check Balance");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnTransfer.setBackground(new java.awt.Color(0, 0, 0));
        btnTransfer.setForeground(new java.awt.Color(255, 255, 255));
        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(0, 0, 0));
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Welcome, Mariam");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
         
         String with = JOptionPane.showInputDialog("Enter Withdraw Value");
         int withdraw = Integer.parseInt(with);
         
          
           if(withdrawLimit + withdraw <= 7000)
          {
      
            if (withdraw <= balance)
            {               
                 
                try {
                    double newAmount = balance - withdraw;
                    JOptionPane.showMessageDialog(msgPanel, "You withdraw "+withdraw+" EGP\nYour new balance is: "+newAmount+" EGP");
                    withdrawLimit += withdraw;
                    balance=newAmount;
                    String sentencetoserver = "withdraw Mariam "+ withdraw;
                    outToServer.writeUTF(sentencetoserver);
                } catch (IOException ex) {
                    Logger.getLogger(Mariam.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
             else 
            {              
                JOptionPane.showMessageDialog(msgPanel, "Your balance is not enough for withdrawal");
            }
          }
           else
           {
                JOptionPane.showMessageDialog(msgPanel, "You cant withdraw more than 7000 EGP"); 
           }
          
          
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        
      
        String dep = JOptionPane.showInputDialog("Enter deposit amount: ");
       
        double newBalance = balance+Integer.parseInt(dep);
        
        JOptionPane.showMessageDialog(msgPanel,"You deposit: "+dep+ " EGP\nYour new Balance is "+ newBalance+" EGP");
        
        balance = newBalance;
        
        
         try{
             
             String sentencetoserver = "deposit Mariam "+ dep ;
             outToServer.writeUTF(sentencetoserver);
             
         }catch(Exception e)
         {
             
         }
        
                    
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        
         JOptionPane.showMessageDialog(msgPanel,"Your account balance is : "+balance+" EGP");
         
         try{
             
             String sentencetoserver = "Mariam checked her balance";
             outToServer.writeUTF(sentencetoserver);
             
         }catch(Exception e)
         {
             
         }
      
         
        
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
       
        String tr = JOptionPane.showInputDialog("Enter account number to transfer: ");
        int trans = Integer.parseInt(tr);
        String am = JOptionPane.showInputDialog("Enter amount you need to transfer: ");
        int transferAmount = Integer.parseInt(am);
        
        if(transferAmount<=balance)
        {
            if(trans == 3333)
            {
                try {
                    outToServer.writeUTF("transfer Mariam Yasmeen " + am);
                    balance -= Double.parseDouble(am);
                } catch (IOException ex) {
                    Logger.getLogger(Mariam.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
            }
            else if(trans == 1111)
            {
                try {
                    outToServer.writeUTF("transfer Mariam Menna " + am);
                    balance -= Double.parseDouble(am);  
                } catch (IOException ex) {
                    Logger.getLogger(Mariam.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
             JOptionPane.showMessageDialog(msgPanel,"Invalid account number");  
            }
        
        }
        else
        {
            JOptionPane.showMessageDialog(msgPanel, "Your balance is not enough for withdrawal");
        }
        
    }//GEN-LAST:event_btnTransferActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
       
        
        Login l = new Login();
        l.show();
        dispose();
        
    }//GEN-LAST:event_btnbackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static  void main(String args[]) throws IOException {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mariam().setVisible(true);
            }
        });
        
         s = new Socket("localhost", 9999); 
         outToServer = new DataOutputStream(s.getOutputStream());
         in = new DataInputStream(s.getInputStream());
         br = new BufferedReader(new InputStreamReader(System.in)); 
        
         while(true)
        {
           String amount = in.readUTF(); 
           balance += Double.parseDouble(amount);   
        }
        
    
        
      
    }
private static javax.swing.JPanel msgPanel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JButton btnback;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JFrame jFrame6;
    private javax.swing.JFrame jFrame7;
    private javax.swing.JFrame jFrame8;
    private javax.swing.JFrame jFrame9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
