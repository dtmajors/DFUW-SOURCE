/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  bvf
 *  lcr
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;

public class mmt
extends JPanel {
    private JCheckBox DNI;
    private JButton DNJ;
    private JTextField DJg;
    private JLabel I;
    private eh DNK = null;
    private aux DEC;
    private amf DNl;
    private String DNL = "xml/other/attachpoint_marker.xml";
    private ldv DNn = null;
    private ldv gte = null;
    private boolean cri = true;

    public mmt() {
        this.b();
    }

    public mmt(amf amf2, eh eh2, aux aux2) {
        this.DEC = aux2;
        this.DNl = amf2;
        this.DNK = eh2;
        this.b();
        this.c();
    }

    private void b() {
        this.I = new JLabel();
        this.DJg = new JTextField();
        this.DNJ = new JButton();
        this.DNI = new JCheckBox();
        this.setBorder(BorderFactory.createEtchedBorder());
        this.I.setText("Name:");
        this.DJg.setEditable(false);
        this.DNJ.setText("Edit..");
        this.DNJ.addActionListener(new ActionListener(this){
            final /* synthetic */ mmt DNM;
            {
                this.DNM = mmt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmt.a(this.DNM, actionEvent);
            }
        });
        this.DNI.setText("AttachObject");
        this.DNI.addActionListener(new ActionListener(this){
            final /* synthetic */ mmt DNM;
            {
                this.DNM = mmt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmt.b(this.DNM, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.I).addGap(10, 10, 10).addComponent(this.DJg, -1, 468, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DNI).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DNJ).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.DNJ).addComponent(this.DNI).addComponent(this.DJg, -2, -1, -2)));
    }

    private void ax(ActionEvent actionEvent) {
        if (this.DNI.isSelected()) {
            this.eFA();
        } else {
            this.eFG();
        }
    }

    private void ay(ActionEvent actionEvent) {
        if (this.DNK != null) {
            mmu mmu2 = new mmu(this.DNl, this.DNK, this.gte, this.DNL, this.DEC);
            this.DEC.eCu().add(mmu2);
            mmu2.setVisible(true);
        }
    }

    private void c() {
        this.DJg.setText(this.DNK.getName());
        if (this.DNl instanceof bvf) {
            String[] stringArray = ((bvf)this.DNl).azG();
            boolean bl = false;
            int n = stringArray.length;
            for (int i = 0; i < n; ++i) {
                if (!stringArray[i].equals(this.DNK.getFrameName())) continue;
                bl = true;
                break;
            }
            this.DJg.setBackground(Color.WHITE);
            if (!bl && this.DNK.fa() == 0) {
                this.DNI.setEnabled(false);
                this.DJg.setBackground(Color.RED);
                String string = "Invalid AttachPoint. Needs valid FrameName, or change Type. Name = " + this.DNK.getName() + ", FrameName = " + this.DNK.getFrameName();
                lfn.b(5, this.getClass().getSimpleName(), "initDialog() : " + string);
                this.cri = false;
                haz haz2 = (haz)this.DEC.d(4098);
                haz2.lU(string);
                haz2.setMessageType(2);
                haz2.mT(false);
                this.DEC.b(haz2);
            }
        }
    }

    public void zn(boolean bl) {
        if (!this.cri) {
            lfn.b(0, this.getClass().getSimpleName(), "setSelected() : Cannot attach witt Attachpoint [" + this.DNK.getName() + "]. Not Valid!");
            return;
        }
        SwingUtilities.invokeLater(new Runnable(this, bl){
            final /* synthetic */ boolean DNN;
            final /* synthetic */ mmt DNM;
            {
                this.DNM = mmt2;
                this.DNN = bl;
            }

            public void run() {
                if (this.DNN && !mmt.a(this.DNM).isSelected()) {
                    mmt.a(this.DNM).doClick();
                } else if (!this.DNN && mmt.a(this.DNM).isSelected()) {
                    mmt.a(this.DNM).doClick();
                }
                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        });
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void eFA() {
        this.DNn = this.DEC.bzv();
        hac hac2 = (hac)this.DEC.d(4097);
        hac2.on(lcr.qAE);
        hac2.f(lcr.qzr);
        hac2.Lb(1);
        hac2.setFileName(this.DNL);
        hac2.hC(this.DNn);
        hac2.li(false);
        hac2.jxl = false;
        this.DEC.a((dxq)hac2);
        try {
            Thread.sleep(50L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
            return;
        }
        if (this.DNn == null) {
            JOptionPane.showInternalMessageDialog(this, "An Attachable Object Must be selected!", "Error: No Attachable Object", 0);
            return;
        }
        if (this.gte != null) {
            JOptionPane.showInternalMessageDialog(this, "Item already attached to this Attachpoint!", "Error: Could not Attach Item", 0);
            return;
        }
        if (!this.DNn.equals(this.DNl.getGUID())) {
            this.gte = this.DEC.bzv();
            hac2 = (gzx)this.DEC.d(4112);
            if (this.DNK.fa() == 0) {
                ((gzx)hac2).KZ(5);
            } else if (this.DNK.fa() == 1) {
                ((gzx)hac2).KZ(64);
                ((gzx)hac2).mu(true);
            } else assert (false) : "Invalid AttachpointType = " + this.DNK.fa();
            hac2.on(this.DNl.getGUID());
            hac2.f(lcr.qzr);
            ((gzx)hac2).qJ(this.DNl.getGUID());
            ((gzx)hac2).qI(this.DNn);
            ((gzx)hac2).setAttachPointName("");
            ((gzx)hac2).setFrameName(this.DNK.getFrameName());
            hac2.setRotation(this.DNK.getRotation());
            ((gzx)hac2).K(this.DNK.fb());
            ((gzx)hac2).kX(this.gte);
            ((gzx)hac2).ac(this.DNK.fa());
            this.DEC.a((dxq)hac2);
        } else {
            lfn.b(4, this.getClass().getName(), "attachItemButton_ActionPerformed() : Could not Attach Item. ");
        }
    }

    public void eFG() {
        if (this.gte == null) {
            lfn.b(4, this.getClass().getSimpleName(), "detachItemButton_ActionPerformed() : Nothing attached!");
            return;
        }
        if (this.DNn != null && !this.DNn.equals(this.DNl.getGUID())) {
            gzx gzx2 = (gzx)this.DEC.d(4112);
            if (this.DNK.fa() == 0) {
                gzx2.KZ(2);
            } else if (this.DNK.fa() == 1) {
                gzx2.KZ(1);
            } else assert (false);
            gzx2.on(this.DNl.getGUID());
            gzx2.f(lcr.qzr);
            gzx2.qJ(this.DNl.getGUID());
            gzx2.qI(this.DNn);
            gzx2.setAttachPointName("");
            gzx2.setFrameName(this.DNK.getFrameName());
            gzx2.setRotation(new ljq());
            gzx2.K(new ljq());
            gzx2.kX(this.gte);
            gzx2.ac(this.DNK.fa());
            this.DEC.a((dxq)gzx2);
            this.gte = null;
            try {
                Thread.sleep(20L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                return;
            }
            haf haf2 = (haf)this.DEC.d(4101);
            haf2.Lf(2);
            haf2.hC(this.DNn);
            this.DEC.a((dxq)haf2);
            this.DNn = null;
        } else {
            JOptionPane.showInternalMessageDialog(this, "An Attachable Object Must be selected!", "Error: No Attachable Object", 0);
        }
    }

    @Override
    public boolean isValid() {
        return this.cri;
    }

    public void zo(boolean bl) {
        this.cri = bl;
    }

    public String eFH() {
        return this.DNL;
    }

    public void CC(String string) {
        this.DNL = string;
    }

    public boolean isSelected() {
        return this.DNI.isSelected();
    }

    eh GP() {
        return this.DNK;
    }

    static /* synthetic */ void a(mmt mmt2, ActionEvent actionEvent) {
        mmt2.ay(actionEvent);
    }

    static /* synthetic */ void b(mmt mmt2, ActionEvent actionEvent) {
        mmt2.ax(actionEvent);
    }

    static /* synthetic */ JCheckBox a(mmt mmt2) {
        return mmt2.DNI;
    }
}

