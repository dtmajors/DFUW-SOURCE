/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mlq
extends mkx {
    private lkw[] DJm = null;
    private ldv rqm = null;
    private mkn[] DJn = null;
    private mkt[] DJo = null;
    private mkt[] DJp = null;
    private mjr[] DJq = null;
    private mjr[] DJr = null;
    private JSlider[] DJs = null;
    private float DJt = 100.0f;
    private int DJu = 0;
    private int DJv = 100;
    private mla[] DJw = null;
    private mla[] DJx;
    private mla DJy;
    private mkl DJz = new mkl("Lock Weights?", false);
    private Dimension DJA = new Dimension(500, 650);
    private aux DEC = null;
    private String DJB = "no title";
    private boolean DJC = true;
    private float DJD = 0.0f;
    private float DJE = 5.0f;

    public mlq(aux aux2, String string, ldv ldv2, lkw[] lkwArray) {
        this.DJB = string;
        this.DEC = aux2;
        this.rqm = ldv2;
        this.DJm = lkwArray;
        this.setTitle("| " + this.DJB + "| NrOfTracks [" + this.DJm.length + "]");
        this.setPreferredSize(this.DJA);
        this.setMinimumSize(this.DJA);
        this.setClosable(true);
        int n = this.DJm.length;
        this.DJn = new mkn[n];
        this.DJo = new mkt[n];
        this.DJp = new mkt[n];
        this.DJq = new mjr[n];
        this.DJr = new mjr[n];
        this.DJs = new JSlider[n];
        this.DJw = new mla[n];
        this.DJx = new mla[n];
        this.eEl();
        Box box = Box.createVerticalBox();
        JScrollPane jScrollPane = new JScrollPane(box);
        this.DGa.add((Component)jScrollPane, "Center");
        JPanel jPanel = null;
        for (int i = 0; i < this.DJm.length; ++i) {
            jPanel = this.b(this.DJm[i], i);
            box.add(jPanel);
        }
        box.add(this.eEk());
        this.pack();
    }

    private JPanel eEk() {
        JPanel jPanel = new JPanel(new FlowLayout(0));
        jPanel.setPreferredSize(new Dimension(480, 100));
        jPanel.setBorder(new EtchedBorder());
        this.DJy = new mla("Global Blending", this.DJD, 1.0f, 0.0f, 2);
        this.DJy.a(new ChangeListener(this){
            final /* synthetic */ mlq DJF;
            {
                this.DJF = mlq2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                if (!jSlider.getValueIsAdjusting()) {
                    mlq.a(this.DJF, mlq.a(this.DJF).getValue());
                }
            }
        });
        jPanel.add(this.DJy);
        jPanel.add(this.DJz);
        return jPanel;
    }

    private void eEl() {
        JPanel jPanel = new JPanel(new FlowLayout());
        JLabel jLabel = new JLabel(this.DJB);
        jPanel.add(jLabel);
        this.DGa.add((Component)jPanel, "North");
    }

    private JPanel b(lkw lkw2, int n) {
        JPanel jPanel = new JPanel(new FlowLayout(2));
        jPanel.setBorder(new EtchedBorder(1, Color.white, Color.black));
        jPanel.setPreferredSize(new Dimension(480, 150));
        if (lkw2 == null) {
            lfn.b(5, "SFAnimationBlendingDialog", "createTrackPane() : AnimationTrack [" + n + "] is null!");
            return jPanel;
        }
        JPanel jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.DJp[n] = new mkt("Weight", Float.toString(lkw2.bEY()));
        jPanel2.add(this.DJp[n]);
        this.DJs[n] = new JSlider(this.DJu, this.DJv);
        this.DJs[n].setValue((int)(lkw2.bEY() * this.DJt));
        this.DJs[n].addChangeListener(new ChangeListener(this, n){
            final /* synthetic */ int DIY;
            final /* synthetic */ mlq DJF;
            {
                this.DJF = mlq2;
                this.DIY = n;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mlq.a(this.DJF, mlq.b(this.DJF)[this.DIY].getValue(), this.DIY);
            }
        });
        jPanel2.add(this.DJs[n]);
        jPanel.add(jPanel2);
        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.DJw[n] = new mla("Speed", this.DJD, this.DJE, this.DJm[n].bEX(), 2);
        this.DJw[n].a(new ChangeListener(this, n){
            final /* synthetic */ int DIY;
            final /* synthetic */ mlq DJF;
            {
                this.DJF = mlq2;
                this.DIY = n;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mlq.a(this.DJF, mlq.c(this.DJF)[this.DIY].getValue(), this.DIY);
            }
        });
        jPanel2.add(this.DJw[n]);
        jPanel.add(jPanel2);
        this.DJx[n] = new mla("Track Position (secs)", this.DJD, this.DJE, (float)lkw2.bEZ(), 2);
        this.DJx[n].a(new ChangeListener(this, n){
            final /* synthetic */ int DIY;
            final /* synthetic */ mlq DJF;
            {
                this.DJF = mlq2;
                this.DIY = n;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mlq.b(this.DJF, mlq.d(this.DJF)[this.DIY].getValue(), this.DIY);
            }
        });
        jPanel.add(this.DJx[n]);
        this.DJn[n] = new mkn("TrackNr", Integer.toString(lkw2.bEU()));
        jPanel.add(this.DJn[n]);
        this.DJo[n] = new mkt("SetName", lkw2.dZF());
        jPanel.add(this.DJo[n]);
        int n2 = 0;
        if (lkw2.bEW()) {
            n2 = 1;
        }
        this.DJq[n] = new mjr("Enabled:", (Object[])new String[]{"FALSE", "TRUE"}, n2);
        jPanel.add(this.DJq[n]);
        n2 = lkw2.bES() - 1;
        if (n2 < 0) {
            n2 = 0;
        }
        this.DJr[n] = new mjr("Priority:", (Object[])new String[]{"LOW", "HIGH"}, n2);
        jPanel.add(this.DJr[n]);
        return jPanel;
    }

    @Override
    protected void eDD() {
        for (int i = 0; i < this.DJm.length; ++i) {
            dzy dzy2 = (dzy)this.DEC.d(7428);
            dzy2.on(this.rqm);
            dzy2.f(lcr.qzr);
            dzy2.Do(this.DJm[i].bEU());
            int n = 0;
            if (this.DJo[i].hasChanged()) {
                n |= 0x20;
                int n2 = Integer.parseInt(this.DJo[i].eCU());
                dzy2.Dp(n2);
            }
            if (this.DJq[i].hasChanged()) {
                n |= 0x10;
                if (this.DJq[i].getSelectedIndex() == 0) {
                    this.DJm[i].jQ(false);
                    dzy2.jQ(false);
                } else {
                    this.DJm[i].jQ(true);
                    dzy2.jQ(true);
                }
            }
            if (this.DJr[i].hasChanged()) {
                n |= 1;
                if (this.DJr[i].getSelectedIndex() == 0) {
                    this.DJm[i].Dm(1);
                    dzy2.Dm(1);
                } else {
                    this.DJm[i].Dm(2);
                    dzy2.Dm(2);
                }
            }
            if (n == 0) continue;
            dzy2.Dn(n);
            lfn.b(0, "SFAnimationTrackPropertyDialog", "ApplyChanges() : Sending AnimationTrack Message!");
            this.DEC.a((dxq)dzy2);
        }
    }

    private void f(float f2, int n) {
        dzy dzy2 = (dzy)this.DEC.d(7428);
        dzy2.Dn(8);
        dzy2.Do(this.DJm[n].bEU());
        dzy2.on(this.rqm);
        dzy2.f(lcr.qAE);
        dzy2.cb(f2);
        this.DEC.a((dxq)dzy2);
    }

    private void gn(int n, int n2) {
        float f2 = (float)n / this.DJt;
        this.DJp[n2].Cf(Float.toString(f2));
        dzy dzy2 = (dzy)this.DEC.d(7428);
        dzy2.Dn(4);
        dzy2.Do(this.DJm[n2].bEU());
        dzy2.on(this.rqm);
        dzy2.f(lcr.qAE);
        dzy2.iG(f2);
        this.DEC.a((dxq)dzy2);
        if (this.DJz.eDr()) {
            for (int i = 0; i < this.DJm.length; ++i) {
                if (i == n2) continue;
                if (n + this.DJs[i].getValue() >= this.DJv && this.DJs[i].getValue() != this.DJu) {
                    this.DJs[i].setValue(this.DJv - n);
                    float f3 = (float)this.DJs[i].getValue() / this.DJt;
                    this.DJp[i].Cf(Float.toString(f3));
                    dzy2 = (dzy)this.DEC.d(7428);
                    dzy2.Dn(4);
                    dzy2.Do(this.DJm[i].bEU());
                    dzy2.on(this.rqm);
                    dzy2.f(lcr.qAE);
                    dzy2.iG(f3);
                    this.DEC.a((dxq)dzy2);
                }
                n += this.DJs[i].getValue();
            }
        }
    }

    private void g(float f2, int n) {
        dzy dzy2 = (dzy)this.DEC.d(7428);
        dzy2.Dn(2);
        dzy2.Do(this.DJm[n].bEU());
        dzy2.on(this.rqm);
        dzy2.f(lcr.qAE);
        dzy2.iF(f2);
        this.DEC.a((dxq)dzy2);
    }

    private void os(float f2) {
        lfn.b(0, "SFAnimationBlendingDialog", "applyGlobalBlendingSliderChanges() : GobalPrio!");
        dzy dzy2 = (dzy)this.DEC.d(7428);
        dzy2.Dn(64);
        dzy2.Do(0);
        dzy2.on(this.rqm);
        dzy2.f(lcr.qAE);
        dzy2.iG(f2);
        this.DEC.a((dxq)dzy2);
    }

    static /* synthetic */ mla a(mlq mlq2) {
        return mlq2.DJy;
    }

    static /* synthetic */ void a(mlq mlq2, float f2) {
        mlq2.os(f2);
    }

    static /* synthetic */ JSlider[] b(mlq mlq2) {
        return mlq2.DJs;
    }

    static /* synthetic */ void a(mlq mlq2, int n, int n2) {
        mlq2.gn(n, n2);
    }

    static /* synthetic */ mla[] c(mlq mlq2) {
        return mlq2.DJw;
    }

    static /* synthetic */ void a(mlq mlq2, float f2, int n) {
        mlq2.g(f2, n);
    }

    static /* synthetic */ mla[] d(mlq mlq2) {
        return mlq2.DJx;
    }

    static /* synthetic */ void b(mlq mlq2, float f2, int n) {
        mlq2.f(f2, n);
    }
}

