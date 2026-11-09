/*
 * Decompiled with CFR.
 */
public class dfr
extends dft {
    protected String fFC = null;
    protected ljp fFz = new ljp(1.0f, 1.0f);
    protected ljq fFA = new ljq(0.0f, 0.0f, 0.0f);
    protected ljp fFB = new ljp(0.0f, 0.0f);
    protected float eir = 0.0f;
    protected boolean fFD = false;
    protected boolean fFE = false;
    protected boolean fFF = false;
    protected lgs gpd = new lgs();
    protected lcq dMT = lcq.BRIGHT_WHITE;
    protected float fFy = 0.0f;
    protected boolean Visible = true;
    private int dcq = 0;

    dfr() {
        this.gnv = 15;
    }

    @Override
    protected void a(dey dey2) {
        super.a(dey2);
        dfr dfr2 = (dfr)dey2;
        dfr2.j(this.bmS());
        dfr2.b(this.bmP());
        dfr2.setColor(this.getColor());
        dfr2.gu(this.bmQ());
        dfr2.bS(this.bmR());
        dfr2.j(this.bmS());
        dfr2.setTextureName(this.getTextureName());
        dfr2.k(this.bmT());
        dfr2.hT(this.bmU());
        dfr2.hU(this.bmV());
        dfr2.hV(this.bmW());
        dfr2.setVisible(this.isVisible());
        dfr2.fb(this.bdV());
    }

    @Override
    public void setDefaultValues() {
        super.setDefaultValues();
        this.fFz = new ljp(1.0f, 1.0f);
        this.fFA = new ljq(0.0f, 0.0f, 0.0f);
        this.fFB = new ljp(0.0f, 0.0f);
        this.eir = 0.0f;
        this.fFD = false;
        this.fFE = false;
        this.fFF = false;
        this.gpd = new lgs();
        this.dMT = lcq.BRIGHT_WHITE;
        this.fFy = 0.0f;
        this.Visible = true;
    }

    @Override
    public void cleanUp() {
        if (!this.CleanedUp) {
            super.cleanUp();
            if (this.Initialized) {
                this.removeSprite();
            }
            this.CleanedUp = true;
        }
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.bmq();
            this.Initialized = true;
        }
    }

    private void bmq() {
        assert (this.MessageDelegator != null);
        kod kod2 = (kod)this.MessageDelegator.h(259);
        kod2.ZM(1);
        kod2.ts(this.GUID);
        kod2.hC(this.GUID);
        kod2.xr(this.bmU());
        kod2.p(this.bmP());
        kod2.setColor(this.getColor());
        kod2.jM(true);
        kod2.wC(false);
        kod2.g(this.bmT());
        kod2.wD(false);
        kod2.gu(this.bmQ());
        kod2.bS(this.bmR());
        kod2.gk(this.bdV());
        kod2.setVisible(this.isVisible());
        kod2.j(this.bmS());
        kod2.setTextureName(this.getTextureName());
        kod2.hU(this.bmV());
        kod2.hV(this.bmW());
        this.MessageDelegator.a(kod2);
        this.dcq = 0;
    }

    private void updateObject() {
        if (this.dcq == 0) {
            return;
        }
        assert (this.MessageDelegator != null);
        kod kod2 = (kod)this.MessageDelegator.h(259);
        kod2.ZM(this.dcq);
        kod2.ts(this.GUID);
        kod2.hC(this.GUID);
        kod2.xr(this.bmU());
        kod2.p(this.bmP());
        kod2.setColor(this.getColor());
        kod2.jM(true);
        kod2.wC(false);
        kod2.g(this.bmT());
        kod2.wD(false);
        kod2.gu(this.bmQ());
        kod2.bS(this.bmR());
        kod2.gk(this.bdV());
        kod2.setVisible(this.isVisible());
        kod2.j(this.bmS());
        kod2.setTextureName(this.getTextureName());
        kod2.hU(this.bmV());
        kod2.hV(this.bmW());
        this.MessageDelegator.a(kod2);
        this.dcq = 0;
    }

    private void removeSprite() {
        kod kod2 = (kod)this.MessageDelegator.h(259);
        kod2.ZM(2);
        kod2.ts(this.GUID);
        kod2.hC(this.GUID);
        kod2.jM(false);
        kod2.wC(false);
        kod2.wD(false);
        this.MessageDelegator.a(kod2);
        this.dcq = 0;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.updateObject();
    }

    public lgs bmP() {
        return this.gpd;
    }

    public void b(lgs lgs2) {
        this.gpd = lgs2;
        this.dcq |= 0x800;
    }

    public lcq getColor() {
        return this.dMT;
    }

    public void setColor(lcq lcq2) {
        this.dMT = lcq2;
        this.dcq |= 0x1000;
    }

    public float bmQ() {
        return this.eir;
    }

    public void gu(float f2) {
        this.eir = f2;
        this.dcq |= 0x20;
    }

    public ljq bmR() {
        return this.fFA;
    }

    public void bS(ljq ljq2) {
        this.fFA = ljq2;
        this.dcq |= 0x40;
    }

    public ljp bmS() {
        return this.fFz;
    }

    public void j(ljp ljp2) {
        this.fFz = ljp2;
        this.dcq |= 8;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
        this.dcq |= 0x100;
    }

    public ljp bmT() {
        return this.fFB;
    }

    public void k(ljp ljp2) {
        this.fFB = ljp2;
        this.dcq |= 0x80;
    }

    public boolean bmU() {
        return this.fFF;
    }

    public void hT(boolean bl) {
        this.fFF = bl;
        this.dcq |= 0x400;
    }

    public boolean bmV() {
        return this.fFE;
    }

    public void hU(boolean bl) {
        this.fFE = bl;
        this.dcq |= 0x10;
    }

    public boolean bmW() {
        return this.fFD;
    }

    public void hV(boolean bl) {
        this.fFD = bl;
        this.dcq |= 4;
    }

    public boolean isVisible() {
        return this.Visible;
    }

    public void setVisible(boolean bl) {
        this.Visible = bl;
        this.dcq |= 0x200;
    }

    public float bdV() {
        return this.fFy;
    }

    public void fb(float f2) {
        this.fFy = f2;
        this.dcq |= 0x2000;
    }
}

