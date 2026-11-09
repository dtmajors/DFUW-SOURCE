/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;

public final class aax
extends aaz
implements xl {
    private List<xj> bcV = lcn.emA();
    private int bcW = 0;
    private jcl bcX = null;

    public aax(wy wy2, int n) {
        super(wy2, n, abc.bdw);
    }

    public aax(wy wy2, int n, String string) {
        super(wy2, n, abc.bdw, string);
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
        if (this.bcV.isEmpty()) {
            this.wF().b(this, true, false);
            this.wF().complete();
        } else {
            for (xj xj2 : this.bcV) {
                if (!xj2.wL()) continue;
                xj2.perform();
            }
        }
    }

    @Override
    public void c(xj xj2) {
        ++this.bcW;
        if (this.bcW == this.bcV.size()) {
            if (!this.wF().isActive()) {
                lfn.b(5, this.getClass().getSimpleName(), "actionPerformed() : Quest is Not Active!!!... Quest = " + this.wF() + ", Node = " + this);
                assert (false);
                return;
            }
            this.wF().b(this, true, false);
            this.wF().cj(this.ay(true));
            this.wF().complete();
        }
    }

    @Override
    public void wO() {
        for (xj xj2 : this.bcV) {
            if (!xj2.wK()) continue;
            xj2.wO();
        }
    }

    @Override
    public void a(int n, int n2, boolean bl, boolean bl2) {
        if (!this.wF().isActive()) {
            lfn.b(5, this.getClass().getSimpleName(), "receiveInput() : Quest is Not Active!!!... Quest = " + this.wF() + ", Node = " + this + ", In-Edge ID = " + n + ", Input-Value = " + n2);
            assert (false);
            return;
        }
        this.wF().a(this, bl, bl2);
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

    @Override
    public aaz h(wy wy2) {
        aax aax2 = new aax(wy2, this.getID());
        aax2.bcX = this.bcX;
        this.a(wy2, aax2);
        return aax2;
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
        return "[" + this.getClass().getSimpleName() + " :: ID = " + this.getID() + ", Actions = " + this.bcV.size() + "]";
    }
}

