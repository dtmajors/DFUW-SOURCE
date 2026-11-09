/*
 * Decompiled with CFR.
 */
public class jhq
extends inx {
    private jhi nfm;
    private jhi nfn;

    public jhq(jhi jhi2, jhi jhi3) {
        super("TrackerDraggableWindow", "TrackerWindow.swf");
        this.nfm = jhi2;
        this.nfn = jhi3;
    }

    public jhi dGq() {
        return this.nfn;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(irl.dnr());
        this.dhJ().W(this.nfm);
        this.dhJ().W(ipx.c(new ipf[0]));
        this.pack();
    }
}

