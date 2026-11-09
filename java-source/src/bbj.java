/*
 * Decompiled with CFR.
 */
import java.util.List;

public class bbj {
    private ldv cQE;
    private ljq cQF;
    private String cQG;
    private String cQl;
    private List<ljq> cQH = lcn.emv();

    public final ldv aka() {
        return this.cQE;
    }

    public final void gp(ldv ldv2) {
        this.cQE = ldv2;
    }

    public final ljq akb() {
        return this.cQF;
    }

    public final void aJ(ljq ljq2) {
        this.cQF = ljq2;
    }

    public final String akc() {
        return this.cQG;
    }

    public final lip akd() {
        return new ljk(this.akc());
    }

    public final void fl(String string) {
        this.cQG = string;
    }

    public final String ajI() {
        return this.cQl;
    }

    public final void fj(String string) {
        this.cQl = string;
    }

    public final List<ljq> ake() {
        return this.cQH;
    }

    public final void X(List<ljq> list) {
        this.cQH = list;
    }

    public final void c(ljq[] ljqArray) {
        if (ljqArray == null) {
            return;
        }
        for (ljq ljq2 : ljqArray) {
            if (ljq2 == null) continue;
            this.cQH.add(ljq2);
        }
    }
}

