/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;
import java.util.Set;

public class bgl
extends bgk {
    public static bgh Tq = null;

    @Override
    protected void aoU() {
        super.aoU();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
    }

    @Override
    protected void fw(String string) {
        super.fw(string);
    }

    @Override
    protected void aoT() {
        super.aoT();
    }

    @Override
    protected void t(Map<String, String> map) {
        super.t(map);
    }

    void ht(ldv ldv2) {
    }

    @Override
    public void initialize() {
        boolean bl;
        super.initialize();
        assert (Tq != null);
        String string = (String)this.dlm.get("true");
        if (string == null) {
            string = (String)this.dlm.get("false");
            if (string == null) {
                this.fw("Required parameter is missing (must be either true or false)");
                return;
            }
            bl = false;
        } else {
            bl = true;
        }
        int n = dyf.jP(string);
        if (n == 0) {
            this.fw("Invalid parameter value");
            return;
        }
        Set<Integer> set = lcn.emx();
        Map<ldv, bgg> map = Tq.aoF();
        for (Map.Entry<ldv, bgg> entry : map.entrySet()) {
            bgg object = (bgg)entry.getValue();
            if (object.getType() != 2) continue;
            set.add(((ldv)entry.getKey()).ib());
        }
        for (Integer n2 : set) {
            ldv ldv2 = new ldv(n2, 15000 + lcr.qzp.enw(), lcr.qzp.enx());
            dyf dyf2 = (dyf)this.MessageDelegator.h(13322, Tq.getGUID(), ldv2);
            dyf2.aZF = n;
            dyf2.iiE = bl;
            this.MessageDelegator.F(dyf2);
        }
        this.aoU();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }
}

