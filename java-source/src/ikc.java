/*
 * Decompiled with CFR.
 */
public enum ikc {
    mfj("button_em_crosshair", lyu.tJZ),
    mfk("button_em_target_information", lyu.tKa),
    mfl("button_em_bars", lyu.tKb),
    mfm("button_em_use_prompt", lyu.tKc),
    mfn("button_em_floating_combat_text", lyu.tKd),
    mfo("button_em_advisory_prompt", lyu.tKe),
    mfp("button_em_notifications", lyu.tKf),
    mfq("button_em_notifications", lyu.tKg);

    private String mfr;
    private lox lne = null;

    private ikc(String string2, lox lox2) {
        this.mfr = string2;
        this.lne = lox2;
    }

    public String dbY() {
        return this.mfr;
    }

    public String getToolTipText() {
        return this.lne == null ? "" : this.lne.bD(new Object[0]).exA();
    }
}

