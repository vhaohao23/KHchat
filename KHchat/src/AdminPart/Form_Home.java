
package AdminPart;

import javax.swing.ImageIcon;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
    initComponents();
    card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/AdminImage/cloudw.png")), "Total accounts registered", "1000", "Increased by 70%"));
    card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/AdminImage/user.png")), "Number of active users", "700", "Increased by 70%"));
    card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/AdminImage/blockuser.png")), "Number of banned users", "300", "Decreased by 30%"));
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new AdminPart.Card();
        card2 = new AdminPart.Card();
        card3 = new AdminPart.Card();
        panelBorder1 = new AdminPart.PanelBorder();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 246, 246));

        panel.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        card1.setColor1(new java.awt.Color(37, 33, 94));
        card1.setColor2(new java.awt.Color(255, 204, 204));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(37, 33, 94));
        card2.setColor2(new java.awt.Color(255, 204, 204));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(37, 33, 94));
        card3.setColor2(new java.awt.Color(255, 204, 204));
        panel.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(89, 89, 89));
        jLabel1.setText("Statistical Table");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private AdminPart.Card card1;
    private AdminPart.Card card2;
    private AdminPart.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    private AdminPart.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
