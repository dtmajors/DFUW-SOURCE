/*
 * Decompiled with CFR.
 */
public class jfu
extends inx {
    private jev mYo;
    private String mXZ;

    public jfu(jev jev2, String string) {
        super("WeaponDraggableWindow", "RolesWindow.swf");
        this.mYo = jev2;
        this.mXZ = string;
    }

    public jev dBW() {
        return this.mYo;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(irl.dnr());
        this.dhJ().W(new ipb(this.mXZ));
        this.pack();
    }
}

