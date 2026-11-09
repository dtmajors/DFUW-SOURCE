/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class hdo
implements lbr {
    private static final hbe jzX = hbe.jAM;
    private final hdm jLM;
    private final Map<ldv, b<?>> kaw = new HashMap();
    private final lbn kax = new lbn(this){
        final /* synthetic */ hdo kay;
        {
            this.kay = hdo2;
        }

        public final void W() {
            hdo.a(this.kay);
        }
    };
    private boolean jLT;

    public hdo(hdm hdm2) {
        this.jLM = hdm2;
        this.jLT = true;
        this.mU(true);
    }

    public void dispose() {
        assert (this.jLT);
        for (b<?> b2 : this.kaw.values()) {
            b2.dispose();
        }
        this.kaw.clear();
        this.mU(false);
        this.jLT = false;
    }

    @Override
    public boolean a(lfu lfu2) {
        assert (lda.by(lfu2));
        return false;
    }

    private void mU(boolean bl) {
        this.jLM.cbP().kcp.cny().a(bl, this.kax);
    }

    private void cdO() {
        Object object;
        bdq[] bdqArray = this.jLM.cbP().kcp.cnz();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < bdqArray.length; ++i) {
            Iterator<Object> iterator = bdqArray[i];
            ldv ldv2 = ((bdq)((Object)iterator)).dbx;
            if (ldv2 == null) continue;
            hashMap.put(ldv2, iterator);
        }
        LinkedList<ldv> linkedList = new LinkedList<ldv>();
        for (ldv ldv2 : this.kaw.keySet()) {
            if (hashMap.containsKey(ldv2)) continue;
            linkedList.add(ldv2);
        }
        for (ldv ldv2 : linkedList) {
            object = this.kaw.get(ldv2);
            ((b)object).dispose();
            this.kaw.remove(ldv2);
        }
        for (ldv ldv2 : hashMap.keySet()) {
            if (this.kaw.containsKey(ldv2)) continue;
            object = (bdq)hashMap.get(ldv2);
            assert (((bdq)object).dbx == ldv2);
            b<?> b2 = this.a((bdq)object);
            if (b2 == null) continue;
            this.kaw.put(ldv2, b2);
        }
    }

    private b<?> a(bdq bdq2) {
        if (bdq2 instanceof bdr) {
            return this.a((bdr)bdq2);
        }
        assert (false) : "unknown confirmation request: " + bdq2;
        return null;
    }

    private b<?> a(bdr bdr2) {
        int n = 0;
        if (bdr2.dby.length == 0) {
            return null;
        }
        if (n < 0) {
            n = 0;
        }
        if (n >= bdr2.dby.length) {
            n = bdr2.dby.length - 1;
        }
        lip[] lipArray = new lip[bdr2.dby.length];
        for (int i = 0; i < lipArray.length; ++i) {
            lipArray[i] = new ljg(bdr2.dby[i]);
        }
        return new a(this.jLM, bdr2.dbx, n, lipArray, bdr2.dbA, bdr2.Title == null ? new ljg("Confirmation") : new ljg(bdr2.Title), bdr2.Caption == null ? ljg.roH : new ljg(bdr2.Caption));
    }

    static /* synthetic */ void a(hdo hdo2) {
        hdo2.cdO();
    }
}

