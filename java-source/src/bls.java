/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class bls
extends bke {
    private fcw dtR = null;

    public bls() {
        this.dsy = bkd.a.dsp;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFPerformTrueDamageFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9227) {
            lfn.b(5, "SFPerformTrueDamageFO", "doFunction() FunctionMessage is not a SFFunctionEffectMessage.");
            lfn.b(5, "SFPerformTrueDamageFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dtR = (fcw)fdo2;
        amf amf2 = this.d(fdo2.akX);
        if (amf2 instanceof cbx) {
            cbx cbx2 = (cbx)amf2;
            cbx2.a(352, this.dtR.aYF, this.dtR.aYG, this.dtR.bsG, this.dtR.aYC, this.dtR.Magnitude);
            return;
        }
        lfn.b(5, "SFPerformTrueDamageFO", "doFunction() SourceObject " + fdo2.aZG + " was not found or its not a physical object!!");
        this.Vc();
    }
}

