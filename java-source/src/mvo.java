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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mvo
extends mkx {
    private aux DEC = null;
    private mla ELk = null;
    private mla ELl = null;
    private mjp ELm = null;
    private mkp ELn = null;
    private mjp ELo = null;
    private mkp ELp = null;
    private Dimension bV = new Dimension(550, 300);
    private mjr ELq = null;
    private mla ELr = null;
    private drb dfd = null;

    public mvo(drb drb2) {
        super(false);
        assert (drb2 != null) : "Cannot show dialog for NULL Atmosphere object!";
        this.dfd = drb2;
        this.setClosable(true);
        this.setTitle("Atmosphere Properties");
        this.setPreferredSize(this.bV);
        this.ePH();
        this.pack();
    }

    public void ePH() {
        JPanel jPanel = new JPanel(new FlowLayout(2));
        this.ELk = new mla("Cloud Cover", 0.0f, 1.0f, this.dfd.buR(), 2);
        this.ELk.a(new ChangeListener(this){
            final /* synthetic */ mvo ELs;
            {
                this.ELs = mvo2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                mvo.a(this.ELs, mvo.a(this.ELs).getValue());
            }
        });
        jPanel.add(this.ELk);
        this.ELl = new mla("Thickness", 0.0f, 1.0f, this.dfd.buS(), 2);
        this.ELl.a(new ChangeListener(this){
            final /* synthetic */ mvo ELs;
            {
                this.ELs = mvo2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                mvo.b(this.ELs, mvo.b(this.ELs).getValue());
            }
        });
        jPanel.add(this.ELl);
        lcq lcq2 = null;
        Color color = null;
        lcq2 = this.dfd.buT();
        color = new Color(lcq2.r, lcq2.g, lcq2.b, lcq2.a);
        this.ELm = new mjp(color, "Cloud Color");
        this.ELm.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvo ELs;
            {
                this.ELs = mvo2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvo.a(this.ELs, new lcq(mvo.c(this.ELs).getColor()));
                mvo.d(this.ELs).setColor(mvo.c(this.ELs).getColor());
            }
        });
        this.ELn = new mkp(this, this.ELm, "Cloud Color", color);
        jPanel.add(this.ELn);
        lcq2 = this.dfd.buU();
        color = new Color(lcq2.r, lcq2.g, lcq2.b, lcq2.a);
        this.ELo = new mjp(color, "Atmospherice Light");
        this.ELo.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvo ELs;
            {
                this.ELs = mvo2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvo.b(this.ELs, new lcq(mvo.e(this.ELs).getColor()));
                mvo.f(this.ELs).setColor(mvo.e(this.ELs).getColor());
            }
        });
        this.ELp = new mkp(this, this.ELo, "Atmospheric Light", color);
        jPanel.add(this.ELp);
        ArrayList<String> arrayList = lcn.emv();
        for (ber.a a2 : ber.a.values()) {
            arrayList.add(a2.name());
        }
        this.ELq = new mjr("Atmospheric Effect", arrayList.toArray(), this.dfd.buV());
        this.ELq.a(new ActionListener(this){
            final /* synthetic */ mvo ELs;
            {
                this.ELs = mvo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvo.h(this.ELs).BA(mvo.g(this.ELs).getSelectedIndex());
            }
        });
        jPanel.add(this.ELq);
        this.ELr = new mla("Atmospheric Effect Density", 0.0f, 1.0f, this.dfd.buW(), 2);
        this.ELr.a(new ChangeListener(this){
            final /* synthetic */ mvo ELs;
            {
                this.ELs = mvo2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvo.h(this.ELs).hu(mvo.i(this.ELs).getValue());
            }
        });
        jPanel.add(this.ELr);
        this.DGa.add(jPanel);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void oI(float f2) {
        fae fae2 = (fae)this.DEC.d(1795);
        fae2.FX(4);
        fae2.on(this.dfd.getGUID());
        fae2.f(lcr.qAE);
        fae2.bZ(f2);
        this.DEC.a((dxq)fae2);
    }

    private void oJ(float f2) {
        fae fae2 = (fae)this.DEC.d(1795);
        fae2.on(this.dfd.getGUID());
        fae2.f(lcr.qAE);
        fae2.FX(16);
        fae2.bY(f2);
        this.DEC.a((dxq)fae2);
    }

    private void aa(lcq lcq2) {
        fae fae2 = (fae)this.DEC.d(1795);
        fae2.on(this.dfd.getGUID());
        fae2.f(lcr.qAE);
        fae2.FX(8);
        fae2.e(lcq2);
        this.DEC.a((dxq)fae2);
    }

    private void ab(lcq lcq2) {
        lfn.b(0, "SFAtmospherePropertiesDialog.ApplyAtmosphericLightChange()", "CALLED");
        fae fae2 = (fae)this.DEC.d(1795);
        fae2.on(this.dfd.getGUID());
        fae2.f(lcr.qAE);
        fae2.FX(32);
        fae2.p(lcq2);
        this.DEC.a((dxq)fae2);
    }

    static /* synthetic */ mla a(mvo mvo2) {
        return mvo2.ELk;
    }

    static /* synthetic */ void a(mvo mvo2, float f2) {
        mvo2.oI(f2);
    }

    static /* synthetic */ mla b(mvo mvo2) {
        return mvo2.ELl;
    }

    static /* synthetic */ void b(mvo mvo2, float f2) {
        mvo2.oJ(f2);
    }

    static /* synthetic */ mjp c(mvo mvo2) {
        return mvo2.ELm;
    }

    static /* synthetic */ void a(mvo mvo2, lcq lcq2) {
        mvo2.aa(lcq2);
    }

    static /* synthetic */ mkp d(mvo mvo2) {
        return mvo2.ELn;
    }

    static /* synthetic */ mjp e(mvo mvo2) {
        return mvo2.ELo;
    }

    static /* synthetic */ void b(mvo mvo2, lcq lcq2) {
        mvo2.ab(lcq2);
    }

    static /* synthetic */ mkp f(mvo mvo2) {
        return mvo2.ELp;
    }

    static /* synthetic */ mjr g(mvo mvo2) {
        return mvo2.ELq;
    }

    static /* synthetic */ drb h(mvo mvo2) {
        return mvo2.dfd;
    }

    static /* synthetic */ mla i(mvo mvo2) {
        return mvo2.ELr;
    }
}

