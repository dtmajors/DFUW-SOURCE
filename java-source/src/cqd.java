/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class cqd
extends bsv {
    private String ID;
    private String eUB;
    private String eUC;
    private ldv aGH;
    private cqe eUD = cqe.eUF;
    private List<cqc> eUE = lcn.emv();

    public boolean aYs() {
        for (cqc cqc2 : this.eUE) {
            if (!cqc2.aYq()) continue;
            return true;
        }
        return false;
    }

    public int aYt() {
        int n = 0;
        for (cqc cqc2 : this.eUE) {
            if (cqc2.aYq()) continue;
            ++n;
        }
        return n;
    }

    public cqc aYu() {
        for (cqc cqc2 : this.eUE) {
            if (!cqc2.aYq()) continue;
            return cqc2;
        }
        return null;
    }

    public List<cqc> aYv() {
        ArrayList<cqc> arrayList = lcn.abH(this.eUE.size());
        for (cqc cqc2 : this.eUE) {
            if (cqc2.aYq()) continue;
            arrayList.add(cqc2);
        }
        return arrayList;
    }

    public final String aYw() {
        return this.eUB;
    }

    public final void hN(String string) {
        this.eUB = string;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String string) {
        this.ID = string;
    }

    public final String aYx() {
        return this.eUC;
    }

    public final void hO(String string) {
        this.eUC = string;
    }

    public final ldv aYy() {
        return this.aGH;
    }

    public final void cl(ldv ldv2) {
        this.aGH = ldv2;
    }

    public final cqe aYz() {
        return this.eUD;
    }

    public final void a(cqe cqe2) {
        this.eUD = cqe2;
    }

    public final List<cqc> aYA() {
        return this.eUE;
    }

    public final void az(List<cqc> list) {
        this.eUE = list;
    }

    public void a(cqc cqc2) {
        this.eUE.add(cqc2);
    }
}

