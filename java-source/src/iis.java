/*
 * Decompiled with CFR.
 */
public abstract class iis
extends ijc {
    private boolean mbF = true;
    private ipb mbG = new ipb();
    private ipb mbH = new ipb();
    private ist lUP = new ist(isf.mwM, 10, 0xE0E0E0, "25.00");

    public iis(boolean bl, lox lox2) {
        super(true, bl, lox2);
    }

    public boolean dag() {
        return this.mbF;
    }

    public void qt(boolean bl) {
        this.mbF = bl;
        this.lUP.setVisible(bl);
        this.pack();
        this.mci.dLF();
    }

    public ipb dal() {
        return this.mbG;
    }

    public ipb dam() {
        return this.mbH;
    }

    public ist dan() {
        return this.lUP;
    }

    @Override
    public void daa() {
        if (this.mbG != null) {
            this.mbG.hz(this.daE());
        }
        if (this.mbH != null) {
            this.mbH.hz(this.daE());
        }
    }
}

