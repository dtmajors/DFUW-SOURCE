/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public abstract class aay
extends aaz
implements acd,
acr,
xl {
    private abo bcY = abo.bdC;
    private List<acp> bcZ = null;
    private List<xj> bcV = null;
    private jcm bda = null;
    private boolean bdb = false;
    protected int bdc = 0;
    private jcl bcX = null;

    public abo xR() {
        return this.bcY;
    }

    public void ax(boolean bl) {
        this.bdb = bl;
    }

    public List<acp> getTasks() {
        return this.bcZ;
    }

    protected aay(wy wy2, int n, abo abo2) {
        super(wy2, n, abc.bdv);
        this.bcY = abo2;
        this.bcZ = lcn.emA();
        this.bcV = lcn.emA();
    }

    protected aay(wy wy2, int n, abo abo2, String string) {
        super(wy2, n, abc.bdv, string);
        this.bcY = abo2;
        this.bcZ = lcn.emA();
        this.bcV = lcn.emA();
    }

    @Override
    public boolean xP() {
        for (xj xj2 : this.bcV) {
            if (xj2.wG() != xm.bbm && xj2.wG() != xm.bbv) continue;
            return true;
        }
        return false;
    }

    @Override
    public jcl xQ() {
        if (this.bcX != null) {
            return this.bcX;
        }
        if (!this.xP()) {
            return null;
        }
        LinkedList<jck> linkedList = lcn.emA();
        LinkedList<jck> linkedList2 = lcn.emA();
        for (xj xj2 : this.bcV) {
            switch (xj2.wG()) {
                case bbm: {
                    linkedList.add(((xz)xj2).wY());
                    break;
                }
                case bbv: {
                    linkedList2.add(((yj)xj2).wY());
                }
            }
        }
        if (linkedList.isEmpty() && linkedList2.isEmpty()) {
            return null;
        }
        this.bcX = new jcl(this.wF().getID(), this.getID(), linkedList, linkedList2);
        return this.bcX;
    }

    public boolean xS() {
        for (acp acp2 : this.bcZ) {
            if (!acp2.yU() || !acp2.yV()) continue;
            return true;
        }
        return false;
    }

    public int xT() {
        for (acp acp2 : this.bcZ) {
            if (!acp2.yU() || !acp2.yV()) continue;
            return acp2.xT();
        }
        return -1;
    }

    @Override
    protected String ay(boolean bl) {
        String string;
        String string2 = bl ? xc.dV(this.getID()) : xc.dU(this.getID());
        String string3 = string = this.yw() ? this.xU() : null;
        if (string != null && !string.isEmpty()) {
            string2 = string2 + ';' + string;
        }
        return string2;
    }

    protected String xU() {
        String string;
        String string2 = null;
        String string3 = this.xZ();
        if (string3 != null && !string3.isEmpty()) {
            String string4 = string2 = string2 == null ? string3 : ';' + string3;
        }
        if ((string = this.yb()) != null && !string.isEmpty()) {
            string2 = string2 == null ? string : string2 + ';' + string;
        }
        return string2;
    }

    public int xV() {
        return this.bcZ.size();
    }

    public boolean xW() {
        return !this.bcZ.isEmpty();
    }

    @Override
    public void b(acp acp2) {
        this.bcZ.add(acp2);
    }

    @Override
    public abstract void c(acp var1);

    public boolean xX() {
        return this.bdb;
    }

    public Set<acp> xY() {
        Set<acp> set = lcn.emx();
        for (acp acp2 : this.bcZ) {
            if (!acp2.isComplete()) continue;
            set.add(acp2);
        }
        return set;
    }

    private acp en(int n) {
        for (acp acp2 : this.bcZ) {
            if (acp2.getID() != n) continue;
            return acp2;
        }
        return null;
    }

    private String xZ() {
        String string = null;
        for (acp acp2 : this.bcZ) {
            String string2 = acp2.wJ();
            if (string2 == null || string2.isEmpty()) continue;
            string = string == null ? string2 : string + ';' + string2;
        }
        return string;
    }

    @Override
    public void b(xj xj2) {
        this.bcV.add(xj2);
    }

    @Override
    public void wQ() {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "performActions() : Quest is Not Active!!!... Quest = " + this.wF() + ", Node = " + this);
            assert (false);
            return;
        }
        for (xj xj2 : this.bcV) {
            if (!xj2.wL()) continue;
            xj2.perform();
        }
    }

    @Override
    public void c(xj xj2) {
    }

    public void ya() {
        for (xj xj2 : this.bcV) {
            xj2.wM();
        }
    }

    @Override
    public void wO() {
        for (xj xj2 : this.bcV) {
            if (!xj2.wK()) continue;
            xj2.wO();
        }
    }

    private String yb() {
        String string = null;
        for (xj xj2 : this.bcV) {
            String string2 = xj2.wJ();
            if (string2 == null || string2.isEmpty()) continue;
            string = string == null ? string2 : string + ';' + string2;
        }
        return string;
    }

    public jcm yc() {
        LinkedList<jcn> linkedList = lcn.emA();
        for (acp acp2 : this.bcZ) {
            jcn jcn2 = acp2.zc();
            if (jcn2 == null) continue;
            linkedList.add(jcn2);
        }
        if (linkedList.isEmpty() && !this.yo() && !this.yq()) {
            return null;
        }
        this.bda = this.J(linkedList);
        return this.bda;
    }

    public void yd() {
        LinkedList<jck> linkedList = null;
        LinkedList linkedList2 = null;
        for (xj xj2 : this.bcV) {
            if (!(xj2 instanceof xz)) continue;
            xz xz2 = (xz)xj2;
            LinkedList<jck> linkedList3 = null;
            if (xz2.wW()) {
                if (linkedList == null) {
                    linkedList = lcn.emA();
                }
                linkedList3 = linkedList;
            } else {
                if (!xz2.wX()) continue;
                if (linkedList2 == null) {
                    linkedList2 = lcn.emA();
                }
                linkedList3 = linkedList2;
            }
            linkedList3.add(xz2.wY());
        }
        if (linkedList != null && !linkedList.isEmpty()) {
            jcc.dwT().mQK.c(this.wF().getID(), (List<jck>)linkedList, Boolean.TRUE);
        }
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            jcc.dwT().mQK.c(this.wF().getID(), linkedList2, Boolean.FALSE);
        }
    }

    protected jcm J(List<jcn> list) {
        return list.isEmpty() ? new jcm(this, this.wF().getID(), this.getID(), this.yp()) : new jcm(this, this.wF().getID(), this.getID(), this.yp(), false, list);
    }

    public void ye() {
        if (this.bda != null) {
            this.bda.b(this.yu());
            this.bda = null;
        }
    }

    public void yf() {
        if (this.bda != null) {
            jcc.dwT().b(this.wF().getID(), this.bda);
            this.bda = null;
        }
    }

    public void yg() {
        for (acp acp2 : this.bcZ) {
            acp2.yg();
        }
    }

    public void yh() {
        if (!this.bcZ.isEmpty()) {
            for (acp acp2 : this.bcZ) {
                acp2.activate();
            }
        }
    }

    public void yi() {
        if (!this.isActive()) {
            return;
        }
        for (acp acp2 : this.bcZ) {
            if (acp2.xo() && acp2.yY()) {
                acp2.yZ();
            }
            if (this.isActive()) continue;
            return;
        }
    }

    public void yj() {
        if (this.bcZ.isEmpty()) {
            this.wF().b(this, true, true);
            for (Integer n : this.yz()) {
                this.l(n, true);
            }
        }
    }

    public void yk() {
        for (acp acp2 : this.bcZ) {
            acp2.wl();
        }
    }

    public void yl() {
        for (acp acp2 : this.bcZ) {
            acp2.deactivate();
        }
    }

    @Override
    public void eo(int n) {
        acp acp2 = this.en(n);
        if (acp2 == null) {
            return;
        }
        acp2.za();
    }

    @Override
    protected void c(aaz aaz2) {
        super.c(aaz2);
        if (!(aaz2 instanceof aay)) {
            return;
        }
        ((aay)aaz2).bdb = this.bdb;
    }

    @Override
    public void a(wy wy2, acr acr2) {
        if (acr2 == null) {
            return;
        }
        for (acp acp2 : this.bcZ) {
            acr2.b(acp2.b(wy2, acr2));
        }
    }

    @Override
    public void b(wy wy2, xl xl2) {
        if (xl2 == null) {
            return;
        }
        for (xj xj2 : this.bcV) {
            xl2.b(xj2.a(wy2, xl2));
        }
    }

    public String toString() {
        return "[" + this.getClass().getSimpleName() + " :: ID = " + this.getID() + ", Event-Type = " + (Object)((Object)this.bcY) + ", Tasks = " + this.bcZ.size() + ", Actions = " + this.bcV.size() + "]";
    }
}

