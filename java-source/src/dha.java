/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.List;

public class dha
extends djy {
    private int gtE = 1;
    private int gtF = 1;
    private float gtG = 0.2f;
    private double gtH = 0.0;
    private int gtI = 0;
    List<dfc> gtJ = lcn.emv();

    dha() {
        this.gqB = 103;
        this.gqA = null;
    }

    @Override
    protected void initializeSpecialEffect() {
        this.gtI = this.gtE;
        this.superInitializeSpecialEffect();
    }

    @Override
    protected void doTickSpecialEffect() {
        super.doTickSpecialEffect();
        if (this.nx.rgz >= this.gtH && this.gtI > 0) {
            --this.gtI;
            int n2 = (int)(Math.random() * (double)this.gtF) % this.gtF + 1;
            lfn.b(5, "SFSpecialEffectDebrisAudio", "doTickSpecialEffect() :" + n2);
            String string = String.valueOf(n2);
            if (string.length() == 1) {
                string = "0" + string;
            }
            String string2 = this.getXMLFileName() + "_" + string + ".xml";
            this.gtJ.add(super.createAudio(string2, this.getNewEffectGuid()));
            this.gtH = this.nx.rgz + Math.random() * (double)this.gtG;
        }
    }

    @Override
    public void cleanUpSpecialEffect() {
        super.cleanUpSpecialEffect();
        for (dfc dfc2 : this.gtJ) {
            dey.bls().b(dfc2);
        }
        this.gtJ.clear();
    }

    @Override
    protected void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dha dha2 = (dha)dgj2;
        dha2.gtE = this.gtE;
        dha2.gtF = this.gtF;
        dha2.gtG = this.gtG;
    }

    @Override
    public void setDefaultValues() {
        super.setDefaultValues();
        this.gtE = 1;
        this.gtF = 1;
        this.gtG = 0.2f;
    }

    public int getPlayCount() {
        return this.gtE;
    }

    public void setPlayCount(int n2) {
        this.gtE = n2;
    }

    public int getRandomCount() {
        return this.gtF;
    }

    public void setRandomCount(int n2) {
        this.gtF = n2;
    }

    public float getRandomInterval() {
        return this.gtG;
    }

    public void setRandomInterval(float f2) {
        this.gtG = f2;
    }
}

