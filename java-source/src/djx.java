/*
 * Decompiled with CFR.
 */
public class djx
extends djw {
    public djx() {
        this.gqB = 101;
    }

    @Override
    public void initializeSpecialEffect() {
        String string;
        int n = 0;
        if (this.aZG != null) {
            n = (int)this.aZG.eny();
        }
        if ((string = lea.epl().get(n)) == null) {
            string = lea.epl().get(0);
            lfn.b(5, "SFSpecialEffectSingle2DAudioMonster", "initializeSpecialEffect() : failed to find monster sound with id " + n);
        }
        this.setXMLFileName(string);
        super.initializeSpecialEffect();
    }
}

