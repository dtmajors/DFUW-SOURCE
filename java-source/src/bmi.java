/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bmi
extends bke {
    private fdo duA = null;
    private int[] bqd = null;

    public bmi() {
        this.dsy = bkd.a.drW;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            this.Vc();
            return;
        }
        this.duA = fdo2;
        String string = this.a(this.dsy, n);
        foo foo2 = (foo)this.MessageDelegator.h(11526, this.GUID, lcr.qzt);
        foo2.setObjectType(71);
        foo2.fn(n);
        foo2.setServerObject(true);
        foo2.setDirectoryName(null);
        foo2.cd(string);
        foo2.lh(true);
        foo2.pM(this.GUID);
        foo2.sk(1);
        this.MessageDelegator.E(foo2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11527: {
                this.b((fon)dxq2);
                break;
            }
            case 11530: {
                this.Vc();
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(fon fon2) {
        Object object = fon2.iSe;
        if (object == null) {
            this.Vc();
            return;
        }
        this.bqd = (int[])object;
        if (dqt.isDescendant(this.duA.bst, bkd.dqR)) {
            cte[] cteArray = new cte[this.bqd.length];
            for (int i = 0; i < cteArray.length; ++i) {
                cteArray[i] = new cte();
                cteArray[i].ResourceType = this.bqd[i];
                cteArray[i].fex = false;
            }
            this.a(bkd.dqO, cteArray);
        } else {
            this.Vc();
        }
    }

    private void a(int n, cte[] cteArray) {
        assert (cteArray != null);
        fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
        fcy2.bst = n;
        fcy2.aZG = this.duA.aZG;
        fcy2.akX = this.duA.aZG;
        fcy2.dtP = cteArray;
        fcy2.b(bqy.dFP);
        this.MessageDelegator.F(fcy2);
    }
}

