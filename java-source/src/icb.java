/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ibp
 */
public class icb
extends ibj {
    public icb(ibp ibp2, joa joa2) {
        super("ChatChannelSelectionWindow", "ChatWindow.swf", (ioa)ibp2, joa2, lvw.tbf, "/dfdata/texture/gui/j2f/chat/popups/window_popup_bg_channel.png", 70, 25, 132, 137, 113);
    }

    @Override
    public void cCu() {
        super.cCu();
        this.PG(4);
        this.PH(2);
        this.cMt().W(ipx.a(1, 4, new ipf[0]));
        for (ibu ibu2 : ibv.cNA()) {
            if (!ibu2.cNv() || ibu2.cNw() == null || !ibu2.cNz()) continue;
            ica ica2 = new ica(this, ibu2){
                final /* synthetic */ icb lGS;
                {
                    this.lGS = icb2;
                    super(ibu2);
                }

                public void c(ibu ibu2) {
                    this.lGS.close();
                    this.lGS.c(ibu2);
                }
            };
            this.cMt().W(ipx.c(new ipf[]{ica2}));
        }
    }

    public void c(ibu ibu2) {
    }
}

