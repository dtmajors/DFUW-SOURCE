/*
 * Decompiled with CFR.
 */
public class ieh
extends inz {
    private static final int lNj = 24;
    private int lNk;

    public ieh(ioa ioa2, joa joa2, int n) {
        super("ClanPerkDurationSelectionPopupWindow", "J2FWindow.swf", ioa2, joa2, 0, 2);
        this.lNk = n;
        this.a(iod.moE);
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(irl.dnr());
        this.dhJ().W(new ipb("/dfdata/texture/gui/j2f/clanperks/perk_duration_popup_bg.png"));
        this.dhJ().W(ipx.c(8, 8, 8, 8, this.cGU()));
    }

    protected void Qd(int n) {
    }

    private ipf cGU() {
        ipx ipx2 = ipx.j(new ipf[0]);
        int n = 0;
        int n2 = 1;
        while (n2 <= 24) {
            ipx ipx3 = ipx.l(new ipf[0]);
            ipx2.W(ipx3);
            int n3 = 0;
            while (n3 < 4) {
                ipx3.W(ipx.a(24, 24, ipx.d(this.Qe(n2))));
                if (n3 < 3) {
                    ipx3.W(ipx.c(new ipf[0]));
                }
                ++n3;
                ++n2;
            }
            if (n < 5) {
                ipx2.W(ipx.c(new ipf[0]));
            }
            ++n;
        }
        return ipx2;
    }

    private ipf Qe(int n) {
        return new iow(this, null, new ist(isf.mwO, 15, 0x313131, "" + n), null, new ist(isf.mwO, 15, 0xABABAB, "" + n), null, new ist(isf.mwO, 15, 0xC0C0C0, "" + n), null, new ist(isf.mwO, 13, 0xC0C0C0, "" + n), n){
            final /* synthetic */ int lNl;
            final /* synthetic */ ieh lNm;
            {
                this.lNm = ieh2;
                this.lNl = n;
                super(ipf2, ist2, ipf3, ist3, ipf4, ist4, ipf5, ist5);
            }

            public void cLq() {
                ieh.a(this.lNm);
                this.lNm.Qd(this.lNl);
            }
        };
    }

    static /* synthetic */ void a(ieh ieh2) {
        ieh2.cGR();
    }
}

