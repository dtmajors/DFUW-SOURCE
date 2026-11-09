/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class hdt {
    public static final hbe jzX = hbe.jAM;
    private final hdm jLM;
    private boolean jLT;
    private final HashMap<lip, hlk> kaS = new HashMap();
    private final Map<lip, hek> kaT = Collections.emptyMap();

    public hdt(hdm hdm2) {
        this.jLM = hdm2;
        this.jLT = true;
        this.mU(true);
        this.cdW();
    }

    public final void dispose() {
        assert (this.jLT);
        this.H(this.kaT);
        this.mU(false);
        this.jLT = false;
    }

    private void cdW() {
        this.H(this.jLM.cbP().kcq.cou());
    }

    private hlk a(ldv ldv2, lip lip2) {
        int n = -1;
        List list = this.jLM.cdt();
        for (int i = 0; i < list.size(); ++i) {
            hlk hlk2 = (hlk)list.get(i);
            if (hlk2.cpl() == null) {
                if (n != -1) continue;
                n = i;
                continue;
            }
            if (this.kaS.containsKey(hlk2.cpl().kef)) {
                assert (this.kaS.get(hlk2.cpl().kef) == hlk2);
                continue;
            }
            if (hlk2.cpl().cbG().equals(ldv2)) {
                return hlk2;
            }
            if (!hlk2.cpl().kef.i(lip2)) continue;
            return hlk2;
        }
        if (n == -1) {
            return null;
        }
        return (hlk)list.get(n);
    }

    private void H(Map<lip, hek> map) {
        Object object;
        assert (map.size() <= 10);
        for (lip lip2 : map.keySet()) {
            if (this.kaS.containsKey(lip2)) continue;
            object = map.get(lip2);
            assert (((hek)object).kef.i(lip2));
            hlk hlk2 = this.a(((hek)object).cbG(), ((hek)object).kef);
            hlk2.c((hek)object);
            this.kaS.put(((hek)object).kef, hlk2);
            hlk2.cdk();
        }
        Iterator<lip> iterator = this.kaS.keySet().iterator();
        while (iterator.hasNext()) {
            lip lip2;
            lip2 = iterator.next();
            if (map.containsKey(lip2)) continue;
            object = this.kaS.get(lip2);
            ((hdj)object).closeWindow();
            ((hlk)object).c(null);
            iterator.remove();
        }
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

