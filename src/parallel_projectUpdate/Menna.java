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
 * @author Menna
 */
public class Menna extends javax.swing.JFrame {
     static Socket s;
     static BufferedReader br ;
     static DataOutputStream outToServer;
     static DataInputStream in;
    
     static double balance=500;
     static double withdrawLimit = 0;
     

     
     
    
    public Menna() throws IOException {
        initComponents();
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Client2");
        setResizable(true);
        setVisible(true);
        
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnWithdraw = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        btnback.setActionCommand("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Welcome, Menna");

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
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE)
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
                        .addGap(145, 145, 145)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 123, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
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
                    String sentencetoserver = "withdraw Menna "+ withdraw ;
                    outToServer.writeUTF(sentencetoserver);
                } catch (IOException ex) {
                    Logger.getLogger(Menna.class.getName()).log(Level.SEVERE, null, ex);
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
             
             String sentencetoserver = "deposit Menna "+ dep ;
             outToServer.writeUTF(sentencetoserver);
             
         }catch(Exception e)
         {
             
         }
        
                    
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        
         JOptionPane.showMessageDialog(msgPanel,"Your account balance is : "+balance+" EGP");
         
         try{
             
             String sentencetoserver = "Menna checked her balance";
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
        
        System.out.println(trans);
        
        if(transferAmount<=balance)
        {
            // send to yasemeen
            if(trans == 3333)
            {
                        System.out.println("done");

                try {
                    outToServer.writeUTF("transfer Menna Yasmeen " + am);
                    balance -= Double.parseDouble(am);
                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(Menna.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            // send to mariam
            else if(trans == 2222)
            {
                try {
                    outToServer.writeUTF("transfer Menna Mariam " + am);
                    balance -= Double.parseDouble(am);

                } catch (IOException ex) {
                    Logger.getLogger(Menna.class.getName()).log(Level.SEVERE, null, ex);
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
       
        
                 java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        new Menna().setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
                    
                    
                        
         Socket s = new Socket("localhost", 9999); 
         outToServer = new DataOutputStream(s.getOutputStream());
         in = new DataInputStream(s.getInputStream());
         br = new BufferedReader(new InputStreamReader(System.in)); 
         System.out.print("2");

            
         while(true)
        {
           System.out.print("3");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
