/*
 * Decompiled with CFR.
 */
public class gb
extends fz {
    public ljq Position;

    public gb(ljq ljq2, float f) {
        super(f);
        this.Position = ljq2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.M(this.Position);
    }

    public final void N(ljq ljq2) {
        if (this.Ud == null) {
            lfn.b(5, "SFEngineAOI", "modifyStaticPosition(): " + this.getGUID() + ": No sensor GUID");
            return;
        }
        if (this.Position == null) {
            lfn.b(5, "SFEngineAOI", "modifyStaticPosition(): " + this.getGUID() + ": Current position == null");
            return;
        }
        if (ljq2 == null) {
            lfn.b(5, "SFEngineAOI", "modifyStaticPosition(): " + this.getGUID() + ": New position == null");
            return;
        }
        if (this.Position.ew(ljq2)) {
            return;
        }
        this.Position = ljq2;
        kpd kpd2 = (kpd)this.MessageDelegator.h(541);
        kpd2.ts(this.GUID);
        kpd2.jM(false);
        kpd2.wD(false);
        kpd2.lQ(false);
        kpd2.xt(false);
        kpd2.sy(this.Ud);
        kpd2.xt(true);
        kpd2.pUf = this.Position;
        this.MessageDelegator.a(kpd2);
    }
}

