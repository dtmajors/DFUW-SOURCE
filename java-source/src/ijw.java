/*
 * Decompiled with CFR.
 */
public class ijw
extends ipx {
    private iph meR;
    private ipk meS;
    private ist lCt;
    private iph lWn;

    public ijw() {
        this.a(iqo.dmT());
        this.W(this.dbR());
        this.W(this.cKS());
    }

    public ipk dbP() {
        return this.meS;
    }

    public ist dbQ() {
        return this.lCt;
    }

    public iph cXE() {
        return this.lWn;
    }

    private ipf dbR() {
        this.meR = ipx.h(new ipf[0]);
        this.meR.W(this.dbS());
        this.meR.W(this.dbT());
        return this.meR;
    }

    private ipf dbS() {
        this.meS = new ipk(255);
        return this.meS;
    }

    private ipf dbT() {
        this.lCt = new ist(isf.mwN, 12, 0xFFFFFF);
        return this.lCt;
    }

    private ipf cKS() {
        this.lWn = ipx.h(new ipf[0]);
        return this.lWn;
    }
}

