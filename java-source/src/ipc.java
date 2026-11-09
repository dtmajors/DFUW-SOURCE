/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Set;

public class ipc
extends ipf {
    private String mqi;
    private int mqj;
    private int mqk;
    private boolean mql;
    private boolean mqm = true;
    private static Map<String, Map<String, lfs<Integer, Integer>>> mqn = lcn.emw();
    private static Map<String, Map<String, Set<ipc>>> mqo = lcn.emw();
    private static iqz mqp = new iqz(){

        public void e(ipf ipf2) {
            ipc ipc2 = (ipc)ipf2;
            ipc2.setSize(ipc2.dju(), ipc2.djv());
        }
    };

    public ipc() {
        this.a(mqp);
    }

    @Override
    public void cleanUp() {
        this.djA();
        super.cleanUp();
        this.mql = false;
    }

    public String djt() {
        return this.mqi;
    }

    public void qP(String string) {
        if (lhn.equal(string, this.mqi)) {
            return;
        }
        this.mqi = string;
        this.djz();
        if (string != null && string.length() > 0) {
            this.dku();
        }
    }

    public int dju() {
        return this.mqj;
    }

    public int djv() {
        return this.mqk;
    }

    public boolean djw() {
        return this.mqm;
    }

    public void rc(boolean bl) {
        this.mqm = bl;
    }

    public static lfs<Integer, Integer> R(String string, String string2) {
        Map<String, lfs<Integer, Integer>> map = mqn.get(string);
        return map != null ? map.get(string2) : null;
    }

    public static void c(String string, String string2, int n, int n2) {
        Map<String, lfs<Integer, Integer>> map = mqn.get(string);
        if (map == null) {
            map = lcn.emw();
            mqn.put(string, map);
        }
        map.put(string2, new lfs<Integer, Integer>(n, n2));
    }

    @Override
    public void djx() {
        if (this.djD()) {
            lfn.b(4, this.getClass().getSimpleName(), this.djE().getClass().getSimpleName() + ": SFJ2FWindow: UI locked; waiting for bitmap with name = " + this.mqi);
        }
    }

    @Override
    public void dhU() {
        if (this.djE() == null) {
            return;
        }
        if (this.mqi == null || this.mqi.isEmpty()) {
            return;
        }
        Map<String, lfs<Integer, Integer>> map = mqn.get(this.djE().cyg());
        if (map == null) {
            return;
        }
        map.remove(this.mqi);
        if (map.isEmpty()) {
            mqn.remove(this.djE().cyg());
        }
    }

    @Override
    public void djy() {
        if (this.mqi == null) {
            return;
        }
        lfs<Integer, Integer> lfs2 = ipc.R(this.djE().loi, this.mqi);
        if (lfs2 != null) {
            this.ej((Integer)lfs2.reX, (Integer)lfs2.reY);
        } else {
            Set<ipc> set;
            Map<String, Set<ipc>> map = mqo.get(this.djE().loi);
            if (map == null) {
                map = lcn.emw();
                mqo.put(this.djE().loi, map);
            }
            if ((set = map.get(this.mqi)) == null) {
                set = lcn.emx();
                map.put(this.mqi, set);
                this.dke();
                this.djE().b("Bitmap_measure", new Object[]{this.getId(), this.qL(this.mqi)});
            }
            set.add(this);
        }
    }

    public void o(String string, int n, int n2) {
        Map<String, Set<ipc>> map = mqo.get(this.djE().loi);
        if (map == null) {
            return;
        }
        Set<ipc> set = map.remove(string);
        if (set != null) {
            for (ipc ipc2 : set) {
                ipc2.ej(n, n2);
            }
        }
        if (map.isEmpty()) {
            mqo.remove(this.djE().loi);
        }
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        if (this.mql) {
            this.mql = false;
            this.djr();
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.mql = false;
    }

    public void djr() {
    }

    void djz() {
        if (this.mql) {
            return;
        }
        this.mql = true;
        this.dkg();
    }

    private void ej(int n, int n2) {
        this.mqj = n;
        this.mqk = n2;
        if (this.mqm) {
            super.eq(n, n2);
        }
    }

    private void djA() {
        if (this.mqi == null) {
            return;
        }
        if (this.djE() == null) {
            return;
        }
        Map<String, Set<ipc>> map = mqo.get(this.djE().loi);
        if (map == null) {
            return;
        }
        Set<ipc> set = map.get(this.mqi);
        if (set == null) {
            return;
        }
        set.remove(this);
        if (set.isEmpty()) {
            map.remove(this.mqi);
            if (map.isEmpty()) {
                mqo.remove(this.djE().loi);
            }
        }
    }
}

