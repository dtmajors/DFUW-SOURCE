/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Set;

public class acn
extends btk {
    private Map<Integer, Set<acl>> bdS = lcn.emw();
    private int bdT = 0;

    private void a(gdx gdx2, int n, boolean bl, boolean bl2) {
        gdy gdy2 = (gdy)this.MessageDelegator.h(34824, this.GUID, gdx2.aO());
        this.MessageDelegator.b(gdx2, gdy2);
        gdy2.Ja(n);
        gdy2.lM(bl);
        gdy2.lN(bl2);
        this.MessageDelegator.F(gdy2);
    }

    private void a(gea gea2, int n, boolean bl, boolean bl2) {
        geb geb2 = (geb)this.MessageDelegator.h(34826, this.GUID, gea2.aO());
        this.MessageDelegator.b(gea2, geb2);
        geb2.Ja(n);
        geb2.lM(bl);
        geb2.lO(bl2);
        this.MessageDelegator.F(geb2);
    }

    private void n(ldv ldv2, int n) {
        gdz gdz2 = (gdz)this.MessageDelegator.h(34827, this.GUID, ldv2);
        gdz2.Ja(n);
        this.MessageDelegator.F(gdz2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 34823: {
                this.b((gdx)dxq2);
                break;
            }
            case 34825: {
                this.b((gea)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(gdx gdx2) {
        Set<acl> set = this.bdS.get(gdx2.xc());
        if (set == null) {
            set = lcn.emx();
            this.bdS.put(gdx2.xc(), set);
        }
        acl acl2 = null;
        for (acl acl3 : set) {
            if (!acl3.a(gdx2)) continue;
            acl2 = acl3;
            break;
        }
        if (acl2 == null) {
            switch (gdx2.getType()) {
                case 1: {
                    acl2 = new acm(this.bdT++, gdx2.xc(), gdx2.aO(), gdx2.bUb());
                }
            }
            if (acl2 == null) {
                this.a(gdx2, -1, true, false);
                return;
            }
            set.add(acl2);
        }
        this.a(gdx2, acl2.getID(), false, acl2.yQ());
    }

    private void b(gea gea2) {
        Set<acl> set = this.bdS.get(gea2.xc());
        if (set == null) {
            set = lcn.emx();
            this.bdS.put(gea2.xc(), set);
        }
        acl acl2 = null;
        for (acl acl3 : set) {
            if (!acl3.a(gea2)) continue;
            acl2 = acl3;
            break;
        }
        if (acl2 == null) {
            this.a(gea2, -1, true, false);
            return;
        }
        if (acl2.yR()) {
            set.remove(acl2);
            if (set.isEmpty()) {
                this.bdS.remove(gea2.xc());
            }
            if (ldv.au(gea2.aO(), acl2.sV())) {
                this.a(gea2, acl2.getID(), false, true);
                return;
            }
            this.n(acl2.sV(), acl2.getID());
        }
        this.a(gea2, acl2.getID(), false, false);
    }
}

