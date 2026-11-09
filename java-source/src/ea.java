/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcw
 */
import java.util.List;

public class ea
extends btk
implements bto {
    private static final String oa = lcw.qLb + "xml/audio/monsters_new/";
    private static final String ob = "audio/monsters_new/";
    private a oc = a.of;
    jsw od = null;

    @Override
    public void initialize() {
        super.initialize();
        this.od = new jsw();
    }

    public void di() {
        jrw jrw2 = new jrw(oa);
        if (!jrw2.exists()) {
            return;
        }
        Object[][] objectArray = new Object[asf.a.enumSize()][2];
        int n2 = 0;
        for (asf.a a2 : asf.a.Values) {
            objectArray[n2][0] = a2.name().toLowerCase();
            objectArray[n2][1] = (long)a2.ordinal();
            ++n2;
        }
        jrw[] jrwArray = jrw2.dRT();
        int n3 = 1;
        for (jrw jrw3 : jrwArray) {
            jrw[] jrwArray2;
            if (!jrw3.isDirectory()) continue;
            for (jrw jrw4 : jrwArray2 = jrw3.dRT()) {
                jrw[] jrwArray3;
                int n4;
                if (!jrw4.isDirectory() || (n4 = cug.ih((String)"r_".concat(jrw3.getName()))) <= 0) continue;
                long l2 = -1L;
                for (Object[] objectArray2 : objectArray) {
                    if (!((String)objectArray2[0]).contains(jrw4.getName().toLowerCase())) continue;
                    l2 = (Long)objectArray2[1] << 32;
                    l2 |= (long)n4;
                    break;
                }
                if (l2 < 0L) {
                    assert (false);
                    continue;
                }
                Long l3 = l2;
                for (jrw jrw5 : jrwArray3 = jrw4.dRT()) {
                    String string;
                    if (!jrw5.isFile() || !(string = jrw5.getName().toLowerCase()).endsWith(".xml")) continue;
                    String string2 = ob + jrw3.getName() + '/' + jrw4.getName() + '/' + string;
                    this.od.dSx().put(n3, string2);
                    List<Integer> list = this.od.dSy().get(l3);
                    if (list == null) {
                        list = lcn.emv();
                        this.od.dSy().put(l3, list);
                    }
                    list.add(n3);
                    ++n3;
                }
            }
        }
        this.dj();
    }

    public void dj() {
        assert (this.od != null);
        this.oc = a.oh;
        jsx.a(this.od);
        this.oc = a.oi;
    }

    @Override
    public void doTick(ldz ldz2) {
        switch (this.oc) {
            case of: {
                this.oc = a.og;
                this.di();
                break;
            }
            case og: {
                break;
            }
            case oh: {
                break;
            }
            case oi: {
                this.dk();
                return;
            }
        }
    }

    private void dk() {
        this.cleanUp();
        System.exit(0);
    }
}

