/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class lhg
extends ler
implements bsn {
    private boolean rnw = false;
    private lhu dzN;
    private boolean rnx = false;
    private boolean rny = false;
    private cxd.g rnz = cxd.g.fRa;
    private cxd.h rnA = cxd.h.fRk;
    private float rnB = 0.0f;
    private boolean rnC = false;
    private dcg[] rnD = null;
    private static les aqN = lea.enZ();

    public boolean ceu() {
        return this.rnw;
    }

    public void yu(boolean bl) {
        this.rnw = bl;
    }

    @Override
    public lhu atw() {
        assert (this.dzN != null);
        return this.dzN;
    }

    public void a(lhu lhu2) {
        assert (lhu2 != null);
        this.dzN = lhu2;
    }

    @Override
    public boolean awQ() {
        return this.rnx;
    }

    public void yv(boolean bl) {
        this.rnx = bl;
    }

    public boolean erU() {
        return this.rny;
    }

    public void yw(boolean bl) {
        this.rny = bl;
    }

    public cxd.g erV() {
        return this.rnz;
    }

    public void a(cxd.g g2) {
        this.rnz = g2;
    }

    public cxd.h erW() {
        return this.rnA;
    }

    public void b(cxd.h h2) {
        this.rnA = h2;
    }

    public float erX() {
        return this.rnB;
    }

    public void nq(float f) {
        this.rnB = f;
    }

    public boolean erY() {
        return this.rnC;
    }

    public void yx(boolean bl) {
        this.rnC = bl;
    }

    public dcg[] erZ() {
        return this.rnD;
    }

    public void a(dcg[] dcgArray) {
        this.rnD = dcgArray;
    }

    public dcg acO(int n) {
        if (this.rnD == null) {
            return null;
        }
        int n2 = this.rnD.length;
        for (int i = 0; i < n2; ++i) {
            if (this.rnD[i] == null || this.rnD[i].gcP != n) continue;
            return this.rnD[i];
        }
        return null;
    }

    @Override
    public lcf awS() {
        return lcw.enh();
    }

    @Override
    public lgs awT() {
        return new lgs(0, 0, this.dzN.kLY);
    }

    public lgs cel() {
        return new lgs(0, 0, this.dzN.kLY);
    }

    @Override
    public bsg awR() {
        int n = aqN.uW(this.Type);
        if (n < 0) {
            return null;
        }
        return (bsg)((Object)aqN.acv(n));
    }

    @Override
    public bsn awX() {
        return (bsn)this.awR();
    }

    public bsf uj(ldv ldv2) {
        assert (false) : ldv2;
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name='");
        stringBuilder.append(this.getName());
        stringBuilder.append("' Description='");
        stringBuilder.append(this.jD);
        stringBuilder.append("' Texture='");
        stringBuilder.append(this.dzN);
        stringBuilder.append(" Activatable=");
        stringBuilder.append(this.rnx);
        return stringBuilder.toString();
    }
}

