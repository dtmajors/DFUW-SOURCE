/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ibp
 */
import java.util.Collection;

public class icg
extends ibj {
    public icg(ibp ibp2, joa joa2) {
        super("ChatEmoteSelectionWindow", "ChatWindow.swf", (ioa)ibp2, joa2, lvw.tbh, "/dfdata/texture/gui/j2f/chat/popups/window_popup_bg_emotes.png", 40, 25, 132, 140, 112);
    }

    @Override
    public void cCu() {
        super.cCu();
        this.RA(76);
        this.PG(0);
        this.PH(2);
        Collection<ldj> collection = lea.eoE().values();
        this.cMt().W(ipx.a(1, 8, new ipf[0]));
        for (ldj ldj2 : collection) {
            if (this.dhC() instanceof ibp) {
                ibp ibp2 = (ibp)this.dhC();
                if (ldj2.bdP && !jid.dHb().UK(ldj2.aWe)) continue;
            }
            this.cMt().W(ipx.a(1, 1, new ipf[0]));
            this.cMt().W(ipx.c(new ipf[]{new ich(this, ldj2){
                final /* synthetic */ icg lHf;
                {
                    this.lHf = icg2;
                    super(ldj2);
                }

                public void b(ldj ldj2) {
                    this.lHf.close();
                    this.lHf.b(ldj2);
                }
            }}));
        }
    }

    public void b(ldj ldj2) {
    }

    public void e(ldj ldj2) {
        this.cMt().W(ipx.a(1, 1, new ipf[0]));
        this.cMt().W(ipx.c(new ipf[]{new ich(this, ldj2){
            final /* synthetic */ icg lHf;
            {
                this.lHf = icg2;
                super(ldj2);
            }

            public void b(ldj ldj2) {
                this.lHf.close();
                this.lHf.b(ldj2);
            }
        }}));
    }

    @Override
    public void cGR() {
        ((ibp)this.dhC()).cMZ();
        super.cGR();
    }
}

