/*
 * Decompiled with CFR.
 */
public class iju
extends ijc {
    private boolean meM = true;
    private boolean meN = true;
    private boolean meO = true;

    public iju() {
        super(true, true, lyu.tKG);
        this.rh(false);
    }

    @Override
    public ije dae() {
        return new ijv(this);
    }

    @Override
    public ikd daf() {
        return ikd.mfB;
    }

    public boolean dbJ() {
        return this.meM;
    }

    public void qB(boolean bl) {
        this.meM = bl;
    }

    public boolean dbK() {
        return this.meN;
    }

    public void qC(boolean bl) {
        this.meN = bl;
    }

    public boolean dbL() {
        return this.meO;
    }

    public void qD(boolean bl) {
        this.meO = bl;
    }
}

