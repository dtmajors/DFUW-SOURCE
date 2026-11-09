/*
 * Decompiled with CFR.
 */
import java.util.List;

public class jhu
extends btk
implements bto {
    List<aim> nfM = lcn.emv();
    List<aim> nfN = lcn.emv();

    public jhu() {
        jid.dHb().ngv.c(new jlf<aim>(this){
            final /* synthetic */ jhu nfO;
            {
                this.nfO = jhu2;
            }

            public boolean c(aim aim2) {
                this.nfO.nfM.add(aim2);
                return true;
            }

            public /* synthetic */ boolean T(Object object) {
                return this.c((aim)object);
            }
        });
        jid.dHb().ngw.c(new jlf<aim>(this){
            final /* synthetic */ jhu nfO;
            {
                this.nfO = jhu2;
            }

            public boolean c(aim aim2) {
                this.nfO.nfN.add(aim2);
                return true;
            }

            public /* synthetic */ boolean T(Object object) {
                return this.c((aim)object);
            }
        });
    }

    private void a(efl efl2) {
        aim[] aimArray = efl2.bGs();
        if (aimArray == null || aimArray.length == 0) {
            return;
        }
        for (aim aim2 : aimArray) {
            jid.dHb().a(aim2);
        }
    }

    public void n(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 12858: {
                this.a((efl)dxq2);
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.nfM.size() > 0 || this.nfN.size() > 0) {
            ede ede2 = (ede)this.MessageDelegator.h(12859, this.GUID, hso.cxK().bAn().gYX);
            int[] nArray = new int[this.nfM.size()];
            for (int j = 0; j < this.nfM.size(); ++j) {
                nArray[j] = this.nfM.get(j).az();
            }
            int[] nArray2 = new int[this.nfN.size()];
            for (int j = 0; j < this.nfN.size(); ++j) {
                nArray2[j] = this.nfN.get(j).az();
            }
            ede2.Q(nArray);
            ede2.R(nArray2);
            this.MessageDelegator.E(ede2);
            this.nfM.clear();
            this.nfN.clear();
        }
    }
}

