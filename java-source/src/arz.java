/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class arz
extends btk
implements bto {
    private static final double bST = 45.0;
    private static final double bSU = 60.0;
    private static final arz bSV = new arz();
    private static int bSW;
    private final Map<Integer, ldv> bSX = lcn.emw();
    private final lid<asx> PV = new lid();

    public static arz SH() {
        return bSV;
    }

    private arz() {
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.PV.clear();
        this.bSX.clear();
    }

    public int c(int n, ljq ljq2, lgl lgl2) {
        if (ljq2 == null) {
            return -1;
        }
        if (lgl2 == null) {
            return -1;
        }
        ldv ldv2 = lcr.ak((ldv)lcr.qBI, (int)lcr.Wu.ib());
        fem fem2 = (fem)this.MessageDelegator.h(25345, this.GUID, ldv2);
        fem2.sk(++bSW);
        fem2.ResourceType = n;
        fem2.ilU = null;
        fem2.ikP = true;
        fem2.Position = ljq2.esF();
        fem2.Rotation = new lgl(lgl2);
        fem2.iKA = 60.0;
        this.MessageDelegator.F(fem2);
        this.bSX.put(bSW, null);
        return bSW;
    }

    public void a(int n, int n2, ljq ljq2, lgl lgl2) {
        if (ljq2 == null) {
            return;
        }
        if (lgl2 == null) {
            return;
        }
        if (this.bSX.containsKey(n)) {
            return;
        }
        ldv ldv2 = lcr.ak((ldv)lcr.qBI, (int)lcr.Wu.ib());
        fem fem2 = (fem)this.MessageDelegator.h(25345, this.GUID, ldv2);
        fem2.sk(n);
        fem2.ResourceType = n2;
        fem2.ilU = null;
        fem2.ikP = true;
        fem2.Position = ljq2.esF();
        fem2.Rotation = new lgl(lgl2);
        fem2.iKA = 60.0;
        this.MessageDelegator.F(fem2);
        this.bSX.put(n, null);
    }

    @Override
    public void doTick(ldz ldz2) {
        this.ae(ldz2.rgz);
    }

    public ldv hM(int n) {
        return this.bSX.get(n);
    }

    public boolean hN(int n) {
        return this.bSX.get(n) != null;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.PV.a(45.0, asy.a(asx.a.bXX, false));
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 25346: {
                this.b((fen)dxq2);
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

    public void SI() {
        for (ldv ldv2 : this.bSX.values()) {
            this.dj(ldv2);
        }
        this.bSX.clear();
    }

    public void hO(int n) {
        this.dj(this.bSX.remove(n));
    }

    private void ae(double d2) {
        List<asx> list = this.PV.eh(d2);
        if (list == null) {
            return;
        }
        for (asx asx2 : list) {
            switch (asx2.UZ()) {
                case bXX: {
                    this.af(d2);
                }
            }
        }
    }

    private void a(fbf fbf2) {
        bfn bfn2 = fbf2.iIb;
        if (bfn2 == null) {
            return;
        }
        int n = bfn2.Type;
        switch (n) {
            case 5: {
                Iterator<Map.Entry<Integer, ldv>> iterator = this.bSX.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Integer, ldv> entry = iterator.next();
                    if (!entry.getValue().equals(bfn2.akX)) continue;
                    this.dj(entry.getValue());
                    iterator.remove();
                    return;
                }
                break;
            }
        }
    }

    private void b(fen fen2) {
        this.bSX.put(fen2.aVk(), fen2.iKB);
        fbb fbb2 = (fbb)this.MessageDelegator.h(12545, this.GUID, fen2.iKB);
        fbb2.iHR = this.GUID;
        fbb2.dhI = new int[]{5};
        this.MessageDelegator.F(fbb2);
    }

    private void dj(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        ldv ldv3 = lcr.ak((ldv)lcr.qBI, (int)lcr.Wu.ib());
        feq feq2 = (feq)this.MessageDelegator.h(25347, this.GUID, ldv3);
        feq2.iFu = false;
        feq2.iKB = ldv2;
        this.MessageDelegator.F(feq2);
    }

    private void af(double d2) {
        this.PV.a(d2 + 45.0, asy.a(asx.a.bXX, false));
        ldv ldv2 = lcr.ak((ldv)lcr.qBI, (int)lcr.Wu.ib());
        for (ldv ldv3 : this.bSX.values()) {
            if (ldv3 == null) continue;
            fer fer2 = (fer)this.MessageDelegator.h(25348, this.GUID, ldv2);
            fer2.iKD = 60.0;
            fer2.iKB = ldv3;
            this.MessageDelegator.F(fer2);
        }
    }
}

