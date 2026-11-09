/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 */
public class dsl
extends dqk {
    private String gXY;
    private dsn ou;
    private float gXZ = 100.0f;
    private boolean gYa;

    public dsl() {
        this.ObjectType = 53;
        this.ObjectDescriptionFilename = "gizmos\\gizmo_spawnpoint_01.xml";
    }

    public void initialize() {
        super.initialize();
        if (mje.DCf) {
            this.btv();
        }
    }

    public String byn() {
        return this.gXY;
    }

    public void jr(String string) {
        this.gXY = string;
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (mje.DCf) {
            if (this.ou != null) {
                if (this.gYa) {
                    this.btu();
                    this.btv();
                    this.gYa = false;
                }
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

    public void byo() {
        this.gYa = true;
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
        this.ou.setRadius(this.gXZ);
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

    public float byp() {
        return this.gXZ;
    }

    public void it(float f2) {
        this.gXZ = f2;
    }
}

