/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dmo
 *  lcr
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class aew
extends btk
implements bto {
    private static final String TC = "SFSpecialEventGlobalManager";
    private static final double auT = 1.0;
    private final dmo US;
    private Map<String, aey> bfy = aev.zh();
    private Map<String, aex> bfD = aev.zi();
    private Map<String, afc> bfE = lcn.emw();
    private Map<String, afc> bfF = lcn.emw();
    private lid<afc> bfG = new lid();
    private boolean ava = false;
    private double abo = 0.0;

    public aew(dmo dmo2) {
        assert (aev.isEnabled());
        this.US = dmo2;
    }

    @Override
    public void initialize() {
        super.initialize();
        for (aex aex2 : this.bfD.values()) {
            this.bfE.put(aex2.getName(), new afc(aex2, this));
        }
    }

    public final void E(List<pe> list) {
        if (list != null && !list.isEmpty()) {
            for (pe pe2 : list) {
                aex aex2 = this.bfD.get(pe2.Name);
                if (aex2 == null) {
                    lfn.b(5, TC, "restoreFromPersistence() Event Name : " + pe2.Name + " has been removed from the system.");
                    assert (false);
                    continue;
                }
                if (!aex2.isPersistent()) {
                    lfn.b(5, TC, "restoreFromPersistence() Event Name : " + pe2.Name + " is a persistent event anymore.");
                    continue;
                }
                afc afc2 = this.bfE.get(aex2.getName());
                afc2.a(pe2);
            }
        }
    }

    public void pu() {
        this.ava = true;
        for (aey aey2 : this.bfy.values()) {
            afk afk2 = aey2.zp();
            int n = aey2.zq();
            int n2 = 0;
            afc afc2 = null;
            String string = null;
            List<aex> list = aey2.zx();
            if (list == null || list.isEmpty()) continue;
            switch (afk2) {
                default: 
            }
            string = aey2.zs();
            if (string == null) continue;
            afc2 = this.bfE.get(string);
            if (afc2 == null) {
                lfn.b(5, TC, "restoreFromPersistence() There is no Event with Name : " + string + " which found in group with name : " + aey2.getName());
                assert (false);
                continue;
            }
            aff aff2 = afc2.zQ();
            if ((aff2 == null || aff2.Ab() == 0 && aff2.ze() == 0) && n2 > n) continue;
            afl afl2 = aey2.zu();
            switch (afl2) {
                case bgL: {
                    this.a(afc2);
                    afc2.start();
                    ++n2;
                }
            }
        }
    }

    private void a(afc afc2) {
        assert (!afc2.isInitialized());
        afc2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(afc2);
        this.bfF.put(afc2.zS(), afc2);
    }

    public void ct(String string) {
        afc afc2 = this.bfF.get(string);
        assert (afc2 != null);
        this.b(afc2);
        afc2.reset();
        aey aey2 = this.bfy.get(afc2.zR().zo());
        assert (aey2 != null);
        aey2.zt();
        afc2 = null;
        switch (aey2.zw().Ad()) {
            case bgC: {
                if (aey2.zy() < aey2.zw().getLimit()) break;
                return;
            }
        }
        afk afk2 = aey2.zp();
        switch (afk2) {
            default: 
        }
        String string2 = aey2.zs();
        if (string2 == null) {
            lfn.b(5, TC, "notifyEventCompleted() There are no enabled events in group with name : " + aey2.getName() + ". This can not happen!!!");
            assert (false);
            return;
        }
        afc2 = this.bfE.get(string2);
        if (afc2 == null) {
            lfn.b(5, TC, "notifyEventCompleted() There is no Event with Name : " + string2 + " which found in group with name : " + aey2.getName());
            assert (false);
            return;
        }
        switch (aey2.zw().Ad()) {
            default: 
        }
        switch (aey2.zv().Af()) {
            case bgw: {
                this.a(afc2);
                afc2.start();
                break;
            }
            case bgx: {
                double d2 = this.MessageDelegator.arc().rgz + aey2.zv().Ae();
                this.bfG.a(d2, afc2);
                break;
            }
        }
    }

    private void b(afc afc2) {
        this.bfF.remove(afc2.zS());
        this.MessageDelegator.hd(afc2.getGUID());
    }

    public void g(loz loz2) {
        fgo fgo2 = (fgo)this.MessageDelegator.h(29447, this.getGUID(), lcr.qAL);
        fgo2.r(loz2);
        this.MessageDelegator.F(fgo2);
    }

    public Map<Integer, Integer> zj() {
        return this.US.bqA();
    }

    public void o(ldv ldv2, int n) {
        for (afc afc2 : this.bfF.values()) {
            afc2.o(ldv2, n);
        }
    }

    public void cB(ldv ldv2) {
        for (afc afc2 : this.bfF.values()) {
            afc2.cB(ldv2);
        }
    }

    public final List<pe> zk() {
        if (this.bfF == null || this.bfF.isEmpty()) {
            return null;
        }
        ArrayList<pe> arrayList = lcn.abH(this.bfF.size());
        for (afc afc2 : this.bfE.values()) {
            if (!afc2.zR().isPersistent()) continue;
            arrayList.add(afc2.zT());
        }
        return arrayList;
    }

    private void a(glm glm2) {
        gln gln2 = (gln)this.MessageDelegator.h(35332, this.getGUID(), glm2.aO());
        gln2.jgj = this.er(glm2.bBh);
        this.MessageDelegator.E(gln2);
    }

    private cto[] er(int n) {
        if (this.bfF.isEmpty()) {
            return null;
        }
        for (afc afc2 : this.bfF.values()) {
            afe afe2;
            aff aff2 = afc2.zQ();
            if (!(aff2 instanceof afe) || !aff2.isInitialized() || aff2.zZ() || !(afe2 = (afe)aff2).ex(n)) continue;
            return afe2.zY();
        }
        return null;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 35331: {
                this.a((glm)dxq2);
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        this.abo -= ldz2.qwh;
        if (this.abo > 0.0) {
            return;
        }
        this.abo = 1.0;
        List<afc> list = this.bfG.eh(ldz2.rgz);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (afc afc2 : list) {
            this.a(afc2);
            afc2.start();
        }
    }
}

