/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.List;

public class cg {
    public static final int gg = 6;
    public static final int gh = 0;
    public static final int gi = 1;
    public static final int gj = 2;
    public static final int gk = 3;
    public static final int gl = 4;
    public static final int gm = 5;
    public static final int gn = 6;
    public static final int go = 0;
    public static final int gp = 1;
    public static final int gq = 2;
    public static final int gr = 10;
    public static final int gs = -10;
    public static final int gt = 0;
    public static final int gu = 0;
    public static final int gv = -1;
    public static final String gw = "Neutral";
    public static final String gx = "Good";
    public static final String gy = "Evil";
    public static final ljq gz = new ljq(Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);
    public static final boolean gA = false;
    public static final float gB = 0.1f;
    public static final float gC = 2.0f;
    public static final float gD = 4.0f;
    public static final float gE = 10.0f;
    public static final float gF = 3.5f;
    public static final float gG = 10.0f;
    public static final float gH = 1.0f;
    public static final float gI = 3.5f;
    public static final float gJ = 100.0f;
    public static final float gK = 1000.0f;
    public static final float gL = 20.0f;
    public static final int gM = 1000;
    public static final int gN = 1000;
    public static final float gO = 1.0f;
    public static final float gP = 0.05f;
    public static final float gQ = 0.05f;
    public static final float gR = 0.5f;
    private static List<String> gS = null;
    private static List<String> gT = null;
    public static String[] gU = new String[]{null, "slider_shaft_color_skin_alfar.bmp", "slider_shaft_color_skin_dwarf.bmp", "slider_shaft_color_skin_human.bmp", "slider_shaft_color_skin_mahirim.bmp", "slider_shaft_color_skin_mirdain.bmp", "slider_shaft_color_skin_ork.bmp"};
    public static String[] gV = new String[]{null, "slider_shaft_color_hair_alfar.bmp", "slider_shaft_color_hair_dwarf.bmp", "slider_shaft_color_hair_human.bmp", "slider_shaft_color_hair_mahirim.bmp", "slider_shaft_color_hair_mirdain.bmp", "slider_shaft_color_hair_ork.bmp"};
    public static int gW = 4000;

    public static int z(String string) {
        if (string == null || string.trim().equals("")) {
            return 0;
        }
        if (c.hk.hq.contains(string.toLowerCase())) {
            return 1;
        }
        if (c.hl.hq.contains(string.toLowerCase())) {
            return 2;
        }
        if (c.hm.hq.contains(string.toLowerCase())) {
            return 3;
        }
        if (c.hn.hq.contains(string.toLowerCase())) {
            return 4;
        }
        if (c.ho.hq.contains(string.toLowerCase())) {
            return 5;
        }
        if (c.hp.hq.contains(string.toLowerCase())) {
            return 6;
        }
        return 0;
    }

    public static int A(String string) {
        if (string.equalsIgnoreCase("human")) {
            return 3;
        }
        if (string.equalsIgnoreCase("dwarf")) {
            return 2;
        }
        if (string.equalsIgnoreCase("mirdain")) {
            return 5;
        }
        if (string.equalsIgnoreCase("alfar")) {
            return 1;
        }
        if (string.equalsIgnoreCase("ork")) {
            return 6;
        }
        if (string.equalsIgnoreCase("mahirim")) {
            return 4;
        }
        assert (false) : "Unknown Race!";
        return 0;
    }

    public static int B(String string) {
        if (string == null || string.trim().equals("")) {
            return 0;
        }
        if (a.gY.ha.contains(string.toLowerCase())) {
            return 1;
        }
        if (a.gZ.ha.contains(string.toLowerCase())) {
            return 2;
        }
        return 0;
    }

    public static boolean m(int n) {
        return n == 3 || n == 1 || n == 2 || n == 4 || n == 5 || n == 6;
    }

    public static String n(int n) {
        switch (n) {
            case 0: {
                return "Unknown Race";
            }
            case 3: {
                return "Human";
            }
            case 2: {
                return "Dwarf";
            }
            case 5: {
                return "Mirdain";
            }
            case 1: {
                return "Alfar";
            }
            case 6: {
                return "Ork";
            }
            case 4: {
                return "Mahirim";
            }
        }
        return null;
    }

    public static String c(String string, String string2) {
        return string + " " + string2;
    }

    public static List<String> aB() {
        if (gS == null) {
            gS = lcn.emv();
            gS.add(cg.n(3));
            gS.add(cg.n(6));
            gS.add(cg.n(2));
            gS.add(cg.n(4));
            gS.add(cg.n(5));
            gS.add(cg.n(1));
        }
        return gS;
    }

    public static List<String> aC() {
        if (gT == null) {
            gT = lcn.emv();
            gT.add(gy);
            gT.add(gx);
        }
        return gT;
    }

    public static int C(String string) {
        if (string.equals(gy)) {
            return -1;
        }
        return 1;
    }

    public static String o(int n) {
        if (n >= 0) {
            return gx;
        }
        return gy;
    }

    public static boolean p(int n) {
        return n < 0;
    }

    public static int[] aD() {
        return new int[]{2, 3, 5, 1, 6, 4};
    }

    public static String q(int n) {
        int n2 = cg.s(n);
        return cg.n(n2);
    }

    public static int r(int n) {
        if (n == cug.fhO || n == cug.fhS || n == cug.fhQ || n == cug.fhW || n == cug.fhU || n == cug.fhY) {
            return 2;
        }
        if (n == cug.fhP || n == cug.fhT || n == cug.fhR || n == cug.fhX || n == cug.fhV || n == cug.fhZ) {
            return 1;
        }
        return 0;
    }

    public static int s(int n) {
        if (n == cug.fhO || n == cug.fhP) {
            return 1;
        }
        if (n == cug.fhS || n == cug.fhT) {
            return 3;
        }
        if (n == cug.fhQ || n == cug.fhR) {
            return 2;
        }
        if (n == cug.fhW || n == cug.fhX) {
            return 5;
        }
        if (n == cug.fhU || n == cug.fhV) {
            return 4;
        }
        if (n == cug.fhY || n == cug.fhZ) {
            return 6;
        }
        return 0;
    }

    public static int b(int n, int n2) {
        int n3 = -1;
        if (n2 == 208) {
            n3 = 0;
        } else if (n2 == 160) {
            n3 = 1;
        } else if (n2 == 240) {
            n3 = 2;
        } else if (n2 == 176) {
            n3 = 3;
        } else {
            assert (false);
            return 20;
        }
        int[] nArray = new int[]{16, 20, 20, 24, 22, 16, 22, 20, 20, 20, 20, 20, 22, 22, 16, 20, 18, 24, 28, 20, 24, 20, 18, 18};
        return nArray[(n - 1) * 4 + n3];
    }

    public static boolean t(int n) {
        return n == cug.fhP || n == cug.fhR || n == cug.fhV || n == cug.fhX || n == cug.fhT || n == cug.fhZ;
    }

    public static String u(int n) {
        switch (n) {
            case 1: {
                return "Male";
            }
            case 2: {
                return "Female";
            }
        }
        lfn.b(5, "SFDarkfallConstants", "getRaceName() : Unknown Gender [" + n + "]");
        return null;
    }

    public static int c(int n, int n2) {
        int n3 = 0;
        switch (n) {
            case 3: {
                if (n2 == 2) {
                    n3 = cug.fhS;
                    break;
                }
                if (n2 != 1) break;
                n3 = cug.fhT;
                break;
            }
            case 2: {
                if (n2 == 2) {
                    n3 = cug.fhQ;
                    break;
                }
                if (n2 != 1) break;
                n3 = cug.fhR;
                break;
            }
            case 5: {
                if (n2 == 2) {
                    n3 = cug.fhW;
                    break;
                }
                if (n2 != 1) break;
                n3 = cug.fhX;
                break;
            }
            case 1: {
                if (n2 == 2) {
                    n3 = cug.fhO;
                    break;
                }
                if (n2 != 1) break;
                n3 = cug.fhP;
                break;
            }
            case 6: {
                if (n2 == 2) {
                    n3 = cug.fhY;
                    break;
                }
                if (n2 != 1) break;
                n3 = cug.fhZ;
                break;
            }
            case 4: {
                if (n2 == 2) {
                    n3 = cug.fhU;
                    break;
                }
                if (n2 != 1) break;
                n3 = cug.fhV;
                break;
            }
            default: {
                n3 = cug.fhS;
            }
        }
        return n3;
    }

    public static String a(int n, boolean bl) {
        String string = "";
        if (n == cug.fhT) {
            string = "waw/hum_m_eye_l_01";
        } else if (n == cug.fhS) {
            string = "waw/hum_f_eye_l_01";
        } else if (n == cug.fhR) {
            string = "waw/dwarf_m_eye_l_01";
        } else if (n == cug.fhQ) {
            string = "waw/dwarf_f_eye_l_01";
        } else if (n == cug.fhX) {
            string = "waw/mir_m_eye_l_01";
        } else if (n == cug.fhW) {
            string = "waw/mir_f_eye_l_01";
        } else if (n == cug.fhV) {
            string = "waw/mahirim_m_eye_l_01";
        } else if (n == cug.fhU) {
            string = "waw/mahirim_f_eye_l_01";
        } else if (n == cug.fhZ) {
            string = "waw/ork_m_eye_l_01";
        } else if (n == cug.fhY) {
            string = "waw/ork_f_eye_l_01";
        } else if (n == cug.fhP) {
            string = "waw/alf_m_eye_l_01";
        } else if (n == cug.fhO) {
            string = "waw/alf_f_eye_l_01";
        } else {
            assert (false);
            return null;
        }
        if (bl) {
            string = string + "_korean";
        }
        return string + ".xml";
    }

    public static String b(int n, boolean bl) {
        String string = "";
        if (n == cug.fhT) {
            string = "waw/hum_m_eye_r_01";
        } else if (n == cug.fhS) {
            string = "waw/hum_f_eye_r_01";
        } else if (n == cug.fhR) {
            string = "waw/dwarf_m_eye_r_01";
        } else if (n == cug.fhQ) {
            string = "waw/dwarf_f_eye_r_01";
        } else if (n == cug.fhX) {
            string = "waw/mir_m_eye_r_01";
        } else if (n == cug.fhW) {
            string = "waw/mir_f_eye_r_01";
        } else if (n == cug.fhV) {
            string = "waw/mahirim_m_eye_r_01";
        } else if (n == cug.fhU) {
            string = "waw/mahirim_f_eye_r_01";
        } else if (n == cug.fhZ) {
            string = "waw/ork_m_eye_r_01";
        } else if (n == cug.fhY) {
            string = "waw/ork_f_eye_r_01";
        } else if (n == cug.fhP) {
            string = "waw/alf_m_eye_r_01";
        } else if (n == cug.fhO) {
            string = "waw/alf_f_eye_r_01";
        } else {
            assert (false);
            return null;
        }
        if (bl) {
            string = string + "_korean";
        }
        return string + ".xml";
    }

    private cg() {
    }
}

