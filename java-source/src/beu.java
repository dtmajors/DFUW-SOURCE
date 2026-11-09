/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  gg
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class beu
extends btk
implements bto {
    private final double deh = 180.0;
    private final int dei = 100;
    private boolean dej = true;
    private lhw dek;
    private Map<Integer, List<ber>> del;
    private Random dem = new Random();
    private gg den;
    private boolean deo;
    int[] dep = new int[1024];
    int deq = 1024;

    private double anw() {
        return 180.0;
    }

    public beu() {
        this.GUID = lcr.qDI;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dek = new lhw(this.MessageDelegator.arc().rgz - this.anw() + 20.0, this.anw());
        this.anz();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.dej) {
            return;
        }
        if (!this.deo && this.MessageDelegator.bzx().bzt().dVA() == kdw.a.phY) {
            this.deo = true;
            this.anx();
        }
        if (this.dek != null && this.dek.eb(ldz2.rgz)) {
            lfn.b(3, this.getClass().getSimpleName(), "doTick() : RandomWeatherTimer triggered. Randomizing weather.");
            this.dek.ec(ldz2.rgz);
            this.any();
        }
    }

    private void anx() {
        if (this.del == null) {
            lfn.b(5, this.getClass().getSimpleName(), "randomizeAllWeather() : EnvironmentInfoMap is null!");
            assert (false);
            return;
        }
        Map<Integer, Integer> map = lcn.emw();
        for (int i = 0; i < 1024; ++i) {
            int n = 100 + i;
            List<ber> list = this.del.get(n);
            if (list == null || list.size() <= 1) continue;
            int n2 = this.ac(list);
            map.put(n, n2);
        }
        int[] nArray = new int[map.size()];
        bet[] betArray = new bet[map.size()];
        int n = 0;
        gr[] grArray = map.entrySet().iterator();
        while (grArray.hasNext()) {
            Map.Entry object = grArray.next();
            nArray[n] = (Integer)object.getKey();
            bet bet2 = new bet();
            bet2.dee = (Integer)object.getValue();
            this.a(bet2, nArray[n]);
            betArray[n] = bet2;
            ++n;
        }
        if (lcw.enb()) {
            grArray = lcr.qDH;
            fai fai2 = (fai)this.MessageDelegator.h(1806, this.GUID, (ldv)grArray);
            fai2.dfq = nArray;
            fai2.iGT = betArray;
            this.MessageDelegator.E(fai2);
            return;
        }
        for (gr gr2 : grArray = this.den.hR()) {
            ldv ldv2 = lcr.ak((ldv)lcr.qDH, (int)gr2.di);
            fai fai3 = (fai)this.MessageDelegator.h(1806, this.GUID, ldv2);
            fai3.dfq = nArray;
            fai3.iGT = betArray;
            this.MessageDelegator.E(fai3);
        }
    }

    private void any() {
        Object object;
        Object object2;
        int n;
        if (this.del == null) {
            lfn.b(5, this.getClass().getSimpleName(), "randomizeWeather() : EnvironmentInfoMap is null!");
            assert (false);
            return;
        }
        Map<Integer, Integer> map = lcn.emw();
        int n2 = 100;
        for (int i = 0; i < n2; ++i) {
            n = this.anA();
            object2 = this.del.get(n);
            if (object2 == null || object2.size() <= 1) continue;
            int n3 = this.ac((List<ber>)object2);
            object = (Integer)map.get(n);
            if (object != null && (Integer)object == n3) continue;
            map.put(n, n3);
        }
        int[] nArray = new int[map.size()];
        bet[] betArray = new bet[map.size()];
        n = 0;
        object2 = map.entrySet().iterator();
        while (object2.hasNext()) {
            Map.Entry entry = (Map.Entry)object2.next();
            nArray[n] = (Integer)entry.getKey();
            object = new bet();
            ((bet)object).dee = (Integer)entry.getValue();
            this.a((bet)object, nArray[n]);
            betArray[n] = object;
            ++n;
        }
        if (lcw.enb()) {
            object2 = lcr.qDH;
            fai fai2 = (fai)this.MessageDelegator.h(1806, this.GUID, (ldv)object2);
            fai2.dfq = nArray;
            fai2.iGT = betArray;
            this.MessageDelegator.E(fai2);
            return;
        }
        for (gr gr2 : object2 = this.den.hR()) {
            ldv ldv2 = lcr.ak((ldv)lcr.qDH, (int)gr2.di);
            fai fai3 = (fai)this.MessageDelegator.h(1806, this.GUID, ldv2);
            fai3.dfq = nArray;
            fai3.iGT = betArray;
            this.MessageDelegator.E(fai3);
        }
    }

    private void a(bet bet2, int n) {
        ArrayList<bfc> arrayList = lcn.emv();
        ber ber2 = this.del.get(n).get(bet2.dee);
        if (ber2 == null) {
            bet2.def = new bfc[0];
            lfn.b(5, "SFEnvironmentGlobalWeatherManager", "createRandomWeather() Env is null. PROBLEM.");
            assert (false);
            return;
        }
        if (this.dem.nextFloat() >= 0.0f && ber2.ant() == ber.a.ddY) {
            this.Z(arrayList);
        }
        if (this.dem.nextFloat() >= 0.0f && ber2.ant() == ber.a.ddZ) {
            this.aa(arrayList);
        }
        bet2.deg = 1.0f + this.dem.nextFloat() * 0.2f;
        for (bfc bfc2 : arrayList) {
            bfc2.anT();
        }
        bet2.def = arrayList.toArray(new bfc[arrayList.size()]);
    }

    private void Y(List<bfc> list) {
        bff bff2 = null;
        bff2 = new bff();
        bff2.kC((int)(86400.0f * this.dem.nextFloat()));
        bff2.kD(120);
        bff2.b(bfb.dfP);
        bff2.eS(1);
        bff2.setValue(0.7f + this.dem.nextFloat() * 0.3f);
        list.add(bff2);
        bff2 = new bff();
        bff2.kC((int)(86400.0f * this.dem.nextFloat()));
        bff2.kD(120);
        bff2.b(bfb.dfP);
        bff2.eS(1);
        bff2.setValue(this.dem.nextFloat());
        list.add(bff2);
        bff2 = new bff();
        bff2.kC((int)(86400.0f * this.dem.nextFloat()));
        bff2.kD(120);
        bff2.b(bfb.dfP);
        bff2.eS(1);
        bff2.setValue(this.dem.nextFloat());
        list.add(bff2);
        bff2 = new bff();
        bff2.kC((int)(86400.0f * this.dem.nextFloat()));
        bff2.kD(120);
        bff2.b(bfb.dfP);
        bff2.eS(1);
        bff2.setValue(this.dem.nextFloat());
        list.add(bff2);
        bff2 = new bff();
        bff2.kC((int)(86400.0f * this.dem.nextFloat()));
        bff2.kD(120);
        bff2.b(bfb.dfP);
        bff2.eS(1);
        bff2.setValue(0.5f + this.dem.nextFloat() * 0.5f);
        list.add(bff2);
        bff2 = new bff();
        bff2.kC((int)(86400.0f * this.dem.nextFloat()));
        bff2.kD(120);
        bff2.b(bfb.dfP);
        bff2.eS(2);
        bff2.setValue(0.7f + this.dem.nextFloat() * 0.3f);
        list.add(bff2);
        bff2 = new bff();
        bff2.kC((int)(86400.0f * this.dem.nextFloat()));
        bff2.kD(120);
        bff2.b(bfb.dfP);
        bff2.eS(2);
        bff2.setValue(0.4f + this.dem.nextFloat() * 0.6f);
        list.add(bff2);
        bff2 = new bff();
        bff2.kC((int)(86400.0f * this.dem.nextFloat()));
        bff2.kD(120);
        bff2.b(bfb.dfP);
        bff2.eS(2);
        bff2.setValue(0.4f + this.dem.nextFloat() * 0.6f);
        list.add(bff2);
    }

    private void Z(List<bfc> list) {
        float f2 = this.dem.nextFloat() * 0.8f;
        float f3 = f2 + 0.02f + this.dem.nextFloat() * 0.18f;
        if (f3 >= 1.0f) {
            f3 = 0.95f;
        }
        bfc bfc2 = new bfd();
        bfc2.kC((int)(86400.0f * f2));
        bfc2.kD(0);
        bfc2.b(bfb.dfV);
        bfc2.eS(1);
        bfc2.dc(false);
        ((bfd)bfc2).setValue(true);
        list.add(bfc2);
        bfc2 = new bfd();
        bfc2.kC((int)(86400.0f * f3));
        bfc2.kD(0);
        bfc2.b(bfb.dfV);
        bfc2.eS(1);
        bfc2.dc(false);
        ((bfd)bfc2).setValue(false);
        list.add(bfc2);
        bfc2 = new bff();
        bfc2.kC((int)(86400.0f * f2));
        bfc2.kD(0);
        bfc2.b(bfb.dfV);
        bfc2.eS(2);
        bfc2.dc(false);
        ((bff)bfc2).setValue(this.dem.nextFloat() * 0.5f);
        list.add(bfc2);
    }

    private void aa(List<bfc> list) {
        float f2 = 0.2f + this.dem.nextFloat() * 0.3f;
        float f3 = f2 + 0.02f + this.dem.nextFloat() * 0.28f;
        if (f3 >= 1.0f) {
            f3 = 0.9f;
        }
        bfc bfc2 = new bfd();
        bfc2.kC((int)(86400.0f * f2));
        bfc2.kD(120);
        bfc2.b(bfb.dfW);
        bfc2.eS(1);
        ((bfd)bfc2).setValue(true);
        list.add(bfc2);
        bfc2 = new bfd();
        bfc2.kC((int)(86400.0f * f3));
        bfc2.kD(120);
        bfc2.b(bfb.dfW);
        bfc2.eS(1);
        ((bfd)bfc2).setValue(false);
        list.add(bfc2);
        bfc2 = new bff();
        bfc2.kC((int)(86400.0f * f2));
        bfc2.kD(120);
        bfc2.b(bfb.dfW);
        bfc2.eS(2);
        ((bff)bfc2).setValue(this.dem.nextFloat());
        list.add(bfc2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1807: {
                this.a((fac)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fac fac2) {
        if ((fac2.iGk & 1) != 0) {
            this.dej = fac2.gUI;
        }
    }

    private void anz() {
        jwn jwn2 = new jwn();
        this.del = jwn2.dUr();
    }

    public void b(gg gg2) {
        this.den = gg2;
    }

    private int anA() {
        int n;
        if (this.deq >= 1024) {
            for (n = 0; n < 1024; ++n) {
                this.dep[n] = 100 + n;
            }
            for (n = 1023; n >= 0; --n) {
                int n2 = this.dem.nextInt(n + 1);
                int n3 = this.dep[n];
                this.dep[n] = this.dep[n2];
                this.dep[n2] = n3;
            }
            this.deq = 0;
        }
        n = this.dep[this.deq];
        ++this.deq;
        return n;
    }

    private int ab(List<ber> list) {
        return this.dem.nextInt(list.size());
    }

    private int ac(List<ber> list) {
        int n = 0;
        for (ber ber2 : list) {
            if (ber2.anj() < 0) continue;
            n += ber2.anj();
        }
        int n2 = this.dem.nextInt(n);
        int n3 = 0;
        for (int i = 0; i < list.size(); ++i) {
            ber ber3 = list.get(i);
            if (ber3.anj() < 0 || n2 >= (n3 += ber3.anj())) continue;
            return i;
        }
        assert (false);
        return 0;
    }
}

