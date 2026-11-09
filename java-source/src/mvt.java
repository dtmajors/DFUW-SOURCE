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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mvt
extends mkx {
    private aux DEC = null;
    private mla ELJ = null;
    private mkt ELK = null;
    private mku ELL = null;
    private mku ELM = null;
    private mla ELN = null;
    private mla ELO = null;
    private mku ELP = null;
    private mku ELQ = null;
    private mkl ELR = null;
    private mkl ELS = null;
    private mkn ELT = null;
    private mkp ELU = null;
    private mjp ELV = null;
    private drd nB = null;
    private mku ELW = null;
    private JButton ELX = null;
    private float ELY = 628.31854f;
    private Dimension bV = new Dimension(800, 400);

    public mvt(drd drd2) {
        assert (drd2 != null) : "Planet cannot be null!";
        this.nB = drd2;
        this.setTitle("Planet Properties");
        this.setPreferredSize(this.bV);
        this.setClosable(true);
        this.ePH();
        this.pack();
    }

    private void ePH() {
        JPanel jPanel = new JPanel(new FlowLayout(2));
        this.ELJ = new mla("Intensity", 0.0f, 1.0f, this.nB.bvj(), 2);
        this.ELJ.a(new ChangeListener(this){
            final /* synthetic */ mvt ELZ;
            {
                this.ELZ = mvt2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                mvt.a(this.ELZ, mvt.a(this.ELZ).getValue());
            }
        });
        jPanel.add(this.ELJ);
        lcq lcq2 = null;
        Color color = null;
        lcq2 = this.nB.bvi();
        color = new Color(lcq2.r, lcq2.g, lcq2.b, lcq2.a);
        this.ELV = new mjp(color, "Choose Planet Color for GUID[" + this.nB.getGUID() + "]");
        this.ELV.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvt ELZ;
            {
                this.ELZ = mvt2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvt.a(this.ELZ, new lcq(mvt.b(this.ELZ).getColor()));
                mvt.c(this.ELZ).setColor(mvt.b(this.ELZ).getColor());
            }
        });
        this.ELU = new mkp(this, this.ELV, "Light Color", color);
        jPanel.add(this.ELU);
        JPanel jPanel2 = new JPanel();
        jPanel2.setBorder(new EtchedBorder());
        this.ELX = new JButton("Get Camera Rotation");
        this.ELX.addActionListener(new ActionListener(this){
            final /* synthetic */ mvt ELZ;
            {
                this.ELZ = mvt2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvt.a(this.ELZ, actionEvent);
            }
        });
        jPanel2.add((Component)this.ELX, "North");
        this.ELM = new mku("Rotation", this.nB.bve());
        jPanel2.add(this.ELM);
        jPanel.add(jPanel2);
        int n = (int)this.ELY;
        this.ELN = new mla("RotationX", 0.0f, (float)Math.PI * 2, this.nB.bve().x, 2);
        this.ELN.a(new ChangeListener(this){
            final /* synthetic */ mvt ELZ;
            {
                this.ELZ = mvt2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                if (!jSlider.getValueIsAdjusting()) {
                    mvt.b(this.ELZ, mvt.d(this.ELZ).getValue());
                }
            }
        });
        jPanel.add(this.ELN);
        this.ELO = new mla("RotationZ", 0.0f, (float)Math.PI * 2, this.nB.bve().rlV, 2);
        this.ELO.a(new ChangeListener(this){
            final /* synthetic */ mvt ELZ;
            {
                this.ELZ = mvt2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                if (!jSlider.getValueIsAdjusting()) {
                    mvt.c(this.ELZ, mvt.e(this.ELZ).getValue());
                }
            }
        });
        jPanel.add(this.ELO);
        this.ELP = new mku("Local Rotation", this.nB.bvf());
        jPanel.add(this.ELP);
        this.ELL = new mku("Distance", this.nB.buZ());
        jPanel.add(this.ELL);
        this.ELQ = new mku("Self-Light Direction", this.nB.bvg());
        jPanel.add(this.ELQ);
        this.ELR = new mkl("Visible ", this.nB.isVisible());
        jPanel.add(this.ELR);
        this.ELS = new mkl("Active ", this.nB.bvk());
        jPanel.add(this.ELS);
        this.ELK = new mkt("Logical Distance ", Float.toString(this.nB.bvh()));
        jPanel.add(this.ELK);
        this.ELT = new mkn("Planet Filename", this.nB.blU());
        jPanel.add(this.ELT);
        this.DGa.add(jPanel);
    }

    @Override
    protected void eDD() {
        fah fah2 = (fah)this.DEC.d(1797);
        fah2.on(this.nB.getGUID());
        fah2.f(lcr.qAE);
        int n = 0;
        if (this.ELL.hasChanged()) {
            n |= 4;
            fah2.cm(this.ELL.bSh());
        }
        if (this.ELP.hasChanged()) {
            n |= 0x20;
            fah2.co(this.ELP.bSh());
        }
        if (this.ELM.hasChanged()) {
            n |= 0x10;
            fah2.cn(this.ELM.bSh());
        }
        if (this.ELQ.hasChanged()) {
            n |= 0x400;
            fah2.cp(this.ELQ.bSh());
        }
        if (this.ELR.hasChanged()) {
            n |= 0x100;
            fah2.setVisible(this.ELR.eDr());
        }
        if (this.ELS.hasChanged()) {
            n |= 0x200;
            fah2.setActive(this.ELS.eDr());
        }
        if (this.ELK.hasChanged()) {
            n |= 8;
            fah2.hw(Float.parseFloat(this.ELK.eCU()));
        }
        if (n != 0) {
            fah2.FZ(n);
            this.DEC.a((dxq)fah2);
        } else {
            lfn.b(0, "SFPlanetPropertiesDialog", "ApplyChanges() : Nothing to do. Not sending Message!");
        }
    }

    private void oL(float f2) {
        fah fah2 = (fah)this.DEC.d(1797);
        fah2.FZ(128);
        fah2.on(this.nB.getGUID());
        fah2.f(lcr.qAE);
        fah2.hx(f2);
        this.DEC.a((dxq)fah2);
    }

    private void oM(float f2) {
        ljq ljq2 = this.ELM.bSh();
        ljq2.kl(f2);
        this.ELM.cL(ljq2);
        fah fah2 = (fah)this.DEC.d(1797);
        fah2.FZ(16);
        fah2.on(this.nB.getGUID());
        fah2.f(lcr.qAE);
        fah2.cn(new ljq(ljq2));
        this.DEC.a((dxq)fah2);
    }

    private void oN(float f2) {
        ljq ljq2 = this.ELM.bSh();
        ljq2.fb(f2);
        this.ELM.cL(ljq2);
        fah fah2 = (fah)this.DEC.d(1797);
        fah2.FZ(16);
        fah2.on(this.nB.getGUID());
        fah2.f(lcr.qAE);
        fah2.cn(new ljq(ljq2));
        this.DEC.a((dxq)fah2);
    }

    private void ad(lcq lcq2) {
        fah fah2 = (fah)this.DEC.d(1797);
        fah2.on(this.nB.getGUID());
        fah2.f(lcr.qAE);
        fah2.FZ(64);
        fah2.r(lcq2);
        this.DEC.a((dxq)fah2);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void cZ(ActionEvent actionEvent) {
        ljq ljq2 = new ljq(mje.DBm);
        ljq2.es(new ljq(1.5707964f, 0.0f, 0.0f));
        this.ELM.cL(ljq2);
    }

    static /* synthetic */ mla a(mvt mvt2) {
        return mvt2.ELJ;
    }

    static /* synthetic */ void a(mvt mvt2, float f2) {
        mvt2.oL(f2);
    }

    static /* synthetic */ mjp b(mvt mvt2) {
        return mvt2.ELV;
    }

    static /* synthetic */ void a(mvt mvt2, lcq lcq2) {
        mvt2.ad(lcq2);
    }

    static /* synthetic */ mkp c(mvt mvt2) {
        return mvt2.ELU;
    }

    static /* synthetic */ void a(mvt mvt2, ActionEvent actionEvent) {
        mvt2.cZ(actionEvent);
    }

    static /* synthetic */ mla d(mvt mvt2) {
        return mvt2.ELN;
    }

    static /* synthetic */ void b(mvt mvt2, float f2) {
        mvt2.oM(f2);
    }

    static /* synthetic */ mla e(mvt mvt2) {
        return mvt2.ELO;
    }

    static /* synthetic */ void c(mvt mvt2, float f2) {
        mvt2.oN(f2);
    }
}

