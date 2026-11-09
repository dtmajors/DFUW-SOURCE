/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class mry
extends JInternalFrame {
    protected JList Eoq;
    protected JScrollPane Eor;
    protected JButton Eos;
    protected JPanel Eiv;
    protected JList DHd;
    protected JScrollPane Eiw;
    protected JButton qtf;
    protected JTextField Eot;

    public mry() {
        this.b();
    }

    private void b() {
        this.Eiv = new JPanel();
        this.Eiw = new JScrollPane();
        this.DHd = new JList();
        this.Eot = new JTextField();
        this.qtf = new JButton();
        this.Eor = new JScrollPane();
        this.Eoq = new JList();
        this.Eos = new JButton();
        this.Eiw.setViewportView(this.DHd);
        this.Eot.addActionListener(new ActionListener(this){
            final /* synthetic */ mry Eou;
            {
                this.Eou = mry2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mry.a(this.Eou, actionEvent);
            }
        });
        this.qtf.setText("Search");
        this.Eor.setViewportView(this.Eoq);
        this.Eos.setText("Erase");
        GroupLayout groupLayout = new GroupLayout(this.Eiv);
        this.Eiv.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(this.Eot, -1, 205, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.qtf)).addComponent(this.Eiw, -1, 276, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Eos, GroupLayout.Alignment.TRAILING).addComponent(this.Eor, -1, 439, Short.MAX_VALUE)).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(11, 11, 11).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Eot, -2, -1, -2).addComponent(this.qtf)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Eiw, -1, 408, Short.MAX_VALUE).addComponent(this.Eor, -1, 408, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Eos).addGap(11, 11, 11)));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Eiv, -1, -1, Short.MAX_VALUE));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addComponent(this.Eiv, -1, -1, Short.MAX_VALUE).addContainerGap()));
        this.pack();
    }

    private void cb(ActionEvent actionEvent) {
    }

    static /* synthetic */ void a(mry mry2, ActionEvent actionEvent) {
        mry2.cb(actionEvent);
    }
}

