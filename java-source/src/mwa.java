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
import javax.swing.JSlider;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileFilter;

public class mwa
extends mlc {
    private aux DEC;
    private dry ENM;
    private mkt ENC;
    private mku EGC;
    private mkt ENN;
    private JSlider ENO;
    private mkt ENP;
    private JSlider ENQ;
    private mkt ENR;
    private JSlider ENS;
    private mkt ENT;
    private JSlider ENU;
    private mkt ENV;
    private JSlider ENW;
    private mkt ENX;
    private JSlider ENY;
    private mkt ENZ;
    private JSlider EOa;
    private mkt EOb;
    private JSlider EOc;
    private mkt EOd;
    private JSlider EOe;
    private mkt EOf;
    private JSlider EOg;
    private mkt EOh;
    private JSlider EOi;
    private mkt EOj;
    private JSlider EOk;
    private mkt EOl;
    private JSlider EOm;
    private mkt EOn;
    private JSlider EOo;
    private mkt EOp;
    private JSlider EOq;
    private mkt EOr;
    private JSlider EOs;
    private mkt EOt;
    private JSlider EOu;
    private mkt EOv;
    private JSlider EOw;
    private mkt EOx;
    private JSlider EOy;
    private mkt EOz;
    private JSlider EOA;
    private mkt EOB;
    private JSlider EOC;
    private mkt EOD;
    private JSlider EOE;
    private mkt EOF;
    private JSlider EOG;
    private mkp EOH = null;
    private mkp EOI = null;
    private mjp EOJ = null;
    private mjp EOK = null;
    private JButton EJo = null;
    private float EOL = 10.0f;

    public mwa(dry dry2) {
        this.setTitle("ParticleSystem properties");
        this.setPreferredSize(new Dimension(600, 350));
        this.ENM = dry2;
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
        this.v(jPanel);
        this.addTab("Scale+Rotation", jPanel);
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(0));
        this.t(jPanel);
        this.addTab("Gravity", jPanel);
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(0));
        this.u(jPanel);
        this.addTab("Magnet", jPanel);
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(0));
        this.s(jPanel);
        this.addTab("Wind", jPanel);
    }

    private void j(JPanel jPanel) {
        mkn mkn2 = new mkn("GUID", this.ENM.getGUID().toString());
        jPanel.add(mkn2);
        this.EJo = new JButton("Save As Template");
        this.EJo.addActionListener(new ActionListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mwa.a(this.EOM, actionEvent);
            }
        });
        jPanel.add(this.EJo);
        this.ENC = new mkt("TextureName", this.ENM.getTextureName());
        jPanel.add(this.ENC);
        this.EGC = new mku("Position", new ljq(this.ENM.av()));
        jPanel.add(this.EGC);
        JPanel jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.ENO = new JSlider(0, 100);
        this.ENO.setValue((int)(this.ENM.bwQ() * this.EOL));
        this.ENO.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.a(this.EOM, (float)mwa.a(this.EOM).getValue());
            }
        });
        jPanel2.add(this.ENO);
        this.ENN = new mkt("Lifetime", Float.toString(this.ENM.bwQ()));
        jPanel2.add(this.ENN);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.ENQ = new JSlider(0, 1000);
        this.ENQ.setValue((int)(this.ENM.bwR() * this.EOL));
        this.ENQ.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.b(this.EOM, mwa.b(this.EOM).getValue());
            }
        });
        jPanel2.add(this.ENQ);
        this.ENP = new mkt("Launch Speed", Float.toString(this.ENM.bwR()));
        jPanel2.add(this.ENP);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.ENS = new JSlider(-1000, 1000);
        this.ENS.setValue((int)(this.ENM.bwS() * this.EOL));
        this.ENS.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.c(this.EOM, mwa.c(this.EOM).getValue());
            }
        });
        jPanel2.add(this.ENS);
        this.ENR = new mkt("Launch Acceleration", Float.toString(this.ENM.bwS()));
        jPanel2.add(this.ENR);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.ENU = new JSlider(0, 2000);
        this.ENU.setValue(this.ENM.getNumParticles());
        this.ENU.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.a(this.EOM, mwa.d(this.EOM).getValue());
            }
        });
        jPanel2.add(this.ENU);
        this.ENT = new mkt("Nr Of Particles", Float.toString(this.ENM.getNumParticles()));
        jPanel2.add(this.ENT);
        jPanel.add(jPanel2);
    }

    private void s(JPanel jPanel) {
        JPanel jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOe = new JSlider(0, 1000);
        this.EOe.setValue((int)(this.ENM.bwX() * this.EOL));
        this.EOe.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.d(this.EOM, mwa.e(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOe);
        this.EOd = new mkt("Wind Heading", Float.toString(this.ENM.bwX()));
        jPanel2.add(this.EOd);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOg = new JSlider(0, 1000);
        this.EOg.setValue((int)(this.ENM.bwY() * this.EOL));
        this.EOg.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.e(this.EOM, mwa.f(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOg);
        this.EOf = new mkt("Wind Pitch", Float.toString(this.ENM.bwY()));
        jPanel2.add(this.EOf);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOi = new JSlider(0, 1000);
        this.EOi.setValue((int)(this.ENM.bwZ() * this.EOL));
        this.EOi.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.f(this.EOM, mwa.g(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOi);
        this.EOh = new mkt("Wind Scale", Float.toString(this.ENM.bwZ()));
        jPanel2.add(this.EOh);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOk = new JSlider(0, 1000);
        this.EOk.setValue((int)(this.ENM.bxa() * this.EOL));
        this.EOk.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.g(this.EOM, mwa.h(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOk);
        this.EOj = new mkt("Wind Start Effect", Float.toString(this.ENM.bxa()));
        jPanel2.add(this.EOj);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOm = new JSlider(0, 1000);
        this.EOm.setValue((int)(this.ENM.bxb() * this.EOL));
        this.EOm.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.h(this.EOM, mwa.i(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOm);
        this.EOl = new mkt("Wind End Effect", Float.toString(this.ENM.bxb()));
        jPanel2.add(this.EOl);
        jPanel.add(jPanel2);
    }

    private void t(JPanel jPanel) {
        JPanel jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOo = new JSlider(0, 100);
        this.EOo.setValue((int)(this.ENM.bxc() * this.EOL));
        this.EOo.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.i(this.EOM, mwa.j(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOo);
        this.EOn = new mkt("Gravity Heading", Float.toString(this.ENM.bxc()));
        jPanel2.add(this.EOn);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOq = new JSlider(0, 100);
        this.EOq.setValue((int)(this.ENM.bxd() * this.EOL));
        this.EOq.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.j(this.EOM, mwa.k(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOq);
        this.EOp = new mkt("Gravity Pitch", Float.toString(this.ENM.bxd()));
        jPanel2.add(this.EOp);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOs = new JSlider(0, 1000);
        this.EOs.setValue((int)(this.ENM.bxe() * this.EOL));
        this.EOs.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.k(this.EOM, mwa.l(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOs);
        this.EOr = new mkt("Gravity Scale", Float.toString(this.ENM.bxe()));
        jPanel2.add(this.EOr);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOu = new JSlider(-1000, 1000);
        this.EOu.setValue((int)(this.ENM.bxf() * this.EOL));
        this.EOu.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.l(this.EOM, mwa.m(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOu);
        this.EOt = new mkt("Gravity Acceleration", Float.toString(this.ENM.bxf()));
        jPanel2.add(this.EOt);
        jPanel.add(jPanel2);
    }

    private void u(JPanel jPanel) {
        JPanel jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOw = new JSlider(0, 100);
        this.EOw.setValue((int)(this.ENM.bxg() * this.EOL));
        this.EOw.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.m(this.EOM, mwa.n(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOw);
        this.EOv = new mkt("Magnet Heading", Float.toString(this.ENM.bxg()));
        jPanel2.add(this.EOv);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOy = new JSlider(0, 100);
        this.EOy.setValue((int)(this.ENM.bxh() * this.EOL));
        this.EOy.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.n(this.EOM, mwa.o(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOy);
        this.EOx = new mkt("Magnet Pitch", Float.toString(this.ENM.bxh()));
        jPanel2.add(this.EOx);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOA = new JSlider(0, 1000);
        this.EOA.setValue((int)(this.ENM.bxi() * this.EOL));
        this.EOA.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.o(this.EOM, mwa.p(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOA);
        this.EOz = new mkt("Magnet Distance", Float.toString(this.ENM.bxi()));
        jPanel2.add(this.EOz);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOC = new JSlider(0, 1000);
        this.EOC.setValue((int)(this.ENM.bxj() * this.EOL));
        this.EOC.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.p(this.EOM, mwa.q(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOC);
        this.EOB = new mkt("Magnet Strength", Float.toString(this.ENM.bxj()));
        jPanel2.add(this.EOB);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOE = new JSlider(0, 1000);
        this.EOE.setValue((int)(this.ENM.bxk() * this.EOL));
        this.EOE.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.q(this.EOM, mwa.r(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOE);
        this.EOD = new mkt("Magnet Start Effect", Float.toString(this.ENM.bxk()));
        jPanel2.add(this.EOD);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOG = new JSlider(0, 1000);
        this.EOG.setValue((int)(this.ENM.bxl() * this.EOL));
        this.EOG.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.r(this.EOM, mwa.s(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOG);
        this.EOF = new mkt("Magnet End Effect", Float.toString(this.ENM.bxl()));
        jPanel2.add(this.EOF);
        jPanel.add(jPanel2);
    }

    private void l(JPanel jPanel) {
        lcq lcq2 = null;
        Color color = null;
        lcq2 = this.ENM.getStartColor();
        color = new Color(lcq2.r, lcq2.g, lcq2.b, lcq2.a);
        this.EOJ = new mjp(color, "Choose Start color for GUID[" + this.ENM.getGUID() + "]");
        this.EOJ.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.a(this.EOM, new lcq(mwa.t(this.EOM).getColor()));
                mwa.u(this.EOM).setColor(mwa.t(this.EOM).getColor());
            }
        });
        this.EOH = new mkp(this, this.EOJ, "EmitColor", color);
        jPanel.add(this.EOH);
        lcq2 = this.ENM.getEndColor();
        color = new Color(lcq2.r, lcq2.g, lcq2.b, lcq2.a);
        this.EOK = new mjp(color, "Choose End color for GUID[" + this.ENM.getGUID() + "]");
        this.EOK.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.w(this.EOM).setColor(mwa.v(this.EOM).getColor());
                mwa.b(this.EOM, new lcq(mwa.v(this.EOM).getColor()));
            }
        });
        this.EOI = new mkp(this, this.EOK, "FadeColor", color);
        jPanel.add(this.EOI);
        boolean bl = false;
    }

    private void v(JPanel jPanel) {
        JPanel jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.ENW = new JSlider(0, 1000);
        this.ENW.setValue((int)(this.ENM.bwT() * this.EOL));
        this.ENW.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.s(this.EOM, mwa.x(this.EOM).getValue());
            }
        });
        jPanel2.add(this.ENW);
        this.ENV = new mkt("Start Scale", Float.toString(this.ENM.bwT()));
        jPanel2.add(this.ENV);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.ENY = new JSlider(0, 1000);
        this.ENY.setValue((int)(this.ENM.bwU() * this.EOL));
        this.ENY.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.t(this.EOM, mwa.y(this.EOM).getValue());
            }
        });
        jPanel2.add(this.ENY);
        this.ENX = new mkt("End Scale", Float.toString(this.ENM.bwU()));
        jPanel2.add(this.ENX);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOa = new JSlider(0, 1000);
        this.EOa.setValue((int)(this.ENM.bwV() * this.EOL));
        this.EOa.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.u(this.EOM, mwa.z(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOa);
        this.ENZ = new mkt("Start Rotation", Float.toString(this.ENM.bwV()));
        jPanel2.add(this.ENZ);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.EOc = new JSlider(0, 2000);
        this.EOc.setValue((int)(this.ENM.bwW() * this.EOL));
        this.EOc.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mwa EOM;
            {
                this.EOM = mwa2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mwa.v(this.EOM, mwa.A(this.EOM).getValue());
            }
        });
        jPanel2.add(this.EOc);
        this.EOb = new mkt("End Rotation", Float.toString(this.ENM.bwW()));
        jPanel2.add(this.EOb);
        jPanel.add(jPanel2);
    }

    @Override
    protected void z(ActionEvent actionEvent) {
        this.eDD();
        if (this.EOJ != null) {
            this.EOJ.dispose();
        }
        if (this.EOK != null) {
            this.EOK.dispose();
        }
        this.dispose();
    }

    @Override
    protected void A(ActionEvent actionEvent) {
        if (this.EOJ != null) {
            this.EOJ.dispose();
        }
        if (this.EOK != null) {
            this.EOK.dispose();
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
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        if (this.EOH.hasChanged()) {
            lfn.b(0, this.getClass().getName(), "StartLnTColor HAS CHANGED!");
            color = this.EOH.getColor();
            f2 = (float)color.getAlpha() / 255.0f;
            f3 = (float)color.getRed() / 255.0f;
            f4 = (float)color.getGreen() / 255.0f;
            f5 = (float)color.getBlue() / 255.0f;
            fwf2.setStartColor(new lcq(f3, f4, f5, f2));
            n |= 0x1000000;
        }
        if (this.EOI.hasChanged()) {
            lfn.b(0, this.getClass().getName(), "EndLnTColor HAS CHANGED!");
            color = this.EOI.getColor();
            f2 = (float)color.getAlpha() / 255.0f;
            f3 = (float)color.getRed() / 255.0f;
            f4 = (float)color.getGreen() / 255.0f;
            f5 = (float)color.getBlue() / 255.0f;
            fwf2.setEndColor(new lcq(f3, f4, f5, f2));
            n |= 0x2000000;
        }
        if (this.ENN.hasChanged()) {
            fwf2.hS(Float.parseFloat(this.ENN.eCU()));
            n |= 4;
        }
        if (this.ENV.hasChanged()) {
            fwf2.hV(Float.parseFloat(this.ENV.eCU()));
            n |= 0x20;
        }
        if (this.ENX.hasChanged()) {
            fwf2.hW(Float.parseFloat(this.ENX.eCU()));
            n |= 0x40;
        }
        if (this.ENT.hasChanged()) {
            fwf2.setNumParticles(Integer.parseInt(this.ENT.eCU()));
            n |= 0x4000000;
        }
        if (this.ENC.hasChanged()) {
            fwf2.setTextureName(this.ENC.eCU());
            n |= 0x8000000;
        }
        if (n != 0) {
            fwf2.Ij(n);
            this.DEC.a((dxq)fwf2);
        }
    }

    private void pd(float f2) {
        float f3 = f2 / this.EOL;
        this.ENN.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(4);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.hS(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pe(float f2) {
        float f3 = f2 / this.EOL;
        this.ENP.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(16);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.hT(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pf(float f2) {
        float f3 = f2 / this.EOL;
        this.ENR.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(8);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.hU(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void afN(int n) {
        this.ENT.Cf(Integer.toString(n));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(0x4000000);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.setNumParticles(n);
        this.DEC.a((dxq)fwf2);
    }

    private void pg(float f2) {
        float f3 = f2 / this.EOL;
        this.EOd.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(512);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.hZ(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void ph(float f2) {
        float f3 = f2 / this.EOL;
        this.EOf.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(1024);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.ia(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pi(float f2) {
        float f3 = f2 / this.EOL;
        this.EOh.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(2048);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.ib(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pj(float f2) {
        float f3 = f2 / this.EOL;
        this.EOj.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(4096);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.ic(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pk(float f2) {
        float f3 = f2 / this.EOL;
        this.EOl.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(8192);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.id(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pl(float f2) {
        float f3 = f2 / this.EOL;
        this.EOn.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(16384);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.ie(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pm(float f2) {
        float f3 = f2 / this.EOL;
        this.EOp.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(32768);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.if(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pn(float f2) {
        float f3 = f2 / this.EOL;
        this.EOr.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(65536);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.ig(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void po(float f2) {
        float f3 = f2 / this.EOL;
        this.EOt.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(131072);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.ih(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pp(float f2) {
        float f3 = f2 / this.EOL;
        this.EOv.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(262144);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.ii(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pq(float f2) {
        float f3 = f2 / this.EOL;
        this.EOx.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(524288);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.ij(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pr(float f2) {
        float f3 = f2 / this.EOL;
        this.EOz.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(0x100000);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.ik(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void ps(float f2) {
        float f3 = f2 / this.EOL;
        this.EOB.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(0x200000);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.il(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pt(float f2) {
        float f3 = f2 / this.EOL;
        this.EOD.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(0x400000);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.im(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pu(float f2) {
        float f3 = f2 / this.EOL;
        this.EOF.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(0x800000);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.in(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pv(float f2) {
        float f3 = f2 / this.EOL;
        this.ENV.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(32);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.hV(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void pw(float f2) {
        float f3 = f2 / this.EOL;
        this.ENX.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(64);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.hW(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void px(float f2) {
        float f3 = f2 / this.EOL;
        this.ENZ.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(128);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.hX(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void py(float f2) {
        float f3 = f2 / this.EOL;
        this.EOb.Cf(Float.toString(f3));
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(256);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.pV(this.ENM.getGUID());
        fwf2.hY(f3);
        this.DEC.a((dxq)fwf2);
    }

    private void am(lcq lcq2) {
        lfn.b(0, this.getClass().getName(), "Setting StartColor??");
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(0x1000000);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.setStartColor(lcq2);
        this.DEC.a((dxq)fwf2);
    }

    private void an(lcq lcq2) {
        lfn.b(0, this.getClass().getName(), "Setting EndColor");
        fwf fwf2 = (fwf)this.DEC.d(6658);
        fwf2.Ij(0x2000000);
        fwf2.on(this.ENM.getGUID());
        fwf2.f(lcr.qzr);
        fwf2.setEndColor(lcq2);
        this.DEC.a((dxq)fwf2);
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
                hac2.Lb(23);
                try {
                    hac2.setFileName(((File)object).getAbsolutePath());
                    lfn.b(0, this.getClass().getName(), "Thg SaveFile is:" + object);
                }
                catch (Exception exception) {
                    lfn.b(4, this.getClass().getName(), "SFFile Not Found.. New SFFile!");
                }
                hac2.hC(this.ENM.getGUID());
                this.DEC.a((dxq)hac2);
                String string3 = "Saving ParticleSystemTemplate [" + object + "]";
                lfn.b(0, this.getClass().getName(), string3);
            } else {
                JOptionPane.showInternalMessageDialog(this, "Cannot save outside of Install Directory!", "Error: Wrong save area", 0);
            }
        }
    }

    static /* synthetic */ void a(mwa mwa2, ActionEvent actionEvent) {
        mwa2.cM(actionEvent);
    }

    static /* synthetic */ JSlider a(mwa mwa2) {
        return mwa2.ENO;
    }

    static /* synthetic */ void a(mwa mwa2, float f2) {
        mwa2.pd(f2);
    }

    static /* synthetic */ JSlider b(mwa mwa2) {
        return mwa2.ENQ;
    }

    static /* synthetic */ void b(mwa mwa2, float f2) {
        mwa2.pe(f2);
    }

    static /* synthetic */ JSlider c(mwa mwa2) {
        return mwa2.ENS;
    }

    static /* synthetic */ void c(mwa mwa2, float f2) {
        mwa2.pf(f2);
    }

    static /* synthetic */ JSlider d(mwa mwa2) {
        return mwa2.ENU;
    }

    static /* synthetic */ void a(mwa mwa2, int n) {
        mwa2.afN(n);
    }

    static /* synthetic */ JSlider e(mwa mwa2) {
        return mwa2.EOe;
    }

    static /* synthetic */ void d(mwa mwa2, float f2) {
        mwa2.pg(f2);
    }

    static /* synthetic */ JSlider f(mwa mwa2) {
        return mwa2.EOg;
    }

    static /* synthetic */ void e(mwa mwa2, float f2) {
        mwa2.ph(f2);
    }

    static /* synthetic */ JSlider g(mwa mwa2) {
        return mwa2.EOi;
    }

    static /* synthetic */ void f(mwa mwa2, float f2) {
        mwa2.pi(f2);
    }

    static /* synthetic */ JSlider h(mwa mwa2) {
        return mwa2.EOk;
    }

    static /* synthetic */ void g(mwa mwa2, float f2) {
        mwa2.pj(f2);
    }

    static /* synthetic */ JSlider i(mwa mwa2) {
        return mwa2.EOm;
    }

    static /* synthetic */ void h(mwa mwa2, float f2) {
        mwa2.pk(f2);
    }

    static /* synthetic */ JSlider j(mwa mwa2) {
        return mwa2.EOo;
    }

    static /* synthetic */ void i(mwa mwa2, float f2) {
        mwa2.pl(f2);
    }

    static /* synthetic */ JSlider k(mwa mwa2) {
        return mwa2.EOq;
    }

    static /* synthetic */ void j(mwa mwa2, float f2) {
        mwa2.pm(f2);
    }

    static /* synthetic */ JSlider l(mwa mwa2) {
        return mwa2.EOs;
    }

    static /* synthetic */ void k(mwa mwa2, float f2) {
        mwa2.pn(f2);
    }

    static /* synthetic */ JSlider m(mwa mwa2) {
        return mwa2.EOu;
    }

    static /* synthetic */ void l(mwa mwa2, float f2) {
        mwa2.po(f2);
    }

    static /* synthetic */ JSlider n(mwa mwa2) {
        return mwa2.EOw;
    }

    static /* synthetic */ void m(mwa mwa2, float f2) {
        mwa2.pp(f2);
    }

    static /* synthetic */ JSlider o(mwa mwa2) {
        return mwa2.EOy;
    }

    static /* synthetic */ void n(mwa mwa2, float f2) {
        mwa2.pq(f2);
    }

    static /* synthetic */ JSlider p(mwa mwa2) {
        return mwa2.EOA;
    }

    static /* synthetic */ void o(mwa mwa2, float f2) {
        mwa2.pr(f2);
    }

    static /* synthetic */ JSlider q(mwa mwa2) {
        return mwa2.EOC;
    }

    static /* synthetic */ void p(mwa mwa2, float f2) {
        mwa2.ps(f2);
    }

    static /* synthetic */ JSlider r(mwa mwa2) {
        return mwa2.EOE;
    }

    static /* synthetic */ void q(mwa mwa2, float f2) {
        mwa2.pt(f2);
    }

    static /* synthetic */ JSlider s(mwa mwa2) {
        return mwa2.EOG;
    }

    static /* synthetic */ void r(mwa mwa2, float f2) {
        mwa2.pu(f2);
    }

    static /* synthetic */ mjp t(mwa mwa2) {
        return mwa2.EOJ;
    }

    static /* synthetic */ void a(mwa mwa2, lcq lcq2) {
        mwa2.am(lcq2);
    }

    static /* synthetic */ mkp u(mwa mwa2) {
        return mwa2.EOH;
    }

    static /* synthetic */ mjp v(mwa mwa2) {
        return mwa2.EOK;
    }

    static /* synthetic */ mkp w(mwa mwa2) {
        return mwa2.EOI;
    }

    static /* synthetic */ void b(mwa mwa2, lcq lcq2) {
        mwa2.an(lcq2);
    }

    static /* synthetic */ JSlider x(mwa mwa2) {
        return mwa2.ENW;
    }

    static /* synthetic */ void s(mwa mwa2, float f2) {
        mwa2.pv(f2);
    }

    static /* synthetic */ JSlider y(mwa mwa2) {
        return mwa2.ENY;
    }

    static /* synthetic */ void t(mwa mwa2, float f2) {
        mwa2.pw(f2);
    }

    static /* synthetic */ JSlider z(mwa mwa2) {
        return mwa2.EOa;
    }

    static /* synthetic */ void u(mwa mwa2, float f2) {
        mwa2.px(f2);
    }

    static /* synthetic */ JSlider A(mwa mwa2) {
        return mwa2.EOc;
    }

    static /* synthetic */ void v(mwa mwa2, float f2) {
        mwa2.py(f2);
    }
}

