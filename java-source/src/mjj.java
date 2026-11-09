/*
 * Decompiled with CFR.
 */
import java.util.HashMap;
import java.util.Map;

public class mjj {
    Map<ldv, b> DCD = new HashMap<ldv, b>();
    dxr MessageDelegator = null;
    ldv nUB;

    public mjj(dxr dxr2, ldv ldv2) {
        this.MessageDelegator = dxr2;
        this.nUB = ldv2;
    }

    public boolean g(ktv ktv2) {
        b b2 = this.DCD.get(ktv2.dXg());
        if (b2 == null) {
            return false;
        }
        b2.DCE.a(ktv2, b2.jwc);
        return true;
    }

    public void a(khd khd2) {
        this.a(khd2, null, null);
    }

    public void a(khd khd2, a a2, Object object) {
        if (a2 != null) {
            this.DCD.put(khd2.getGUID(), new b(this, a2, object));
        }
        khd2.ts(this.nUB);
        this.MessageDelegator.a(khd2);
    }

    public void a(ksl ksl2) {
        ksl2.ts(this.nUB);
        this.MessageDelegator.a(ksl2);
    }
}

