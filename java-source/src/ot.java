/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ot {
    public ldv GUID;
    public String aGn;

    public ot() {
    }

    public ot(ldv ldv2, String string) {
        this.GUID = ldv2;
        this.aGn = string;
    }

    public String fk() {
        return pr.b(':', this.GUID.fk(), this.aGn);
    }

    public static ot bU(String string) {
        List<String> list = pr.a(':', string);
        if (list.size() != 2) {
            lfn.b(5, "SFStorablePairGUIDString", "fromDBString: Couldn't parse '" + string + "'");
            return null;
        }
        ot ot2 = new ot();
        ot2.GUID = ldv.zp(list.get(0));
        if (ot2.GUID == null) {
            lfn.b(5, "SFStorablePairGUIDString", "fromDBString: Couldn't parse '" + string + "'");
            return null;
        }
        ot2.aGn = list.get(1);
        return ot2;
    }
}

