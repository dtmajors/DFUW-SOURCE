/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  bvf
 *  dqk
 *  lcr
 *  lcw
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileFilter;

public class mmr
extends mkx
implements mkc {
    private aux DEC = null;
    private amf DNl = null;
    private Dimension DJA = new Dimension(600, 300);
    private eh ehx;
    private ldv gte;
    private mkt DNm = new mkt("GUID", "n/a");
    private ldv DNn = null;
    private JButton DNo = new JButton("Get GUID");
    private JButton DNp = new JButton("Load");
    private JButton DNq = new JButton("AttachPoint Edit Mode");
    private mkl DNr;
    private mkn DNs = new mkn("FrameName", "n/a", false);
    private mku DNt = null;
    private mku DNu = null;
    private JButton DNv = new JButton("Change");
    private JButton DNw = new JButton("Attach");
    private JButton DNx = new JButton("Detach");

    public mmr(amf amf2, eh eh2) {
        this.DNl = amf2;
        this.ehx = eh2;
        if (this.eFC()) {
            this.ehx.ac(0);
        }
        assert (this.DNl != null) : "AnimationObject is null!";
        assert (this.ehx != null) : "AttachPoint is null!";
        this.setTitle("Properties for attachpoint: " + this.ehx.getName());
        this.setPreferredSize(this.DJA);
        this.setMinimumSize(this.DJA);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(false);
        this.r();
        this.pack();
    }

    public mmr(eh eh2) {
        this.ehx = eh2;
        if (this.eFC()) {
            this.ehx.ac(0);
        }
        assert (this.ehx != null) : "AttachPoint is null!";
        this.setTitle("Properties for attachpoint: " + this.ehx.getName());
        this.setPreferredSize(this.DJA);
        this.setMinimumSize(this.DJA);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(false);
        this.r();
        this.pack();
    }

    private void r() {
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new FlowLayout(0));
        JPanel jPanel3 = new JPanel(new FlowLayout(0));
        JPanel jPanel4 = new JPanel(new FlowLayout(0));
        JPanel jPanel5 = new JPanel(new FlowLayout());
        jPanel5.setBorder(BorderFactory.createTitledBorder("Animated object attachpoint info"));
        this.DNr = new mkl("Attach To Bone", true, false);
        jPanel5.add(this.DNr);
        this.DNr.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mmr DNy;
            {
                this.DNy = mmr2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                this.DNy.zm(mmr.a(this.DNy).eDr());
            }
        });
        this.DNs.Cf(this.ehx.getFrameName());
        jPanel5.add(this.DNs);
        this.DNv.addActionListener(new ActionListener(this){
            final /* synthetic */ mmr DNy;
            {
                this.DNy = mmr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmr.b(this.DNy);
            }
        });
        jPanel5.add(this.DNv);
        if (!this.eFC()) {
            this.DNv.setEnabled(false);
        }
        jPanel4.add(jPanel5);
        JPanel jPanel6 = new JPanel();
        jPanel6.setLayout(new BoxLayout(jPanel6, 1));
        this.DNu = new mku("Rotation", this.ehx.getRotation(), false);
        jPanel6.add(this.DNu);
        this.DNt = new mku("Translation", this.ehx.fb(), false);
        jPanel6.add(this.DNt);
        jPanel2.add(jPanel6);
        jPanel3.setBorder(BorderFactory.createTitledBorder("For AttachPoint Testing"));
        String string = null;
        string = this.DNn != null ? this.DNn.enz() : "n/a";
        this.DNm.Cf(string);
        jPanel3.add(this.DNm);
        this.DNp.addActionListener(new ActionListener(this){
            final /* synthetic */ mmr DNy;
            {
                this.DNy = mmr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmr.a(this.DNy, actionEvent);
            }
        });
        jPanel3.add(this.DNp);
        this.DNo.addActionListener(new ActionListener(this){
            final /* synthetic */ mmr DNy;
            {
                this.DNy = mmr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmr.b(this.DNy, actionEvent);
            }
        });
        jPanel3.add(this.DNo);
        this.DNw.addActionListener(new ActionListener(this){
            final /* synthetic */ mmr DNy;
            {
                this.DNy = mmr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmr.c(this.DNy);
            }
        });
        jPanel3.add(this.DNw);
        this.DNx.addActionListener(new ActionListener(this){
            final /* synthetic */ mmr DNy;
            {
                this.DNy = mmr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmr.d(this.DNy);
            }
        });
        jPanel3.add(this.DNx);
        this.DNq.addActionListener(new ActionListener(this){
            final /* synthetic */ mmr DNy;
            {
                this.DNy = mmr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmr.e(this.DNy);
            }
        });
        jPanel3.add(this.DNq);
        jPanel.add((Component)jPanel4, "North");
        jPanel.add((Component)jPanel2, "Center");
        jPanel.add((Component)jPanel3, "South");
        this.DGa.add(jPanel);
    }

    protected void zm(boolean bl) {
        if (this.eFC()) {
            this.DNv.setEnabled(bl);
            if (bl) {
                lfn.b(0, this.getClass().getName(), "applyAttachToBoneCheckboxChange() : Setting Anim2Mesh");
                this.ehx.ac(0);
            } else {
                this.ehx.ac(1);
                lfn.b(0, this.getClass().getName(), "applyAttachToBoneCheckboxChange() : Setting Mesh2Mesh");
            }
        } else {
            this.DNv.setEnabled(false);
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
            this.DNs.Cf((String)object);
        }
    }

    private void av(ActionEvent actionEvent) {
        this.DNn = this.DEC.eCw();
        if (this.DNn != null) {
            this.DNm.Cf(this.DNn.toString());
        } else {
            JOptionPane.showInternalMessageDialog(this, "An Attachable Object Must be selected!", "Error: No Attachable Object", 0);
        }
    }

    private void eFz() {
        this.DNn = this.DEC.eCw();
        if (this.DNn != null) {
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
        } else {
            JOptionPane.showInternalMessageDialog(this, "An Attachable Object Must be selected!", "Error: No Attachable Object", 0);
        }
    }

    private void aw(ActionEvent actionEvent) {
        String string = lcw.qLb + "xml/" + "waw";
        FileFilter[] fileFilterArray = new FileFilter[1];
        myr myr2 = new myr("xml", "XML Files");
        fileFilterArray[0] = myr2;
        mpn mpn2 = new mpn(this.DEC.eCu(), string, fileFilterArray, true);
        mpn2.p(this.DEC);
        mpn2.a(this);
        this.DEC.eCu().add(mpn2);
        mpn2.setVisible(true);
    }

    @Override
    public void a(mkb mkb2, jrw jrw2) {
        if (jrw2 == null) {
            lfn.b(5, this.getClass().getName(), "loadFileChooserFile() : The SFFile is null!");
            return;
        }
        ldv ldv2 = this.DEC.eCF().lL(this.DNl.getGUID());
        lfn.b(0, this.getClass().getName(), "loadFileChooserFile() : Callback from Attachable Item FikleExplorer! NewGUID = " + ldv2);
        hac hac2 = (hac)this.DEC.d(4097);
        hac2.on(lcr.qAE);
        hac2.f(lcr.qzr);
        hac2.Lb(1);
        hac2.setFileName(jrw2.getAbsolutePath());
        hac2.hC(ldv2);
        hac2.li(false);
        this.DEC.a((dxq)hac2);
        mje.DAU = ldv2;
    }

    private void eFA() {
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
            gzx gzx2 = (gzx)this.DEC.d(4112);
            if (this.ehx.fa() == 0) {
                gzx2.KZ(5);
            } else if (this.ehx.fa() == 1) {
                gzx2.KZ(64);
                gzx2.mu(true);
            } else assert (false);
            gzx2.on(this.DNl.getGUID());
            gzx2.f(lcr.qzr);
            gzx2.qJ(this.DNl.getGUID());
            gzx2.qI(this.DNn);
            gzx2.setAttachPointName("");
            gzx2.setFrameName(this.ehx.getFrameName());
            gzx2.setRotation(this.ehx.getRotation());
            gzx2.K(this.ehx.fb());
            gzx2.kX(this.gte);
            gzx2.ac(this.ehx.fa());
            this.DEC.a((dxq)gzx2);
        } else {
            lfn.b(4, this.getClass().getName(), "attachItemButton_ActionPerformed() : Could not Attach Item. ");
        }
    }

    private void eFB() {
        if (this.gte == null) {
            lfn.b(4, this.getClass().getSimpleName(), "detachItemButton_ActionPerformed() : Nothing attached!");
            JOptionPane.showMessageDialog(this, "Nothing attached!");
            return;
        }
        if (this.DNn != null && !this.DNn.equals(this.DNl.getGUID())) {
            gzx gzx2 = (gzx)this.DEC.d(4112);
            if (this.ehx.fa() == 0) {
                gzx2.KZ(2);
            } else if (this.ehx.fa() == 1) {
                gzx2.KZ(1);
            } else assert (false);
            gzx2.on(this.DNl.getGUID());
            gzx2.f(lcr.qzr);
            gzx2.qJ(this.DNl.getGUID());
            gzx2.qI(this.DNn);
            gzx2.setAttachPointName("");
            gzx2.setFrameName(this.ehx.getFrameName());
            gzx2.setRotation(new ljq());
            gzx2.K(new ljq());
            gzx2.kX(this.gte);
            gzx2.ac(this.ehx.fa());
            this.DEC.a((dxq)gzx2);
            this.gte = null;
        } else {
            JOptionPane.showInternalMessageDialog(this, "An Attachable Object Must be selected!", "Error: No Attachable Object", 0);
        }
    }

    private boolean eFC() {
        return this.DNl instanceof bvf;
    }

    public final void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ mkl a(mmr mmr2) {
        return mmr2.DNr;
    }

    static /* synthetic */ void b(mmr mmr2) {
        mmr2.eFy();
    }

    static /* synthetic */ void a(mmr mmr2, ActionEvent actionEvent) {
        mmr2.aw(actionEvent);
    }

    static /* synthetic */ void b(mmr mmr2, ActionEvent actionEvent) {
        mmr2.av(actionEvent);
    }

    static /* synthetic */ void c(mmr mmr2) {
        mmr2.eFA();
    }

    static /* synthetic */ void d(mmr mmr2) {
        mmr2.eFB();
    }

    static /* synthetic */ void e(mmr mmr2) {
        mmr2.eFz();
    }
}

