/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.LinkedList;

public class ifl
extends hzk {
    private LinkedList<Integer> lRp = new LinkedList();

    public ifl() {
        super("FeatNotification", "FeatNotification.swf");
        this.OQ(0xFFFFFFFF & ~(jnz.nGm | jnz.nGk));
        this.a(hya.lmp, true);
        this.a(hyb.lmC);
    }

    public void ab(int n, boolean bl) {
        if (this.isVisible() && !bl) {
            this.lRp.addLast(n);
        } else {
            this.QD(n);
        }
    }

    public void cSp() {
        this.setVisible(false);
        this.hz(0.0f);
        this.lRp.clear();
    }

    protected void cBa() {
        super.cBa();
        this.cSq();
    }

    @Override
    protected boolean og(String string) {
        hwl hwl2 = new hwl(string);
        return ifl.cyJ().cHR() != null ? ifl.cyJ().cHR().QK(hwl2.cck) != null : false;
    }

    @Override
    protected ifg of(String string) {
        hwn hwn2;
        hwl hwl2 = new hwl(string);
        hwn hwn3 = hwn2 = ifl.cyJ().cHR() != null ? ifl.cyJ().cHR().QK(hwl2.cck).cTs() : null;
        if (hwn2 == null) {
            return null;
        }
        ifh ifh2 = new ifh(hwn2, hwl2.lir, hwl2.lis);
        return ifh2;
    }

    private void QD(int n) {
        this.setVisible(true);
        this.hz(1.0f);
        this.pd(false);
        ign ign2 = igq.QK(n);
        if (ign2 == null) {
            return;
        }
        this.a("showNotification", new Object[]{ign2.cTu(), ign2.cTt(), ign2.cTF(), ign2.getTitle().toUpperCase(), ign2.getDescription().toUpperCase(), ign2.cBj()});
        lie lie2 = new lie(this, 0.1, true){
            final /* synthetic */ ifl lRq;
            {
                this.lRq = ifl2;
                super(d2, bl);
            }

            public void dh(double d2) {
                if (d2 < 1.0 || this.lRq.cFq() || hyn.cyJ().cHS().cFq()) {
                    return;
                }
                float f = this.lRq.getAlpha() - 0.02f;
                if ((double)f > 0.5) {
                    this.lRq.hz(f);
                } else {
                    this.stop();
                    if (!ifl.a(this.lRq)) {
                        this.lRq.setVisible(false);
                    }
                }
            }
        };
        lie2.e(this.MessageDelegator);
    }

    private boolean cSq() {
        if (this.lRp.isEmpty()) {
            return false;
        }
        int n = this.lRp.removeFirst();
        this.QD(n);
        return true;
    }

    static /* synthetic */ boolean a(ifl ifl2) {
        return ifl2.cSq();
    }
}

