/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class brt
extends brm
implements bsh {
    private int ResourceType = 0;
    private int asi = 0;
    private float aXV = 0.0f;
    private float aXy = 0.0f;
    private boolean dIZ = false;
    private int dpT = 0;
    private float dJa = 0.0f;

    @Override
    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    @Override
    public int vf() {
        return this.asi;
    }

    public void do(int n) {
        this.asi = n;
    }

    @Override
    public float Bb() {
        return this.aXV;
    }

    public void aa(float f2) {
        this.aXV = f2;
    }

    public float getWeight() {
        return this.aXy;
    }

    public void setWeight(float f2) {
        this.aXy = f2;
    }

    public boolean awv() {
        return this.dIZ;
    }

    public void ec(boolean bl2) {
        this.dIZ = bl2;
    }

    public int aqI() {
        return this.dpT;
    }

    public void kR(int n) {
        this.dpT = n;
    }

    public float aww() {
        return this.dJa;
    }

    public void de(float f2) {
        this.dJa = f2;
    }

    @Override
    public final brm aue() {
        return (brm)((Object)this.awy());
    }

    public boolean equals(Object object) {
        if (object instanceof brt) {
            brt brt2 = (brt)object;
            return this.GUID.equals(brt2.getGUID());
        }
        return false;
    }

    @Override
    public final bsm awx() {
        bsm bsm2 = lea.acl(this.ResourceType);
        if (bsm2 == null) {
            // empty if block
        }
        return bsm2;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(this.pa());
        stringBuilder.append("' Quantity=");
        stringBuilder.append(this.asi);
        stringBuilder.append(" Cost=");
        stringBuilder.append(this.aXV);
        stringBuilder.append(" Weight=");
        stringBuilder.append(this.aXy);
        stringBuilder.append(" ExtraItem=");
        stringBuilder.append(this.dIZ);
        stringBuilder.append(" MaxQuantity=");
        stringBuilder.append(this.dpT);
        stringBuilder.append(" RegenerationRate=");
        stringBuilder.append(this.dJa);
        return stringBuilder.toString();
    }

    @Override
    public bsf awy() {
        brt brt2 = new brt();
        brt2.setGUID(this.GUID);
        brt2.l(this.ResourceType);
        brt2.do(this.asi);
        brt2.aa(this.aXV);
        brt2.setWeight(this.aXy);
        brt2.ec(this.dIZ);
        brt2.kR(this.dpT);
        brt2.de(this.dJa);
        return brt2;
    }

    @Override
    public String awz() {
        return this.awx().getName();
    }

    @Override
    public lip awA() {
        return this.awx().awO();
    }

    @Override
    public float awB() {
        return this.aXy;
    }

    public int awC() {
        return 0;
    }

    @Override
    public boolean awD() {
        return true;
    }

    @Override
    public bsg awE() {
        return this.awx();
    }

    @Override
    public ej[] arJ() {
        return new ej[0];
    }

    @Override
    public boolean ad(int n) {
        return false;
    }

    @Override
    public int AR() {
        return -1;
    }

    @Override
    public alc.a awF() {
        return null;
    }

    @Override
    public cak.c auO() {
        return cak.c.efE;
    }

    @Override
    public boolean AT() {
        return true;
    }

    @Override
    public long AQ() {
        return -1L;
    }
}

