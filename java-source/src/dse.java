/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcw
 */
public class dse
extends dqk {
    private float gOU = 100.0f;
    private dsn ou;

    public dse() {
        this.ObjectType = 120;
    }

    public void initialize() {
        jrw jrw2 = new jrw(lcw.qLb + "xml/" + this.ObjectDescriptionFilename);
        jxa jxa2 = new jxa();
        String string = jxa2.y(jrw2);
        assert (string != null) : "ResourceName is null for GuardTower = " + this.ObjectDescriptionFilename;
        int n = lea.enW().getType(string);
        assert (n > 0) : "ResourceName [" + string + "] is invalid for GuardTower = " + this.ObjectDescriptionFilename;
        lfn.b(0, ((Object)((Object)this)).getClass().getSimpleName(), "initialize() : ResourceName = " + string + ", ResType = " + n);
        asb asb2 = lea.eoR().get(n);
        assert (asb2 != null) : "SFAIGuardTowerInfo is null for GuardTower = " + this.ObjectDescriptionFilename;
        this.gOU = asb2.getRadius();
        super.initialize();
        if (mje.DCf) {
            this.btv();
        }
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (mje.DCf) {
            if (this.ou != null) {
                return;
            }
            this.btv();
        } else {
            if (this.ou == null) {
                return;
            }
            this.btu();
        }
    }

    private void btu() {
        if (this.ou == null) {
            return;
        }
        this.MessageDelegator.hd(this.ou.getGUID());
        this.ou = null;
    }

    private void btv() {
        if (this.ou != null) {
            return;
        }
        this.ou = new dsn();
        this.ou.setGUID(this.MessageDelegator.bzv());
        this.ou.c(this.Position);
        this.ou.setObjectType(22);
        this.ou.setRadius(this.gOU);
        this.ou.d(new ljq());
        this.MessageDelegator.a((amf)((Object)this.ou));
    }

    public void c(ljq ljq2) {
        super.c(ljq2);
        if (this.ou != null) {
            this.ou.c(this.Position);
            this.ou.iN(true);
        }
    }

    public void cleanUp() {
        super.cleanUp();
        this.btu();
    }
}

