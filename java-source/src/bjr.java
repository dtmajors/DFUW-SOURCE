/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class bjr
extends bsv {
    private String dpn;
    private String dpo;
    private ldv aFc;
    private bjy dpp = bjy.dqg;
    private List<bjp> dpq = lcn.emv();

    public final boolean apY() {
        for (bjp bjp2 : this.dpq) {
            if (!bjp2.apQ()) continue;
            return true;
        }
        return false;
    }

    public final bjp apZ() {
        for (bjp bjp2 : this.dpq) {
            if (!bjp2.apQ()) continue;
            return bjp2;
        }
        return null;
    }

    public final boolean aqa() {
        for (bjp bjp2 : this.dpq) {
            if (!bjp2.apR()) continue;
            return true;
        }
        return false;
    }

    public final boolean aqb() {
        for (bjp bjp2 : this.dpq) {
            if (!bjp2.apS()) continue;
            return true;
        }
        return false;
    }

    public final List<bjp> aqc() {
        ArrayList<bjp> arrayList = lcn.emv();
        for (bjp bjp2 : this.dpq) {
            if (!bjp2.apS()) continue;
            arrayList.add(bjp2);
        }
        return arrayList;
    }

    public final String aqd() {
        return this.dpn;
    }

    public final void fL(String string) {
        this.dpn = string;
    }

    public final String aqe() {
        return this.dpo;
    }

    public final void fM(String string) {
        this.dpo = string;
    }

    public final ldv aqf() {
        return this.aFc;
    }

    public final void cj(ldv ldv2) {
        this.aFc = ldv2;
    }

    public final bjy aqg() {
        return this.dpp;
    }

    public final void a(bjy bjy2) {
        this.dpp = bjy2;
    }

    public final List<bjp> aqh() {
        return this.dpq;
    }

    public final void ag(List<bjp> list) {
        this.dpq = list;
    }

    public final void a(bjp bjp2) {
        this.dpq.add(bjp2);
    }
}

