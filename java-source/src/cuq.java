/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class cuq
extends btk
implements bto {
    private static final boolean fxP = true;
    private static final float akO = 2000.0f;
    private static final double fxQ = 1.0;
    private static final ljq akL = new ljq(0.0, -1.0, 0.0);
    private static final int[] fxR = new int[]{cug.fkT, cug.fkS, cug.fkU};
    private static final int[] fxS = new int[]{200, 100, 50};
    private Map<Integer, Queue<ggc>> fxT = null;
    private Map<Integer, Queue<ljq>> fxU = null;
    private int[] fxV = null;
    private int fxW = -1;
    private double fxX = 0.0;
    private boolean fxY = false;
    private Map<Integer, List<lgs>> fxZ = null;
    private List<lgs> fya = null;

    @Override
    public void initialize() {
        super.initialize();
        this.fxX = this.MessageDelegator.arc().rgz;
        this.Active = true;
        this.fxT = lcn.emw();
        this.fxU = lcn.emw();
        this.fxV = new int[fxR.length];
        this.fxZ = lcn.emw();
        this.fya = lcn.emA();
        mhi mhi2 = new mhi();
        mhi2.BQ("xml-files/quadtrees/treasure_mapping.sfqt");
        for (int i = 0; i < fxR.length; ++i) {
            this.fxT.put(fxR[i], new LinkedList());
            this.fxU.put(fxR[i], new LinkedList());
            this.fxZ.put(fxR[i], mhi2.aej(fxR[i]));
        }
        mhi2.oG();
    }

    @Override
    public void doTick(ldz ldz2) {
        int n;
        if (this.MessageDelegator.bzx().bzt().dVA() != kdw.a.phY) {
            return;
        }
        if (this.fya.isEmpty()) {
            return;
        }
        for (n = 0; n < fxR.length; ++n) {
            Queue<ljq> queue = this.fxU.get(fxR[n]);
            Queue<ggc> queue2 = this.fxT.get(fxR[n]);
            if (queue.isEmpty() || queue2.isEmpty()) continue;
            while (!queue.isEmpty() && !queue2.isEmpty()) {
                ljq ljq2 = queue.poll();
                ggc ggc2 = queue2.poll();
                if (ljq2 == null || ggc2 == null) break;
                fh fh2 = new fh();
                fh2.L(ljq2);
                fh2.setType(10976);
                this.a(ggc2.aO(), fh2);
                int n2 = n;
                this.fxV[n2] = this.fxV[n2] - 1;
            }
            return;
        }
        if (!this.fxY && this.fxX + 1.0 < ldz2.rgz) {
            int n3 = n = this.fxW < 0 || this.fxW >= fxR.length ? 0 : this.fxW;
            while (n < fxR.length) {
                if (this.fxV[n] < fxS[n]) {
                    this.fxW = n;
                    this.fxY = true;
                    this.fxX = ldz2.rgz;
                    this.bz(this.wR(fxR[n]));
                    return;
                }
                ++this.fxW;
                ++n;
            }
        }
    }

    private ljq wR(int n) {
        List<lgs> list = this.fxZ.get(n);
        if (list == null || list.isEmpty()) {
            list = this.fxZ.get(fxR[0]);
        }
        lgs lgs2 = null;
        if (list.isEmpty()) {
            lgs2 = this.fya.get((int)((float)this.fya.size() * lgp.erA().nextFloat()));
            lfn.b(5, "SFTreasureMapManager", "getRandomPosition() : No Treasure Map Areas Exist, Defaulting to Loaded Zone Areas!!!");
        } else {
            lgs2 = list.get((int)((float)list.size() * lgp.erA().nextFloat()));
        }
        float f2 = lew.d(lgs2.cf, lgs2.erB(), lgp.erA().nextFloat());
        float f3 = lew.d(lgs2.cg, lgs2.cjG(), lgp.erA().nextFloat());
        return new ljq(f2, 1000.0f, f3);
    }

    private void a(ldv ldv2, ej ej2) {
        eap eap2 = (eap)this.MessageDelegator.h(10757, this.GUID, ldv2);
        eap2.bhp = ej2;
        this.MessageDelegator.F(eap2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3846: {
                this.a((fpc)dxq2);
                break;
            }
            case 6165: {
                this.a((ggc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fpc fpc2) {
        int n;
        for (n = 0; n < fpc2.iSu.length; ++n) {
            this.fya.add(new lgs((int)fpc2.iSu[n], (int)fpc2.iSy[n], (int)(fpc2.iSv[n] - fpc2.iSu[n]), (int)(fpc2.iSz[n] - fpc2.iSy[n])));
        }
        for (n = 0; n < fxR.length; ++n) {
            List<lgs> list = this.fxZ.get(fxR[n]);
            Iterator<lgs> iterator = list.iterator();
            int n2 = list.size();
            while (iterator.hasNext()) {
                lgs lgs2 = iterator.next();
                boolean bl = false;
                for (lgs lgs3 : this.fya) {
                    if (!lgs2.x(lgs3)) continue;
                    bl = true;
                    break;
                }
                if (bl) continue;
                iterator.remove();
            }
        }
    }

    private void a(ggc ggc2) {
        int n = -1;
        for (int i = 0; i < fxR.length; ++i) {
            if (fxR[i] != ggc2.az()) continue;
            n = i;
            break;
        }
        if (n < 0) {
            n = 0;
        }
        this.fxT.get(fxR[n]).add(ggc2);
    }

    private void bz(ljq ljq2) {
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(1);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(akL);
        kji2.setLength(2000.0f);
        this.MessageDelegator.a(kji2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        assert (this.fxY);
        this.fxY = false;
        if (kuj2.bqd == null || kuj2.bqd.length <= 0) {
            return;
        }
        if (kuj2.bqd.length != 1) {
            lfn.b(5, "SFTreasureMapManager", "handleLineContainmentResponse(): Multiple hits, wtf?");
            return;
        }
        if (kuj2.bqd[0] == cug.fkr && kuj2.qdQ != null && kuj2.qdQ.length > 0 && (double)Math.abs(kuj2.qdQ[0]) < 0.7853981633974483) {
            this.fxU.get(fxR[this.fxW]).add(kuj2.ilP[0]);
            int n = this.fxW++;
            this.fxV[n] = this.fxV[n] + 1;
        }
    }
}

