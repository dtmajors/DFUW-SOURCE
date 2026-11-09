/*
 * Decompiled with CFR.
 */
public class jfr
extends inx {
    private jet mXY;
    private String mXZ;

    public jfr(jet jet2, String string) {
        super("ArmorRobeDraggableWindow", "RolesWindow.swf");
        this.mXY = jet2;
        this.mXZ = string;
    }

    public jet dBL() {
        return this.mXY;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(irl.dnr());
        this.dhJ().W(new ipb(this.mXZ));
        this.pack();
    }
}

