/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class bsr
extends btk {
    private bsq dJt = null;
    private Map<ldv, bsp> dJu = lcn.emw();
    private boolean dJv = true;

    @Override
    public void initialize() {
        super.initialize();
        koy koy2 = (koy)this.MessageDelegator.h(549);
        koy2.ZU(1);
        koy2.ts(this.GUID);
        koy2.sy(this.GUID);
        this.MessageDelegator.a(koy2);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        koy koy2 = (koy)this.MessageDelegator.h(549);
        koy2.ZU(2);
        koy2.ts(this.GUID);
        koy2.sy(this.GUID);
        this.MessageDelegator.a(koy2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 539) {
            this.a((kwd)ktv2);
        } else {
            super.receiveResponse(ktv2);
        }
    }

    private void a(kwd kwd2) {
        bsp bsp2;
        int n;
        if (this.dJt == null) {
            return;
        }
        for (n = 0; n < kwd2.CX().length; ++n) {
            bsp2 = new bsp(kwd2.ehu()[n], kwd2.ehx()[n], kwd2.CX()[n], kwd2.bFx()[n]);
            if (this.dJv) {
                this.dJu.put(bsp2.axa(), bsp2);
            }
            this.dJt.a(bsp2);
        }
        for (n = 0; n < kwd2.ehv().length; ++n) {
            bsp2 = null;
            if (this.dJv) {
                bsp2 = this.dJu.get(kwd2.ehw()[n]);
                if (bsp2 == null) {
                    assert (false);
                    continue;
                }
            } else {
                bsp2 = new bsp(kwd2.ehw()[n], kwd2.ehy()[n], kwd2.ehv()[n], null);
            }
            this.dJt.b(bsp2);
        }
    }

    public void mP(int n) {
        koy koy2 = (koy)this.MessageDelegator.h(549);
        koy2.ts(this.GUID);
        koy2.ZU(4);
        koy2.sy(this.GUID);
        koy2.g(this.mR(n));
        this.MessageDelegator.a(koy2);
    }

    public void mQ(int n) {
        koy koy2 = (koy)this.MessageDelegator.h(549);
        koy2.ts(this.GUID);
        koy2.ZU(8);
        koy2.sy(this.GUID);
        koy2.g(this.mR(n));
        this.MessageDelegator.a(koy2);
        if (this.dJv) {
            Iterator<Map.Entry<ldv, bsp>> iterator = this.dJu.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<ldv, bsp> entry = iterator.next();
                if (!lea.enW().isDescendant(entry.getValue().az(), n)) continue;
                iterator.remove();
            }
        }
    }

    int[] mR(int n) {
        ler ler2 = lea.enW().acv(n);
        List<ler> list = lea.enW().a(ler2, true);
        int[] nArray = new int[list.size() + 1];
        for (int i = 0; i < list.size(); ++i) {
            nArray[i] = list.get(i).getType();
        }
        nArray[nArray.length - 1] = n;
        return nArray;
    }

    public bsq axb() {
        return this.dJt;
    }

    public void a(bsq bsq2) {
        this.dJt = bsq2;
    }

    public boolean axc() {
        return this.dJv;
    }

    public void ed(boolean bl2) {
        this.dJv = bl2;
    }

    public Map<ldv, bsp> axd() {
        return this.dJu;
    }

    public void y(Map<ldv, bsp> map) {
        this.dJu = map;
    }
}

