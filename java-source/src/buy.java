/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class buy
extends btk
implements bto {
    protected Map<ldv, bux> dPV = lcn.emw();
    protected TreeMap<Long, Object> dPW = lcn.emG();
    protected Set<ldv> Sg = lcn.emx();

    @Override
    public void doTick(ldz ldz2) {
        if (!this.dPW.isEmpty()) {
            long l2 = (long)(ldz2.rgz * 1000.0);
            if (this.dPW.firstKey() <= l2) {
                this.S(l2);
            }
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.Active = true;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 31233: {
                this.a((fpx)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected void a(fpx fpx2) {
        fpy fpy2 = (fpy)this.MessageDelegator.h(31234, this.getGUID(), fpx2.aO());
        fpy2.ed = fpx2.ed;
        this.MessageDelegator.b(fpx2, fpy2);
        fpy2.dPP = fpx2.dPP;
        switch (fpx2.ed) {
            case 1: {
                this.a(fpx2, fpy2);
                break;
            }
            case 2: {
                this.b(fpx2, fpy2);
                break;
            }
            case 3: {
                this.c(fpx2, fpy2);
                break;
            }
            default: {
                fpy2.iTz = 4;
                lfn.b(5, "SFMarkerManager", "handleMarkerRequestMessage: Invalid request type " + fpx2.ed);
                assert (false);
                break;
            }
        }
        this.MessageDelegator.E(fpy2);
    }

    protected void a(fpx fpx2, fpy fpy2) {
        if (fpx2.iTv == null) {
            fpy2.iTz = 3;
            lfn.b(5, "SFMarkerManager", "handleMarkerCreateRequest: Marker is null");
            assert (false);
            return;
        }
        bux bux2 = fpx2.iTv.ayQ();
        bux2.setGUID(fpx2.dPP);
        fpy2.iTz = this.a(bux2);
        fpy2.dPP = bux2.getGUID();
    }

    protected void b(fpx fpx2, fpy fpy2) {
        if (fpx2.dPP == null) {
            fpy2.iTz = 3;
            lfn.b(5, "SFMarkerManager", "handleMarkerModifyRequest: MarkerGUID is null");
            assert (false);
            return;
        }
        bux bux2 = fpx2.iTv;
        if (bux2 == null) {
            fpy2.iTz = 3;
            lfn.b(5, "SFMarkerManager", "handleMarkerModifyRequest: Marker is null");
            assert (false);
            return;
        }
        if ((bux2 = bux2.ayQ()).getGUID() == null) {
            bux2.setGUID(fpx2.dPP);
        }
        if (!fpx2.dPP.equals(bux2.getGUID())) {
            fpy2.iTz = 3;
            lfn.b(5, "SFMarkerManager", "handleMarkerModifyRequest: Inconsistent marker GUIDs: " + fpx2.dPP + " != " + bux2.getGUID());
            assert (false);
            return;
        }
        bux bux3 = this.dPV.get(bux2.getGUID());
        if (bux3 == null) {
            fpy2.iTz = 1;
            lfn.b(5, "SFMarkerManager", "handleMarkerModifyRequest: Marker " + bux2.getGUID() + " not found");
            return;
        }
        fpy2.iTz = this.a(fpx2.fFK, bux2, bux3);
    }

    protected int a(int n, bux bux2, bux bux3) {
        int n2 = bux3.a(bux2, n);
        if (n2 < 0) {
            return -n2;
        }
        if (n2 != 0) {
            this.b(bux3, n2);
            this.a(2, bux3, n2);
        }
        return 0;
    }

    protected void c(fpx fpx2, fpy fpy2) {
        if (fpx2.dPP == null) {
            fpy2.iTz = 3;
            lfn.b(5, "SFMarkerManager", "handleMarkerDeleteRequest: MargerGUID is null");
            assert (false);
            return;
        }
        bux bux2 = this.dPV.get(fpx2.dPP);
        if (bux2 == null) {
            fpy2.iTz = 1;
            lfn.b(5, "SFMarkerManager", "handleMarkerDeleteRequest: Could not find Marker with GUID " + fpx2.dPP);
            return;
        }
        if (bux2.ayT() > 0L) {
            this.b(bux2);
        }
        this.dPV.remove(bux2.getGUID());
        this.e(bux2);
        this.a(3, bux2, 0);
    }

    protected int a(bux bux2) {
        if (bux2.getGUID() == null) {
            bux2.setGUID(this.MessageDelegator.bzv());
        } else if (this.dPV.containsKey(bux2.getGUID())) {
            lfn.b(5, "SFMarkerManager", "addMarker: Marker " + bux2.getGUID() + " already exists");
            return 2;
        }
        if (bux2.ayR() == null) {
            lfn.b(5, "SFMarkerManager", "addMarker: MarkerType is null");
            assert (false);
            return 3;
        }
        if (bux2.az() <= 0) {
            lfn.b(5, "SFMarkerManager", "addMarker: ResourceType is invalid");
            assert (false);
            return 3;
        }
        this.dPV.put(bux2.getGUID(), bux2);
        if (bux2.ayT() > 0L) {
            this.c(bux2);
        }
        this.d(bux2);
        this.a(1, bux2, 0);
        return 0;
    }

    private void b(bux bux2) {
        long l2 = bux2.ayT();
        Object object = this.dPW.get(l2);
        if (object == null) {
            lfn.b(5, "SFMarkerManager", "removeTimerMarker: Marker " + bux2.getGUID() + " should be in expiry map, but isn't");
            assert (false);
            return;
        }
        if (object instanceof bux) {
            if (object != bux2) {
                lfn.b(5, "SFMarkerManager", "removeTimerMarker: Marker " + bux2.getGUID() + " isn't same instance as marker in expiry map");
                assert (false);
                return;
            }
            this.dPW.remove(l2);
        } else if (object instanceof Map) {
            Map map = (Map)object;
            if ((object = map.remove(bux2.getGUID())) == null) {
                lfn.b(5, "SFMarkerManager", "removeTimerMarker: Marker " + bux2.getGUID() + " should be in expiry map, but isn't");
                assert (false);
                return;
            }
            if (map.isEmpty()) {
                lfn.b(5, "SFMarkerManager", "removeTimerMarker: Map instance in expiry map is empty - shouldn't happen");
                assert (false);
                this.dPW.remove(l2);
            } else if (map.size() == 1) {
                Object v = map.values().iterator().next();
                this.dPW.put(l2, v);
            }
        } else {
            lfn.b(5, "SFMarkerManager", "removeTimerMarker: Incorrect type in expiry map: " + object.getClass().getSimpleName());
            assert (false);
        }
    }

    private void c(bux bux2) {
        long l2 = bux2.ayT();
        Object object = this.dPW.get(l2);
        if (object == null) {
            this.dPW.put(l2, bux2);
        } else if (object instanceof bux) {
            bux bux3 = (bux)object;
            Map<ldv, bux> map = lcn.emw();
            map.put(bux2.getGUID(), bux2);
            map.put(bux3.getGUID(), bux3);
            this.dPW.put(l2, map);
        } else {
            Map map = (Map)object;
            map.put(bux2.getGUID(), object);
        }
    }

    private void a(int n, bux bux2, int n2) {
        if (this.Sg.isEmpty()) {
            return;
        }
        if (n == 4) {
            return;
        }
        for (ldv ldv2 : this.Sg) {
            fpw fpw2 = (fpw)this.MessageDelegator.h(31235, this.getGUID(), ldv2);
            fpw2.iTt = n;
            fpw2.iTu = n2;
            fpw2.dPP = bux2.getGUID();
            fpw2.iTv = bux2;
            this.MessageDelegator.E(fpw2);
        }
    }

    private void S(long l2) {
        while (!this.dPW.isEmpty() && this.dPW.firstKey() <= l2) {
            Object object;
            Map.Entry<Long, Object> entry = this.dPW.pollFirstEntry();
            if (entry.getValue() instanceof bux) {
                object = (bux)entry.getValue();
                this.dPV.remove(((bux)object).getGUID());
                this.e((bux)object);
                this.a(4, (bux)object, 0);
                continue;
            }
            if (entry.getValue() instanceof Map) {
                object = (Map)entry.getValue();
                for (Object v : object.values()) {
                    bux bux2 = (bux)v;
                    this.dPV.remove(bux2.getGUID());
                    this.e(bux2);
                    this.a(4, bux2, 0);
                }
                continue;
            }
            lfn.b(5, "SFMarkerManager", "processExpiredMarkers: Incorrect type in expiry map: " + entry.getValue().getClass().getSimpleName());
            assert (false);
        }
    }

    protected void d(bux bux2) {
    }

    protected void b(bux bux2, int n) {
    }

    protected void e(bux bux2) {
    }
}

