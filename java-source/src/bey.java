/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class bey
extends bew {
    private Map<ldv, a> dfi = lcn.emw();
    private Map<Integer, List<ldv>> dfj = lcn.emw();
    private Map<Integer, List<ber>> del;
    private Map<Integer, bet> dfk = lcn.emw();
    private bfi dfl;
    private boolean dfm = true;
    private double dfn;
    private double dfo;
    private double dfp = 3600.0;
    private int[] dfq;

    public bey() {
        this.del = lcn.emw();
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            this.anR();
            this.dfl = new bfi();
            this.dfl.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.dfl);
            this.dfn = this.MessageDelegator.arc().rgz;
            this.dfo = this.dfn + this.dfp;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.ddN) {
            this.ddN = false;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1801: {
                this.a((fan)dxq2);
                break;
            }
            case 11034: {
                break;
            }
            case 1806: {
                this.a((fai)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fai fai2) {
        Iterator iterator;
        int n;
        int[] nArray = fai2.dfq;
        bet[] betArray = fai2.iGT;
        if (nArray == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleEnvironmentGlobalWeatherSetMessage() : AreaIDs is null.");
            assert (false);
            return;
        }
        if (betArray == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleEnvironmentGlobalWeatherSetMessage() : WeatherConfigs is null.");
            assert (false);
            return;
        }
        if (nArray.length != betArray.length) {
            lfn.b(5, this.getClass().getSimpleName(), "handleEnvironmentGlobalWeatherSetMessage() : TileIds.length [" + this.dfq.length + "] !=  WeatherConfigs.length [" + betArray.length + "}");
            assert (false);
            return;
        }
        int n2 = nArray.length;
        for (n = 0; n < n2; ++n) {
            this.dfk.put(nArray[n], betArray[n]);
            iterator = betArray[n].def;
            if (iterator == null) {
                lfn.b(5, "SFEnvironmentManagerServer", "handleEnvironmentGlobalWeatherSetMessage() Records is null. BAD");
                assert (false);
                continue;
            }
            for (Object object : iterator) {
                ((bfc)object).anU();
            }
        }
        n2 = nArray.length;
        for (n = 0; n < n2; ++n) {
            iterator = this.dfj.get(nArray[n]);
            if (iterator == null) continue;
            Iterator iterator2 = iterator.iterator();
            while (iterator2.hasNext()) {
                ldv ldv2 = (ldv)iterator2.next();
                a a2 = this.dfi.get(ldv2);
                if (a2 == null) continue;
                this.a(a2, true);
            }
        }
    }

    private void a(fan fan2) {
        switch (fan2.bNP()) {
            case 0: {
                this.b(fan2);
                break;
            }
            case 1: {
                this.c(fan2);
                break;
            }
            case 2: {
                this.d(fan2);
                break;
            }
            case 3: {
                this.d(fan2);
                break;
            }
            default: {
                assert (false) : "Invalid getEnvironmentPSOGUIDResponseMessageType !";
                break;
            }
        }
    }

    private void b(fan fan2) {
        assert (!this.dfi.containsKey(fan2.aO())) : "Tried to add already existing client!";
        a a2 = new a(this, null);
        a2.dfs = fan2.xz();
        a2.dfr = fan2.bNQ();
        a2.Ri = fan2.aO();
        this.dfi.put(a2.Ri, a2);
        List<ldv> list = this.dfj.get(a2.dfs);
        if (list == null) {
            list = lcn.emv();
            this.dfj.put(a2.dfs, list);
        }
        list.add(a2.Ri);
        this.a(a2, false);
    }

    private void c(fan fan2) {
        boolean bl;
        a a2 = this.dfi.remove(fan2.aO());
        if (a2 == null) {
            String string = "Trying to remove non-existing client!";
            return;
        }
        List<ldv> list = this.dfj.get(a2.dfs);
        if (list != null && !(bl = list.remove(a2.Ri))) {
            return;
        }
    }

    private void d(fan fan2) {
        boolean bl;
        a a2 = this.dfi.get(fan2.aO());
        if (a2 == null) {
            return;
        }
        List<ldv> list = this.dfj.get(a2.dfs);
        if (list != null && !(bl = list.remove(a2.Ri))) {
            return;
        }
        a2.dfs = fan2.xz();
        list = this.dfj.get(a2.dfs);
        if (list == null) {
            list = lcn.emv();
            this.dfj.put(a2.dfs, list);
        }
        list.add(a2.Ri);
        this.a(a2, false);
    }

    private void a(a a2, boolean bl) {
        Object object;
        ldv ldv2 = lcr.ak((ldv)lcr.qDH, (int)a2.dfr);
        faa faa2 = (faa)this.MessageDelegator.h(1802, this.GUID, ldv2);
        List<ber> list = this.del.get(a2.dfs);
        if (list == null) {
            lfn.b(5, "SFEnvironmentManagerServer", "sendEnvironmentInfoToClient(): Environment is null for area ID " + a2.dfs);
            assert (false);
            return;
        }
        bet bet2 = this.dfk.get(a2.dfs);
        int n = 0;
        if (bet2 != null) {
            n = bet2.dee;
        }
        if (n >= list.size()) {
            String string = " ActiveWeatherIndex = " + n + ", EnvList.Size() = " + list.size();
            assert (false) : string;
            return;
        }
        ber ber2 = list.get(n);
        if (ber2 == null) {
            lfn.b(5, "SFEnvironmentManagerServer", "sendEnvironmentInfoToClient() Environment is null. Not updating client.");
            assert (false);
            return;
        }
        if (bl && bet2 != null || ber2.anu() == null) {
            object = ber2.anv();
            object = (TreeSet)((TreeSet)object).clone();
            if (bet2 != null) {
                this.a((TreeSet<bfc>)object, bet2);
            }
            ber2.a(((AbstractCollection)object).toArray(new bfc[((TreeSet)object).size()]));
        }
        object = ber2.anu();
        for (int i = 0; i < ((bfc[])object).length; ++i) {
            ((bfc)object[i]).anT();
            if (((bfc)object[i]).anG() != bfb.dfV) continue;
        }
        faa2.b((bfc[])object);
        faa2.ky(a2.dfs);
        faa2.cw(this.dfn);
        faa2.cv(this.dfo);
        this.MessageDelegator.F(faa2);
    }

    private void a(TreeSet<bfc> treeSet, bet bet2) {
        bfc[] bfcArray = bet2.def;
        if (bfcArray == null) {
            lfn.b(5, "SFEnvironmentManagerServer", "addCustomWeatherSettings() CustomRecords is null.");
            assert (false);
            return;
        }
        for (bfc bfc2 : bfcArray) {
            treeSet.add(bfc2);
        }
        ArrayList arrayList = lcn.emv();
        Iterator<bfc> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            bfc bfc3 = iterator.next();
            if (bfc3.anG() != bfb.dfR || bfc3.AJ() != 2) continue;
            float f2 = ((Float)((bff)bfc3).getValue()).floatValue();
            bff bff2 = ((bff)bfc3).anW();
            bff2.setValue(f2 * bet2.deg);
            iterator.remove();
            arrayList.add(bff2);
        }
        treeSet.addAll(arrayList);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    private void anR() {
        jwn jwn2 = new jwn();
        this.del = jwn2.dUr();
    }
}

