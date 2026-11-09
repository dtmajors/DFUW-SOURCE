/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Dimension;

public class mnt
extends mnq {
    private static final Color DQM = Color.ORANGE;
    private static final Color DQN = Color.RED;
    private static final Color DQO = Color.BLUE;
    private static final Color DQP = Color.BLUE;
    private static final int DQQ = 14;
    private static final int DQR = 20;
    private static final int[] DQS = new int[]{0, 14, 7};
    private static final int[] DQT = new int[]{0, 0, 14};
    private static final int[] DQU = new int[]{0, 20, 10};
    private static final int[] DQV = new int[]{20, 20, 0};
    private axs DQW = null;

    public ayb afx() {
        return ayb.getValueByOrdinal(this.DQW.YJ());
    }

    public String afw() {
        return this.DQW.getID();
    }

    @Override
    public Color eHc() {
        switch (this.DQW == null ? ayb.cvi : ayb.getValueByOrdinal(this.DQW.YJ())) {
            case cvk: {
                return Color.BLACK;
            }
        }
        return Color.WHITE;
    }

    public mnt(axs axs2, boolean bl, boolean bl2, Dimension dimension) {
        super(mnx.DRh, mnt.e(axs2), mnt.f(axs2), mnt.g(axs2), mnt.h(axs2), mnt.i(axs2), bl2, dimension);
        if (bl) {
            this.e(mnt.j(axs2));
        }
        this.DQW = axs2;
    }

    @Override
    public String[] eHf() {
        if (!this.DQA || this.DQW == null) {
            return null;
        }
        if (this.DPD == null) {
            this.DPD = new String[2];
            this.DPD[0] = this.DQW.getID();
            ayb ayb2 = ayb.getValueByOrdinal(this.DQW.YJ());
            switch (ayb2) {
                case cvj: {
                    this.DPD[1] = "Clan-City";
                    break;
                }
                case cvk: {
                    this.DPD[1] = "Clan-Hamlet";
                    break;
                }
                default: {
                    this.DPD[1] = "Unknown Type!!!";
                }
            }
        }
        return this.DPD;
    }

    private static String e(axs axs2) {
        return axs2 == null ? null : axs2.YH();
    }

    private static ljq f(axs axs2) {
        return axs2 == null ? null : axs2.Xv();
    }

    private static int[] g(axs axs2) {
        switch (axs2 == null ? ayb.cvi : ayb.getValueByOrdinal(axs2.YJ())) {
            case cvk: {
                return DQS;
            }
            case cvj: {
                return DQU;
            }
        }
        return null;
    }

    private static int[] h(axs axs2) {
        switch (axs2 == null ? ayb.cvi : ayb.getValueByOrdinal(axs2.YJ())) {
            case cvk: {
                return DQT;
            }
            case cvj: {
                return DQV;
            }
        }
        return null;
    }

    private static Color i(axs axs2) {
        switch (axs2 == null ? ayb.cvi : ayb.getValueByOrdinal(axs2.YJ())) {
            case cvk: {
                return DQM;
            }
            case cvj: {
                return DQN;
            }
        }
        return null;
    }

    private static Color j(axs axs2) {
        switch (axs2 == null ? ayb.cvi : ayb.getValueByOrdinal(axs2.YJ())) {
            case cvk: {
                return DQO;
            }
            case cvj: {
                return DQP;
            }
        }
        return null;
    }
}

