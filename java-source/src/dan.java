/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class dan
extends czb {
    private int aYG = 0;
    private int gbh = 0;
    private float akO = 0.0f;
    private float Magnitude = 0.0f;
    private float Radius = 0.0f;

    public int CD() {
        return this.aYG;
    }

    public void fJ(int n2) {
        this.aYG = n2;
    }

    public int bis() {
        return this.gbh;
    }

    public void zu(int n2) {
        this.gbh = n2;
    }

    public float aCc() {
        return this.akO;
    }

    public void dy(float f2) {
        this.akO = f2;
    }

    public float uO() {
        return this.Magnitude;
    }

    public void N(float f2) {
        this.Magnitude = f2;
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f2) {
        this.Radius = f2;
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        dan dan2 = (dan)((Object)cxc2);
        dan2.fJ(this.aYG);
        dan2.zu(this.gbh);
        dan2.dy(this.akO);
        dan2.N(this.Magnitude);
        dan2.setRadius(this.Radius);
    }

    protected void beA() {
        assert (this.fGi != null);
        this.g(this.fGi);
    }

    private void g(ddc ddc2) {
        czj czj2 = (czj)((Object)this.emI.ht(ddc2.aYC));
        if (czj2 == null) {
            lfn.b(5, "SFFlameThrowerSkill", "sendFunctionFlameThrowerEffectMessage() Could not find parentskill '" + aqN.getName(ddc2.aYC) + "' of skill '" + this.getName() + "'");
            return;
        }
        assert (czj2.beo().dph != null);
        assert (czj2.beo().dpi != null);
        ljq ljq2 = czj2.beo().dph;
        lgl lgl2 = czj2.beo().dpi;
        ljq ljq3 = new ljq(0.0f, 0.0f, 1.0f);
        ljq ljq4 = lgl2.eq(ljq3);
        ljq4.normalize();
        fcz fcz2 = (fcz)this.MessageDelegator.h(9230, this.GUID, this.MessageDelegator.getGUID());
        fcz2.bst = this.getFunctionType();
        fcz2.aZG = this.emI.bgQ().getGUID();
        fcz2.akX = ddc2.akX;
        fcz2.aYF = fcz2.aZG;
        fcz2.bsG = this.emI.bgQ().az();
        fcz2.aYC = ddc2.aYC;
        fcz2.Magnitude = this.Magnitude;
        fcz2.eKm = 6.0;
        fcz2.aSp = 1.0f;
        fcz2.a(ddc2.dur);
        fcz2.iV(ddc2.dus);
        fcz2.aYH = ddc2.aYH;
        fcz2.aYG = this.aYG;
        fcz2.bsE = 0;
        fcz2.bRD = 1;
        fcz2.gpI = -3.0;
        fcz2.dup = ddc2.dup;
        fcz2.aZH = ddc2.aZH;
        fcz2.akO = this.akO;
        fcz2.Radius = this.Radius;
        fcz2.dsD = this.emI.bgQ().aAG().getGUID();
        fcz2.Position = ljq2;
        fcz2.mx = ljq4;
        fcz2.gfq = lgl2;
        fcz2.dta = new int[]{cug.fgE, cug.fnJ};
        fcz2.iJH = bkd.dqy;
        fcz2.gbh = this.gbh;
        this.MessageDelegator.H(fcz2);
    }
}

