/*
 * Decompiled with CFR.
 */
public class djz
extends djy {
    public djz() {
        this.gqB = 100;
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
            lfn.b(5, "SFSpecialEffectSingle3DAudioMonster", "initializeSpecialEffect() : failed to find monster sound with id " + n);
        }
        this.setLooping(false);
        this.setXMLFileName(string);
        super.initializeSpecialEffect();
    }
}

