/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class dvu
extends dvy
implements dwb {
    private Map<Integer, dvp> hhC = null;

    public dvp[] bCk() {
        return this.hhC.values().toArray(new dvp[this.hhC.size()]);
    }

    public dvu(String string) {
        this.jE(string);
        this.hhC = lcn.yi(false);
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
            case hhE: {
                for (int i = 0; i < lmn2.euT().length; ++i) {
                    dvp dvp2 = dvp.d(lmn2.euT()[i].euV(), lmn2.euS());
                    if (dvp2 == null) continue;
                    this.hhC.put(dvp2.bBA(), dvp2);
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
            case hhE: {
                this.b(this.bCq(), 0, "Darkfall_Read");
                return true;
            }
            case hhF: {
                this.d(new dvs(dvl.a(this.bCk())));
                return this.bCw();
            }
            case hhG: {
                this.d(new dvw(dvl.b(this.bCk())));
                return this.bCw();
            }
            case hhH: {
                this.d(new dvt(dvl.c(this.bCk())));
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
            case hhF: {
                dvm[] dvmArray;
                if (!(dvy2 instanceof dvs)) {
                    this.bCv();
                    return;
                }
                for (dvm dvm2 : dvmArray = ((dvs)dvy2).bCi()) {
                    if (!this.hhC.containsKey(dvm2.bBA())) continue;
                    this.hhC.get(dvm2.bBA()).a(dvm2);
                }
                break;
            }
            case hhG: {
                dvq[] dvqArray;
                if (!(dvy2 instanceof dvw)) {
                    this.bCv();
                    return;
                }
                block6: for (dvq dvq2 : dvqArray = ((dvw)dvy2).bCn()) {
                    dvp dvp2 = this.hhC.get(dvq2.bBA());
                    if (dvp2 == null) continue;
                    if (dvq2.bCc().equals(dvp2.afk())) {
                        dvp2.a(dvq2);
                        continue;
                    }
                    for (dvm dvm3 : dvp2.bBY()) {
                        if (!dvm3.afr().equals(dvq2.bCc())) continue;
                        dvm3.a(dvq2);
                        continue block6;
                    }
                }
                break;
            }
            case hhH: {
                dvo[] dvoArray;
                if (!(dvy2 instanceof dvt)) {
                    this.bCv();
                    return;
                }
                for (dvo dvo2 : dvoArray = ((dvt)dvy2).bCj()) {
                    if (!this.hhC.containsKey(dvo2.bBA())) continue;
                    this.hhC.get(dvo2.bBA()).a(dvo2);
                }
                break;
            }
        }
        this.bCt();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " :: Database worker to retrieve a collection of conquest challenges... Current Job = " + this.bCr() + "... SQL = " + this.bCq();
    }
}

