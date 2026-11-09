/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  ep
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mtn
extends mkx {
    private ej bhp;
    private cbx dtF;
    private Dimension bV = new Dimension(400, 350);
    private mla Ezv = new mla("Value", 0.0f, 100.0f, 50.0f, 2, false);
    private mla Ezw = new mla("MaxValue", 0.0f, 100.0f, 50.0f, 2, false);
    private mla Ezx = new mla("MaxMaxValue", 0.0f, 100.0f, 50.0f, 2, false);
    private mla Ezy = new mla("MinValue", 0.0f, 100.0f, 50.0f, 2, false);
    private mkl Ezz;
    private mkt EzA;

    public mtn(ej ej2, cbx cbx2) {
        this.bhp = ej2;
        this.dtF = cbx2;
        this.setTitle("Modify Attribute: " + this.bhp.getName());
        this.setClosable(true);
        this.setResizable(false);
        this.setPreferredSize(this.bV);
        if (this.bhp instanceof ez) {
            this.eOv();
        } else if (this.bhp instanceof et) {
            this.eOu();
        } else if (this.bhp instanceof ff) {
            this.eOw();
        } else if (this.bhp instanceof eq) {
            this.eOx();
        }
        this.pack();
    }

    private void eOu() {
        if (this.bhp instanceof et) {
            et et2 = (et)this.bhp;
            this.Ezv.or(((et)this.bhp).fN());
            this.Ezv.a(new ChangeListener(this, et2){
                final /* synthetic */ et EzB;
                final /* synthetic */ mtn EzC;
                {
                    this.EzC = mtn2;
                    this.EzB = et2;
                }

                public final void stateChanged(ChangeEvent changeEvent) {
                    this.EzB.o(mtn.a(this.EzC).getValue());
                }
            });
            JPanel jPanel = new JPanel(new FlowLayout(2));
            jPanel.add(this.Ezv);
            this.DGa.add(jPanel);
        }
    }

    private void eOv() {
        if (this.bhp instanceof ez) {
            ez ez2 = (ez)this.bhp;
            int n = ep.k((int)this.bhp.getType(), (int)0);
            int n2 = ep.k((int)n, (int)2);
            int n3 = ep.k((int)n, (int)4);
            int n4 = ep.k((int)n, (int)1);
            JPanel jPanel = new JPanel(new FlowLayout(2));
            this.Ezv.or(((et)this.bhp).fN());
            jPanel.add(this.Ezv);
            this.Ezv.or(ez2.fN());
            this.Ezv.a(new ChangeListener(this, ez2){
                final /* synthetic */ ez EzD;
                final /* synthetic */ mtn EzC;
                {
                    this.EzC = mtn2;
                    this.EzD = ez2;
                }

                public final void stateChanged(ChangeEvent changeEvent) {
                    this.EzD.o(mtn.a(this.EzC).getValue());
                }
            });
            jPanel.add(this.Ezv);
            this.Ezw.or(this.dtF.fi().al(n2));
            this.Ezw.a(new ChangeListener(this, n2){
                final /* synthetic */ int EzE;
                final /* synthetic */ mtn EzC;
                {
                    this.EzC = mtn2;
                    this.EzE = n;
                }

                public final void stateChanged(ChangeEvent changeEvent) {
                    et et2 = mtn.b(this.EzC).fi().ah(this.EzE);
                    et2.o(mtn.c(this.EzC).getValue());
                }
            });
            jPanel.add(this.Ezw);
            this.Ezx.or(this.dtF.fi().al(n3));
            this.Ezx.a(new ChangeListener(this, n3){
                final /* synthetic */ int EzF;
                final /* synthetic */ mtn EzC;
                {
                    this.EzC = mtn2;
                    this.EzF = n;
                }

                public final void stateChanged(ChangeEvent changeEvent) {
                    et et2 = mtn.b(this.EzC).fi().ah(this.EzF);
                    et2.o(mtn.d(this.EzC).getValue());
                }
            });
            jPanel.add(this.Ezx);
            this.Ezy.or(this.dtF.fi().al(n4));
            this.Ezy.a(new ChangeListener(this, n4){
                final /* synthetic */ int EzG;
                final /* synthetic */ mtn EzC;
                {
                    this.EzC = mtn2;
                    this.EzG = n;
                }

                public final void stateChanged(ChangeEvent changeEvent) {
                    et et2 = mtn.b(this.EzC).fi().ah(this.EzG);
                    et2.o(mtn.e(this.EzC).getValue());
                }
            });
            jPanel.add(this.Ezy);
            this.DGa.add(jPanel);
        }
    }

    private void eOw() {
        if (this.bhp instanceof ff) {
            ff ff2 = (ff)this.bhp;
            this.EzA = new mkt("String value", ff2.getStringValue());
            this.EzA.addKeyListener(new KeyAdapter(this, ff2){
                final /* synthetic */ ff EzH;
                final /* synthetic */ mtn EzC;
                {
                    this.EzC = mtn2;
                    this.EzH = ff2;
                }

                public void keyReleased(KeyEvent keyEvent) {
                    if (keyEvent.getKeyCode() == 10) {
                        this.EzH.av(mtn.f(this.EzC).eCU());
                    }
                }
            });
            JPanel jPanel = new JPanel(new FlowLayout(2));
            jPanel.add(this.EzA);
            jPanel.add(new JLabel("You must press Enter to Commit String changes!"));
            this.DGa.add(jPanel);
        }
    }

    private void eOx() {
        if (this.bhp instanceof eq) {
            eq eq2 = (eq)this.bhp;
            this.Ezz = new mkl("Enabled", eq2.getBooleanValue());
            this.Ezz.c(new ActionListener(this, eq2){
                final /* synthetic */ eq EzI;
                final /* synthetic */ mtn EzC;
                {
                    this.EzC = mtn2;
                    this.EzI = eq2;
                }

                public final void actionPerformed(ActionEvent actionEvent) {
                    this.EzI.x(mtn.g(this.EzC).eDr());
                }
            });
            JPanel jPanel = new JPanel(new FlowLayout(2));
            jPanel.add(this.Ezz);
            this.DGa.add(jPanel);
        }
    }

    @Override
    protected void eDD() {
        if (this.bhp instanceof et) {
            et et2 = (et)this.bhp;
            et2.o(this.Ezv.getValue());
        } else if (this.bhp instanceof eq) {
            eq eq2 = (eq)this.bhp;
            eq2.x(this.Ezz.eDr());
        } else if (this.bhp instanceof ff) {
            ff ff2 = (ff)this.bhp;
            ff2.av(this.EzA.eCU());
        } else if (this.bhp instanceof ez) {
            ez ez2 = (ez)this.bhp;
            int n = ep.k((int)this.bhp.getType(), (int)0);
            int n2 = ep.k((int)n, (int)2);
            int n3 = ep.k((int)n, (int)4);
            int n4 = ep.k((int)n, (int)1);
            ez2.o(this.Ezv.getValue());
            et et3 = this.dtF.fi().ah(n2);
            if (et3 != null) {
                et3.o(this.Ezw.getValue());
            }
            if ((et3 = this.dtF.fi().ah(n3)) != null) {
                et3.o(this.Ezx.getValue());
            }
            if ((et3 = this.dtF.fi().ah(n4)) != null) {
                et3.o(this.Ezy.getValue());
            }
        }
    }

    static /* synthetic */ mla a(mtn mtn2) {
        return mtn2.Ezv;
    }

    static /* synthetic */ cbx b(mtn mtn2) {
        return mtn2.dtF;
    }

    static /* synthetic */ mla c(mtn mtn2) {
        return mtn2.Ezw;
    }

    static /* synthetic */ mla d(mtn mtn2) {
        return mtn2.Ezx;
    }

    static /* synthetic */ mla e(mtn mtn2) {
        return mtn2.Ezy;
    }

    static /* synthetic */ mkt f(mtn mtn2) {
        return mtn2.EzA;
    }

    static /* synthetic */ mkl g(mtn mtn2) {
        return mtn2.Ezz;
    }
}

