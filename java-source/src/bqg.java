/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  mcs
 */
public class bqg {
    public final alk dBG;
    public final bqh dBH;
    public bqs dBI = null;
    public brr dBJ = null;

    public bqg(alk alk2, bqh bqh2) {
        assert (alk2 != null);
        this.dBG = alk2;
        this.dBH = bqh2;
    }

    public float aug() {
        if (alc.a.isRareIngredient(this.dBG.brQ)) {
            return 5.0f;
        }
        et et2 = (et)cug.bh((int)this.dBI.az(), (int)1088);
        if (et2 == null) {
            lfn.b(5, "SFEnchantmentSlot", "getQuality() Could not find attribute 'Quality' for resource '" + this.dBI.pa() + "'");
            return 0.0f;
        }
        return et2.fN();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFEnchantmentSlot: SlotType=");
        stringBuilder.append((Object)this.dBG.brQ);
        stringBuilder.append(" Item=");
        stringBuilder.append(this.dBI);
        return stringBuilder.toString();
    }

    public akp db(float f2) {
        if (this.dBJ != null) {
            return new akp(true);
        }
        if (this.dBI == null) {
            akp akp2 = new akp(false);
            akp2.bok = this.dBG.brQ == alc.a.brl ? mcs.uzj.bD(new Object[]{alc.a.brl}) : mcs.uzj.bD(new Object[]{this.dBG.brQ.brz});
            return akp2;
        }
        if (this.dBG.brR > this.dBI.vf()) {
            lfn.b(5, "SFEnchantmentSlot", "validateInventoryItem() RequiredQuantity=" + this.dBG.brR);
            lfn.b(5, "SFEnchantmentSlot", "validateInventoryItem() Item.Quantity=" + this.dBI.vf());
            akp akp3 = new akp(false);
            akp3.bok = this.dBG.brQ == alc.a.brl ? mcs.uzn.bD(this.dBI.pa()) : mcs.uzm.bD(this.dBI.pa());
            return akp3;
        }
        if (this.dBG.brQ == alc.a.brl && !cug.uy((int)this.dBI.az())) {
            akp akp4 = new akp(false);
            akp4.bok = mcs.uzq.bD(this.dBI.pa());
            return akp4;
        }
        if (!lea.enW().isDescendant(this.dBI.az(), this.dBG.brS)) {
            akp akp5 = new akp(false);
            akp5.bok = this.dBG.brQ == alc.a.brl ? mcs.uzl.bD(this.dBI.pa()) : mcs.uzk.bD(this.dBI.pa());
            return akp5;
        }
        if (alc.b(this.dBG.brQ) && !alc.j(this.dBI.az(), f2)) {
            lfn.b(5, "SFEnchantmentSlot", "validateInventoryItem() Resource '" + this.dBI.pa() + "' does not contain valid quality.");
            akp akp6 = new akp(false);
            akp6.bok = mcs.uzr.bD(this.dBI.pa());
            return akp6;
        }
        return new akp(true);
    }
}

