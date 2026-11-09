/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cex
 *  cxd
 *  ep
 */
import java.util.Map;

public class ccw {
    private static final double emj = 1.0;
    private static final float emk = -1.0f;
    private static final float eml = 3.0f;
    private static final float emm = -10.0f;
    private final cdb aeg;
    private Map<Integer, a> emn = lcn.emw();
    private boolean emo = true;
    private double Ec = 0.0;

    public ccw(cdb cdb2) {
        assert (cdb2.isServerObject());
        this.aeg = cdb2;
    }

    public boolean aJn() {
        return this.emo;
    }

    public void fC(boolean bl) {
        this.emo = bl;
    }

    public void doTick(ldz ldz2) {
        if (ldz2.rgz > this.Ec) {
            this.Ec += 1.0;
            if (!this.aeg.aIs()) {
                return;
            }
            if (ctg.feN && this.emo) {
                this.aJp();
            }
        }
    }

    public boolean oS(int n) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeRegenerationManager", "isRegenerationActive() AttributeType is invalid.");
            return false;
        }
        a a2 = this.emn.get(n);
        if (a2 == null) {
            lfn.b(5, "SFAttributeRegenerationManager", "isRegenerationActive() Attribute '" + ep.aM((int)n) + "' is not registered.");
            return false;
        }
        return a2.Active;
    }

    public void aC(int n, int n2) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeRegenerationManager", "registerAttribute() AttributeType is invalid.");
            return;
        }
        if (n2 <= 0) {
            lfn.b(5, "SFAttributeRegenerationManager", "registerAttribute() RateAttributeType is invalid.");
            return;
        }
        if (!ep.aR((int)n)) {
            lfn.b(5, "SFAttributeRegenerationManager", "registerAttribute() Attribute '" + ep.aM((int)n) + "' has no related types.");
            return;
        }
        if (this.emn.containsKey(n)) {
            lfn.b(5, "SFAttributeRegenerationManager", "registerAttribute() Attribute '" + ep.aM((int)n) + "' is already registered.");
            return;
        }
        ez ez2 = (ez)this.aeg.fi().ah(n);
        if (ez2 == null) {
            lfn.b(5, "SFAttributeRegenerationManager", "registerAttribute() CreatureObject " + this.aeg.getGUID() + " does not contain attribute '" + ep.aM((int)n) + "'");
            return;
        }
        et et2 = this.aeg.fi().ah(n2);
        if (et2 == null) {
            lfn.b(5, "SFAttributeRegenerationManager", "registerAttribute() CreatureObject " + this.aeg.getGUID() + " does not contain attribute '" + ep.aM((int)n2) + "'");
            return;
        }
        c c2 = new c(this);
        c2.emp = ez2;
        c2.emu = et2;
        this.emn.put(ez2.getType(), c2);
    }

    public void aJo() {
        int n = 1504;
        assert (ep.aR((int)n));
        if (this.emn.containsKey(n)) {
            lfn.b(5, "SFAttributeRegenerationManager", "registerBreathAttribute() Attribute '" + ep.aM((int)n) + "' is already registered.");
            return;
        }
        ez ez2 = (ez)this.aeg.fi().ah(n);
        if (ez2 == null) {
            String string = ep.aM((int)n);
            lfn.b(5, "SFAttributeRegenerationManager", "registerBreathAttribute() CreatureObject " + this.aeg.getGUID() + " does not contain attribute '" + string + "'");
            return;
        }
        b b2 = new b(this);
        b2.emp = ez2;
        b2.emr = -1.0f;
        b2.ems = 3.0f;
        this.emn.put(ez2.getType(), b2);
    }

    public void b(int n, boolean bl, String string) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeRegenerationManager", "setRegenerationActive() AttributeType is invalid.");
            return;
        }
        a a2 = this.emn.get(n);
        if (a2 == null) {
            lfn.b(5, "SFAttributeRegenerationManager", "setRegenerationActive() Attribute '" + ep.aM((int)n) + "' is not registered.");
            return;
        }
        a2.b(bl, string);
    }

    public void bl(double d2) {
        this.Ec = d2;
    }

    public void oT(int n) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeRegenerationManager", "unregisterAttribute() AttributeType is invalid.");
            return;
        }
        a a2 = this.emn.remove(n);
        if (a2 == null) {
            lfn.b(5, "SFAttributeRegenerationManager", "unregisterAttribute() Attribute '" + ep.aM((int)n) + "'");
            return;
        }
    }

    public void q(int n, float f2) {
        if (n <= 0) {
            lfn.b(5, "SFAttributeRegenerationManager", "updateRegenerationRate() AttributeType is invalid.");
            return;
        }
        if (f2 < 0.0f) {
            lfn.b(5, "SFAttributeRegenerationManager", "updateRegenerationRate() RegenerationRate is invalid.");
            return;
        }
        c c2 = (c)this.emn.get(n);
        if (c2 == null) {
            lfn.b(5, "SFAttributeRegenerationManager", "updateRegenerationRate() Attribute '" + ep.aM((int)n) + "' is not registered.");
            return;
        }
        c2.dJa = f2;
    }

    private void a(b b2) {
        if (this.aeg.aJD().aEP().aEE()) {
            if (b2.emt) {
                if (this.aeg.UB()) {
                    ((cex)this.aeg).jk().yZ(cxd.fJP);
                }
            } else {
                b2.emt = true;
            }
            if (b2.aJr()) {
                int n = 352;
                int n2 = bfk.dgz;
                int n3 = cxd.fHJ;
                this.aeg.a(n, n2, this.aeg.az(), n3, -10.0f, null);
                return;
            }
            float f2 = b2.emr;
            b2.emp.n(f2);
        } else {
            b2.emt = false;
            if (b2.fV()) {
                return;
            }
            float f3 = b2.ems;
            b2.emp.n(f3);
        }
    }

    private void a(c c2) {
        if (c2.fV()) {
            return;
        }
        float f2 = c2.aww();
        if (f2 == 0.0f) {
            return;
        }
        c2.emp.n(f2);
    }

    private void aJp() {
        if (this.emn.isEmpty()) {
            return;
        }
        for (a a2 : this.emn.values()) {
            if (!a2.Active) continue;
            if (a2 instanceof b) {
                this.a((b)a2);
                continue;
            }
            if (!(a2 instanceof c)) continue;
            this.a((c)a2);
        }
    }
}

