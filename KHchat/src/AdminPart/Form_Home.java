
package AdminPart;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
    initComponents();
    card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/AdminImage/cloudw.png")), "Total accounts registered", "1000", "Increased by 70%"));
    card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/AdminImage/user.png")), "Number of active users", "700", "Increased by 70%"));
    card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/AdminImage/blockuser.png")), "Number of banned users", "300", "Decreased by 30%"));
    // add row table
    spTable.setVerticalScrollBar(new ScollBar());
    spTable.getVerticalScrollBar().setBackground(Color.WHITE);
    spTable.getViewport().setBackground(Color.WHITE);
    JPanel p = new JPanel();
    p.setBackground(Color.WHITE);
    spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    table.addRow(new Object[] {"A", "Văn", "Nguyễn", "2000-03-15", "male", "Vietnam", "987654321", "nguyenvana1503@gmail.com", "nguyenvana1503", "15031503", StatusType.ACTIVE});
    table.addRow(new Object[] {"A", "Văn", "Nguyễn", "2000-03-15", "male", "Vietnam", "987654321", "nguyenvana1503@gmail.com", "nguyenvana1503", "15031503", StatusType.ACTIVE});
    table.addRow(new Object[] {"A", "Văn", "Nguyễn", "2000-03-15", "male", "Vietnam", "987654321", "nguyenvana1503@gmail.com", "nguyenvana1503", "15031503", StatusType.ACTIVE});
    table.addRow(new Object[] {"A", "Văn", "Nguyễn", "2000-03-15", "male", "Vietnam", "987654321", "nguyenvana1503@gmail.com", "nguyenvana1503", "15031503", StatusType.ACTIVE});
    table.addRow(new Object[] {"A", "Văn", "Nguyễn", "2000-03-15", "male", "Vietnam", "987654321", "nguyenvana1503@gmail.com", "nguyenvana1503", "15031503", StatusType.ACTIVE});
    table.addRow(new Object[] {"A", "Văn", "Nguyễn", "2000-03-15", "male", "Vietnam", "987654321", "nguyenvana1503@gmail.com", "nguyenvana1503", "15031503", StatusType.ACTIVE});
    table.addRow(new Object[] {"A", "Văn", "Nguyễn", "2000-03-15", "male", "Vietnam", "987654321", "nguyenvana1503@gmail.com", "nguyenvana1503", "15031503", StatusType.ACTIVE});
    table.addRow(new Object[] {"A", "Văn", "Nguyễn", "2000-03-15", "male", "Vietnam", "987654321", "nguyenvana1503@gmail.com", "nguyenvana1503", "15031503", StatusType.ACTIVE});
    table.addRow(new Object[] {"A", "Văn", "Nguyễn", "2000-03-15", "male", "Vietnam", "987654321", "nguyenvana1503@gmail.com", "nguyenvana1503", "15031503", StatusType.ACTIVE});
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
        spTable = new javax.swing.JScrollPane();
        table = new AdminPart.Table();

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
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Statistical Table");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Middle Name", "Last Name", "Date of Birth", "Gender", "Country", "Phone Mobile", "Email", "Password", "Conform Code", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        spTable.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(7).setMinWidth(100);
            table.getColumnModel().getColumn(8).setMinWidth(100);
        }

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(747, 747, 747))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private AdminPart.Card card1;
    private AdminPart.Card card2;
    private AdminPart.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    private AdminPart.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private AdminPart.Table table;
    // End of variables declaration//GEN-END:variables
}
