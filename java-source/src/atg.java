/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public abstract class atg
extends btk {
    protected TreeMap<Integer, atf> bYj;
    protected List<atf> bYk = lcn.emv();
    private final int bYl = 100;

    public atg() {
        this.ObjectType = 122;
    }

    @Override
    public void initialize() {
        super.initialize();
        assert (this.MessageDelegator != null);
        for (atf atf2 : this.bYk) {
            this.a(atf2.ID, atf2.aFo, atf2.ResourceType, atf2.Position, atf2.aFp, atf2.aXn);
        }
        this.bYk = null;
    }

    protected int a(int n, String string, int n2, ljq ljq2, boolean bl, String string2) {
        if (this.MessageDelegator == null) {
            assert (n != 0);
            atf atf2 = new atf();
            atf2.ID = n;
            atf2.Position = ljq2;
            atf2.ResourceType = n2;
            atf2.aFo = string;
            atf2.aXn = string2;
            atf2.aFp = bl;
            this.bYk.add(atf2);
            return atf2.ID;
        }
        assert (string != null);
        assert (n2 > 0);
        assert (ljq2 != null);
        if (this.bYj != null && this.bYj.containsKey(n)) {
            return 0;
        }
        if (this.bYj == null) {
            this.bYj = lcn.emG();
        }
        if (n == 0) {
            if (bl) {
                for (n = 1; this.bYj.containsKey(n) && n < 100; ++n) {
                }
                assert (n < 100);
                if (n >= 100) {
                    return 0;
                }
            } else {
                n = 100;
                while (this.bYj.containsKey(n)) {
                    ++n;
                }
            }
        } else assert (!this.bYj.containsKey(n));
        atf atf3 = new atf();
        atf3.ID = n;
        atf3.Position = ljq2;
        atf3.ResourceType = n2;
        atf3.aFo = string;
        atf3.aXn = string2;
        atf3.aFp = bl;
        this.bYj.put(n, atf3);
        this.c(atf3);
        return n;
    }

    protected atf hZ(int n) {
        if (this.bYj == null) {
            return null;
        }
        atf atf2 = this.bYj.get(n);
        if (atf2 == null) {
            return null;
        }
        this.bYj.remove(n);
        if (this.bYj.size() == 0) {
            this.bYj = null;
        }
        this.d(atf2);
        return atf2;
    }

    protected abstract void c(atf var1);

    protected abstract void d(atf var1);

    private void a(eab eab2) {
        eaf eaf2 = (eaf)this.MessageDelegator.h(22788, eab2.amk(), eab2.aO());
        eaf2.Zn = this.bV(eab2.ikr);
        eaf2.ex = 1;
        eaf2.aqs = eab2.aqs;
        this.MessageDelegator.F(eaf2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 22787: {
                this.a((eab)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public atf[] bV(boolean bl) {
        if (this.bYj == null || this.bYj.size() == 0) {
            return new atf[0];
        }
        if (bl) {
            atf[] atfArray = new atf[this.bYj.size()];
            return this.bYj.values().toArray(atfArray);
        }
        atf[] atfArray = new atf[this.bYj.headMap(100).size()];
        return this.bYj.headMap(100).values().toArray(atfArray);
    }

    public atf[] Ve() {
        atf[] atfArray;
        if (this.bYj == null || this.bYj.size() == 0) {
            return new atf[0];
        }
        Iterator<atf> iterator = this.bYj.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            atfArray = iterator.next();
            if (!atfArray.aFp) continue;
            ++n;
        }
        iterator = this.bYj.values().iterator();
        atfArray = new atf[n];
        iterator = this.bYj.values().iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            atf atf2 = iterator.next();
            if (!atf2.aFp) continue;
            atfArray[n2] = atf2;
            ++n2;
        }
        return atfArray;
    }

    public int Vf() {
        if (this.bYj == null) {
            return 0;
        }
        int n = 0;
        for (atf atf2 : this.bYj.values()) {
            if (!atf2.aFp) continue;
            ++n;
        }
        return n;
    }
}

