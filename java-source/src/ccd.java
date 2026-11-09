/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.Map;
import java.util.Set;

public class ccd
extends ccb {
    private cbq elf = null;
    private bfu elg = new bfu(this);
    protected btn elh = null;
    protected String azF = null;
    protected int[] eli = null;
    private static final float dpr = 10.0f;
    private ldv dpw = null;
    private bfl dpJ = null;

    public ccd(boolean bl) {
        super(bl);
    }

    public cbq aIL() {
        return this.elf;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.elg != null) {
            this.elg.doTick(ldz2);
        }
    }

    public void a(cbq cbq2) {
        this.elf = cbq2;
    }

    public final bfq aIv() {
        return this.elg;
    }

    public boolean oP(int n) {
        if (this.eli == null) {
            return true;
        }
        if (this.eli.length == 0) {
            return true;
        }
        for (int n2 : this.eli) {
            if (n2 != n) continue;
            return true;
        }
        return false;
    }

    public Set<ldv> aIM() {
        return this.ekW.keySet();
    }

    public Map<ldv, ldv> aIN() {
        return this.ekW;
    }

    public void receiveMessage(dxq dxq2) {
        if (this.elh == null || !this.elh.a(dxq2, (btk)((Object)this))) {
            switch (dxq2.bEz()) {
                case 12812: {
                    this.a((eeg)dxq2);
                    break;
                }
                case 17415: {
                    this.a((eav)dxq2);
                    break;
                }
                case 17417: {
                    this.a((eas)dxq2);
                    break;
                }
                default: {
                    super.receiveMessage(dxq2);
                }
            }
        }
    }

    public btn aIO() {
        return this.elh;
    }

    public void a(btn btn2) {
        this.elh = btn2;
    }

    private void a(eav eav2) {
        assert (false) : "SHOULD NOT HAPPEN HERE!";
        eaw eaw2 = (eaw)this.MessageDelegator.h(17416, this.getGUID(), eav2.aO());
        this.MessageDelegator.b(eav2, eaw2);
        eaw2.jR(false);
        this.MessageDelegator.F(eaw2);
    }

    private void a(eas eas2) {
        if (this instanceof ccj) assert (false) : "SHOULD NOT HAPPEN HERE!";
        if (!this.kq(eas2.Ri)) {
            return;
        }
        this.kr(eas2.Ri);
    }

    public String rz() {
        return this.azF;
    }

    public void bL(String string) {
        this.azF = string;
    }

    public int[] aIP() {
        return this.eli;
    }

    public void y(int[] nArray) {
        this.eli = nArray;
    }

    public void a(eat eat2, ccf ccf2, ldv ldv2) {
        eau eau2 = (eau)this.MessageDelegator.h(17410, ldv2, eat2.aO());
        this.MessageDelegator.b(eat2, eau2);
        eau2.ikL = ccf2.ordinal();
        eau2.bYY = this.aIG().esF();
        float f2 = 4.0f + (float)Math.random() * 10.0f;
        float f3 = 4.0f + (float)Math.random() * 10.0f;
        if (Math.random() > 0.5) {
            f2 *= -1.0f;
        }
        if (Math.random() > 0.5) {
            f3 *= -1.0f;
        }
        eau2.bYY.x += f2;
        eau2.bYY.rlV += f3;
        eau2.bYY.y += 0.5f;
        eau2.ela = this.aIH();
        eau2.azF = this.azF;
        eau2.azE = this.ry();
        this.MessageDelegator.F(eau2);
    }

    public void a(eax eax2, ccf ccf2, ldv ldv2) {
        eay eay2 = (eay)this.MessageDelegator.h(17425, ldv2, eax2.aO());
        this.MessageDelegator.b(eax2, eay2);
        eay2.ikL = ccf2.ordinal();
        eay2.bYY = this.aIC();
        eay2.ela = this.aIH();
        eay2.azF = this.azF;
        eay2.azE = this.ry();
        this.MessageDelegator.F(eay2);
    }

    public void Hy() {
        this.aIw();
    }

    public void a(ccf ccf2) {
        assert (false);
    }

    public ccf b(ldv ldv2, ccf ccf2) {
        assert (false);
        return ccf.eln;
    }

    public void f(et et2) {
        if (et2.getType() == 352) {
            bfl bfl2 = (bfl)this.elg.aof();
            if (bfl2 == null) {
                lfn.b(5, "SFBindStoneServer", "handleFloatAttributeBelowMin() LastEventOccured is null.");
                lfn.b(5, "SFBindStoneServer", "handleFloatAttributeBelowMin() Either a bug or someone changed the health through a chatcommand.");
                return;
            }
            assert (bfl2.aYF != null);
            if (this.dpw != null) {
                return;
            }
            if (bfl2.aYF == null) {
                this.aqx();
                et2.o(10.0f);
                return;
            }
            this.dpJ = bfl2;
            if (lea.enW().isDescendant(bfl2.bsG, cug.fgG)) {
                this.aqx();
                et2.o(10.0f);
                return;
            }
            this.dpw = lcr.tQ((ldv)bfl2.aYF);
            eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), this.dpw);
            this.MessageDelegator.F(eef2);
            return;
        }
        super.f(et2);
    }

    private void a(eeg eeg2) {
        if (eeg2.kv() && !iw.nE()) {
            this.b(this.dpw, mdc.uEN.bD(new Object[0]));
            this.dpw = null;
            this.dpJ = null;
            et et2 = (et)this.fi().ae(352);
            this.aqx();
            et2.o(10.0f);
            return;
        }
        this.elg.a(5, this.dpJ);
        if (this.elf != null) {
            this.elf.b(this);
        }
        this.dpw = null;
    }

    public void b(ldv ldv2, loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void aqx() {
        ej ej2 = this.fi().ae(352);
        if (ej2 == null) {
            lfn.b(5, "SFBindStoneServer", "enableAttributeNotification() No Health Attribute!");
            return;
        }
        if (!(ej2 instanceof ex)) {
            lfn.b(5, "SFBindStoneServer", "enableAttributeNotification() Health NOT limited float attribute");
            return;
        }
        ex ex2 = (ex)ej2;
        ex2.y(true);
    }

    public void d(et et2, float f2) {
        super.d(et2, f2);
        if (this.elf != null) {
            this.elf.a(this, et2);
        }
    }

    public void a(bgc bgc2) {
        this.elg.a(bgc2);
    }

    public void b(bgc bgc2) {
        this.elg.b(bgc2);
    }
}

