/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ibp
 */
public class icd
extends ibj {
    public icd(ibp ibp2, joa joa2) {
        super("ChatCommandSelectionWindow", "ChatWindow.swf", (ioa)ibp2, joa2, lvw.tbg, "/dfdata/texture/gui/j2f/chat/popups/window_popup_bg_commands.png", 40, 25, 223, 120, 90);
    }

    @Override
    public void cCu() {
        super.cCu();
        this.cXC().QU(0);
        this.cXC().QT(10);
        this.PH(-15);
        int n = 0;
        for (icc icc2 : icc.values()) {
            if (icc2.cNE().ordinal() > icd.cxP().cyZ().cAv()) continue;
            if (n > 0) {
                this.cMt().W(ipx.a(1, 4, new ipf[0]));
                this.cMt().W(new iwx());
                this.cMt().W(ipx.a(1, 4, new ipf[0]));
            }
            this.cMt().W(ipx.c(new ipf[]{new izx(icc2.cNq().bD(new Object[0]).exA() + ":")}));
            for (jmy jmy2 : icc2.cNF()) {
                this.cMt().W(ipx.c(new ipf[]{new ice(this, jmy2){
                    final /* synthetic */ icd lHc;
                    {
                        this.lHc = icd2;
                        super(jmy2);
                    }

                    public void c(jmy jmy2) {
                        this.lHc.close();
                        this.lHc.c(jmy2);
                    }
                }}));
            }
            ++n;
        }
    }

    @Override
    public ipx cNG() {
        return ipx.a(45, 1, new ipf[0]);
    }

    public void c(jmy jmy2) {
    }
}

