/*
 * Decompiled with CFR.
 */
public class jcq
extends ipx {
    private ipb lBW;
    private hvr lgb;

    public jcq() {
        this.a(irl.dnr());
        this.W(new ipb("/dfdata/texture/gui/j2f/quests/media_player/button_narration_audio_normal.png"));
        this.lBW = new ipb("/dfdata/texture/gui/j2f/quests/media_player/button_narration_audio_glow.png");
        this.W(this.lBW);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.dxY();
    }

    @Override
    public void cCy() {
        super.cCy();
        this.dxX();
    }

    @Override
    public void dkq() {
        super.dkq();
        if (this.djM()) {
            this.dxX();
        } else {
            this.dxY();
        }
    }

    private void dxX() {
        if (this.lgb == null) {
            this.lgb = new hvl(this, 0.0f, 1.0f, 1.0){
                final /* synthetic */ jcq mRM;
                {
                    this.mRM = jcq2;
                    super(f, f2, d2);
                }

                public void hz(float f) {
                    jcq.a(this.mRM).hz(f);
                }
            };
            hso.cxK().cxP().czy().a(this.lgb);
        }
    }

    private void dxY() {
        if (this.lgb != null) {
            hso.cxK().cxP().czy().b(this.lgb);
            this.lgb = null;
        }
    }

    static /* synthetic */ ipb a(jcq jcq2) {
        return jcq2.lBW;
    }
}

