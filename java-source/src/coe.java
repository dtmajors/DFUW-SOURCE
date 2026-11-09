/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
import java.util.Map;

public class coe
extends cbx
implements bto {
    private ljq ePi;
    private lgl ePj;
    private ljq ePk;
    private lgl ePl;
    private cog ePm;

    public coe(boolean bl) {
        super(bl);
        this.ObjectType = 146;
    }

    protected void aIw() {
        super.aIw();
        cog cog2 = lea.epi().get(this.az());
        if (cog2 == null) {
            lfn.b(5, "SFTrackFlag", "handleMeshObjectAdded() No trackflaginfo for this: " + this.pa());
            assert (false);
            return;
        }
        this.a(cog2);
        Map<String, eh> map = ei.ao(this.aAG().getFileName());
        assert (map != null);
        eh eh2 = map.get("AttachPoint Object Owner Display");
        assert (eh2 != null);
        this.ePk = eh2.fb();
        this.ePl = eh2.fc();
        eh2 = map.get("AttachPoint_Structure Spawn Delta");
        assert (eh2 != null);
        this.ePi = eh2.fb();
        this.ePj = eh2.fc();
    }

    public final ljq aUV() {
        return this.ePi;
    }

    public final lgl aUW() {
        return this.ePj;
    }

    public final ljq aUX() {
        return this.ePk;
    }

    public final lgl aUY() {
        return this.ePl;
    }

    public final cog aUZ() {
        return this.ePm;
    }

    public final void a(cog cog2) {
        this.ePm = cog2;
    }
}

