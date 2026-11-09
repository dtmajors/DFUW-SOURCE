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
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mvx
extends mlc {
    private drt EMM = null;
    private int EMN = 0;
    private aux DEC = null;
    private int EMO = 0;
    private mkq EMP = null;
    private mkq EMQ = null;
    private mkq EMR = null;
    private mku EGC = null;
    private mkt EMS = null;
    private mku EMT = null;
    private mku EMs = null;
    private mjp EMU = null;
    private mjp EMV = null;
    private mjp EMW = null;
    private JButton EMX = null;
    private boolean EMY = false;

    public mvx(drt drt2) {
        this.setTitle("Light properties");
        this.setPreferredSize(new Dimension(450, 300));
        this.EMM = drt2;
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
        this.addTab("Color", jPanel);
        if (this.EMM.getObjectType() == 10) {
            this.EMO = 1;
            jPanel = new JPanel();
            jPanel.setLayout(new FlowLayout(0));
            this.o(jPanel);
            this.addTab("DirectionalLight specifics", jPanel);
        } else if (this.EMM.getObjectType() == 8) {
            this.EMO = 4;
            jPanel = new JPanel();
            jPanel.setLayout(new FlowLayout(0));
            this.k(jPanel);
            this.addTab("Position", jPanel);
            jPanel = new JPanel();
            jPanel.setLayout(new FlowLayout(0));
            this.n(jPanel);
            this.addTab("PointLight specifics", jPanel);
        } else if (this.EMM.getObjectType() == 9) {
            this.EMO = 2;
            jPanel = new JPanel();
            jPanel.setLayout(new FlowLayout(0));
            this.k(jPanel);
            this.addTab("Position", jPanel);
            jPanel = new JPanel();
            jPanel.setLayout(new FlowLayout(0));
            this.m(jPanel);
            this.addTab("SpotLight specifics", jPanel);
        }
    }

    private void j(JPanel jPanel) {
        mkn mkn2 = null;
        mkn2 = new mkn("LightType", amh.bxE[this.EMM.getObjectType()]);
        jPanel.add(mkn2);
        mkn2 = new mkn("GUID", this.EMM.getGUID().toString());
        jPanel.add(mkn2);
        this.EMX = new JButton("Show Light Gizmo");
        this.EMX.addActionListener(new ActionListener(this){
            final /* synthetic */ mvx EMZ;
            {
                this.EMZ = mvx2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvx.a(this.EMZ, actionEvent);
            }
        });
        jPanel.add(this.EMX);
    }

    private void l(JPanel jPanel) {
        lco lco2 = null;
        Color color = null;
        lco2 = this.EMM.bws();
        color = new Color(lco2.qwk, lco2.qwl, lco2.qwm);
        this.EMU = new mjp(color, "Choose Ambient color for GUID[" + this.EMM.getGUID() + "]");
        this.EMU.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvx EMZ;
            {
                this.EMZ = mvx2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvx.a(this.EMZ, new lco(mvx.a(this.EMZ).getColor()));
                mvx.b(this.EMZ).setColor(mvx.a(this.EMZ).getColor());
            }
        });
        this.EMP = new mkq(this, this.EMU, "Ambient", color);
        jPanel.add(this.EMP);
        lco2 = this.EMM.bwo();
        color = new Color(lco2.qwk, lco2.qwl, lco2.qwm);
        this.EMV = new mjp(color, "Choose Diffuse color for GUID[" + this.EMM.getGUID() + "]");
        this.EMV.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvx EMZ;
            {
                this.EMZ = mvx2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvx.b(this.EMZ, new lco(mvx.c(this.EMZ).getColor()));
                mvx.d(this.EMZ).setColor(mvx.c(this.EMZ).getColor());
            }
        });
        this.EMQ = new mkq(this, this.EMV, "Diffuse", color);
        jPanel.add(this.EMQ);
        lco2 = this.EMM.bwp();
        color = new Color(lco2.qwk, lco2.qwl, lco2.qwm);
        this.EMW = new mjp(color, "Choose Specular color for GUID[" + this.EMM.getGUID() + "]");
        this.EMW.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvx EMZ;
            {
                this.EMZ = mvx2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvx.c(this.EMZ, new lco(mvx.e(this.EMZ).getColor()));
                mvx.f(this.EMZ).setColor(mvx.e(this.EMZ).getColor());
            }
        });
        this.EMR = new mkq(this, this.EMW, "Specular", color);
        jPanel.add(this.EMR);
    }

    private void m(JPanel jPanel) {
        lfn.b(4, this.getClass().getName(), ".buildSpotLightingTab  NOT IMPLMENTED!");
    }

    private void n(JPanel jPanel) {
        this.EMS = new mkt("Range", Float.toString(((dru)this.EMM).getRange()));
        jPanel.add(this.EMS);
    }

    private void o(JPanel jPanel) {
        if (this.EMM.getObjectType() == 9) {
            this.EMs = new mku("Direction", ((drw)this.EMM).bpa());
            jPanel.add(this.EMs);
        } else if (this.EMM.getObjectType() == 10) {
            this.EMs = new mku("Direction", ((drr)this.EMM).bpa());
            jPanel.add(this.EMs);
        }
    }

    private void k(JPanel jPanel) {
        if (this.EMM.getObjectType() == 9 || this.EMM.getObjectType() == 8) {
            this.EGC = new mku("Position", ((dru)this.EMM).av());
            jPanel.add(this.EGC);
        }
    }

    @Override
    protected void z(ActionEvent actionEvent) {
        this.eDD();
        if (this.EMU != null) {
            this.EMU.dispose();
        }
        if (this.EMV != null) {
            this.EMV.dispose();
        }
        if (this.EMW != null) {
            this.EMW.dispose();
        }
        this.dispose();
    }

    @Override
    protected void A(ActionEvent actionEvent) {
        if (this.EMU != null) {
            this.EMU.dispose();
        }
        if (this.EMV != null) {
            this.EMV.dispose();
        }
        if (this.EMW != null) {
            this.EMW.dispose();
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
        fpg fpg2 = (fpg)this.DEC.d(1537);
        fpg2.on(this.EMM.getGUID());
        fpg2.f(lcr.qzr);
        if (this.EMP.hasChanged()) {
            color = this.EMP.getColor();
            f2 = color.getRed();
            f3 = color.getGreen();
            f4 = color.getBlue();
            fpg2.i(new lco(f2 /= 255.0f, f3 /= 255.0f, f4 /= 255.0f));
            n |= 8;
        }
        if (this.EMQ.hasChanged()) {
            color = this.EMQ.getColor();
            f2 = color.getRed();
            f3 = color.getGreen();
            f4 = color.getBlue();
            fpg2.j(new lco(f2 /= 255.0f, f3 /= 255.0f, f4 /= 255.0f));
            n |= 0x10;
        }
        if (this.EMR.hasChanged()) {
            color = this.EMR.getColor();
            f2 = color.getRed();
            f3 = color.getGreen();
            f4 = color.getBlue();
            fpg2.k(new lco(f2 /= 255.0f, f3 /= 255.0f, f4 /= 255.0f));
            n |= 0x20;
        }
        if (this.EMM.getObjectType() == 10) {
            this.a(n, fpg2);
        } else if (this.EMM.getObjectType() == 8) {
            this.b(n, fpg2);
        } else if (this.EMM.getObjectType() == 9) {
            this.c(n, fpg2);
        }
    }

    private void a(int n, fpg fpg2) {
        if (this.EMs.hasChanged()) {
            ljq ljq2 = this.EMs.bSh();
            fpg2.cq(ljq2);
            n |= 0x40;
            lfn.b(0, this.getClass().getName(), "DirectionalLight Direction has changed! New Dir:" + ljq2);
        }
        if (n != 0) {
            fpg2.Hl(n |= 1);
            this.DEC.a((dxq)fpg2);
        }
    }

    private void b(int n, fpg fpg2) {
        if (this.EMS.hasChanged()) {
            float f2 = 0.0f;
            try {
                f2 = Float.parseFloat(this.EMS.eCU());
            }
            catch (Exception exception) {
                System.out.println("The Range string is not FLOAT compatible!");
            }
            n |= 0x100;
            fpg2.setRange(f2);
        }
        if (this.EGC.hasChanged()) {
            ljq ljq2 = this.EGC.bSh();
            fpg2.c(ljq2);
            n |= 0x80;
            lfn.b(0, this.getClass().getName(), "PointLight Position has changed! New Pos:" + ljq2);
        }
        if (n != 0) {
            fpg2.Hl(n |= 4);
            this.DEC.a((dxq)fpg2);
        }
    }

    private void c(int n, fpg fpg2) {
        if (n != 0) {
            fpg2.Hl(n |= 2);
            this.DEC.a((dxq)fpg2);
        }
    }

    private void n(lco lco2) {
        fpg fpg2 = (fpg)this.DEC.d(1537);
        fpg2.Hl(8 | this.EMO);
        fpg2.on(this.EMM.getGUID());
        fpg2.f(lcr.qzr);
        fpg2.i(lco2);
        this.DEC.a((dxq)fpg2);
    }

    private void o(lco lco2) {
        fpg fpg2 = (fpg)this.DEC.d(1537);
        fpg2.Hl(0x10 | this.EMO);
        fpg2.on(this.EMM.getGUID());
        fpg2.f(lcr.qzr);
        fpg2.j(lco2);
        this.DEC.a((dxq)fpg2);
    }

    private void p(lco lco2) {
        fpg fpg2 = (fpg)this.DEC.d(1537);
        fpg2.Hl(0x20 | this.EMO);
        fpg2.on(this.EMM.getGUID());
        fpg2.f(lcr.qzr);
        fpg2.k(lco2);
        this.DEC.a((dxq)fpg2);
    }

    private void da(ActionEvent actionEvent) {
        if (!this.EMY && this.EMM.getObjectType() != 10) {
            this.eQL();
            this.EMY = true;
        }
    }

    private void eQL() {
        hac hac2 = (hac)this.DEC.d(4097);
        hac2.Lb(17);
        hac2.on(lcr.qzr);
        hac2.f(lcr.qzr);
        hac2.hC(this.EMM.getGUID());
        this.DEC.a((dxq)hac2);
    }

    static /* synthetic */ void a(mvx mvx2, ActionEvent actionEvent) {
        mvx2.da(actionEvent);
    }

    static /* synthetic */ mjp a(mvx mvx2) {
        return mvx2.EMU;
    }

    static /* synthetic */ void a(mvx mvx2, lco lco2) {
        mvx2.n(lco2);
    }

    static /* synthetic */ mkq b(mvx mvx2) {
        return mvx2.EMP;
    }

    static /* synthetic */ mjp c(mvx mvx2) {
        return mvx2.EMV;
    }

    static /* synthetic */ void b(mvx mvx2, lco lco2) {
        mvx2.o(lco2);
    }

    static /* synthetic */ mkq d(mvx mvx2) {
        return mvx2.EMQ;
    }

    static /* synthetic */ mjp e(mvx mvx2) {
        return mvx2.EMW;
    }

    static /* synthetic */ void c(mvx mvx2, lco lco2) {
        mvx2.p(lco2);
    }

    static /* synthetic */ mkq f(mvx mvx2) {
        return mvx2.EMR;
    }
}

