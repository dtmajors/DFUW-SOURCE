/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class ctc {
    private String ResourceName = null;
    private int ResourceType = -1;
    private float Probability = 0.0f;
    private int asi = 0;

    public String pa() {
        return this.ResourceName;
    }

    public int az() {
        return this.ResourceType;
    }

    public float aqG() {
        return this.Probability;
    }

    public boolean vA() {
        return lgp.erA().cS(this.Probability);
    }

    public int vf() {
        return this.asi;
    }

    public ctc(String string, float f2, int n) {
        this.ResourceName = string;
        this.ResourceType = cug.ih((String)this.ResourceName);
        this.Probability = f2;
        this.asi = n;
    }

    public ctc bbv() {
        return new ctc(this.ResourceName, this.Probability, this.asi);
    }
}

