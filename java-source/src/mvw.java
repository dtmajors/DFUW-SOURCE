/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mvw
extends mkx {
    private aux DEC = null;
    private Dimension bV = new Dimension(420, 550);
    private drs EMu;
    private mla EMv;
    private mkp EMw;
    private mjp EMx;
    private mla EMy;
    private mkp EMz;
    private mjp EMA;
    private mla EMB;
    private mkp EMC;
    private mjp EMD;
    private mla EME;
    private mkp EMF;
    private mjp EMG;
    private mla EMH;
    private mkp EMI;
    private mjp EMJ;
    private mla EMK;

    public mvw(drs drs2) {
        super(false);
        this.EMu = drs2;
        this.setTitle("Light Manager Setup Dialog");
        this.r();
        this.setPreferredSize(this.bV);
        this.setMinimumSize(this.bV);
        this.setMaximumSize(this.bV);
        this.setMaximizable(false);
        this.setClosable(true);
        this.pack();
    }

    private void r() {
        Box box = Box.createVerticalBox();
        JPanel jPanel = new JPanel(new FlowLayout(2));
        this.EMv = new mla("Lerp Frequency", 0.0f, 50.0f, this.EMu.getLerpFrequency(), 2, false);
        this.EMv.a(new ChangeListener(this){
            final /* synthetic */ mvw EML;
            {
                this.EML = mvw2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvw.a(this.EML, mvw.a(this.EML).getValue());
            }
        });
        jPanel.add(this.EMv);
        this.EMx = new mjp(this.EMu.bwe().getColor(), "Choose Global Color 0");
        this.EMx.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvw EML;
            {
                this.EML = mvw2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvw.a(this.EML, new lcq(mvw.b(this.EML).getColor()));
                mvw.c(this.EML).setColor(mvw.b(this.EML).getColor());
            }
        });
        this.EMw = new mkp(this, this.EMx, "Color 0", this.EMu.bwe().getColor(), false);
        jPanel.add(this.EMw);
        this.EMy = new mla("Color0 Power", 0.0f, 1.0f, this.EMu.bwe().a, 2, false);
        this.EMy.a(new ChangeListener(this){
            final /* synthetic */ mvw EML;
            {
                this.EML = mvw2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvw.b(this.EML, mvw.d(this.EML).getValue());
            }
        });
        jPanel.add(this.EMy);
        this.EMA = new mjp(this.EMu.bwf().getColor(), "Choose Global Color 1");
        this.EMA.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvw EML;
            {
                this.EML = mvw2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvw.b(this.EML, new lcq(mvw.e(this.EML).getColor()));
                mvw.f(this.EML).setColor(mvw.e(this.EML).getColor());
            }
        });
        this.EMz = new mkp(this, this.EMA, "Color 1", this.EMu.bwf().getColor(), false);
        jPanel.add(this.EMz);
        this.EMB = new mla("Color1 Power", 0.0f, 1.0f, this.EMu.bwf().a, 2, false);
        this.EMB.a(new ChangeListener(this){
            final /* synthetic */ mvw EML;
            {
                this.EML = mvw2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvw.c(this.EML, mvw.g(this.EML).getValue());
            }
        });
        jPanel.add(this.EMB);
        this.EMD = new mjp(this.EMu.bwg().getColor(), "Choose Global Color 2");
        this.EMD.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvw EML;
            {
                this.EML = mvw2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvw.c(this.EML, new lcq(mvw.h(this.EML).getColor()));
                mvw.i(this.EML).setColor(mvw.h(this.EML).getColor());
            }
        });
        this.EMC = new mkp(this, this.EMD, "Color 2", this.EMu.bwg().getColor(), false);
        jPanel.add(this.EMC);
        this.EME = new mla("Color2 Power", 0.0f, 1.0f, this.EMu.bwg().a, 2, false);
        this.EME.a(new ChangeListener(this){
            final /* synthetic */ mvw EML;
            {
                this.EML = mvw2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvw.d(this.EML, mvw.j(this.EML).getValue());
            }
        });
        jPanel.add(this.EME);
        this.EMG = new mjp(this.EMu.bwi().getColor(), "Choose Global LerpColor End");
        this.EMG.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvw EML;
            {
                this.EML = mvw2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvw.d(this.EML, new lcq(mvw.k(this.EML).getColor()));
                mvw.l(this.EML).setColor(mvw.k(this.EML).getColor());
            }
        });
        this.EMF = new mkp(this, this.EMG, "LerpColor End", this.EMu.bwi().getColor(), false);
        jPanel.add(this.EMF);
        this.EMH = new mla("LerpColor End Power", 0.0f, 1.0f, this.EMu.bwi().a, 2, false);
        this.EMH.a(new ChangeListener(this){
            final /* synthetic */ mvw EML;
            {
                this.EML = mvw2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvw.e(this.EML, mvw.m(this.EML).getValue());
            }
        });
        jPanel.add(this.EMH);
        this.EMJ = new mjp(this.EMu.bwh().getColor(), "Choose Global LerpColor Start");
        this.EMJ.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvw EML;
            {
                this.EML = mvw2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvw.e(this.EML, new lcq(mvw.n(this.EML).getColor()));
                mvw.o(this.EML).setColor(mvw.n(this.EML).getColor());
            }
        });
        this.EMI = new mkp(this, this.EMJ, "LerpColor Start", this.EMu.bwh().getColor(), false);
        jPanel.add(this.EMI);
        this.EMK = new mla("LerpColor Start Power", 0.0f, 1.0f, this.EMu.bwh().a, 2, false);
        this.EMK.a(new ChangeListener(this){
            final /* synthetic */ mvw EML;
            {
                this.EML = mvw2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvw.f(this.EML, mvw.p(this.EML).getValue());
            }
        });
        jPanel.add(this.EMK);
        this.DGa.add(jPanel);
    }

    private void oV(float f2) {
        fpd fpd2 = (fpd)this.DEC.d(1539);
        fpd2.on(this.EMu.getGUID());
        fpd2.f(lcr.qAE);
        fpd2.setLerpFrequency(f2);
        fpd2.Hj(fpd.iSF);
        this.DEC.a((dxq)fpd2);
    }

    private void ae(lcq lcq2) {
        lcq2 = new lcq(lcq2.r, lcq2.g, lcq2.b, this.EMy.getValue());
        fpd fpd2 = (fpd)this.DEC.d(1539);
        fpd2.on(this.EMu.getGUID());
        fpd2.f(lcr.qAE);
        fpd2.t(lcq2);
        fpd2.Hj(fpd.iSA);
        this.DEC.a((dxq)fpd2);
    }

    private void oW(float f2) {
        Color color = this.EMw.getColor();
        lcq lcq2 = new lcq(color.getRed(), color.getGreen(), color.getBlue(), f2);
        fpd fpd2 = (fpd)this.DEC.d(1539);
        fpd2.on(this.EMu.getGUID());
        fpd2.f(lcr.qAE);
        fpd2.t(lcq2);
        fpd2.Hj(fpd.iSA);
        this.DEC.a((dxq)fpd2);
    }

    private void af(lcq lcq2) {
        lcq2 = new lcq(lcq2.r, lcq2.g, lcq2.b, this.EMB.getValue());
        fpd fpd2 = (fpd)this.DEC.d(1539);
        fpd2.on(this.EMu.getGUID());
        fpd2.f(lcr.qAE);
        fpd2.u(lcq2);
        fpd2.Hj(fpd.iSB);
        this.DEC.a((dxq)fpd2);
    }

    private void oX(float f2) {
        Color color = this.EMz.getColor();
        lcq lcq2 = new lcq(color.getRed(), color.getGreen(), color.getBlue(), f2);
        fpd fpd2 = (fpd)this.DEC.d(1539);
        fpd2.on(this.EMu.getGUID());
        fpd2.f(lcr.qAE);
        fpd2.u(lcq2);
        fpd2.Hj(fpd.iSB);
        this.DEC.a((dxq)fpd2);
    }

    private void ag(lcq lcq2) {
        lcq2 = new lcq(lcq2.r, lcq2.g, lcq2.b, this.EME.getValue());
        fpd fpd2 = (fpd)this.DEC.d(1539);
        fpd2.on(this.EMu.getGUID());
        fpd2.f(lcr.qAE);
        fpd2.v(lcq2);
        fpd2.Hj(fpd.iSC);
        this.DEC.a((dxq)fpd2);
    }

    private void oY(float f2) {
        Color color = this.EMC.getColor();
        lcq lcq2 = new lcq(color.getRed(), color.getGreen(), color.getBlue(), f2);
        fpd fpd2 = (fpd)this.DEC.d(1539);
        fpd2.on(this.EMu.getGUID());
        fpd2.f(lcr.qAE);
        fpd2.v(lcq2);
        fpd2.Hj(fpd.iSC);
        this.DEC.a((dxq)fpd2);
    }

    private void ah(lcq lcq2) {
        fpd fpd2 = (fpd)this.DEC.d(1539);
        fpd2.on(this.EMu.getGUID());
        fpd2.f(lcr.qAE);
        fpd2.x(lcq2);
        fpd2.Hj(fpd.iSE);
        this.DEC.a((dxq)fpd2);
    }

    private void oZ(float f2) {
        Color color = this.EMF.getColor();
        lcq lcq2 = new lcq(color.getRed(), color.getGreen(), color.getBlue(), f2);
        fpd fpd2 = (fpd)this.DEC.d(1539);
        fpd2.on(this.EMu.getGUID());
        fpd2.f(lcr.qAE);
        fpd2.x(lcq2);
        fpd2.Hj(fpd.iSE);
        this.DEC.a((dxq)fpd2);
    }

    private void ai(lcq lcq2) {
        fpd fpd2 = (fpd)this.DEC.d(1539);
        fpd2.on(this.EMu.getGUID());
        fpd2.f(lcr.qAE);
        fpd2.w(lcq2);
        fpd2.Hj(fpd.iSD);
        this.DEC.a((dxq)fpd2);
    }

    private void pa(float f2) {
        Color color = this.EMI.getColor();
        lcq lcq2 = new lcq(color.getRed(), color.getGreen(), color.getBlue(), f2);
        fpd fpd2 = (fpd)this.DEC.d(1539);
        fpd2.on(this.EMu.getGUID());
        fpd2.f(lcr.qAE);
        fpd2.w(lcq2);
        fpd2.Hj(fpd.iSD);
        this.DEC.a((dxq)fpd2);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ mla a(mvw mvw2) {
        return mvw2.EMv;
    }

    static /* synthetic */ void a(mvw mvw2, float f2) {
        mvw2.oV(f2);
    }

    static /* synthetic */ mjp b(mvw mvw2) {
        return mvw2.EMx;
    }

    static /* synthetic */ void a(mvw mvw2, lcq lcq2) {
        mvw2.ae(lcq2);
    }

    static /* synthetic */ mkp c(mvw mvw2) {
        return mvw2.EMw;
    }

    static /* synthetic */ mla d(mvw mvw2) {
        return mvw2.EMy;
    }

    static /* synthetic */ void b(mvw mvw2, float f2) {
        mvw2.oW(f2);
    }

    static /* synthetic */ mjp e(mvw mvw2) {
        return mvw2.EMA;
    }

    static /* synthetic */ void b(mvw mvw2, lcq lcq2) {
        mvw2.af(lcq2);
    }

    static /* synthetic */ mkp f(mvw mvw2) {
        return mvw2.EMz;
    }

    static /* synthetic */ mla g(mvw mvw2) {
        return mvw2.EMB;
    }

    static /* synthetic */ void c(mvw mvw2, float f2) {
        mvw2.oX(f2);
    }

    static /* synthetic */ mjp h(mvw mvw2) {
        return mvw2.EMD;
    }

    static /* synthetic */ void c(mvw mvw2, lcq lcq2) {
        mvw2.ag(lcq2);
    }

    static /* synthetic */ mkp i(mvw mvw2) {
        return mvw2.EMC;
    }

    static /* synthetic */ mla j(mvw mvw2) {
        return mvw2.EME;
    }

    static /* synthetic */ void d(mvw mvw2, float f2) {
        mvw2.oY(f2);
    }

    static /* synthetic */ mjp k(mvw mvw2) {
        return mvw2.EMG;
    }

    static /* synthetic */ void d(mvw mvw2, lcq lcq2) {
        mvw2.ah(lcq2);
    }

    static /* synthetic */ mkp l(mvw mvw2) {
        return mvw2.EMF;
    }

    static /* synthetic */ mla m(mvw mvw2) {
        return mvw2.EMH;
    }

    static /* synthetic */ void e(mvw mvw2, float f2) {
        mvw2.oZ(f2);
    }

    static /* synthetic */ mjp n(mvw mvw2) {
        return mvw2.EMJ;
    }

    static /* synthetic */ void e(mvw mvw2, lcq lcq2) {
        mvw2.ai(lcq2);
    }

    static /* synthetic */ mkp o(mvw mvw2) {
        return mvw2.EMI;
    }

    static /* synthetic */ mla p(mvw mvw2) {
        return mvw2.EMK;
    }

    static /* synthetic */ void f(mvw mvw2, float f2) {
        mvw2.pa(f2);
    }
}

