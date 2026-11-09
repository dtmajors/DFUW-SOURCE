/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class lke
implements Cloneable {
    private static final boolean bC = false;
    private Map<String, lkd> rqk = lcn.emw();
    private List<lkd> rql;
    private dxr MessageDelegator;
    private ldv rqm;
    private ldv rqn;
    private lkd rqo;
    private String Filename = null;
    private bvf rqp = null;

    public lke() {
        if (lcw.qHe) {
            this.rql = lcn.emv();
        }
        lkf.ets().c(this);
    }

    public void a(lkd lkd2) {
        if (this.rqk.containsKey(lkd2.dZF())) {
            lfn.b(4, this.getClass().getName(), "DistanceTimer for this AnimationSet already registered. Overwriting!");
            if (lcw.qHe) {
                lkd lkd3 = this.rqk.get(lkd2.dZF());
                this.rql.remove(lkd3);
            }
        }
        this.rqk.put(lkd2.dZF(), lkd2);
        if (lcw.qHe) {
            this.rql.add(lkd2);
        }
    }

    public void b(lkd lkd2) {
        lkd lkd3 = this.rqk.remove(lkd2.dZF());
        if (lcw.qHe) {
            this.rql.remove(lkd2);
        }
        if (lkd3 == null) {
            lfn.b(4, "SFAnimationDistanceTimerManager.unregisterDistanceTimer()", "DistanceTimer not found! Could not unregister DistanceTimer: " + lkd2);
        }
    }

    public boolean AA(String string) {
        assert (this.MessageDelegator != null) : "No MessageDelegator!";
        assert (this.rqm != null) : "No AnimationGUID!";
        boolean bl = false;
        if (this.rqo != null && string.equals(this.rqo.dZF())) {
            return true;
        }
        lkd lkd2 = this.rqk.get(string);
        int n = 0;
        if (lkd2 != null) {
            if (this.rqn == null) {
                this.rqn = this.MessageDelegator.bzv();
                n = 1;
            } else {
                n = 312;
            }
            try {
                this.rqo = (lkd)lkd2.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                lfn.b(5, this.getClass().getName(), "activateDistanceTimer() : Omg. Could not clone DistanceTimer ->\n");
                cloneNotSupportedException.printStackTrace();
            }
            khm khm2 = (khm)this.MessageDelegator.h(3079);
            khm2.Xr(n);
            khm2.Xs(lkd2.dZn());
            khm2.hC(this.rqm);
            khm2.ts(this.rqm);
            khm2.mx(this.rqn);
            khm2.dK(lkd2.dZo());
            khm2.setSetName(lkd2.dZF());
            khm2.setActive(true);
            khm2.wF(true);
            khm2.jM(true);
            this.MessageDelegator.a(khm2);
            bl = true;
        } else if (this.rqn != null) {
            this.etm();
        }
        return bl;
    }

    public void etm() {
        if (this.rqn != null) {
            int n = 8;
            khm khm2 = (khm)this.MessageDelegator.h(3079);
            khm2.Xr(n);
            khm2.hC(this.rqm);
            khm2.ts(this.rqm);
            khm2.mx(this.rqn);
            khm2.setActive(false);
            khm2.jM(true);
            this.MessageDelegator.a(khm2);
            this.rqo = null;
        }
    }

    private void etn() {
        if (this.rqn != null) {
            int n = 4;
            khm khm2 = (khm)this.MessageDelegator.h(3079);
            khm2.Xr(n);
            khm2.hC(this.rqm);
            khm2.ts(this.rqm);
            khm2.mx(this.rqn);
            khm2.setActive(false);
            khm2.jM(true);
            this.MessageDelegator.a(khm2);
            this.rqo = null;
        }
    }

    public boolean eto() {
        return this.rqo != null;
    }

    public String toString() {
        return "SFAnimationDistanceTimerManager: NrOf Registered Timers: " + this.rqk.size();
    }

    public void setMessageDelegator(dxr dxr2) {
        this.MessageDelegator = dxr2;
    }

    public void uk(ldv ldv2) {
        this.rqm = ldv2;
    }

    public String bsl() {
        return this.Filename;
    }

    public void cd(String string) {
        this.Filename = string;
    }

    public List<lkd> etp() {
        return this.rql;
    }

    public final Object clone() {
        lke lke2 = (lke)super.clone();
        if (lcw.qHe) {
            lke2.rql = this.bZ(this.rql);
        }
        lke2.rqk = this.ai(this.rqk);
        if (this.rqo != null) {
            lke2.rqo = (lkd)this.rqo.clone();
        }
        return lke2;
    }

    private List<lkd> bZ(List<lkd> list) {
        ArrayList<lkd> arrayList = lcn.emv();
        lkd lkd2 = null;
        for (lkd lkd3 : list) {
            try {
                lkd2 = (lkd)lkd3.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                lfn.b(5, this.getClass().getName(), "CloneArrayList() : Clone Not supported for Object [" + lkd3 + "]");
            }
            arrayList.add(lkd2);
        }
        return arrayList;
    }

    private Map<String, lkd> ai(Map<String, lkd> map) {
        Map<String, lkd> map2 = lcn.emw();
        lkd lkd2 = null;
        for (lkd lkd3 : map.values()) {
            try {
                lkd2 = (lkd)lkd3.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                lfn.b(5, this.getClass().getName(), "CloneArrayList() : Clone Not supported for Object [" + lkd3 + "]");
                throw new bs(cloneNotSupportedException);
            }
            map2.put(lkd2.dZF(), lkd2);
        }
        return map2;
    }

    public bvf etq() {
        return this.rqp;
    }

    public Map<String, lkd> etr() {
        return this.rqk;
    }

    public void c(bvf bvf2) {
        this.rqp = bvf2;
    }

    public void cleanUp() {
        this.etn();
        lkf.ets().d(this);
        this.rqp = null;
    }
}

