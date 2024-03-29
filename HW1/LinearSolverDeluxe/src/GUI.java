import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 * This class represent user interface of
 * Linear Solver Deluxe program.
 * @author efkandurakli
 */
public class GUI extends javax.swing.JFrame {




    private JButton submit = new JButton();
    private double[][] A;
    private double[] b;
    private JTextField[][] fields;
    private int row;
    private int column;
    private JComboBox<String> selectMethodComboBox = new JComboBox(new String[] {"Gaussian Elimination","Matrix Inversion"});
    private JButton backButton = new JButton();
    private LinearSolver linearSolver;





    /**
     * Creates new form Jframe
     */
    public GUI() {
        initComponents();
        jPanel2.setVisible(false);
        jScrollPane2.setVisible(false);
        setVisible(true);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SubmitActionPerformed(e);
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                jPanel2.removeAll();
                jScrollPane2.setVisible(false);
                jPanel2.setVisible(false);
                SelectSystemSizePanel.setVisible(true);

                for (int i = 0; i < row; ++i) {
                    for (int j = 0; j < column; ++j) {
                        fields[i][j].setText("");
                    }
                }
            }
        });



    }    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelectSystemSizePanel = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        equationsLabel = new java.awt.Label();
        unknownsLabel = new java.awt.Label();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        button1 = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("Please select size of system and click SUBMIT button");

        equationsLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        equationsLabel.setText("*  Number of equation   : m =");

        unknownsLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        unknownsLabel.setText("*  Number of unknowns : n =");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setMaximumRowCount(20);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setMaximumRowCount(20);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBox2.setToolTipText("");
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        button1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button1.setLabel("SUBMIT");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SelectSystemSizePanelLayout = new javax.swing.GroupLayout(SelectSystemSizePanel);
        SelectSystemSizePanel.setLayout(SelectSystemSizePanelLayout);
        SelectSystemSizePanelLayout.setHorizontalGroup(
                SelectSystemSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SelectSystemSizePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(SelectSystemSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(SelectSystemSizePanelLayout.createSequentialGroup()
                                                .addGroup(SelectSystemSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(equationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(unknownsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35)
                                                .addGroup(SelectSystemSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(SelectSystemSizePanelLayout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(296, Short.MAX_VALUE))
        );
        SelectSystemSizePanelLayout.setVerticalGroup(
                SelectSystemSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SelectSystemSizePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(SelectSystemSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(equationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(SelectSystemSizePanelLayout.createSequentialGroup()
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addGroup(SelectSystemSizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(unknownsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(65, 65, 65)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(354, Short.MAX_VALUE))
        );

        jComboBox1.getAccessibleContext().setAccessibleName("");
        jComboBox1.getAccessibleContext().setAccessibleDescription("");

        jPanel2.setPreferredSize(new java.awt.Dimension(2200, 500));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 681, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(SelectSystemSizePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(SelectSystemSizePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(88, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        String m = (String)jComboBox1.getSelectedItem();
        String n = (String)jComboBox2.getSelectedItem();
        Integer numberOfEquations =Integer.parseInt(m);
        Integer numberOfUnknowns =Integer.parseInt(n);
        row = numberOfEquations;
        column = numberOfUnknowns + 1;

        if (numberOfEquations != numberOfUnknowns) {
            JOptionPane.showMessageDialog(null, "Existing methods work only square matrix.", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }


        SelectSystemSizePanel.setVisible(false);
        jScrollPane2.setVisible(true);
        fields = new JTextField[row][column];
        jPanel2.setBackground(Color.YELLOW);
        jPanel2.setVisible(true);
        this.setResizable(true);
        fields = new JTextField[row][column];
        for (int i = 0; i < row; ++i)
            fields[i] = new JTextField[column];
        for (int i = 0; i < row; ++i)
            for (int j = 0; j < column; ++j) {

                JLabel label = new JLabel();
                fields[i][j] = new JTextField();
                fields[i][j].setSize(new Dimension(50, 25));
                fields[i][j].setVisible(true);
                label.setVisible(true);
                label.setSize(50, 25);
                if (j == column - 2) {
                    label.setText("X" + (j+1) + " =");
                }
                else if (j != column - 1)
                    label.setText("X" + (j+1) + " +");
                fields[i][j].setLocation((j)*50 + (j+1)*5 + j*50, (i)*25 + (i+1)*5);
                label.setLocation((j+1)*50 + (j + 1)*5 + j*50, (i)*25 + (i+1)*5);
                jPanel2.add(fields[i][j]);
                jPanel2.add(label);
            }
        submit.setVisible(true);
        submit.setSize(90,40);
        backButton.setSize(90,40);
        backButton.setVisible(true);
        selectMethodComboBox.setSize(150, 35);
        selectMethodComboBox.setVisible(true);
        submit.setText("SOLVE");
        backButton.setText("BACK");
        backButton.setLocation(5 + 400 ,30*(row+1)- 10);
        submit.setLocation(5 + 500,30*(row+1)-10);
        selectMethodComboBox.setLocation(5,30*(row+1)-6);
        jPanel2.add(submit);
        jPanel2.add(backButton);
        jPanel2.add(selectMethodComboBox);
        A = new double[row][column-1];
        b = new double[row];


    }//GEN-LAST:event_button1ActionPerformed
    //ikinci paneldeki submit butonu
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                if (fields[i][j].getText() == null || fields[i][j].getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the all coefficients", "Warining", JOptionPane.WARNING_MESSAGE);
                    return;

                }
            }
        }


        try {
            for (int i = 0; i < row; ++i) {
                b[i] = Double.parseDouble(fields[i][column-1].getText());
                for (int j = 0; j < column-1; ++j) {
                    A[i][j] = Double.parseDouble(fields[i][j].getText());
                }
            }
            if (selectMethodComboBox.getSelectedItem().equals("Gaussian Elimination"))
                linearSolver = new LinearSolver(new SolveWithGaussianElimination());
            else
                linearSolver = new LinearSolver(new SolveWithMatrixInversion());


            submit.setEnabled(false);

            double x[] = linearSolver.solve(A, b);

            submit.setEnabled(true);
            jPanel2.removeAll();

            jPanel2.setVisible(false);


            for (int i = 0; i < row; ++i) {
                JLabel label = new JLabel();
                label.setText(("X" + (i+1) + "  =  " + x[i]));
                label.setVisible(true);
                label.setSize(250, 30);
                label.setLocation(100, (i+2)*label.getHeight());
                jPanel2.add(label);
            }

            jScrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

            JLabel title = new JLabel();
            title.setText("SOLUTION OF THIS EQUATION");
            title.setSize(250,50);
            title.setLocation(100,20);
            jPanel2.add(title);
            jPanel2.setVisible(true);

        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter the acoefficients as number", "Warning!", JOptionPane.WARNING_MESSAGE);
            submit.setEnabled(true);


        } catch(ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Solution does not exist for this equation", "Error", JOptionPane.ERROR_MESSAGE);
            submit.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unexpected error Occured in system", "Error", JOptionPane.ERROR_MESSAGE);
            submit.setEnabled(true);
        }



    }
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SelectSystemSizePanel;
    private java.awt.Button button1;
    private java.awt.Label equationsLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label unknownsLabel;
    // End of variables declaration//GEN-END:variables
}
