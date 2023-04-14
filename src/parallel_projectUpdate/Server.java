/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parallel_project;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Server extends javax.swing.JFrame {
    
    public Server() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 370));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Transactions");

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel1)))
                        .addGap(0, 154, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.show();
        dispose();
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    
   static ArrayList<DataInputStream> input = new ArrayList<DataInputStream>();   
    static ArrayList<DataOutputStream> output = new ArrayList<DataOutputStream>();   


    public static void main(String args[]) throws IOException {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });

             String sentencefromclient;
             ServerSocket ss =new ServerSocket(9999);     
             
             
             // menna
             Socket client1 = ss.accept();
             DataInputStream client1Input = new DataInputStream(client1.getInputStream());
             DataOutputStream client1Output = new DataOutputStream(client1.getOutputStream());
             input.add(client1Input);
             output.add(client1Output);
             
             // mariem
             Socket client2 = ss.accept();
             DataInputStream client1Input2 = new DataInputStream(client2.getInputStream());
             DataOutputStream client2Output = new DataOutputStream(client2.getOutputStream());
             input.add(client1Input2);
             output.add(client2Output);
             
             //yasmin
             Socket client3 = ss.accept();
             DataInputStream client1Input3 = new DataInputStream(client3.getInputStream());
             DataOutputStream client3Output = new DataOutputStream(client3.getOutputStream()); 
             input.add(client1Input3);
             output.add(client3Output);

             while(true)
             {
//                 
                 for(int i = 0; i < input.size();i++){
                     if(input.get(i).available() > 0){
                     sentencefromclient = input.get(i).readUTF();
                     String[] commands = sentencefromclient.split(" ");
                     String toDo = commands[0];
                     if(toDo.equals("transfer")){
                     String from = commands[1];                  
                     String to = commands[2]; 
                     String amount = commands[3];
                     
                     if(to.equals("Yasmeen")){
                         // talk to yasmeen
                         DataOutputStream outClient3 = output.get(2);
                         outClient3.writeUTF(amount);    
                         txtarea.setText(txtarea.getText().trim()+"\n"+ from + " sent " + amount + " to " + to ); 
                     }else if (to.equals("Mariam")){
                         // talk to maryam
                         DataOutputStream outClient2 = output.get(1);
                         outClient2.writeUTF(amount);    
                         txtarea.setText(txtarea.getText().trim()+"\n"+ from + " sent " + amount + " to " + to ); 
                     }else if (to.equals("Menna")){
                         // talk to Menna
                         DataOutputStream outClient1 = output.get(0);
                         outClient1.writeUTF(amount);    
                         txtarea.setText(txtarea.getText().trim()+"\n"+ from + " sent " + amount + " to " + to );
                     }
                     }else if (toDo.equals("deposit")){
                         String clientName = commands[1];                  
                        String amount = commands[2];
                       txtarea.setText(txtarea.getText().trim()+"\n"+ clientName + " deposited to his/her account "+ amount );

                     }else if (toDo.equals("withdraw")){
                    String clientName = commands[1];                  
                        String amount = commands[2];
                       txtarea.setText(txtarea.getText().trim()+"\n"+ clientName + " withdrew from his/her account "+ amount );

                     }

                 }
                 }

//                 
             } 
             
             
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
