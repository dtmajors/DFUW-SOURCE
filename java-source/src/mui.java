/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import org.jdesktop.layout.GroupLayout;

public class mui
extends JInternalFrame {
    private JLabel I;

    public mui() {
        this.b();
    }

    private void b() {
        this.I = new JLabel();
        this.I.setText("jLabel1");
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.I).addContainerGap(350, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.I).addContainerGap(253, Short.MAX_VALUE)));
        this.pack();
    }
}

