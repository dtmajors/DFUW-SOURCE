/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class dvs
extends dvy
implements dwb {
    private Map<Integer, dvm> cMa = null;

    public dvm[] bCi() {
        return this.cMa.values().toArray(new dvm[this.cMa.size()]);
    }

    public dvs(String string) {
        this.jE(string);
        this.cMa = lcn.yi(false);
        this.a(a.values());
    }

    @Override
    public boolean bCh() {
        if (this.bCq() == null || this.bCq().isEmpty() || !this.Initialized) {
            return false;
        }
        return this.bCs();
    }

    @Override
    protected void e(lmn lmn2, int n) {
        if (lmn2.euT() == null || lmn2.euS() == null || lmn2.euT().length == 0 || lmn2.euS().length == 0) {
            this.bCv();
            return;
        }
        switch ((a)this.bCr()) {
            case hhy: {
                for (int i = 0; i < lmn2.euT().length; ++i) {
                    dvm dvm2 = dvm.a(lmn2.euT()[i].euV(), lmn2.euS());
                    if (dvm2 == null) continue;
                    this.cMa.put(dvm2.bBz(), dvm2);
                }
                break;
            }
            default: {
                this.bCv();
                return;
            }
        }
        this.bCt();
    }

    @Override
    protected boolean a(Enum enum_) {
        if (enum_ == null) {
            return false;
        }
        switch ((a)enum_) {
            case hhy: {
                this.b(this.bCq(), 0, "Darkfall_Read");
                return true;
            }
            case hhz: {
                this.d(new dvr(dvl.a(this.bCi())));
                return this.bCw();
            }
        }
        return false;
    }

    @Override
    public void c(dvy dvy2) {
        if (dvy2 == null) {
            this.bCv();
            return;
        }
        switch ((a)this.bCr()) {
            case hhz: {
                dvn[] dvnArray;
                if (!(dvy2 instanceof dvr)) {
                    this.bCv();
                    return;
                }
                for (dvn dvn2 : dvnArray = ((dvr)dvy2).bCg()) {
                    if (!this.cMa.containsKey(dvn2.bBz())) continue;
                    this.cMa.get(dvn2.bBz()).a(dvn2);
                }
                break;
            }
        }
        this.bCt();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " :: Database worker to retrieve a collection of conquest attackers... Current Job = " + this.bCr() + "... SQL = " + this.bCq();
    }
}

