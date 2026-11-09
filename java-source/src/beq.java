/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Map;

public class beq
extends btk
implements bto {
    private Map<lfs<String, Integer>, lei> ddt = lcn.emw();

    @Override
    public void doTick(ldz ldz2) {
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 26369: {
                this.a((eyx)dxq2);
                break;
            }
            case 26371: {
                this.a((eyz)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eyx eyx2) {
        eyy eyy2 = (eyy)this.MessageDelegator.h(26370, this.getGUID(), eyx2.aO());
        this.MessageDelegator.b(eyx2, eyy2);
        ti ti2 = lea.eol().get(eyx2.aRX);
        if (ti2 == null) {
            assert (false);
            eyy2.ew = 2;
            this.MessageDelegator.F(eyy2);
            return;
        }
        if (ti2.uz() <= 0) {
            eyy2.ew = 3;
            this.MessageDelegator.F(eyy2);
            return;
        }
        String string = lcw.dZ((ljq)eyx2.iFP);
        if (string == null) {
            assert (false);
            eyy2.ew = 1;
            this.MessageDelegator.F(eyy2);
            return;
        }
        lfs<String, Integer> lfs2 = new lfs<String, Integer>(string, eyx2.aRX);
        lei lei2 = this.ddt.get(lfs2);
        if (lei2 == null) {
            lei2 = new lei(0);
            this.ddt.put(lfs2, lei2);
        }
        if (lei2.intValue() >= ti2.uz()) {
            eyy2.ew = 1;
            this.MessageDelegator.F(eyy2);
            return;
        }
        lei2.setValue(lei2.intValue() + 1);
        eyy2.ew = 3;
        this.MessageDelegator.F(eyy2);
    }

    private void a(eyz eyz2) {
        String string = lcw.dZ((ljq)eyz2.iFP);
        if (string == null) {
            assert (false);
            return;
        }
        lfs<String, Integer> lfs2 = new lfs<String, Integer>(string, eyz2.aRX);
        lei lei2 = this.ddt.get(lfs2);
        if (lei2 == null) {
            assert (false);
            return;
        }
        lei2.setValue(lei2.intValue() - 1);
        if (lei2.intValue() < 0) {
            assert (false);
            lei2.setValue(0);
        }
    }
}

