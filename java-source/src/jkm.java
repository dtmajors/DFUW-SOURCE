/*
 * Decompiled with CFR.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class jkm
extends btk
implements bto,
hvd {
    private int nsK = 0;
    private HashMap<ldv, jkn> nsT = new HashMap();

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().cxP().czd().a(this);
        if (hso.cxK().cxP().czd().HT()) {
            this.cyF();
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czd() != null) {
            hso.cxK().cxP().czd().b(this);
        }
    }

    @Override
    public void c(cmd cmd2) {
        jjh jjh2 = hso.cxK().cxT().dIN().rV(cmd2.getGUID());
        if (jjh2 == null) {
            return;
        }
        String string = cmf.getIcon(cmd2.Bo(), cmd2.isActive(), cmd2.aSW());
        jjh2.sA(string);
        jkn jkn2 = new jkn(jjh2, cmd2.getGUID(), cmd2.ajW(), cmd2.Bw(), cmd2.isActive(), cmd2.aSW(), cmd2.aSU(), cmd2.aSV(), cmd2.aSX());
        this.nsT.put(cmd2.getGUID(), jkn2);
    }

    @Override
    public void cyF() {
        Set<cmd> set = hso.cxK().cxP().czd().bqt();
        for (cmd cmd2 : set) {
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("Name", this.d(cmd2));
            if (cmd2.isActive()) {
                hso.cxK().cxT().a(jjm.noq, cmd2.av(), null, hashMap, cmd2.getGUID());
            } else if (cmd2.aSW()) {
                hso.cxK().cxT().a(jjm.nos, cmd2.av(), null, hashMap, cmd2.getGUID());
            } else {
                hso.cxK().cxT().a(jjm.nor, cmd2.av(), null, hashMap, cmd2.getGUID());
            }
            this.c(cmd2);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (ldz2.lpr - this.nsK > 10) {
            this.nsK = ldz2.lpr;
            for (Map.Entry<ldv, jkn> entry : this.nsT.entrySet()) {
                double d2 = 0.0;
                jkn jkn2 = entry.getValue();
                if (jkn2.isActive() || jkn2.dLg()) {
                    double d3 = jkn2.aAx() - jkn2.aAw();
                    double d4 = this.MessageDelegator.arc().rgz - jkn2.aAw();
                    d2 = Math.min(d4 / d3, 1.0);
                } else {
                    d2 = (float)jkn2.aSU() / (float)jkn2.dLh();
                }
                jkn2.duI().setProgress((float)d2);
            }
        }
    }

    public jkn sr(ldv ldv2) {
        return this.nsT.get(ldv2);
    }

    private String d(cmd cmd2) {
        return lvm.sXg.bD(cmd2.av()).exA();
    }
}

