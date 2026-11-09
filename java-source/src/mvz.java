/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 *  lcw
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileFilter;

public class mvz
extends mlc {
    private drx ENo = null;
    private aux DEC = null;
    private mkp ENp = null;
    private mkp ENq = null;
    private mkt ENr = null;
    private mkt ENs = null;
    private mkt ENt = null;
    private mjr ENu = null;
    private mkt ENv = null;
    private mkt ENw = null;
    private mkt ENx = null;
    private mkt ENy = null;
    private mkt ENz = null;
    private mkt ENA = null;
    private mkt ENB = null;
    private mkt ENC = null;
    private mku EGC = null;
    private mku ENE = null;
    private mku ENF = null;
    private mjp ENG = null;
    private mjp ENH = null;
    private JButton EJo = null;
    private mjr ENI = null;
    private mkt ENJ = null;
    private mkt ENK = null;

    public mvz(drx drx2) {
        this.setTitle("ParticleSystem properties");
        this.setPreferredSize(new Dimension(600, 350));
        this.ENo = drx2;
        this.ePH();
        this.pack();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void ePH() {
        JPanel jPanel = null;
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(0));
        this.j(jPanel);
        this.addTab("General", jPanel);
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(0));
        this.l(jPanel);
        this.addTab("Colors", jPanel);
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(0));
        this.k(jPanel);
        this.addTab("Position", jPanel);
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(0));
        this.q(jPanel);
        this.addTab("Gravity&Velocity", jPanel);
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(0));
        this.r(jPanel);
        this.addTab("Scales", jPanel);
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(0));
        this.p(jPanel);
        this.addTab("Point data", jPanel);
    }

    private void j(JPanel jPanel) {
        mkn mkn2 = new mkn("GUID", this.ENo.getGUID().toString());
        jPanel.add(mkn2);
        this.EJo = new JButton("Save As Template");
        this.EJo.addActionListener(new ActionListener(this){
            final /* synthetic */ mvz ENL;
            {
                this.ENL = mvz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvz.a(this.ENL, actionEvent);
            }
        });
        jPanel.add(this.EJo);
    }

    private void p(JPanel jPanel) {
        this.ENv = new mkt("PointSize", Float.toString(this.ENo.bwE()));
        jPanel.add(this.ENv);
        this.ENx = new mkt("MinSize", Float.toString(this.ENo.bwG()));
        jPanel.add(this.ENx);
        this.ENw = new mkt("MaxSize", Float.toString(this.ENo.bwF()));
        jPanel.add(this.ENw);
        this.ENy = new mkt("NumberOfEmittingParticles", Integer.toString(this.ENo.bwL()));
        jPanel.add(this.ENy);
        this.ENA = new mkt("MaxNumberOfParticlesInAction", Integer.toString(this.ENo.bwM()));
        jPanel.add(this.ENA);
        this.ENB = new mkt("FadeTime", Float.toString(this.ENo.bwK()));
        jPanel.add(this.ENB);
        this.ENC = new mkt("TextureName", this.ENo.getTextureName());
        jPanel.add(this.ENC);
    }

    private void l(JPanel jPanel) {
        lcq lcq2 = null;
        Color color = null;
        lcq2 = this.ENo.bwC();
        color = new Color(lcq2.r, lcq2.g, lcq2.b, lcq2.a);
        this.ENG = new mjp(color, "Choose Emit color for GUID[" + this.ENo.getGUID() + "]");
        this.ENG.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvz ENL;
            {
                this.ENL = mvz2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvz.a(this.ENL, new lcq(mvz.a(this.ENL).getColor()));
                mvz.b(this.ENL).setColor(mvz.a(this.ENL).getColor());
            }
        });
        this.ENp = new mkp(this, this.ENG, "EmitColor", color);
        jPanel.add(this.ENp);
        lcq2 = this.ENo.bwD();
        color = new Color(lcq2.r, lcq2.g, lcq2.b, lcq2.a);
        this.ENH = new mjp(color, "Choose Fade color for GUID[" + this.ENo.getGUID() + "]");
        this.ENH.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvz ENL;
            {
                this.ENL = mvz2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvz.b(this.ENL, new lcq(mvz.c(this.ENL).getColor()));
                mvz.d(this.ENL).setColor(mvz.c(this.ENL).getColor());
            }
        });
        this.ENq = new mkp(this, this.ENH, "FadeColor", color);
        jPanel.add(this.ENq);
        int n = 0;
        if (this.ENo.bwN()) {
            n = 1;
        }
        this.ENI = new mjr("Blend Alpha Only:", (Object[])new String[]{"FALSE", "TRUE"}, n);
        jPanel.add(this.ENI);
    }

    private void k(JPanel jPanel) {
        this.EGC = new mku("Position", this.ENo.av());
        jPanel.add(this.EGC);
    }

    private void q(JPanel jPanel) {
        this.ENE = new mku("Gravity", this.ENo.bwA());
        jPanel.add(this.ENE);
        this.ENF = new mku("StartVelocity", this.ENo.bwB());
        jPanel.add(this.ENF);
        this.ENJ = new mkt("AngleStart1", Float.toString(this.ENo.bwO()));
        jPanel.add(this.ENJ);
        this.ENK = new mkt("AngleStart2", Float.toString(this.ENo.bwP()));
        jPanel.add(this.ENK);
    }

    private void r(JPanel jPanel) {
        this.ENr = new mkt("ScaleA", Float.toString(this.ENo.bwH()));
        jPanel.add(this.ENr);
        this.ENs = new mkt("ScaleB", Float.toString(this.ENo.bwI()));
        jPanel.add(this.ENs);
        this.ENt = new mkt("ScaleC", Float.toString(this.ENo.bwJ()));
        jPanel.add(this.ENt);
        int n = 0;
        if (this.ENo.isConstantSize()) {
            n = 1;
        }
        this.ENu = new mjr("ContantSize:", (Object[])new String[]{"FALSE", "TRUE"}, n);
        jPanel.add(this.ENu);
    }

    @Override
    protected void z(ActionEvent actionEvent) {
        this.eDD();
        if (this.ENG != null) {
            this.ENG.dispose();
        }
        if (this.ENH != null) {
            this.ENH.dispose();
        }
        this.dispose();
    }

    @Override
    protected void A(ActionEvent actionEvent) {
        if (this.ENG != null) {
            this.ENG.dispose();
        }
        if (this.ENH != null) {
            this.ENH.dispose();
        }
        this.dispose();
    }

    @Override
    protected void eDD() {
        int n = 0;
        Color color = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        fwe fwe2 = (fwe)this.DEC.d(6657);
        fwe2.on(this.ENo.getGUID());
        fwe2.f(lcr.qzr);
        fwe2.hC(this.ENo.getGUID());
        if (this.ENp.hasChanged()) {
            lfn.b(0, this.getClass().getName(), "EmitLnTColor HAS CHANGED!");
            color = this.ENp.getColor();
            f2 = (float)color.getAlpha() / 255.0f;
            f3 = (float)color.getRed() / 255.0f;
            f4 = (float)color.getGreen() / 255.0f;
            f5 = (float)color.getBlue() / 255.0f;
            fwe2.C(new lcq(f3, f4, f5, f2));
            n |= 0x100;
        }
        if (this.ENq.hasChanged()) {
            lfn.b(0, this.getClass().getName(), "FadeLnTColor HAS CHANGED!");
            color = this.ENq.getColor();
            f2 = (float)color.getAlpha() / 255.0f;
            f3 = (float)color.getRed() / 255.0f;
            f4 = (float)color.getGreen() / 255.0f;
            f5 = (float)color.getBlue() / 255.0f;
            fwe2.D(new lcq(f3, f4, f5, f2));
            n |= 0x200;
        }
        if (this.ENB.hasChanged()) {
            fwe2.hs(Float.parseFloat(this.ENB.eCU()));
            n |= 0x20000;
        }
        if (this.ENu.hasChanged()) {
            n |= 0x400;
            if (this.ENu.getSelectedIndex() == 0) {
                fwe2.setConstantSize(false);
                lfn.b(0, this.getClass().getName(), "ContantSize now is FALSE");
            } else {
                lfn.b(0, this.getClass().getName(), "ContantSize now is TRUE");
                fwe2.setConstantSize(true);
            }
            n |= 0x400;
        }
        if (this.ENw.hasChanged()) {
            fwe2.hL(Float.parseFloat(this.ENw.eCU()));
            n |= 0x1000;
        }
        if (this.ENx.hasChanged()) {
            fwe2.hM(Float.parseFloat(this.ENx.eCU()));
            n |= 0x2000;
        }
        if (this.ENv.hasChanged()) {
            fwe2.hK(Float.parseFloat(this.ENv.eCU()));
            n |= 0x800;
        }
        if (this.ENr.hasChanged()) {
            fwe2.hN(Float.parseFloat(this.ENr.eCU()));
            n |= 0x4000;
        }
        if (this.ENs.hasChanged()) {
            fwe2.hO(Float.parseFloat(this.ENs.eCU()));
            n |= 0x8000;
        }
        if (this.ENt.hasChanged()) {
            fwe2.hP(Float.parseFloat(this.ENt.eCU()));
            n |= 0x10000;
        }
        if (this.ENy.hasChanged()) {
            fwe2.BF(Integer.parseInt(this.ENy.eCU()));
            n |= 0x40000;
        }
        if (this.ENA.hasChanged()) {
            fwe2.BG(Integer.parseInt(this.ENA.eCU()));
            n |= 0x20;
        }
        if (this.EGC.hasChanged()) {
            fwe2.c(this.EGC.bSh());
            n |= 4;
        }
        if (this.ENE.hasChanged()) {
            fwe2.cu(this.ENE.bSh());
            n |= 0x10;
        }
        if (this.ENF.hasChanged()) {
            fwe2.cv(this.ENF.bSh());
            n |= 0x80;
        }
        if (this.ENC.hasChanged()) {
            fwe2.setTextureName(this.ENC.eCU());
            n |= 8;
        }
        if (this.ENI.hasChanged()) {
            n |= 0x80000;
            if (this.ENI.getSelectedIndex() == 0) {
                lfn.b(0, this.getClass().getName(), "ModifyAlphaOnlyBlend now is FALSE");
                fwe2.jj(false);
            } else {
                lfn.b(0, this.getClass().getName(), "ModifyAlphaOnlyBlend now is TRUE");
                fwe2.jj(true);
            }
        }
        if (this.ENJ.hasChanged()) {
            fwe2.hQ(Float.parseFloat(this.ENJ.eCU()));
            n |= 0x100000;
        }
        if (this.ENK.hasChanged()) {
            fwe2.hR(Float.parseFloat(this.ENK.eCU()));
            n |= 0x200000;
        }
        if (n != 0) {
            fwe2.Ih(n);
            this.DEC.a((dxq)fwe2);
        }
    }

    private void ak(lcq lcq2) {
        lfn.b(0, this.getClass().getName(), "Setting EmitColor??");
        fwe fwe2 = (fwe)this.DEC.d(6657);
        fwe2.Ih(256);
        fwe2.on(this.ENo.getGUID());
        fwe2.f(lcr.qzr);
        fwe2.hC(this.ENo.getGUID());
        fwe2.C(lcq2);
        this.DEC.a((dxq)fwe2);
    }

    private void al(lcq lcq2) {
        lfn.b(0, this.getClass().getName(), "Setting FadeColor??");
        fwe fwe2 = (fwe)this.DEC.d(6657);
        fwe2.Ih(512);
        fwe2.on(this.ENo.getGUID());
        fwe2.f(lcr.qzr);
        fwe2.hC(this.ENo.getGUID());
        fwe2.D(lcq2);
        this.DEC.a((dxq)fwe2);
    }

    private void cM(ActionEvent actionEvent) {
        Object object;
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + "xml-files/object/particlesystem/");
            object = new myr("xml", "XML Files");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.Ci(".xml");
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            n = mkb2.showSaveDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return;
        }
        object = mkb2.eDc();
        if (object != null && n == 0) {
            String string = ((File)object).toString();
            String string2 = string.substring(0, lcw.qLb.length());
            string = string.substring(lcw.qLb.length() - 1);
            if (string2.equalsIgnoreCase(lcw.qLb)) {
                hac hac2 = (hac)this.DEC.d(4097);
                hac2.Lb(10);
                try {
                    hac2.setFileName(((File)object).getAbsolutePath());
                    lfn.b(0, this.getClass().getName(), "Thg SaveFile is:" + object);
                }
                catch (Exception exception) {
                    lfn.b(4, this.getClass().getName(), "SFFile Not Found.. New SFFile!");
                }
                hac2.hC(this.ENo.getGUID());
                this.DEC.a((dxq)hac2);
                String string3 = "Saving ParticleSystemTemplate [" + object + "]";
                lfn.b(0, this.getClass().getName(), string3);
            } else {
                JOptionPane.showInternalMessageDialog(this, "Cannot save outside of Install Directory!", "Error: Wrong save area", 0);
            }
        }
    }

    static /* synthetic */ void a(mvz mvz2, ActionEvent actionEvent) {
        mvz2.cM(actionEvent);
    }

    static /* synthetic */ mjp a(mvz mvz2) {
        return mvz2.ENG;
    }

    static /* synthetic */ void a(mvz mvz2, lcq lcq2) {
        mvz2.ak(lcq2);
    }

    static /* synthetic */ mkp b(mvz mvz2) {
        return mvz2.ENp;
    }

    static /* synthetic */ mjp c(mvz mvz2) {
        return mvz2.ENH;
    }

    static /* synthetic */ void b(mvz mvz2, lcq lcq2) {
        mvz2.al(lcq2);
    }

    static /* synthetic */ mkp d(mvz mvz2) {
        return mvz2.ENq;
    }
}

