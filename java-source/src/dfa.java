/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.LinkedList;

public class dfa
extends btk
implements bto {
    private int gnz = 0;
    private LinkedList<dey> gnA = lcn.emA();

    @Override
    public void doTick(ldz ldz2) {
        if (this.gnA.isEmpty()) {
            return;
        }
        Iterator iterator = this.gnA.iterator();
        while (iterator.hasNext()) {
            dey dey2 = (dey)iterator.next();
            if (!dey2.blr()) continue;
            this.mG(dey2.getGUID());
            iterator.remove();
        }
    }

    public void b(dey dey2) {
        if (dey2 == null) {
            return;
        }
        if (dey2.blr()) {
            this.mG(dey2.getGUID());
            return;
        }
        this.gnA.add(dey2);
        ++this.gnz;
    }

    private void mG(ldv ldv2) {
        if (ldv2.enw() == this.GUID.enw()) {
            this.MessageDelegator.hd(ldv2);
            return;
        }
        fub fub2 = (fub)this.MessageDelegator.h(1027, this.GUID, ldv2);
        fub2.HX(fub.iHB);
        this.MessageDelegator.F(fub2);
    }
}

