/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  dqk
 *  lcr
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class muj
extends mkx {
    private aux DEC = null;
    private mjp EGm;
    private dqk EGn;
    private mkq EGo;
    private mla EGp;
    private mla EGq;
    private Dimension bV = new Dimension(350, 220);

    public muj(dqk dqk2) {
        super(false);
        this.EGn = dqk2;
        if (this.EGn.btZ() == null) {
            this.EGn.a(new dql());
            JOptionPane.showInternalMessageDialog(this, "This Object has problems. Close the TintColor dialog and save the world!", "ERROR", 0);
        }
        this.setPreferredSize(this.bV);
        this.setIconifiable(false);
        this.setMaximizable(false);
        this.setClosable(true);
        this.r();
        this.pack();
    }

    private void r() {
        JPanel jPanel = new JPanel(new FlowLayout(2));
        this.EGm = new mjp(this.EGn.btZ().aIf().getColor(), "Mesh Tint Color");
        this.EGm.getColorSelectionModel().addChangeListener(new ChangeListener(this){
            final /* synthetic */ muj EGr;
            {
                this.EGr = muj2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                muj.a(this.EGr, new lcq(muj.a(this.EGr).getColor()));
                muj.b(this.EGr).setColor(muj.a(this.EGr).getColor());
            }
        });
        this.EGo = new mkq(this, this.EGm, "Mesh Tint Color", this.EGn.btZ().aIf().getColor(), false);
        jPanel.add(this.EGo);
        this.EGq = new mla("Power", 0.0f, 1.0f, this.EGn.btZ().getPower(), 2, false);
        this.EGq.a(new ChangeListener(this){
            final /* synthetic */ muj EGr;
            {
                this.EGr = muj2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                muj.a(this.EGr, muj.c(this.EGr).getValue());
            }
        });
        jPanel.add(this.EGq);
        if (mje.DBq) {
            this.EGp = new mla("Multiplyer", 0.0f, 10.0f, this.EGn.btZ().buf(), 2, false);
            this.EGp.a(new ChangeListener(this){
                final /* synthetic */ muj EGr;
                {
                    this.EGr = muj2;
                }

                public final void stateChanged(ChangeEvent changeEvent) {
                    muj.b(this.EGr, muj.d(this.EGr).getValue());
                }
            });
            jPanel.add(this.EGp);
        }
        this.DGa.add(jPanel);
    }

    private void Z(lcq lcq2) {
        lcq2 = new lcq(lcq2.r, lcq2.g, lcq2.b, this.EGp.getValue());
        this.EGn.btZ().j(lcq2);
        this.afH(3);
    }

    private void oF(float f2) {
        this.EGn.btZ().setPower(f2);
        this.afH(5);
    }

    private void oG(float f2) {
        this.EGn.btZ().hn(f2);
        this.afH(9);
    }

    private void afH(int n) {
        ful ful2 = (ful)this.DEC.d(1032);
        ful2.Ia(n);
        if ((n & 2) != 0) {
            ful2.j(this.EGn.btZ().aIf());
        }
        if ((n & 4) != 0) {
            ful2.setPower(this.EGn.btZ().getPower());
        }
        if ((n & 8) != 0) {
            ful2.jk(this.EGn.btZ().buf());
        }
        ful2.on(this.EGn.getGUID());
        ful2.f(lcr.qAE);
        this.DEC.a((dxq)ful2);
        lfn.b(0, this.getClass().getSimpleName(), "getMeshTint() : Sending Msg");
    }

    public dqk ePG() {
        return this.EGn;
    }

    public void d(dqk dqk2) {
        this.EGn = dqk2;
    }

    public aux eDR() {
        return this.DEC;
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ mjp a(muj muj2) {
        return muj2.EGm;
    }

    static /* synthetic */ void a(muj muj2, lcq lcq2) {
        muj2.Z(lcq2);
    }

    static /* synthetic */ mkq b(muj muj2) {
        return muj2.EGo;
    }

    static /* synthetic */ mla c(muj muj2) {
        return muj2.EGq;
    }

    static /* synthetic */ void a(muj muj2, float f2) {
        muj2.oF(f2);
    }

    static /* synthetic */ mla d(muj muj2) {
        return muj2.EGp;
    }

    static /* synthetic */ void b(muj muj2, float f2) {
        muj2.oG(f2);
    }
}

