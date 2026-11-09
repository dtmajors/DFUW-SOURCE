/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.List;
import java.util.Map;
import java.util.Random;

public class afd
extends aff {
    private static final String TC = "SFSpecialEventStepBossKillRunnable";
    private final afa bgk;
    private Map<ldv, eac> abQ = lcn.emw();
    private Map<ldv, Integer> bgl = lcn.emw();
    private a bgm = null;

    public afd(afc afc2, afa afa2) {
        super(afc2, afa2.getIndex(), afa2.getLimit(), afa2.zA());
        this.bgk = afa2;
    }

    @Override
    public void g(int n, String string) {
        super.g(n, string);
        if (string != null && !string.isEmpty()) {
            this.bgm = new a(this);
            this.bgm.Name = string;
        }
    }

    @Override
    public void start() {
        super.start();
        if (this.bgm == null) {
            this.bgm = new a(this);
            this.bgm.Name = this.bgk.zD().get(new Random().nextInt(this.bgk.zD().size()));
        }
        feh feh2 = (feh)this.MessageDelegator.h(27910, this.getGUID(), lcr.hac);
        feh2.kD(this.bgm.Name);
        this.MessageDelegator.F(feh2);
    }

    public void a(fei fei2) {
        assert (!this.zZ());
        assert (this.bgm != null);
        assert (this.bgm.Name != null);
        dlt dlt2 = lea.epJ().get(this.bgk.zC());
        assert (dlt2 != null);
        String string = fei2.Jg();
        if (!this.bgm.Name.equalsIgnoreCase(string)) {
            assert (false) : "Special Event : " + this.zS() + " requested the guid from spawnpoint with the name : " + a.a(this.bgm) + " and got it from spawnpoint with name : " + string;
            return;
        }
        boolean bl = this.bgm.bgo;
        this.bgm.bgo = true;
        this.bgm.GUID = fei2.Rk();
        this.bgm.Position = fei2.av();
        this.bgm.Radius = fei2.bOG();
        this.bgm.bgq = dlt2.bQV;
        fek fek2 = (fek)this.MessageDelegator.h(27914, this.getGUID(), this.bgm.GUID);
        fek2.kE(this.bgk.zC());
        fek2.ja(this.bgk.zG());
        fek2.iY(this.bgk.zE());
        fek2.iZ(this.bgk.zF());
        this.MessageDelegator.F(fek2);
        if (!bl) {
            this.g(this.bgk.zI().bD(this.bgm.bgq, this.bgm.Position));
        }
        this.g(this.bgk.zH().bD(this.bgm.bgq, this.bgm.Position));
        if (!bl) {
            Map<Integer, Integer> map = this.zj();
            for (Integer n : map.keySet()) {
                ldv ldv2 = lcr.abW((int)n);
                this.a(this.bgm.Position, this.bgm.bgq, cug.fkM, ldv2);
            }
        }
    }

    private void ev(int n) {
        assert (!this.zZ());
        assert (this.bgm != null);
        assert (this.bgm.Name != null);
        assert (this.bgm.Position != null);
        assert (this.bgm.Radius != 0.0f);
        assert (this.bgm.bgo);
        if (!this.bgm.bgp) {
            dlt dlt2 = lea.epJ().get(this.bgk.zC());
            assert (dlt2 != null);
            this.bgm.bgp = true;
            this.bgm.bgr = n;
        }
    }

    public void a(fel fel2) {
        int n = fel2.bHc();
        switch (n) {
            case 1: {
                this.ev(fel2.bOJ());
                break;
            }
            case 2: {
                this.trigger(fel2.bOJ());
            }
        }
    }

    private void trigger(int n) {
        assert (this.bgm != null);
        assert (this.bgm.bgo);
        assert (this.bgm.GUID != null);
        assert (this.bgm.bgq != null);
        assert (this.bgm.Position != null);
        assert (this.bgm.Radius > 0.0f);
        if (n == this.bgm.bgr) {
            this.ey(1);
        }
        if (this.zZ()) {
            this.ew(n);
            this.Aa();
            this.zO();
            this.MessageDelegator.hd(this.getGUID());
        }
        this.ez(2);
    }

    private void ew(int n) {
        assert (this.zZ());
        assert (this.bgm != null);
        assert (this.bgm.Name != null);
        assert (this.bgm.Position != null);
        assert (this.bgm.Radius != 0.0f);
        assert (this.bgm.bgo);
        assert (this.bgm.bgp);
        Map<Integer, Integer> map = this.zj();
        for (Integer n2 : map.keySet()) {
            ldv ldv2 = lcr.abW((int)n2);
            Integer n3 = this.bgl.get(ldv2);
            if (n3 == null) {
                lfn.b(5, TC, "handleBossDied() There is no annotation to remove for player : " + ldv2);
                assert (false);
                continue;
            }
            this.j(n3, ldv2);
        }
    }

    @Override
    public void zU() {
        if (this.Ac() == null) {
            return;
        }
        List<afn> list = this.Ac().Al();
        int[] nArray = new int[list.size()];
        int[] nArray2 = new int[list.size()];
        int n = 0;
        for (afn object : list) {
            int[] nArray3;
            nArray[n] = object.az();
            nArray2[n] = object.vf();
            ++n;
            if (object.Aj() == null) continue;
            if (object.Ah() != -1) {
                int[] nArray4 = new int[2];
                nArray4[0] = object.Ah();
                nArray3 = nArray4;
                nArray4[1] = object.Ai();
            } else {
                nArray3 = null;
            }
            int[] nArray5 = nArray3;
            this.g(object.Aj().bD(new Object[]{nArray5}));
        }
        afp afp2 = this.Ac().Ak();
        switch (afp2) {
            case bhb: {
                gll gll2 = (gll)this.MessageDelegator.h(35329, this.getGUID(), lcr.qAY);
                gll2.jle = nArray;
                gll2.jlf = nArray2;
                gll2.Radius = this.bgm.Radius;
                gll2.fyE = this.bgm.Position;
                gll2.jld = 300.0;
                this.MessageDelegator.E(gll2);
            }
        }
    }

    @Override
    public void zO() {
        super.zO();
        this.bgm = null;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 27911: {
                this.a((fei)dxq2);
                break;
            }
            case 27915: {
                this.a((fel)dxq2);
                break;
            }
            case 22788: {
                this.a((eaf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
                assert (false) : "Message : " + dxq2.bEC();
                break;
            }
        }
    }

    public void a(eaf eaf2) {
        ldv ldv2 = eaf2.aO();
        eac eac2 = this.abQ.remove(ldv2);
        if (eac2 == null) {
            assert (eaf2.ex == 3);
            lfn.b(5, TC, "handleAnnotationResponseMessage() There is no annotation request to player : " + ldv2);
            return;
        }
        if (eaf2.ex == 3) {
            return;
        }
        if (eaf2.ex == 5) {
            lfn.b(5, TC, "handleAnnotationResponseMessage() Annotation removal for player : " + ldv2 + " failed. Responsetype : " + eaf2.ex);
            assert (false);
            return;
        }
        if (eaf2.ex != 2) {
            lfn.b(5, TC, "handleAnnotationResponseMessage() Annotation addition for player : " + ldv2 + " failed. Responsetype : " + eaf2.ex);
            assert (false);
            return;
        }
        if (eaf2.Zn == null || eaf2.Zn.length != 1) {
            lfn.b(5, TC, "handleAnnotationResponseMessage() Annotations fucked up");
            assert (false);
            return;
        }
        if (eac2 instanceof eaa) {
            atf atf2 = eaf2.Zn[0];
            if (this.zZ() || this.bgm == null || this.bgm.Name == null || !this.bgm.bgo) {
                this.j(atf2.ID, ldv2);
                return;
            }
            Map<Integer, Integer> map = this.zj();
            if (map.isEmpty()) {
                this.j(atf2.ID, ldv2);
                return;
            }
            boolean bl = false;
            for (int n : map.keySet()) {
                ldv ldv3 = lcr.abW((int)n);
                if (!ldv2.equals(ldv3)) continue;
                bl = true;
                break;
            }
            if (!bl) {
                this.j(atf2.ID, ldv2);
                return;
            }
            this.bgl.put(ldv2, atf2.ID);
        }
    }

    private void a(ljq ljq2, String string, int n, ldv ldv2) {
        eaa eaa2 = (eaa)this.MessageDelegator.h(22785, this.getGUID(), ldv2);
        eaa2.Position = ljq2;
        eaa2.aFo = string;
        eaa2.aXn = this.bgk.zm();
        eaa2.ResourceType = n;
        eaa2.aFp = false;
        this.MessageDelegator.F(eaa2);
        this.abQ.put(ldv2, eaa2);
    }

    private void j(int n, ldv ldv2) {
        eae eae2 = (eae)this.MessageDelegator.h(22786, this.getGUID(), ldv2);
        eae2.iks = n;
        this.MessageDelegator.F(eae2);
        this.abQ.put(ldv2, eae2);
    }

    @Override
    public String zV() {
        return this.bgm != null ? this.bgm.Name : "";
    }

    @Override
    public void o(ldv ldv2, int n) {
        super.o(ldv2, n);
        if (this.bgm != null) {
            assert (this.bgm.Name != null);
            if (this.bgm.bgo) {
                if (this.abQ.containsKey(ldv2) || this.bgl.containsKey(ldv2)) {
                    return;
                }
                this.a(this.bgm.Position, this.bgm.bgq, cug.fkM, ldv2);
            }
        }
    }

    @Override
    public void cB(ldv ldv2) {
        Integer n = this.bgl.remove(ldv2);
        if (n != null) {
            this.j(n, ldv2);
        }
    }

    public final loz cu(String string) {
        return this.bgk.zH().bD(this.bgm.bgq, this.bgm.Position);
    }

    public final loz cv(String string) {
        return this.bgk.zI().bD(this.bgm.bgq);
    }

    public final loz cw(String string) {
        return this.bgk.zJ().bD(this.bgm.bgq, this.bgm.Position);
    }
}

