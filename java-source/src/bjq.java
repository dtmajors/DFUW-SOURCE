/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bjq
extends btk
implements bto {
    private final bjx dpf;
    private ckx dpj;
    private List<coz> dpk = lcn.emv();
    private int dpl = 0;
    private Set<coz> dpm = lcn.emx();
    private LinkedList<coz> bZh = lcn.emA();

    public bjq(bjx bjx2) {
        this.dpf = bjx2;
    }

    public void b(String string, ldv ldv2) {
    }

    public void apO() {
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8451: {
                this.a((ffz)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        this.apW();
    }

    private void apW() {
        if (this.bZh.isEmpty()) {
            return;
        }
        Iterator iterator = this.bZh.iterator();
        while (iterator.hasNext()) {
            coz coz2 = (coz)((Object)iterator.next());
            if (!coz2.aAG().isReadyToRun() || !this.dpj.aAG().isReadyToRun()) continue;
            coz2.jv(this.dpj.getGUID());
            coz2.kW(this.dpj.aAG().axa());
            coz2.kV(this.dpj.aAG().getGUID());
            iterator.remove();
            coz2.aSF();
            coz2.aSH();
            this.dpm.add(coz2);
        }
    }

    public final void a(ckx ckx2) {
        this.dpj = ckx2;
    }

    public void apX() {
        assert (this.dpj != null);
        String string = this.dpj.pa();
        string = string.replace(" Base", " Cannon");
        int n = lea.enW().getType(string);
        assert (n > 0);
        Map<String, eh> map = ei.ao(this.dpj.aAG().getFileName());
        assert (map != null);
        String[] stringArray = ei.fg();
        int n2 = ei.an("AttachPoint Fortress Gun 01");
        if (n2 >= 0) {
            eh eh2;
            for (int i = 0; i < 10 && (eh2 = map.get(stringArray[n2 + i])) != null; ++i) {
                this.dpl = i + 1;
            }
        } else assert (false);
        assert (this.dpl > 0);
        ffy ffy2 = (ffy)this.MessageDelegator.h(8449, this.getGUID(), lcr.qBg);
        ffy2.l(n);
        ffy2.GA(this.dpl);
        ffy2.la(false);
        ffy2.jS(true);
        ffy2.oF(this.getGUID());
        this.MessageDelegator.F(ffy2);
    }

    private void a(ffz ffz2) {
        assert (ffz2.bOZ() != null);
        assert (ffz2.bOZ().length > 0);
        for (int i = 0; i < ffz2.bOZ().length; ++i) {
            assert (ffz2.bOZ()[i] != null);
            assert (ffz2.bOZ()[i] instanceof coz);
            coz coz2 = (coz)ffz2.bOZ()[i];
            bvd bvd2 = coz2.aIl();
            coz2.jv(this.dpj.getGUID());
            coz2.kW(this.dpj.aAG().axa());
            coz2.kV(this.dpj.aAG().getGUID());
            bvd2.c(this.dpj.aAG().av());
            bvd2.a(this.dpj.aAG().aw());
            coz2.d(bvd2);
            this.MessageDelegator.a((amf)((Object)coz2));
            this.bZh.add(coz2);
        }
        this.a(ffz2.bOZ());
    }

    private void a(cox[] coxArray) {
        assert (this.dpj.aAG() != null);
        Map<String, eh> map = ei.ao(this.dpj.aAG().getFileName());
        assert (map != null);
        String[] stringArray = ei.fg();
        int n = ei.an("AttachPoint Fortress Gun 01");
        int n2 = ei.an("AttachPoint Fortress Gun 01 Player");
        assert (n2 >= 0);
        for (int i = 0; i < coxArray.length; ++i) {
            eh eh2 = map.get(stringArray[n + i]);
            eh eh3 = map.get(stringArray[n2 + i]);
            assert (eh2 != null);
            assert (eh3 != null);
            cox cox2 = coxArray[i];
            cox2.bo(eh2.fb());
            lgl lgl2 = new lgl(eh2.getRotation());
            cox2.p(lgl2);
            cox2.bs(eh3.fb());
            cox2.t(new lgl(eh3.getRotation()));
        }
    }
}

