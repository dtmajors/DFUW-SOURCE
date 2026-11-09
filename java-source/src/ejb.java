/*
 * Decompiled with CFR.
 */
public class ejb
extends ejm {
    private boolean irR = false;
    private boolean irS = false;
    private boolean irT = false;
    private boolean irU = false;
    private boolean irV = false;
    private int czZ = azf.cEa.ordinal();
    private boolean irW = false;
    private boolean irX = false;
    private boolean irY = false;
    private boolean irZ = false;

    public boolean bHo() {
        return this.irR;
    }

    public void kk(boolean bl) {
        this.irR = bl;
    }

    public boolean bHp() {
        return this.irS;
    }

    public void kl(boolean bl) {
        this.irS = bl;
    }

    public boolean bHq() {
        return this.irT;
    }

    public void km(boolean bl) {
        this.irT = bl;
    }

    public boolean bHr() {
        return this.irU;
    }

    public void kn(boolean bl) {
        this.irU = bl;
    }

    public boolean bHs() {
        return this.irV;
    }

    public void ko(boolean bl) {
        this.irV = bl;
    }

    public azf Zr() {
        return azf.getValueByOrdinal(this.czZ);
    }

    public void b(azf azf2) {
        this.czZ = azf2 == null ? this.czZ : azf2.ordinal();
    }

    public boolean bHt() {
        return this.irW;
    }

    public void kp(boolean bl) {
        this.irW = bl;
    }

    public boolean bHu() {
        return this.irX;
    }

    public void kq(boolean bl) {
        this.irX = bl;
    }

    public boolean bHv() {
        return this.irY;
    }

    public void kr(boolean bl) {
        this.irY = bl;
    }

    public boolean bHw() {
        return this.irZ;
    }

    public void ks(boolean bl) {
        this.irZ = bl;
    }

    ejb() {
        super(18734);
    }
}

