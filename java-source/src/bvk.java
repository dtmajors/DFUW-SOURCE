/*
 * Decompiled with CFR.
 */
public class bvk
extends btk
implements bto {
    private final double dTl;
    private double dTm;
    private ldv dTn;
    private ldv dTo;
    private String aFo;
    public static String dTp = "";

    public bvk(String string, double d2) {
        this.aFo = string;
        this.dTl = d2;
    }

    @Override
    public void initialize() {
        this.dTm = this.MessageDelegator.arc().rgz;
        kod kod2 = (kod)this.MessageDelegator.h(259);
        kod2.ZM(1);
        kod2.ts(this.GUID);
        kod2.hC(this.GUID);
        kod2.xr(false);
        kod2.p(new lgs(0, 0, 50, 50));
        kod2.setColor(new lcq(1.0f, 0.0f, 0.0f));
        kod2.jM(true);
        kod2.wC(false);
        kod2.g(new ljp(2.0f, 70.0f));
        kod2.wD(false);
        kod2.gu(0.0f);
        kod2.bS(new ljq());
        kod2.gk(0.0f);
        kod2.setVisible(true);
        kod2.j(new ljp(4.0f, 4.0f));
        kod2.setTextureName("white_sprite.dds");
        kod2.hU(false);
        kod2.hV(true);
        this.MessageDelegator.a(kod2);
        ljp ljp2 = new ljp(30.0f, 70.0f);
        this.dTn = this.MessageDelegator.bzv();
        cwu cwu2 = new cwu();
        cwu2.setGUID(this.dTn);
        cwu2.setColor(lcq.BRIGHT_WHITE);
        cwu2.ma(mje.DAW);
        cwu2.io(this.aFo);
        cwu2.h(new ljp(1024.0f, 50.0f));
        cwu2.g(ljp2);
        cwu2.xf(1);
        cwu2.setVisible(true);
        cwu2.fb(10.0f);
        this.MessageDelegator.a(cwu2);
        if (!dTp.isEmpty()) {
            ljp2 = new ljp(2.0f, 130.0f);
            this.dTo = this.MessageDelegator.bzv();
            cwu2 = new cwu();
            cwu2.setGUID(this.dTo);
            cwu2.setColor(lcq.BRIGHT_WHITE);
            cwu2.ma(mje.DAW);
            cwu2.io(dTp);
            cwu2.h(new ljp(1024.0f, 50.0f));
            cwu2.g(ljp2);
            cwu2.xf(1);
            cwu2.setVisible(true);
            cwu2.fb(10.0f);
            this.MessageDelegator.a(cwu2);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (ldz2.rgz > this.dTm + this.dTl) {
            this.MessageDelegator.hd(this.GUID);
        }
    }

    @Override
    public void cleanUp() {
        kod kod2 = (kod)this.MessageDelegator.h(259);
        kod2.ZM(2);
        kod2.ts(this.GUID);
        kod2.hC(this.GUID);
        kod2.jM(false);
        kod2.wC(false);
        kod2.wD(false);
        this.MessageDelegator.a(kod2);
        this.MessageDelegator.hd(this.dTn);
        if (this.dTo != null) {
            this.MessageDelegator.hd(this.dTo);
        }
    }
}

