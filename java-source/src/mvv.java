/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 */
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mvv
extends mkx {
    private aux DEC = null;
    drf EMn = null;
    private mla EMo = null;
    private mla EMp = null;
    private mla EMq = null;
    private mla EMr = null;
    private mku EMs = null;

    public mvv(drf drf2) {
        assert (drf2 != null) : "Wind cannot be null!";
        this.EMn = drf2;
        this.setTitle("Wind Properties");
        this.setSize(550, 400);
        this.setClosable(true);
        this.ePH();
    }

    private void ePH() {
        JPanel jPanel = new JPanel(new FlowLayout(2));
        this.EMo = new mla("Turbidity", 0.0f, 1.0f, this.EMn.bvp(), 2);
        this.EMo.a(new ChangeListener(this){
            final /* synthetic */ mvv EMt;
            {
                this.EMt = mvv2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                if (!jSlider.getValueIsAdjusting()) {
                    mvv.a(this.EMt, mvv.a(this.EMt).getValue());
                }
            }
        });
        jPanel.add(this.EMo);
        this.EMq = new mla("Speed", 0.0f, 1.0f, this.EMn.getSpeed(), 2);
        this.EMq.a(new ChangeListener(this){
            final /* synthetic */ mvv EMt;
            {
                this.EMt = mvv2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                if (!jSlider.getValueIsAdjusting()) {
                    mvv.b(this.EMt, mvv.b(this.EMt).getValue());
                }
            }
        });
        jPanel.add(this.EMq);
        this.EMp = new mla("GustSpeed", 0.0f, 1.0f, this.EMn.bvq(), 2);
        this.EMp.a(new ChangeListener(this){
            final /* synthetic */ mvv EMt;
            {
                this.EMt = mvv2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                if (!jSlider.getValueIsAdjusting()) {
                    mvv.c(this.EMt, mvv.c(this.EMt).getValue());
                }
            }
        });
        jPanel.add(this.EMp);
        this.EMr = new mla("Strength", 0.0f, 1.0f, this.EMn.bnS(), 2);
        this.EMr.a(new ChangeListener(this){
            final /* synthetic */ mvv EMt;
            {
                this.EMt = mvv2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                if (!jSlider.getValueIsAdjusting()) {
                    mvv.d(this.EMt, mvv.d(this.EMt).getValue());
                }
            }
        });
        jPanel.add(this.EMr);
        this.EMs = new mku("Direction", this.EMn.bpa());
        jPanel.add(this.EMs);
        this.DGa.add(jPanel);
    }

    private void oR(float f2) {
        faj faj2 = (faj)this.DEC.d(1798);
        faj2.Ga(2);
        faj2.on(this.EMn.getGUID());
        faj2.f(lcr.qAE);
        faj2.hA(f2);
        this.DEC.a((dxq)faj2);
    }

    private void oS(float f2) {
        faj faj2 = (faj)this.DEC.d(1798);
        faj2.Ga(16);
        faj2.on(this.EMn.getGUID());
        faj2.f(lcr.qAE);
        faj2.hB(f2);
        this.DEC.a((dxq)faj2);
    }

    private void oT(float f2) {
        faj faj2 = (faj)this.DEC.d(1798);
        faj2.Ga(4);
        faj2.on(this.EMn.getGUID());
        faj2.f(lcr.qAE);
        faj2.gL(f2);
        this.DEC.a((dxq)faj2);
    }

    private void oU(float f2) {
        faj faj2 = (faj)this.DEC.d(1798);
        faj2.Ga(32);
        faj2.on(this.EMn.getGUID());
        faj2.f(lcr.qAE);
        faj2.setSpeed(f2);
        this.DEC.a((dxq)faj2);
    }

    @Override
    protected void eDD() {
        faj faj2 = (faj)this.DEC.d(1798);
        faj2.on(this.EMn.getGUID());
        faj2.f(lcr.qAE);
        if (this.EMs.hasChanged()) {
            faj2.Ga(8);
            faj2.cq(this.EMs.bSh());
        }
        if (faj2.bNO() != 0) {
            this.DEC.a((dxq)faj2);
        }
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ mla a(mvv mvv2) {
        return mvv2.EMo;
    }

    static /* synthetic */ void a(mvv mvv2, float f2) {
        mvv2.oR(f2);
    }

    static /* synthetic */ mla b(mvv mvv2) {
        return mvv2.EMq;
    }

    static /* synthetic */ void b(mvv mvv2, float f2) {
        mvv2.oU(f2);
    }

    static /* synthetic */ mla c(mvv mvv2) {
        return mvv2.EMp;
    }

    static /* synthetic */ void c(mvv mvv2, float f2) {
        mvv2.oS(f2);
    }

    static /* synthetic */ mla d(mvv mvv2) {
        return mvv2.EMr;
    }

    static /* synthetic */ void d(mvv mvv2, float f2) {
        mvv2.oT(f2);
    }
}

