/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class ars
extends btk
implements bto {
    private static final double bRf = 30.0;
    private Map<Integer, a> bRg = lcn.emw();
    private ArrayList<coa> bRh = lcn.emv();
    private static final ars bRi = new ars();
    private boolean[] bRj = new boolean[5];
    private int bRk = 1;

    public static ars Sl() {
        return bRi;
    }

    private ars() {
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.bRg.clear();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 33026: {
                this.a((gvx)dxq2);
                break;
            }
            case 12548: {
                this.a((fbf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fbf fbf2) {
        bfn bfn2 = fbf2.iIb;
        if (bfn2 == null) {
            return;
        }
        if (bfn2.Type == 5) {
            Iterator<Map.Entry<Integer, a>> iterator = this.bRg.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, a> entry = iterator.next();
                a a2 = entry.getValue();
                if (a2.bRl == null || !a2.bRl.equals(bfn2.akX)) continue;
                if (a2.bRo != -1) {
                    this.bRj[a2.bRo] = false;
                }
                iterator.remove();
                return;
            }
        }
    }

    private void a(gvx gvx2) {
        this.bRg.get((Object)Integer.valueOf((int)gvx2.aVk())).bRl = gvx2.bYl();
        fbb fbb2 = (fbb)this.MessageDelegator.h(12545, this.GUID, gvx2.bYl());
        fbb2.iHR = this.GUID;
        fbb2.dhI = new int[]{5};
        this.MessageDelegator.F(fbb2);
    }

    public int a(ljq ljq2, lgl lgl2, ldv ldv2, int n) {
        coc[] cocArray = new coc[3];
        cocArray[0] = new coc();
        cocArray[0].bA(2.0);
        cocArray[0].fJ(bfk.fs("Sprint Penalty"));
        cocArray[0].N(100.0f);
        cocArray[1] = new coc();
        cocArray[1].bA(2.0);
        cocArray[1].fJ(bfk.fs("Unholy Damage"));
        cocArray[1].N(80.0f);
        cocArray[2] = new coc();
        cocArray[2].bA(2.0);
        cocArray[2].fJ(bfk.fs("Run Penalty"));
        cocArray[2].N(1.0f);
        return this.a(cug.fho, ljq2, lgl2, 600.0, ldv2, cocArray, n);
    }

    public int a(int n, ljq ljq2, lgl lgl2, double d2, ldv ldv2, coc[] cocArray, int n2) {
        ldv ldv3 = lcr.ak((ldv)lcr.qBJ, (int)lcr.Wu.ib());
        gvw gvw2 = (gvw)this.MessageDelegator.h(33025, this.GUID, ldv3);
        gvw2.sk(++this.bRk);
        gvw2.ResourceType = n;
        gvw2.ilU = null;
        gvw2.ikP = true;
        gvw2.Position = ljq2.esF();
        gvw2.Rotation = new lgl(lgl2);
        gvw2.iKA = d2 == 0.0 ? 30.0 : d2;
        gvw2.jsD = cocArray;
        gvw2.bRu = 2.0f;
        gvw2.jsC = 12;
        this.MessageDelegator.F(gvw2);
        a a2 = new a(this, ldv2);
        a2.bRn = ljq2.esF();
        a2.bRm = gvw2.jsC;
        a2.bRo = n2;
        this.bRg.put(this.bRk, a2);
        this.bRj[n2] = true;
        return this.bRk;
    }

    public void dg(ldv ldv2) {
        ldv ldv3 = lcr.ak((ldv)lcr.qBJ, (int)lcr.Wu.ib());
        gwa gwa2 = (gwa)this.MessageDelegator.h(33027, this.GUID, ldv3);
        gwa2.bRl = ldv2;
        this.MessageDelegator.F(gwa2);
    }

    public void Sm() {
        for (a a2 : this.bRg.values()) {
            if (a2.bRl == null) continue;
            this.dg(a2.bRl);
        }
        this.bRg.clear();
    }

    public void dh(ldv ldv2) {
        Iterator<Map.Entry<Integer, a>> iterator = this.bRg.entrySet().iterator();
        while (iterator.hasNext()) {
            a a2 = iterator.next().getValue();
            if (!a2.aCE.equals(ldv2) || a2.bRl == null) continue;
            this.dg(a2.bRl);
            iterator.remove();
        }
    }

    public int di(ldv ldv2) {
        int n = 0;
        for (a a2 : this.bRg.values()) {
            if (!a2.aCE.equals(ldv2)) continue;
            ++n;
        }
        return n;
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    public boolean a(ldv ldv2, ljq ljq2, float f) {
        for (a a2 : this.bRg.values()) {
            if (a2.bRl == null || !a2.bRl.equals(ldv2)) continue;
            float f2 = a2.bRn.eA(ljq2);
            return f2 >= f * f;
        }
        return true;
    }

    public int Sn() {
        ArrayList<Integer> arrayList = lcn.emv();
        for (int i = 0; i < this.bRj.length; ++i) {
            if (this.bRj[i]) continue;
            arrayList.add(i);
        }
        if (arrayList.size() > 0) {
            return (Integer)arrayList.get(arw.hK(arrayList.size()));
        }
        return -1;
    }
}

