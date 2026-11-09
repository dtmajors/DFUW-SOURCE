/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;

public class amv
extends btk
implements bto {
    private static final String TC = "SFAIDungeonGate";
    private static final double bBc = 3600.0;
    private final cku bBd;
    private final bsx bBe;
    private final ljq Position;
    private final double bBf;
    private final double bBg;
    private final String ael;
    private final int bBh;
    private final int bBi;
    private final int bBj;
    private final int bBk;
    private lid<Integer> bBl = new lid();
    private ldv bBm = null;
    private int bBn = 0;

    public amv(bsx bsx2, cku cku2) {
        this.bBd = cku2;
        this.bBe = bsx2;
        this.ObjectType = 157;
        this.Position = (ljq)this.bBe.getValue("Position");
        this.bBf = ((Float)this.bBe.getValue("AnimationLength")).floatValue();
        this.bBg = ((Float)this.bBe.getValue("CloseDelay")).floatValue();
        this.ael = this.bBe.getValue("Spawnpoint").toString().replace(".xml", "").toLowerCase();
        Object object = this.bBe.getValue("MonsterName");
        this.bBh = object != null ? lea.enW().getType(object.toString()) : -1;
        this.bBi = Integer.parseInt(this.bBe.getValue("MonsterNumber").toString());
        this.bBj = del.dr(this.bBe.getValue("SpecialEffectOpen").toString());
        this.bBk = del.dr(this.bBe.getValue("SpecialEffectClose").toString());
        assert (this.Position != null);
        assert (this.ael != null);
    }

    public void Hy() {
        feh feh2 = (feh)this.MessageDelegator.h(27910, this.GUID, lcr.hac);
        feh2.kD(this.ael);
        this.MessageDelegator.F(feh2);
    }

    private void a(fei fei2) {
        if (this.bBm != null) {
            // empty if block
        }
        this.bBm = fei2.Rk();
        fej fej2 = (fej)this.MessageDelegator.h(27912, this.GUID, this.bBm);
        this.MessageDelegator.F(fej2);
    }

    private void a(feg feg2) {
        int n = feg2.az();
        int n2 = feg2.getEventType();
        ldv ldv2 = feg2.aO();
        if (!ldv2.equals(this.bBm)) {
            lfn.b(5, TC, "handleGenericObjectSpawnPointEventMessage() FromSpawnPointGUID : " + ldv2 + " IS NOT THE SAME WITH SpawnPointGUID : " + this.bBm);
            assert (false);
            return;
        }
        if (this.bBh != -1 && !lea.enW().isDescendant(n, this.bBh)) {
            return;
        }
        this.bBl.a(this.MessageDelegator.arc().rgz + 3600.0, this.bBh);
        if (this.bBd.aIe()) {
            this.bBd.fi().i(12752, this.bBl.size());
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.bBl.isEmpty()) {
            List<Integer> list = this.bBl.eh(ldz2.rgz);
            if (list != null && !list.isEmpty()) {
                this.bBd.fi().i(12752, this.bBl.size());
            }
            if (this.bBd.aIe()) {
                if (this.bBl.size() >= this.bBi) {
                    this.bBd.aRk();
                    this.bBd.fi().i(12752, -1);
                    this.bBd.fi().a(12384, ldz2.rgz + this.bBf + this.bBg);
                    this.bBl.clear();
                }
                return;
            }
        }
        if (!this.bBd.aIe() && ldz2.rgz > this.bBd.aRj() + this.bBf + this.bBg) {
            this.bBd.aRl();
            this.bBd.fi().i(12752, 0);
            this.bBl.clear();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 27911: {
                this.a((fei)dxq2);
                break;
            }
            case 27913: {
                this.a((feg)dxq2);
            }
        }
    }

    public double Hz() {
        return this.bBf;
    }

    public int bh(boolean bl) {
        return bl ? this.bBj : this.bBk;
    }

    public int HA() {
        return (int)this.bBg;
    }

    public int HB() {
        return this.bBi;
    }

    public String HC() {
        return this.bBh != -1 ? lea.enW().getName(this.bBh) : null;
    }
}

