/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  bvf
 *  dqk
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public class mmu
extends JInternalFrame {
    private JCheckBox DNO;
    private JTextField DNP;
    private JTextField DNQ;
    private JButton DNR;
    private mku DNS;
    private mku DNT;
    private JLabel I;
    private JLabel P;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private aux DEC = null;
    private amf DNl = null;
    private eh ehx;
    private ldv gte = null;
    private boolean DNU = true;
    private String DNL = "none";

    public mmu(amf amf2, eh eh2, ldv ldv2, String string, aux aux2) {
        this.DNl = amf2;
        this.ehx = eh2;
        this.gte = ldv2;
        this.DNL = string;
        this.DEC = aux2;
        this.b();
        this.c();
    }

    public mmu() {
        this(null, null, null, null, null);
    }

    private void b() {
        this.aa = new JPanel();
        this.DNO = new JCheckBox();
        this.I = new JLabel();
        this.DNQ = new JTextField();
        this.DNR = new JButton();
        this.bN = new JPanel();
        this.DNT = new mku();
        this.DNS = new mku();
        this.ac = new JPanel();
        this.P = new JLabel();
        this.DNP = new JTextField();
        this.setClosable(true);
        this.setTitle("Modify Attachpoint:");
        this.addInternalFrameListener(new InternalFrameListener(this){
            final /* synthetic */ mmu DNV;
            {
                this.DNV = mmu2;
            }

            public void internalFrameActivated(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameClosed(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameClosing(InternalFrameEvent internalFrameEvent) {
                mmu.a(this.DNV, internalFrameEvent);
            }

            public void internalFrameDeactivated(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameDeiconified(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameIconified(InternalFrameEvent internalFrameEvent) {
            }

            public void internalFrameOpened(InternalFrameEvent internalFrameEvent) {
            }
        });
        this.aa.setBorder(BorderFactory.createTitledBorder("Properties for animation attachpoint"));
        this.DNO.setText("Attach To Bone");
        this.DNO.addActionListener(new ActionListener(this){
            final /* synthetic */ mmu DNV;
            {
                this.DNV = mmu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmu.a(this.DNV, actionEvent);
            }
        });
        this.I.setText("Bone:");
        this.DNQ.setEditable(false);
        this.DNR.setText("Change..");
        this.DNR.addActionListener(new ActionListener(this){
            final /* synthetic */ mmu DNV;
            {
                this.DNV = mmu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmu.b(this.DNV, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.DNO).addGroup(groupLayout.createSequentialGroup().addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DNQ, -1, 330, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DNR))).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.DNO).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.DNR).addComponent(this.DNQ, -2, -1, -2)).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout2 = new GroupLayout(this.bN);
        this.bN.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.DNS, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE).addComponent(this.DNT, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE)).addContainerGap(198, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.DNT, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DNS, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.P.setText("Attached Object:");
        this.DNP.setEditable(false);
        GroupLayout groupLayout3 = new GroupLayout(this.ac);
        this.ac.setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addComponent(this.P).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DNP, -2, 155, -2).addContainerGap(233, Short.MAX_VALUE)));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P).addComponent(this.DNP, -2, -1, -2)).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout4);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ac, GroupLayout.Alignment.TRAILING, -1, -1, Short.MAX_VALUE).addComponent(this.aa, GroupLayout.Alignment.TRAILING, -1, -1, Short.MAX_VALUE).addComponent(this.bN, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addComponent(this.aa, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ac, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.bN, -2, -1, -2).addContainerGap(18, Short.MAX_VALUE)));
        this.pack();
    }

    private void az(ActionEvent actionEvent) {
        this.eFy();
    }

    private void aA(ActionEvent actionEvent) {
        lfn.b(0, "SFAttachpointModifyDialog", "jCheckBox1ActionPerformed() action!");
        this.zm(this.DNO.isSelected());
    }

    private void a(InternalFrameEvent internalFrameEvent) {
        lfn.b(0, "SFAttachpointModifyDialog", "onInternframeClosing() closing..");
        this.DNU = false;
        mje.DAR = mje.a.DCn;
    }

    private void c() {
        this.DNS.setTitle("Rotation");
        this.DNT.setTitle("Translation");
        if (this.ehx != null) {
            this.DNT.cL(this.ehx.fb());
            this.DNS.cL(this.ehx.getRotation());
            if (this.DNl != null) {
                this.DNO.setSelected(this.ehx.fa() == 0);
            }
            if (!this.eFC() || this.ehx.fa() == 1) {
                this.DNR.setEnabled(false);
            }
            this.DNQ.setText(this.ehx.getFrameName());
            this.eFI();
        }
        Object var1_1 = null;
        this.DNP.setText(this.DNL);
        Thread thread = new Thread(this){
            final /* synthetic */ mmu DNV;
            {
                this.DNV = mmu2;
            }

            public void run() {
                while (mmu.a(this.DNV)) {
                    try {
                        Thread.sleep(50L);
                    }
                    catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    if (mmu.b(this.DNV) == null) continue;
                    mmu.d(this.DNV).cL(mmu.c(this.DNV).fb());
                    mmu.e(this.DNV).cL(mmu.c(this.DNV).getRotation());
                }
            }
        };
        thread.start();
        lfn.b(0, "SFAttachpointModifyDialog", "initDialog() Done The Run");
    }

    private boolean eFC() {
        return this.DNl instanceof bvf;
    }

    private void zm(boolean bl) {
        if (this.eFC()) {
            this.DNR.setEnabled(bl);
            if (bl) {
                lfn.b(0, this.getClass().getName(), "applyAttachToBoneCheckboxChange() : Setting Anim2Mesh");
                this.ehx.ac(0);
            } else {
                this.ehx.ac(1);
                lfn.b(0, this.getClass().getName(), "applyAttachToBoneCheckboxChange() : Setting Mesh2Mesh");
            }
        } else {
            this.DNR.setEnabled(false);
            this.ehx.ac(1);
        }
    }

    private void eFy() {
        if (!this.eFC()) {
            JOptionPane.showInternalMessageDialog(this, "The object is not an animatedObject!");
            return;
        }
        Object object = JOptionPane.showInputDialog(this, "Select Bone", "Choose new Bone", -1, null, ((bvf)this.DNl).azG(), this.ehx.getFrameName());
        if (object != null) {
            this.ehx.setFrameName((String)object);
            this.DNQ.setText((String)object);
        }
    }

    private void eFI() {
        if (this.DNl == null) {
            lfn.b(5, "SFAttachpointModifyDialog", "setAttachPointEditMode() MeshObject == null");
            return;
        }
        if (this.DNl != null && this.DEC != null) {
            this.DEC.nG(this.DNl.getGUID());
        }
        mje.DAR = mje.a.DCq;
        mje.DBB = this.ehx;
        if (this.DNl instanceof bvd) {
            mje.DBD = ((bvd)this.DNl).av();
        } else if (this.DNl instanceof dqk) {
            mje.DBD = ((dqk)this.DNl).av();
        } else {
            lfn.b(5, "SFAttachPointEditDialog", "setAttachPointEditModeButton_ActionPerformed() Invalid objecttype provided: " + this.DNl.getClass().getName());
        }
        mje.DBC = this.gte;
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mmu mmu2, InternalFrameEvent internalFrameEvent) {
        mmu2.a(internalFrameEvent);
    }

    static /* synthetic */ void a(mmu mmu2, ActionEvent actionEvent) {
        mmu2.aA(actionEvent);
    }

    static /* synthetic */ void b(mmu mmu2, ActionEvent actionEvent) {
        mmu2.az(actionEvent);
    }

    static /* synthetic */ boolean a(mmu mmu2) {
        return mmu2.DNU;
    }

    static /* synthetic */ amf b(mmu mmu2) {
        return mmu2.DNl;
    }

    static /* synthetic */ eh c(mmu mmu2) {
        return mmu2.ehx;
    }

    static /* synthetic */ mku d(mmu mmu2) {
        return mmu2.DNT;
    }

    static /* synthetic */ mku e(mmu mmu2) {
        return mmu2.DNS;
    }
}

