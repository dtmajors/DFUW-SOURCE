/*
 * Decompiled with CFR.
 */
public class brw {
    public cak.c bpW = null;
    public brx[] dJd = null;

    public brw awG() {
        assert (this.bpW != null);
        assert (this.dJd != null);
        brw brw2 = new brw();
        brw2.bpW = this.bpW;
        brx[] brxArray = new brx[this.dJd.length];
        int n = this.dJd.length;
        for (int i = 0; i < n; ++i) {
            brxArray[i] = this.dJd[i].awI();
        }
        brw2.dJd = brxArray;
        return brw2;
    }

    public brx awH() {
        assert (this.dJd != null);
        int n = this.dJd.length;
        for (int i = 0; i < n; ++i) {
            if (this.dJd[i].dJe != null) continue;
            return this.dJd[i];
        }
        return null;
    }

    public String Eg() {
        return this.bpW.name();
    }

    public brx mu(int n) {
        assert (this.dJd != null);
        int n2 = this.dJd.length;
        for (int i = 0; i < n2; ++i) {
            if (this.dJd[i].aCJ != n) continue;
            return this.dJd[i];
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFLayerNode: LayerType='");
        stringBuilder.append(this.Eg());
        stringBuilder.append("'");
        if (this.dJd != null) {
            stringBuilder.append(" LayerSlotNodes=");
            stringBuilder.append(this.dJd.length);
        } else {
            stringBuilder.append(" LayerSlotNodes=null");
        }
        return stringBuilder.toString();
    }
}

