/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;
import java.util.Map;

public class buz
extends buy {
    private Map<Integer, Map<ldv, bux>> dPX = lcn.emw();
    private hzb dPY;
    private static final float dPZ = 128.0f;
    private static final float dQa = 128.0f;
    private static final int dQb = (int)((lcw.fyn.getX() + 128.0f - 1.0f) / 128.0f);

    @Override
    public void initialize() {
        super.initialize();
        bva bva2 = new bva();
        List<bux> list = bva2.ayX();
        for (bux bux2 : list) {
            if (this.a(bux2) == 0) continue;
            lfn.b(5, "SFMarkerManagerClient", "SFMarkerManagerClient: Error adding marker " + bux2);
            assert (false);
        }
    }

    @Override
    protected void d(bux bux2) {
        super.d(bux2);
    }

    @Override
    protected int a(int n, bux bux2, bux bux3) {
        if ((n & 1) == 0) {
            return super.a(n, bux2, bux3);
        }
        int n2 = this.aW(bux3.av());
        int n3 = super.a(n, bux2, bux3);
        int n4 = this.aW(bux3.av());
        if (n2 != n4) {
            Map<ldv, bux> map = this.dPX.get(n2);
            if (map == null) {
                lfn.b(5, "SFMarkerManagerClient", "applyModifications: No map for tile index " + n2);
                assert (false);
                return n3;
            }
            bux bux4 = map.remove(bux3.getGUID());
            if (bux4 == null) {
                lfn.b(5, "SFMarkerManagerClient", "applyModifications: Could not find " + bux3 + " in map for tile " + n2);
                assert (false);
                return n3;
            }
            if (bux4 != bux3) {
                lfn.b(5, "SFMarkerManagerClient", "applyModifications: Marker in tile " + n2 + " map isn't same object as argument marker");
                assert (false);
                return n3;
            }
            if (map.isEmpty()) {
                this.dPX.remove(n2);
            }
            if ((map = this.dPX.get(n4)) == null) {
                map = lcn.emw();
                this.dPX.put(n4, map);
            }
            map.put(bux3.getGUID(), bux3);
        }
        return n3;
    }

    @Override
    protected void b(bux bux2, int n) {
    }

    @Override
    protected void e(bux bux2) {
    }

    private int aW(ljq ljq2) {
        if (ljq2 == null) {
            return -1;
        }
        if (!ljq2.esG()) {
            return -1;
        }
        int n = (int)((ljq2.getX() - lcw.fyl.getX()) / 128.0f);
        int n2 = (int)((ljq2.bdV() - lcw.fyl.bdV()) / 128.0f);
        return n + n2 * dQb;
    }

    private void f(bux bux2) {
    }

    private void a(hyz hyz2) {
    }
}

