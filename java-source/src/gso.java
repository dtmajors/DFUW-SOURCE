/*
 * Decompiled with CFR.
 */
public class gso
extends grb {
    public int aZa;
    public int jqY;
    public lgk jqZ;

    public uk bXc() {
        uj uj2 = new uj();
        uj2.Uo = 5;
        uj2.aWo = new lgj(this.aZa, this.jqZ.rlO, this.jqZ.rlP, this.jqZ.rlQ, this.jqZ.rlR, this.jqZ.rlS, this.jqZ.rlT, this.jqZ.rlU, this.jqZ.aZb);
        return uj2;
    }

    @Override
    public String toString() {
        return "SFSystemSubscriptionPositionUpdateMessage [ResourceType=" + this.jqY + ", PhysicsStepNumber=" + this.aZa + " Update=" + this.jqZ + "]";
    }

    gso() {
        super(11079);
    }
}

