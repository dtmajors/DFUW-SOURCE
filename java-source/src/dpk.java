/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class dpk {
    public static final int gMy = 20;
    public static final int gMz = 10;
    public static final int gMA = 50;
    public static final int gMB = 0;
    public static final int gMC = 100000000;
    public static final double gMD = 0.05;
    public static final double gME = 0.02;
    private static Set<String> gMF = lcn.emx();

    public static final long X(long l2) {
        return Math.round((double)l2 * 0.05);
    }

    public static final long Y(long l2) {
        return Math.round((double)l2 * 0.02);
    }

    public static boolean iU(String string) {
        return string == null ? false : gMF.contains(string.toLowerCase());
    }

    static {
        gMF.add("q11_idawoll_acolyte");
        gMF.add("p09_gulgrumir_acolyte");
        gMF.add("p10_cor_ymirhal_acolyte");
        gMF.add("p11_maghnir_acolyte");
        gMF.add("u19_sandbrook_acolyte");
        gMF.add("t18_monkfield_acolyte");
        gMF.add("v18_heart_of_eanna_acolyte");
        gMF.add("u18_sanguine_acolyte");
        gMF.add("l14_whiteclaw_acolyte");
        gMF.add("k14_amurran_acolyte");
        gMF.add("j15_urranyr_acolyte");
        gMF.add("k13_lyran_acolyte");
        gMF.add("u14_firun_acolyte");
        gMF.add("t13_okrim_acolyte");
        gMF.add("v13_nerzok_acolyte");
        gMF.add("u13_flaming_skull_acolyte");
        gMF.add("u13_flaming_skull_fistofthelaw");
        gMF.add("v13_quest_ork_shaman");
        gMF.add("p09_gulgrumir_acolyte");
        gMF.add("p10_quest_ork_emissary");
        gMF.add("k14_quest_ork_emissary");
        gMF.add("u18_quest_ork_emissary");
        gMF.add("u19_quest_captain");
        gMF.add("o08_quest_tovar_miner");
    }
}

