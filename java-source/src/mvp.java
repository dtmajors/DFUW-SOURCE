/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 */
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mvp
extends mkx {
    private aux DEC = null;
    private drk ELt = null;
    private mkp ELu = null;
    private mkp ELv = null;
    private mkt ELw = null;
    private mkt ELx = null;
    private mkt ELy = null;
    private mjr ELz = null;
    private mjr ELA = null;
    private mjr ELB = null;
    private mjp ELC = null;
    private mjp ELD = null;

    public mvp(drk drk2) {
        this.ELt = drk2;
        this.setTitle("FogProperties");
        this.setSize(400, 300);
        this.setClosable(true);
        this.ePH();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void ePH() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        Color color = null;
        lcq lcq2 = this.ELt.bvE();
        color = new Color(lcq2.r, lcq2.g, lcq2.b);
        this.ELC = new mjp(color, "Choose Fog GUID[" + this.ELt.getGUID() + "] color.");
        this.ELC.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvp ELE;
            {
                this.ELE = mvp2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mvp.a(this.ELE, new lcq(mvp.a(this.ELE).getColor()));
                mvp.b(this.ELE).setColor(mvp.a(this.ELE).getColor());
            }
        });
        this.ELu = new mkp(this, this.ELC, "FogColor", color);
        jPanel.add(this.ELu);
        lcq lcq3 = this.ELt.bvF();
        Color color2 = new Color(lcq3.r, lcq3.g, lcq3.b);
        this.ELD = new mjp(color2, "Choose Sky GUID[" + this.ELt.getGUID() + "] color.");
        this.ELD.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvp ELE;
            {
                this.ELE = mvp2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                Color color = mvp.c(this.ELE).getColor();
                mvp.d(this.ELE).s(new lcq(mvp.c(this.ELE).getColor()));
                mvp.e(this.ELE).setColor(mvp.c(this.ELE).getColor());
            }
        });
        this.ELv = new mkp(this, this.ELD, "SkyColor", color2);
        jPanel.add(this.ELv);
        this.ELw = new mkt("Fog Start", Float.toString(this.ELt.bvG()));
        jPanel.add(this.ELw);
        this.ELx = new mkt("Fog End", Float.toString(this.ELt.bvH()));
        jPanel.add(this.ELx);
        this.ELy = new mkt("Density", Float.toString(this.ELt.bvI()));
        jPanel.add(this.ELy);
        int n = 0;
        if (this.ELt.bvM()) {
            n = 1;
        }
        this.ELB = new mjr("Fog On:", (Object[])new String[]{"FALSE", "TRUE"}, n);
        jPanel.add(this.ELB);
        n = 0;
        if (this.ELt.bvJ()) {
            n = 1;
        }
        this.ELz = new mjr("Range Based:", (Object[])new String[]{"FALSE", "TRUE"}, n);
        jPanel.add(this.ELz);
        n = 0;
        if (this.ELt.bvK()) {
            n = 1;
        }
        this.ELA = new mjr("Vertex Fog:", (Object[])new String[]{"FALSE", "TRUE"}, n);
        jPanel.add(this.ELA);
        this.DGa.add(jPanel);
    }

    @Override
    protected void eDD() {
        float f2;
        far far2 = (far)this.DEC.d(1793);
        far2.on(this.ELt.getGUID());
        far2.f(lcr.qzr);
        int n = 0;
        if (this.ELw.hasChanged()) {
            n |= 8;
            f2 = Float.parseFloat(this.ELw.eCU());
            this.ELt.cb(f2);
            far2.cb(f2);
        }
        if (this.ELx.hasChanged()) {
            n |= 0x10;
            f2 = Float.parseFloat(this.ELx.eCU());
            this.ELt.ca(f2);
            far2.ca(f2);
        }
        if (this.ELy.hasChanged()) {
            n |= 0x40;
            f2 = Float.parseFloat(this.ELy.eCU());
            this.ELt.bX(f2);
            far2.bX(f2);
        }
        if (this.ELu.hasChanged()) {
            n |= 4;
            Color color = this.ELu.getColor();
            float f3 = color.getRed();
            float f4 = color.getGreen();
            float f5 = color.getBlue();
            float f6 = color.getAlpha();
            lcq lcq2 = new lcq(f3 /= 255.0f, f4 /= 255.0f, f5 /= 255.0f, f6 /= 255.0f);
            this.ELt.d(lcq2);
            far2.d(lcq2);
            System.out.println(lcq2.toString());
        }
        if (this.ELB.hasChanged()) {
            n |= 0x20;
            if (this.ELB.getSelectedIndex() == 0) {
                this.ELt.je(false);
                far2.je(false);
            } else {
                this.ELt.je(true);
                far2.je(true);
            }
        }
        if (this.ELz.hasChanged()) {
            n |= 0x80;
            if (this.ELz.getSelectedIndex() == 0) {
                this.ELt.jc(false);
                far2.jc(false);
            } else {
                this.ELt.jc(true);
                far2.jc(true);
            }
        }
        if (n != 0) {
            lfn.b(0, "SFFogPropertiesDialog", "ApplyChanges() : Sending FogMsg, type=" + n);
            far2.Ge(n);
            this.DEC.a((dxq)far2);
        }
    }

    private void ac(lcq lcq2) {
        far far2 = (far)this.DEC.d(1793);
        far2.Ge(4);
        far2.on(this.ELt.getGUID());
        far2.f(lcr.qzr);
        far2.d(lcq2);
        this.DEC.a((dxq)far2);
    }

    static /* synthetic */ mjp a(mvp mvp2) {
        return mvp2.ELC;
    }

    static /* synthetic */ void a(mvp mvp2, lcq lcq2) {
        mvp2.ac(lcq2);
    }

    static /* synthetic */ mkp b(mvp mvp2) {
        return mvp2.ELu;
    }

    static /* synthetic */ mjp c(mvp mvp2) {
        return mvp2.ELD;
    }

    static /* synthetic */ drk d(mvp mvp2) {
        return mvp2.ELt;
    }

    static /* synthetic */ mkp e(mvp mvp2) {
        return mvp2.ELv;
    }
}

