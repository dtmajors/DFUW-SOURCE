/*
 * Decompiled with CFR.
 */
public class icr {
    public ibs lHB;
    public ics lHC = ics.lHE;
    public int color = 0xFFFFFF;
    public boolean visible = true;

    public icr(ibs ibs2, ics ics2, int n, boolean bl) {
        assert (ibs2 != null);
        this.lHB = ibs2;
        this.lHC = ics2;
        this.color = n;
        this.visible = bl;
    }

    public icr cNS() {
        return new icr(this.lHB, this.lHC, this.color, this.visible);
    }

    public void a(itt itt2) {
        itt2.a(new itx("FontSize", this.lHC.name()));
        itt2.a(new itu("Color", this.color));
        itt2.a(new itr("visible", this.visible));
    }

    public void b(itt itt2) {
        this.lHC = ics.valueOf(itt2.T("FontSize", ics.values()[1].name()));
        this.color = itt2.L("Color", 0xFFFFFF);
        this.visible = itt2.A("visible", true);
    }

    public String toString() {
        return "SFChannelOptions [FontSize=" + this.lHC.name() + ", color=" + this.color + ", visible=" + this.visible + "]";
    }

    public /* synthetic */ Object clone() {
        return this.cNS();
    }
}

