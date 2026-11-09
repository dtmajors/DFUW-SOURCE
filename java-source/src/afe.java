/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class afe
extends aff {
    private static final String TC = "SFSpecialEventStepMonsterRunnable";
    private final afb bgt;

    public afe(afc afc2, afb afb2) {
        super(afc2, afb2.getIndex(), afb2.getLimit(), afb2.zA());
        this.bgt = afb2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.start();
    }

    @Override
    public void start() {
        super.start();
        this.zW();
    }

    private void zW() {
        int[] nArray = new int[this.bgt.zK().size()];
        int n = 0;
        Object object = this.bgt.zK().iterator();
        while (object.hasNext()) {
            int n2;
            nArray[n] = n2 = object.next().intValue();
            ++n;
        }
        object = (fbb)this.MessageDelegator.h(12545, this.GUID, lcr.qEl);
        ((fbb)object).iHR = this.GUID;
        ((fbb)object).dhI = new int[]{5};
        ((fbb)object).bqd = nArray;
        this.MessageDelegator.F((dxq)object);
    }

    private void a(fbf fbf2) {
        int n = fbf2.iIb.dhr;
        int n2 = fbf2.iIb.Type;
        if (n2 != 5) {
            lfn.b(5, TC, "handleEventOccuredMessage() Registered Event : 5 Notified for : " + n2);
            return;
        }
        this.trigger(n);
    }

    private void trigger(int n) {
        if (this.zZ()) {
            return;
        }
        boolean bl = false;
        for (int n2 : this.bgt.zK()) {
            if (!lea.enW().isDescendant(n, n2)) continue;
            this.ey(1);
            break;
        }
        if (this.zZ()) {
            this.Aa();
            this.zO();
            this.MessageDelegator.hd(this.getGUID());
            return;
        }
        this.ez(2);
    }

    @Override
    public void zO() {
        super.zO();
        this.zX();
    }

    private void zX() {
        int[] nArray = new int[this.bgt.zK().size()];
        int n = 0;
        Object object = this.bgt.zK().iterator();
        while (object.hasNext()) {
            int n2;
            nArray[n] = n2 = object.next().intValue();
            ++n;
        }
        object = (fbg)this.MessageDelegator.h(12547, this.GUID, lcr.qEl);
        ((fbg)object).iHR = this.getGUID();
        this.MessageDelegator.F((dxq)object);
    }

    public boolean ex(int n) {
        for (int n2 : this.bgt.zK()) {
            if (!lea.enW().isDescendant(n, n2)) continue;
            return true;
        }
        return false;
    }

    public cto[] zY() {
        return this.bgt.zL();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 12548: {
                this.a((fbf)dxq2);
            }
        }
    }
}

