/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 */
public class dsn
extends dqk {
    private a gYe = a.gYi;
    private float Radius = 10.0f;
    private ldv gYf;
    private boolean gYg = false;

    public dsn() {
        switch (this.gYe) {
            case gYi: {
                this.ObjectDescriptionFilename = "gizmos\\gizmo_arrows01.xml";
                break;
            }
            case gYj: {
                this.ObjectDescriptionFilename = "gizmos\\gizmo_clan_city_marker_01.xml";
            }
        }
        this.ObjectType = 106;
    }

    public void initialize() {
        super.initialize();
        this.bys();
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.gYg) {
            this.bys();
            this.gYg = false;
        }
    }

    protected void a(kuv kuv2) {
        super.a(kuv2);
        this.bys();
    }

    protected void a(kwp kwp2) {
        super.a(kwp2);
        this.bys();
    }

    public void bys() {
        if (this.gYf != null) {
            this.byt();
        }
        this.gYf = this.MessageDelegator.bzv();
        dqs dqs2 = new dqs();
        dqs2.setGUID(this.gYf);
        dqs2.By(1);
        dqs2.setScale(1.0f);
        dqs2.setWidth(0.0f);
        dqs2.hq(0.0f);
        dqs2.hr(0.0f);
        dqs2.setRadius(this.Radius);
        dqs2.hp(0.0f);
        dqs2.Bx(0);
        dqs2.Bw(0);
        dqs2.Bu(20);
        dqs2.Bv(20);
        dqs2.c(new ljq(this.Position));
        dqs2.a(new lgl(this.Rotation));
        this.MessageDelegator.a((amf)((Object)dqs2));
    }

    public void byt() {
        if (this.gYf != null) {
            this.MessageDelegator.hd(this.gYf);
            this.gYf = null;
        }
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f2) {
        this.Radius = f2;
        this.gYg = true;
    }

    public void cleanUp() {
        super.cleanUp();
        this.byt();
    }

    public void b(dqn dqn2) {
        super.b(dqn2);
        dsn dsn2 = (dsn)((Object)dqn2);
        dsn2.setRadius(this.Radius);
    }
}

