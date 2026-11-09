/*
 * Decompiled with CFR.
 */
public class dzv
extends dzt {
    public int dTs = 0;
    public float aWf = 0.0f;

    dzv() {
        super(7425);
    }

    @Override
    public String toString() {
        return "StateID = " + (this.dTs & 0xFFFF) + " : " + super.toString();
    }
}

