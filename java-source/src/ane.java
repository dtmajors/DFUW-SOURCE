/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 *  lcr
 */
import java.util.List;

public abstract class ane
extends btk {
    protected ldv bCi;
    protected ldv bCj;
    protected ldv bCk;
    protected ldv bCl;
    protected ldv bCm;
    protected final float bCn;
    protected final ljq ath;
    protected final ase bCo;
    protected final int ResourceType;
    protected boolean bCp = false;
    protected final asq bCq;
    protected boolean bCr = true;
    protected String ael = "";

    public ane(String string, String string2, dxr dxr2, ljq ljq2, float f) {
        this.ObjectType = 80;
        this.ResourceType = lea.enW().getType(string);
        this.bCo = lea.eoz().get(this.ResourceType);
        this.bCq = lea.eoA().get(this.ResourceType);
        this.MessageDelegator = dxr2;
        this.GUID = this.MessageDelegator.bzv();
        this.ath = ljq2.esF();
        this.bCn = f;
        this.ael = string2;
        this.MessageDelegator.a(this);
    }

    public ane(String string, dxr dxr2, ljq ljq2) {
        this(string, "", dxr2, ljq2, (float)arw.e(-Math.PI, Math.PI));
    }

    public void c(int n, Object object) {
        dys dys2 = (dys)this.MessageDelegator.h(13329, this.GUID, this.bCi);
        dys2.ija = 8;
        dys2.bnM = n;
        dys2.ijd = ep.aL((int)n);
        dys2.ijc = String.valueOf(object);
        this.MessageDelegator.F(dys2);
    }

    @Override
    public void cleanUp() {
        this.bCi = null;
        this.bCj = null;
        this.bCk = null;
        this.bCl = null;
        this.bCm = null;
    }

    public void Ic() {
        this.bCr = false;
        if (this.bCp) {
            return;
        }
        grw grw2 = (grw)this.MessageDelegator.h(11030, this.GUID, this.bCi);
        this.MessageDelegator.F(grw2);
    }

    public int az() {
        return this.ResourceType;
    }

    @Override
    public void initialize() {
        super.initialize();
        gqg gqg2 = (gqg)this.MessageDelegator.h(11015, this.GUID, lcr.qzq);
        gqg2.jpg = false;
        gqg2.Xe = this.GUID;
        gqg2.bc = "Monster";
        gqg2.Za = this.ResourceType;
        gqg2.jjc = this.ath;
        gqg2.jph = new lgl(0.0f, this.bCn, 0.0f);
        gqg2.aeh = 1.0f;
        gqg2.ael = this.ael;
        gqg2.ijb = 0.0f;
        if (this.bCq != null && (double)this.bCq.bVK > 0.0 && (double)this.bCq.bVJ > 0.0) {
            gqg2.aeW = this.bCq.bVK - (float)Math.random();
            gqg2.aeV = this.bCq.bVJ * (1.0f + 0.5f * (float)Math.random());
            gqg2.aeU = true;
        }
        this.MessageDelegator.F(gqg2);
    }

    public boolean isTerminated() {
        return this.bCp;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13317: {
                this.a((dyd)dxq2);
                break;
            }
            case 13315: {
                this.Id();
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void hg(int n) {
        if (this.bCj == null) {
            return;
        }
        dya dya2 = (dya)this.MessageDelegator.h(13332, this.GUID, this.bCj);
        dya2.iiz = true;
        dya2.aWe = n;
        this.MessageDelegator.F(dya2);
    }

    public void hh(int n) {
        if (this.bCj == null) {
            return;
        }
        dya dya2 = (dya)this.MessageDelegator.h(13332, this.GUID, this.bCj);
        dya2.iiz = false;
        dya2.aWe = n;
        this.MessageDelegator.F(dya2);
    }

    protected void a(dyc dyc2) {
    }

    protected void a(dyd dyd2) {
        this.bCi = dyd2.Ts;
        this.bCl = dyd2.Ui;
        this.bCj = dyd2.SA;
        this.bCk = dyd2.dAu;
        this.bCm = dyd2.aTc;
    }

    protected void Id() {
        this.bCp = true;
        this.selfDestruct();
    }

    public void a(asf.a a2) {
        int n = asf.a(this.ResourceType, a2);
        if (n < 0) {
            return;
        }
        long l = Long.valueOf(a2.ordinal()) << 32;
        List<Integer> list = lea.epk().get(l |= (long)n);
        if (list.size() > 0) {
            Integer n2 = list.get(arw.hK(list.size()));
            this.c(11008, n2);
        } else {
            arw.ct.error("*** playSoundForState soundFilesIds.size zero!!");
        }
    }
}

