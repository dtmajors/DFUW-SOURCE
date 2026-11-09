/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 *  lcw
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mvy
extends mkx {
    private aux DEC = null;
    private Dimension bV = new Dimension(400, 600);
    private drv ENa;
    private mkl ENb;
    private mku EGC;
    private mkl ENc;
    private mjy ENd;
    private mla ENe;
    private mla ENf;
    private mkp ENg;
    private mjp ENh;
    private mkl ENi;
    private mla ENj;
    private mjr ENk;
    private JPanel ENl;
    private JPanel ENm;

    public mvy(drv drv2) {
        super(false);
        this.ENa = drv2;
        this.r();
        this.setPreferredSize(this.bV);
        this.setTitle("Spherical Light [" + this.ENa.getGUID() + "] Properties");
        this.setClosable(true);
        this.pack();
    }

    private void r() {
        Box box = Box.createVerticalBox();
        JPanel jPanel = new JPanel(new FlowLayout(2));
        this.ENb = new mkl("Light On", this.ENa.isOn(), false);
        this.ENb.c(new ActionListener(this){
            final /* synthetic */ mvy ENn;
            {
                this.ENn = mvy2;
            }

            public final void actionPerformed(ActionEvent actionEvent) {
                mvy.a(this.ENn, mvy.a(this.ENn).eDr());
            }
        });
        jPanel.add(this.ENb);
        this.EGC = new mku("Position", this.ENa.av(), true);
        this.EGC.d(new ActionListener(this){
            final /* synthetic */ mvy ENn;
            {
                this.ENn = mvy2;
            }

            public final void actionPerformed(ActionEvent actionEvent) {
                mvy.b(this.ENn);
            }
        });
        jPanel.add(this.EGC);
        this.ENc = new mkl("InnerLight On", this.ENa.isInnerOn(), false);
        this.ENc.c(new ActionListener(this){
            final /* synthetic */ mvy ENn;
            {
                this.ENn = mvy2;
            }

            public final void actionPerformed(ActionEvent actionEvent) {
                mvy.b(this.ENn, mvy.c(this.ENn).eDr());
            }
        });
        jPanel.add(this.ENc);
        this.ENi = new mkl("OuterLight On", this.ENa.isOuterOn(), false);
        this.ENi.c(new ActionListener(this){
            final /* synthetic */ mvy ENn;
            {
                this.ENn = mvy2;
            }

            public final void actionPerformed(ActionEvent actionEvent) {
                mvy.c(this.ENn, mvy.d(this.ENn).eDr());
            }
        });
        jPanel.add(this.ENi);
        box.add(jPanel);
        this.ENl = new JPanel(new FlowLayout(2));
        this.ENl.setBorder(BorderFactory.createTitledBorder("Inner Light Properties"));
        this.ENd = new mjy("Inner Texturename", this.ENa.bwx(), false);
        this.ENd.aeD(23);
        this.ENd.b(new ActionListener(this){
            final /* synthetic */ mvy ENn;
            {
                this.ENn = mvy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvy.e(this.ENn);
            }
        });
        this.ENl.add(this.ENd);
        this.ENe = new mla("Inner Radius", 0.0f, 10.0f, this.ENa.getInnerRadius(), 2, false);
        this.ENe.a(new ChangeListener(this){
            final /* synthetic */ mvy ENn;
            {
                this.ENn = mvy2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvy.a(this.ENn, mvy.f(this.ENn).getValue());
            }
        });
        this.ENl.add(this.ENe);
        this.ENf = new mla("Inner Intensity", 0.0f, 1.0f, this.ENa.getInnerIntensity(), 2, false);
        this.ENf.a(new ChangeListener(this){
            final /* synthetic */ mvy ENn;
            {
                this.ENn = mvy2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvy.b(this.ENn, mvy.g(this.ENn).getValue());
            }
        });
        this.ENl.add(this.ENf);
        this.ENh = new mjp(this.ENa.getInnerColor().getColor(), "Choose Inner color for GUID[" + this.ENa.getGUID() + "]");
        this.ENh.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvy ENn;
            {
                this.ENn = mvy2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvy.a(this.ENn, new lcq(mvy.h(this.ENn).getColor()));
                mvy.i(this.ENn).setColor(mvy.h(this.ENn).getColor());
            }
        });
        this.ENg = new mkp(this, this.ENh, "InnerColor", this.ENa.getInnerColor().getColor(), false);
        this.ENl.add(this.ENg);
        box.add(this.ENl);
        this.ENm = new JPanel(new FlowLayout(2));
        this.ENm.setBorder(BorderFactory.createTitledBorder("Outer Light Properties"));
        Object[] objectArray = new String[]{"0", "1", "2", "3"};
        this.ENk = new mjr("OuterColorNumber", objectArray, this.ENa.getOuterColorNumber(), false);
        this.ENk.a(new ActionListener(this){
            final /* synthetic */ mvy ENn;
            {
                this.ENn = mvy2;
            }

            public final void actionPerformed(ActionEvent actionEvent) {
                mvy.a(this.ENn, Integer.parseInt((String)mvy.j(this.ENn).getSelectedItem()));
            }
        });
        this.ENm.add(this.ENk);
        this.ENj = new mla("Outer Radius", 0.0f, 20.0f, this.ENa.getOuterRadius(), 2, false);
        this.ENj.a(new ChangeListener(this){
            final /* synthetic */ mvy ENn;
            {
                this.ENn = mvy2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvy.c(this.ENn, mvy.k(this.ENn).getValue());
            }
        });
        this.ENm.add(this.ENj);
        box.add(this.ENm);
        this.DGa.add(box);
    }

    private void aj(lcq lcq2) {
        fph fph2 = (fph)this.DEC.d(1538);
        fph2.on(this.ENa.getGUID());
        fph2.f(lcr.qAE);
        fph2.setInnerColor(lcq2);
        fph2.Hm(fph.iTg);
        this.DEC.a((dxq)fph2);
    }

    private void pb(float f2) {
        fph fph2 = (fph)this.DEC.d(1538);
        fph2.on(this.ENa.getGUID());
        fph2.f(lcr.qAE);
        fph2.setInnerRadius(f2);
        fph2.Hm(fph.iTd);
        this.DEC.a((dxq)fph2);
    }

    private void oV(float f2) {
        fph fph2 = (fph)this.DEC.d(1538);
        fph2.on(this.ENa.getGUID());
        fph2.f(lcr.qAE);
        fph2.setInnerIntensity(f2);
        fph2.Hm(fph.iTf);
        this.DEC.a((dxq)fph2);
    }

    private void pc(float f2) {
        fph fph2 = (fph)this.DEC.d(1538);
        fph2.on(this.ENa.getGUID());
        fph2.f(lcr.qAE);
        fph2.setOuterRadius(f2);
        fph2.Hm(fph.iTe);
        this.DEC.a((dxq)fph2);
    }

    private void afM(int n) {
        fph fph2 = (fph)this.DEC.d(1538);
        fph2.on(this.ENa.getGUID());
        fph2.f(lcr.qAE);
        fph2.setOuterColorNumber(n);
        fph2.Hm(fph.iTi);
        this.DEC.a((dxq)fph2);
    }

    private void Ak(boolean bl) {
        if (this.ENa.bwx() != null && !this.ENa.bwx().equals("") || !bl) {
            fph fph2 = (fph)this.DEC.d(1538);
            fph2.on(this.ENa.getGUID());
            fph2.f(lcr.qAE);
            fph2.setInnerOn(bl);
            fph2.Hm(fph.iTk);
            this.DEC.a((dxq)fph2);
        } else {
            JOptionPane.showInternalMessageDialog(this, "Must set Texture before inner Light can be turned on!");
            this.ENc.zi(false);
        }
    }

    private void Al(boolean bl) {
        fph fph2 = (fph)this.DEC.d(1538);
        fph2.on(this.ENa.getGUID());
        fph2.f(lcr.qAE);
        fph2.setOuterOn(bl);
        fph2.Hm(fph.iTj);
        this.DEC.a((dxq)fph2);
    }

    private void Am(boolean bl) {
        fph fph2 = (fph)this.DEC.d(1538);
        fph2.on(this.ENa.getGUID());
        fph2.f(lcr.qAE);
        fph2.hX(bl);
        fph2.Hm(fph.iSW);
        this.DEC.a((dxq)fph2);
    }

    private void eQM() {
        fph fph2 = (fph)this.DEC.d(1538);
        fph2.on(this.ENa.getGUID());
        fph2.f(lcr.qAE);
        fph2.c(this.EGC.bSh());
        fph2.Hm(fph.goz);
        this.DEC.a((dxq)fph2);
    }

    private void eQN() {
        jrw jrw2 = this.a(new myr("dds", "Texture Files (*.dds)"), lcw.qLb + "texture/" + "/" + "dds");
        if (jrw2 != null) {
            String string = jrw2.getAbsolutePath();
            String string2 = string.substring(0, lcw.qLb.length());
            lfn.b(0, this.getClass().getName(), "textureNameButtonPressed() : MeshDir = " + string2);
            if (string2.equalsIgnoreCase(lcw.qLb)) {
                this.ENd.Cf(string);
                fph fph2 = (fph)this.DEC.d(1538);
                fph2.on(this.ENa.getGUID());
                fph2.f(lcr.qAE);
                fph2.setTextureName(string);
                fph2.Hm(fph.iTh);
                this.DEC.a((dxq)fph2);
            } else {
                JOptionPane.showInternalMessageDialog(this, "Cannot choose a file outside of the Install directory!", "Error", 0);
            }
        }
    }

    private jrw a(myr myr2, String string) {
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(string);
            mkb2.addChoosableFileFilter(myr2);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            n = mkb2.showOpenDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return null;
        }
        jrw jrw2 = null;
        if (n == 0) {
            jrw2 = mkb2.eDc();
        }
        return jrw2;
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ mkl a(mvy mvy2) {
        return mvy2.ENb;
    }

    static /* synthetic */ void a(mvy mvy2, boolean bl) {
        mvy2.Am(bl);
    }

    static /* synthetic */ void b(mvy mvy2) {
        mvy2.eQM();
    }

    static /* synthetic */ mkl c(mvy mvy2) {
        return mvy2.ENc;
    }

    static /* synthetic */ void b(mvy mvy2, boolean bl) {
        mvy2.Ak(bl);
    }

    static /* synthetic */ mkl d(mvy mvy2) {
        return mvy2.ENi;
    }

    static /* synthetic */ void c(mvy mvy2, boolean bl) {
        mvy2.Al(bl);
    }

    static /* synthetic */ void e(mvy mvy2) {
        mvy2.eQN();
    }

    static /* synthetic */ mla f(mvy mvy2) {
        return mvy2.ENe;
    }

    static /* synthetic */ void a(mvy mvy2, float f2) {
        mvy2.pb(f2);
    }

    static /* synthetic */ mla g(mvy mvy2) {
        return mvy2.ENf;
    }

    static /* synthetic */ void b(mvy mvy2, float f2) {
        mvy2.oV(f2);
    }

    static /* synthetic */ mjp h(mvy mvy2) {
        return mvy2.ENh;
    }

    static /* synthetic */ void a(mvy mvy2, lcq lcq2) {
        mvy2.aj(lcq2);
    }

    static /* synthetic */ mkp i(mvy mvy2) {
        return mvy2.ENg;
    }

    static /* synthetic */ mjr j(mvy mvy2) {
        return mvy2.ENk;
    }

    static /* synthetic */ void a(mvy mvy2, int n) {
        mvy2.afM(n);
    }

    static /* synthetic */ mla k(mvy mvy2) {
        return mvy2.ENj;
    }

    static /* synthetic */ void c(mvy mvy2, float f2) {
        mvy2.pc(f2);
    }
}

