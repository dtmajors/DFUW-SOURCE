/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class jpr {
    private final List<a> nOS = lcn.emv();
    private final Map<Integer, a> nOT = lcn.emw();
    private final Map<Integer, a> nOU = lcn.emw();
    private final jpz nOV;
    private final les nOR = lea.enS();

    public jpr(jpz jpz2) {
        this.nOV = jpz2;
    }

    public void aH(ldz ldz2) {
        if (this.nOT.isEmpty()) {
            return;
        }
        Iterator<a> iterator = this.nOT.values().iterator();
        while (iterator.hasNext()) {
            a a2 = iterator.next();
            if (a2.Up > ldz2.rgz) continue;
            if (a2.nOW) {
                a2.Up += a2.eNV;
                lby lby2 = (lby)this.nOR.acv(a2.ixE);
                if (lby2 == null) {
                    lfn.b(5, "SFActionTimerManager", "checkActionTimers() Could not find listitem for action " + a2.ixE);
                    iterator.remove();
                    a2.reset();
                    this.nOS.add(a2);
                    continue;
                }
                this.nOV.a(lby2, true);
                continue;
            }
            iterator.remove();
            a2.reset();
            this.nOS.add(a2);
        }
    }

    public boolean Vz(int n) {
        assert (n > 0);
        Integer n2 = new Integer(n);
        if (this.nOT.containsKey(n2)) {
            return true;
        }
        return this.nOU.containsKey(n2);
    }

    public void a(int n, double d2, boolean bl) {
        assert (n > 0);
        a a2 = null;
        if (this.nOS.size() > 0) {
            a2 = this.nOS.get(0);
        } else {
            a2 = new a(this);
            this.nOS.add(new a(this));
        }
        a2.ixE = n;
        a2.eNV = d2;
        a2.nOW = bl;
        if (d2 == -2.0 || d2 == -3.0) {
            a2.Up = d2;
            this.nOU.put(new Integer(n), a2);
        } else {
            a2.Up = this.nOV.getMessageDelegator().arc().rgz + d2;
            this.nOT.put(new Integer(n), a2);
        }
    }

    public void VA(int n) {
        this.nOU.remove(n);
    }

    public void VB(int n) {
        assert (n > 0);
        a a2 = this.nOT.get(n);
        if (a2 == null) {
            lfn.b(5, "SFActionTimerManager", "stopRestartingTimer() ActionTimer for action '" + this.nOR.getName(n) + "' was not found.");
            return;
        }
        a2.nOW = false;
    }

    static /* synthetic */ les a(jpr jpr2) {
        return jpr2.nOR;
    }
}

