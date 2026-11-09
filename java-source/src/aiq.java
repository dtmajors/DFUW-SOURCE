/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 */
import java.util.List;
import java.util.Set;

public class aiq
extends aio {
    private List<oo> bnJ;

    public aiq(cex cex2) {
        super((cev)cex2);
    }

    public void E(List<oo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.bnJ = list;
    }

    public List<oo> M(List<oo> list) {
        for (aim aim2 : this.BQ().values()) {
            oo oo2 = new oo();
            oo2.SN = this.bnF.getGUID().enw();
            oo2.ResourceName = lea.enW().getName(aim2.az());
            oo2.aGf = String.valueOf(aim2.isSelected());
            list.add(oo2);
        }
        return list;
    }

    public void BR() {
        if (this.bnJ == null) {
            return;
        }
        for (oo oo2 : this.bnJ) {
            int n = lea.enW().getType(oo2.ResourceName);
            if (n == -1) {
                assert (false) : "Invalid : " + oo2.ResourceName;
                continue;
            }
            ciw ciw2 = (ciw)lea.epC().get(n);
            if (ciw2 == null) {
                assert (false);
                continue;
            }
            aim aim2 = new aim(ciw2.BP(), n, Boolean.parseBoolean(oo2.aGf));
            this.a(aim2);
        }
    }

    @Override
    public boolean isServerObject() {
        return true;
    }

    public void a(ede ede2) {
        aim aim2;
        Set<aim> set = lcn.emx();
        for (int n : ede2.bFG()) {
            aim2 = this.fz(n);
            if (aim2 == null) {
                assert (false);
                continue;
            }
            aim2.setSelected(false);
            set.add(aim2);
        }
        for (int n : ede2.bFF()) {
            aim2 = this.fz(n);
            if (aim2 == null) {
                assert (false);
                continue;
            }
            ain ain2 = ain.getUnlockableTypeForResourceType(n);
            for (aim aim3 : this.BQ().values()) {
                if (!aim3.isSelected() || !aim3.BP().equals((Object)ain2)) continue;
                aim3.setSelected(false);
                set.add(aim3);
            }
            aim2.setSelected(true);
            set.add(aim2);
        }
        Object object = set.iterator();
        while (object.hasNext()) {
            aim aim4 = (aim)object.next();
            this.a(6, aim4);
        }
        if (set.size() > 0) {
            object = (cat)this.bnF.aKu();
            ((cat)object).aGS();
        }
        this.a(cbx.a.ekQ);
    }
}

