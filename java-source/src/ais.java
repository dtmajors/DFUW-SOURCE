/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  ep
 *  lcr
 *  mcs
 */
public class ais
extends aja {
    private int bnM = 0;
    private boolean bnN = false;

    public ais() {
        this.bog = ajb.b.box;
    }

    public int BV() {
        return this.bnM;
    }

    public void fC(int n) {
        this.bnM = n;
    }

    public boolean BW() {
        return this.bnN;
    }

    public void aV(boolean bl) {
        this.bnN = bl;
    }

    public final String getAttributeName() {
        return ep.aM((int)this.bnM);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" AttributeType='");
        stringBuilder.append(this.getAttributeName());
        stringBuilder.append("' RequiredAttributeValue=");
        stringBuilder.append(this.bnN);
        return stringBuilder.toString();
    }

    @Override
    protected boolean BU() {
        dbt dbt2;
        buf buf2;
        bun bun2;
        this.bok = null;
        boolean bl = this.boj.aJz().bgQ().fi().ag(this.bnM);
        if (bl == this.bnN) {
            return true;
        }
        if (!this.boj.bfF() ? (bun2 = (bun)this.boj.getMessageDelegator().bzx().bzt().d(lcr.qBP)) != null && (buf2 = bun2.ayq()) != null && lea.enW().isDescendant(buf2.az(), cug.fkA) : (dbt2 = this.boj.beo()) != null && lea.enW().isDescendant(dbt2.dhr, cug.fkA)) {
            return true;
        }
        this.bok = this.bnM == 10928 ? mcs.uAl.bD(this.boj.Bu()) : (this.Co().zg() == cxd.fJy ? mcs.uAt.bD(this.BV()) : mcs.uAq.bD(this.BV(), this.bnN, bl));
        return false;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ais ais2 = (ais)aja2;
        ais2.fC(this.bnM);
        ais2.aV(this.bnN);
    }
}

