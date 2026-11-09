/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Map;

public class jbs
extends hzk
implements hvx {
    private float bWF;
    private float bWG;
    private float aGr;
    private float bWk;
    private float bWs;
    private float bWt;

    public jbs() {
        super("playerstatus", "playerstatus.swf");
        this.OQ(jnz.nGC);
        if (lcw.qGm) {
            this.OQ(jnz.nGC | jnz.nGw);
        }
        this.a(hyb.lmF);
        this.a(hxy.llH);
    }

    public void initialize() {
        super.initialize();
        hso.cxK().cxP().cyZ().a((hvx)this);
    }

    public void cleanUp() {
        hso.cxK().cxP().cyZ().b((hvx)this);
        super.cleanUp();
    }

    protected void cBa() {
        this.dwP();
        this.cQg();
    }

    protected void cEa() {
        this.dwP();
    }

    protected void b(String string, mhk mhk2) {
        if (string.equals("setPlayerPos")) {
            return;
        }
        super.b(string, mhk2);
    }

    private void dwP() {
        float f = this.cEN().W / this.cEJ();
        this.N(f, f);
        this.cER();
        jbs.cxO().b(jbs.cFj().cxY());
    }

    private void r(ej ej2) {
        switch (ej2.getType()) {
            case 352: {
                this.aGr = ((et)ej2).fN();
                this.a("health", Float.valueOf(this.aGr));
                break;
            }
            case 354: {
                this.bWk = ((et)ej2).fN();
                this.a("healthMax", Float.valueOf(this.bWk));
                break;
            }
            case 400: {
                this.bWF = ((et)ej2).fN();
                this.a("stamina", Float.valueOf(this.bWF));
                break;
            }
            case 402: {
                this.bWG = ((et)ej2).fN();
                this.a("staminaMax", Float.valueOf(this.bWG));
                break;
            }
            case 384: {
                this.bWs = ((et)ej2).fN();
                this.a("mana", Float.valueOf(this.bWs));
                break;
            }
            case 386: {
                this.bWt = ((et)ej2).fN();
                this.a("manaMax", Float.valueOf(this.bWt));
                break;
            }
        }
    }

    private void cQg() {
        this.a("healthMax", Float.valueOf(this.bWk));
        this.a("staminaMax", Float.valueOf(this.bWG));
        this.a("manaMax", Float.valueOf(this.bWt));
        this.a("health", Float.valueOf(this.aGr));
        this.a("stamina", Float.valueOf(this.bWF));
        this.a("mana", Float.valueOf(this.bWs));
        Map map = hso.cxK().cxP().cyZ().cAg();
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            cxc cxc2 = ((hea)entry.getValue()).ceH();
            lhg lhg2 = (lhg)lea.enZ().acv(cxc2.zg());
            if (lhg2 == null) continue;
            this.a("setSelectedSkill", new Object[]{lhg2.atw().Name, ((cdy)((Object)entry.getKey())).cck});
        }
    }

    @Override
    public void a(bsh bsh2, cxc cxc2) {
        lgw lgw2;
        bsh bsh3 = hso.cxK().cxP().cyZ().cAc();
        lgw lgw3 = lgw2 = bsh3 != null ? (lgw)lea.enW().acv(bsh3.az()) : null;
        if (lgw2 != null) {
            this.a("weaponIconFile", lgw2.enm());
        } else {
            this.a("weaponIconFile", "");
        }
    }

    @Override
    public void czV() {
    }

    @Override
    public void q(ej ej2) {
        this.r(ej2);
    }
}

