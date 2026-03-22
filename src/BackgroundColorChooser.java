import javax.swing.JFrame;

/**
 *
 * @author NCRK (नवीन चौहान राजपूत खरदौनी)
 */
class BackgroundColorChooser extends javax.swing.JDialog {

    // Variables declaration - do not modify
    private javax.swing.JButton       jButton1;
    private javax.swing.JButton       jButton2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel        jLabel1;
    private javax.swing.JPanel        jPanel1;

    // End of variables declaration

    private final JFrame1             outer;

    public BackgroundColorChooser(JFrame f, final JFrame1 outer) {
        super(f, "Background Color Chooser", false);
        this.outer = outer;
        initComponents();
    }

    @SuppressWarnings(value = "unchecked")
    private void initComponents() {
        jPanel1        = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton1       = new javax.swing.JButton();
        jButton2       = new javax.swing.JButton();
        jLabel1        = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);

        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(
                    jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 613,
                    javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(57, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel1Layout.createSequentialGroup().addContainerGap(
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(
                    jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 305,
                    javax.swing.GroupLayout.PREFERRED_SIZE).addGap(23, 23, 23)));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18));    // NOI18N
        jLabel1.setText("Choose color and click OK to apply otherwise CANCEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                layout.createSequentialGroup().addGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                        javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup().addContainerGap().addComponent(
                            jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE)).addGroup(
                                layout.createSequentialGroup().addGap(183, 183, 183).addComponent(jButton1).addGap(
                                    142, 142, 142).addComponent(jButton2).addGap(
                                    0, 0, Short.MAX_VALUE))).addContainerGap()).addGroup(
                                        layout.createSequentialGroup().addGap(139, 139, 139).addComponent(
                                            jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445,
                                                javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(
                                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                layout.createSequentialGroup().addContainerGap().addComponent(
                    jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
                    18, 18, 18).addComponent(
                    jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE).addGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(
                            jButton1).addComponent(jButton2)).addGap(26, 26, 26)));
        pack();
    }    // </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        outer.getPro().setBgcolor(jColorChooser1.getColor());

        for (int temp = 0; temp <= outer.getI(); temp++) {
            outer.jTextArea[temp].setBackground(outer.getPro().getBgcolor());
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
