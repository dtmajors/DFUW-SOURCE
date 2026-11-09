/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.LinkedList;

public class des
extends btk
implements bto {
    private LinkedList gnb = lcn.emA();
    private LinkedList gnc = lcn.emA();

    @Override
    public void doTick(ldz ldz2) {
        this.bkX();
    }

    public void a(dfo dfo2, double d2, double d3) {
        if (d2 <= this.MessageDelegator.arc().rgz) {
            return;
        }
        dfo2.bL(d2);
        dfo2.bM(d3);
        this.gnb.add(dfo2);
        this.MessageDelegator.a(dfo2);
    }

    private void bkX() {
        this.bkY();
        this.bkZ();
    }

    private void bkY() {
        if (this.gnb.isEmpty()) {
            return;
        }
        Iterator iterator = this.gnb.iterator();
        while (iterator.hasNext()) {
            dfo dfo2 = (dfo)iterator.next();
            if (dfo2.bmB() <= this.MessageDelegator.arc().rgz) {
                iterator.remove();
                this.MessageDelegator.hd(dfo2.getGUID());
                continue;
            }
            if (!(dfo2.bmC() <= this.MessageDelegator.arc().rgz)) continue;
            this.gnc.add(dfo2);
            iterator.remove();
        }
    }

    private void bkZ() {
        if (this.gnc.isEmpty()) {
            return;
        }
        Iterator iterator = this.gnc.iterator();
        while (iterator.hasNext()) {
            dfo dfo2 = (dfo)iterator.next();
            if (dfo2.bmB() <= this.MessageDelegator.arc().rgz) {
                iterator.remove();
                this.MessageDelegator.hd(dfo2.getGUID());
                continue;
            }
            double d2 = dfo2.bmB() - dfo2.bmC();
            if (d2 == 0.0) continue;
            double d3 = this.MessageDelegator.arc().rgz - dfo2.bmC();
            double d4 = d3 / d2;
            if (d4 > 1.0) {
                d4 = 1.0;
            }
            if (d4 < 0.0) {
                d4 = 0.0;
            }
            lcq lcq2 = lcq.a(dfo2.getStartColor(), dfo2.getEndColor(), (float)d4);
            dfo2.setStartColor(lcq2);
        }
    }
}

