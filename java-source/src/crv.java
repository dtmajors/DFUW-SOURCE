/*
 * Decompiled with CFR.
 */
public class crv
extends crj {
    public int eYU;
    public int eYV;
    public int eYW;
    public int eYX;
    public int eYY;
    public int eYZ;
    public crw eZa = new crw();

    @Override
    public Object clone() {
        crv crv2 = (crv)super.clone();
        crv2.eZa = (crw)this.eZa.clone();
        return crv2;
    }

    public void b(kgy kgy2) {
        this.tv(kgy2.eYU);
        this.tw(kgy2.eYV);
        this.tx(kgy2.eYW);
        this.ty(kgy2.eYX);
        this.tz(kgy2.eYY);
        this.tA(kgy2.eYZ);
    }

    public void tv(int n) {
        this.eYU = n;
        this.eZa.tB(n);
    }

    public void tw(int n) {
        this.eYV = n;
        this.eZa.tC(n);
    }

    public void tx(int n) {
        this.eYW = n;
        this.eZa.tD(n);
    }

    public void ty(int n) {
        this.eYX = n;
        this.eZa.tE(n);
    }

    public void tz(int n) {
        this.eYY = n;
        this.eZa.tF(n);
    }

    public void tA(int n) {
        this.eYZ = n;
        this.eZa.tG(n);
    }
}

