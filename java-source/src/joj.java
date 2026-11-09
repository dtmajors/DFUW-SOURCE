/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class joj {
    protected static final lfo ct = lfr.rkC;
    private static boolean Initialized;
    private static List<jos> jIh;
    public static final jow nHW;
    public static final jow nHX;
    public static final jow nHY;
    public static final jow nHZ;
    public static final jow nIa;
    public static final jow nIb;
    public static final jow nIc;
    public static final jov nId;
    public static final jov nIe;
    public static final jov nIf;
    public static final jov nIg;
    public static final jov nIh;
    public static final jov nIi;
    public static final jou nIj;
    public static final jou nIk;
    public static final jov nIl;
    public static final jov nIm;
    public static final jov nIn;
    public static final jov nIo;
    public static final jov[] nIp;
    public static final jov[] nIq;
    public static final jov[][] nIr;
    public static final jov nIs;
    public static final jov nIt;
    public static final jov nIu;
    public static final jov nIv;
    public static final jov nIw;
    public static final jov nIx;
    public static final jov nIy;
    public static final jov nIz;
    public static final jov nIA;
    public static final jov nIB;
    public static final jov nIC;
    public static final jov nID;
    public static final jov nIE;
    public static final jov nIF;
    public static final jov nIG;
    public static final jov nIH;
    public static final jov nII;
    public static final jov nIJ;
    public static final jov nIK;
    public static final jov nIL;
    public static final jov nIM;
    public static final jov nIN;
    public static final jov nIO;
    public static final jov nIP;
    public static final List<jov> nIQ;
    public static final jov nIR;
    public static final jov nIS;
    public static final jov nIT;
    public static final jov nIU;
    public static final jov nIV;
    public static final jov nIW;
    public static final jov nIX;
    public static final jov nIY;
    public static final jov nIZ;
    public static final jov nJa;
    public static final jov nJb;
    public static final jov nJc;
    public static final jov nJd;
    public static final jov nJe;
    public static final jov nJf;
    public static final jov nJg;
    public static final jov nJh;
    public static final jov nJi;
    public static final jov nJj;
    public static final jov nJk;
    public static final jov nJl;
    public static final jov nJm;
    public static final jov nJn;
    public static final jov nJo;
    public static final jov nJp;
    public static final jov nJq;
    public static final jov nJr;
    public static final jov nJs;
    public static final jov nJt;
    public static final jov nJu;
    public static final jov nJv;
    public static final jov nJw;
    public static final jou nJx;
    public static final jou nJy;
    public static final jov nJz;
    public static final jov nJA;
    public static final jov nJB;
    public static final jov nJC;
    public static final jov nJD;
    public static final jov nJE;
    public static final jou nJF;
    public static final jov nJG;
    public static final jov nJH;
    public static final jov nJI;
    public static final jov nJJ;
    public static final jov nJK;
    public static final jov nJL;
    public static final jov nJM;
    public static final jov nJN;
    public static final jov nJO;
    public static final jov nJP;
    public static final jov nJQ;
    public static final jov nJR;
    public static final jov nJS;
    public static final jov nJT;
    public static final jov nJU;
    public static final jov nJV;
    public static final jov nJW;
    public static final jov nJX;
    public static final jov nJY;
    public static final jov nJZ;
    public static final jov nKa;

    public static List<jos> dOL() {
        if (!Initialized) {
            joj.initialize();
        }
        if (lcw.qGV && !lcw.qGW) {
            return Arrays.asList(nJa, nJb, nJc, nJd, nJe, nJf, nJg, nJh, nJn, nJo, nJp, nJq, nJu, nJx, nJy);
        }
        return jIh;
    }

    private static void initialize() {
        assert (!Initialized);
        ArrayList<jos> arrayList = new ArrayList<jos>();
        jos[] josArray = lin.a(joj.class, jos.class, null, true, true, false);
        arrayList.addAll((Collection<jos>)josArray);
        josArray = lin.a(joj.class, jos[].class, null, true, true, false);
        for (jos[] josArray2 : josArray) {
            arrayList.addAll(Arrays.asList(josArray2));
        }
        josArray = lin.a(joj.class, jos[][].class, null, true, true, false);
        jos[] josArray3 = josArray.iterator();
        while (josArray3.hasNext()) {
            jos[][] josArray2;
            for (jos[] josArray4 : josArray2 = (jos[][])josArray3.next()) {
                arrayList.addAll(Arrays.asList(josArray4));
            }
        }
        Collections.sort(arrayList);
        if (lcw.SC != null && !lcw.SC.lp()) {
            for (jos jos2 : josArray = new jos[]{nId, nIR, nIS, nIT, nIU, nIV, nIW, nIX, nJm, nJn, nJG, nJK, nJL, nJM, nJN, nJO, nJP, nJW, nJX, nJY, nJZ, nKa}) {
                int n = arrayList.remove(jos2) ? 1 : 0;
                assert (n != 0);
                while (arrayList.remove(jos2)) {
                }
            }
        }
        jIh = Collections.unmodifiableList(arrayList);
        Initialized = true;
    }

    static {
        nHW = new jow();
        nHX = new jow();
        nHY = new jow();
        nHZ = new jow();
        nIa = new jow();
        nIb = new jow();
        nIc = new jow();
        nId = new jov(nIb, "Gui_Use_Toggle", "LEFT_ALT+Keyboard:G", new ljk("Description of 'Use Gui Toggle'"));
        nIe = new jov(nIb, "Gui_Hide_Toggle", "LEFT_ALT+Keyboard:H", new ljk("Description of 'Hide Gui Toggle'"));
        nIf = new jov(nHW, "Gui_GuiMode_Toggle", "Mouse:BUTTON_1", new ljk("Description of 'Gui Mode Toggle'"));
        nIg = new jov(nHW, "Gui_GuiMode_Enter", null, new ljk("Description of 'Gui Mode Enter'"));
        nIh = new jov(nHW, "Gui_ChatMode_Toggle", "Keyboard:RETURN", new ljk("Description of 'Chat Mode Toggle'"));
        nIi = new jov(nHZ, "Gui_Logout", "LEFT_ALT+Keyboard:F4", new ljk("Description of 'Logout'"));
        nIj = new jou(nHW, "Gui_Hotbar_Col_Scroll", "LEFT_SHIFT+Mouse:AXIS_Z_0", new ljk("Description of 'Browse Hotbar Rows'"));
        nIk = new jou(nHW, "Gui_Hotbar_Row_Scroll", "Mouse:AXIS_Z_0", new ljk("Description of 'Browse Hotbar Columns'"));
        nIl = new jov(nHW, "Gui_Hotbar_Col_Prev", null, new ljk("Description of 'Previous Hotbar Column'"));
        nIm = new jov(nHW, "Gui_Hotbar_Col_Next", null, new ljk("Description of 'Next Hotbar Column'"));
        nIn = new jov(nHW, "Gui_Hotbar_Row_Prev", null, new ljk("Description of 'Previous Hotbar Row'"));
        nIo = new jov(nHW, "Gui_Hotbar_Row_Next", null, new ljk("Description of 'Next Hotbar Row'"));
        nIp = new jov[]{new jov(nHW, "Gui_Hotbar_Col_1", "LEFT_SHIFT+Keyboard:1", new ljk("Description of 'Activate Hotbar Column 1'")), new jov(nHW, "Gui_Hotbar_Col_2", "LEFT_SHIFT+Keyboard:2", new ljk("Description of 'Activate Hotbar Column 2'")), new jov(nHW, "Gui_Hotbar_Col_3", "LEFT_SHIFT+Keyboard:3", new ljk("Description of 'Activate Hotbar Column 3'")), new jov(nHW, "Gui_Hotbar_Col_4", "LEFT_SHIFT+Keyboard:4", new ljk("Description of 'Activate Hotbar Column 4'")), new jov(nHW, "Gui_Hotbar_Col_5", "LEFT_SHIFT+Keyboard:5", new ljk("Description of 'Activate Hotbar Column 5'")), new jov(nHW, "Gui_Hotbar_Col_6", "LEFT_SHIFT+Keyboard:6", new ljk("Description of 'Activate Hotbar Column 6'")), new jov(nHW, "Gui_Hotbar_Col_7", "LEFT_SHIFT+Keyboard:7", new ljk("Description of 'Activate Hotbar Column 7'")), new jov(nHW, "Gui_Hotbar_Col_8", "LEFT_SHIFT+Keyboard:8", new ljk("Description of 'Activate Hotbar Column 8'")), new jov(nHW, "Gui_Hotbar_Col_9", "LEFT_SHIFT+Keyboard:9", new ljk("Description of 'Activate Hotbar Column 9'")), new jov(nHW, "Gui_Hotbar_Col_0", "LEFT_SHIFT+Keyboard:0", new ljk("Description of 'Activate Hotbar Column 0'"))};
        nIq = new jov[]{new jov(nHW, "Gui_Hotbar_Row_1", "Keyboard:1", new ljk("Description of 'Activate Hotbar Row 1'")), new jov(nHW, "Gui_Hotbar_Row_2", "Keyboard:2", new ljk("Description of 'Activate Hotbar Row 2'")), new jov(nHW, "Gui_Hotbar_Row_3", "Keyboard:3", new ljk("Description of 'Activate Hotbar Row 3'")), new jov(nHW, "Gui_Hotbar_Row_4", "Keyboard:4", new ljk("Description of 'Activate Hotbar Row 4'")), new jov(nHW, "Gui_Hotbar_Row_5", "Keyboard:5", new ljk("Description of 'Activate Hotbar Row 5'")), new jov(nHW, "Gui_Hotbar_Row_6", "Keyboard:6", new ljk("Description of 'Activate Hotbar Row 6'")), new jov(nHW, "Gui_Hotbar_Row_7", "Keyboard:7", new ljk("Description of 'Activate Hotbar Row 7'")), new jov(nHW, "Gui_Hotbar_Row_8", "Keyboard:8", new ljk("Description of 'Activate Hotbar Row 8'")), new jov(nHW, "Gui_Hotbar_Row_9", "Keyboard:9", new ljk("Description of 'Activate Hotbar Row 9'")), new jov(nHW, "Gui_Hotbar_Row_0", "Keyboard:0", new ljk("Description of 'Activate Hotbar Row 0'"))};
        nIr = new jov[][]{{new jov(nHW, "Gui_Hotbar_Col_1_Row_1", null, new ljk("Description of 'Activate Hotbar Col 1, Row 1'")), new jov(nHW, "Gui_Hotbar_Col_1_Row_2", null, new ljk("Description of 'Activate Hotbar Col 1, Row 2'")), new jov(nHW, "Gui_Hotbar_Col_1_Row_3", null, new ljk("Description of 'Activate Hotbar Col 1, Row 3'")), new jov(nHW, "Gui_Hotbar_Col_1_Row_4", null, new ljk("Description of 'Activate Hotbar Col 1, Row 4'")), new jov(nHW, "Gui_Hotbar_Col_1_Row_5", null, new ljk("Description of 'Activate Hotbar Col 1, Row 5'")), new jov(nHW, "Gui_Hotbar_Col_1_Row_6", null, new ljk("Description of 'Activate Hotbar Col 1, Row 6'")), new jov(nHW, "Gui_Hotbar_Col_1_Row_7", null, new ljk("Description of 'Activate Hotbar Col 1, Row 7'")), new jov(nHW, "Gui_Hotbar_Col_1_Row_8", null, new ljk("Description of 'Activate Hotbar Col 1, Row 8'")), new jov(nHW, "Gui_Hotbar_Col_1_Row_9", null, new ljk("Description of 'Activate Hotbar Col 1, Row 9'")), new jov(nHW, "Gui_Hotbar_Col_1_Row_0", null, new ljk("Description of 'Activate Hotbar Col 1, Row 0'"))}, {new jov(nHW, "Gui_Hotbar_Col_2_Row_1", null, new ljk("Description of 'Activate Hotbar Col 2, Row 1'")), new jov(nHW, "Gui_Hotbar_Col_2_Row_2", null, new ljk("Description of 'Activate Hotbar Col 2, Row 2'")), new jov(nHW, "Gui_Hotbar_Col_2_Row_3", null, new ljk("Description of 'Activate Hotbar Col 2, Row 3'")), new jov(nHW, "Gui_Hotbar_Col_2_Row_4", null, new ljk("Description of 'Activate Hotbar Col 2, Row 4'")), new jov(nHW, "Gui_Hotbar_Col_2_Row_5", null, new ljk("Description of 'Activate Hotbar Col 2, Row 5'")), new jov(nHW, "Gui_Hotbar_Col_2_Row_6", null, new ljk("Description of 'Activate Hotbar Col 2, Row 6'")), new jov(nHW, "Gui_Hotbar_Col_2_Row_7", null, new ljk("Description of 'Activate Hotbar Col 2, Row 7'")), new jov(nHW, "Gui_Hotbar_Col_2_Row_8", null, new ljk("Description of 'Activate Hotbar Col 2, Row 8'")), new jov(nHW, "Gui_Hotbar_Col_2_Row_9", null, new ljk("Description of 'Activate Hotbar Col 2, Row 9'")), new jov(nHW, "Gui_Hotbar_Col_2_Row_0", null, new ljk("Description of 'Activate Hotbar Col 2, Row 0'"))}, {new jov(nHW, "Gui_Hotbar_Col_3_Row_1", null, new ljk("Description of 'Activate Hotbar Col 3, Row 1'")), new jov(nHW, "Gui_Hotbar_Col_3_Row_2", null, new ljk("Description of 'Activate Hotbar Col 3, Row 2'")), new jov(nHW, "Gui_Hotbar_Col_3_Row_3", null, new ljk("Description of 'Activate Hotbar Col 3, Row 3'")), new jov(nHW, "Gui_Hotbar_Col_3_Row_4", null, new ljk("Description of 'Activate Hotbar Col 3, Row 4'")), new jov(nHW, "Gui_Hotbar_Col_3_Row_5", null, new ljk("Description of 'Activate Hotbar Col 3, Row 5'")), new jov(nHW, "Gui_Hotbar_Col_3_Row_6", null, new ljk("Description of 'Activate Hotbar Col 3, Row 6'")), new jov(nHW, "Gui_Hotbar_Col_3_Row_7", null, new ljk("Description of 'Activate Hotbar Col 3, Row 7'")), new jov(nHW, "Gui_Hotbar_Col_3_Row_8", null, new ljk("Description of 'Activate Hotbar Col 3, Row 8'")), new jov(nHW, "Gui_Hotbar_Col_3_Row_9", null, new ljk("Description of 'Activate Hotbar Col 3, Row 9'")), new jov(nHW, "Gui_Hotbar_Col_3_Row_0", null, new ljk("Description of 'Activate Hotbar Col 3, Row 0'"))}, {new jov(nHW, "Gui_Hotbar_Col_4_Row_1", null, new ljk("Description of 'Activate Hotbar Col 4, Row 1'")), new jov(nHW, "Gui_Hotbar_Col_4_Row_2", null, new ljk("Description of 'Activate Hotbar Col 4, Row 2'")), new jov(nHW, "Gui_Hotbar_Col_4_Row_3", null, new ljk("Description of 'Activate Hotbar Col 4, Row 3'")), new jov(nHW, "Gui_Hotbar_Col_4_Row_4", null, new ljk("Description of 'Activate Hotbar Col 4, Row 4'")), new jov(nHW, "Gui_Hotbar_Col_4_Row_5", null, new ljk("Description of 'Activate Hotbar Col 4, Row 5'")), new jov(nHW, "Gui_Hotbar_Col_4_Row_6", null, new ljk("Description of 'Activate Hotbar Col 4, Row 6'")), new jov(nHW, "Gui_Hotbar_Col_4_Row_7", null, new ljk("Description of 'Activate Hotbar Col 4, Row 7'")), new jov(nHW, "Gui_Hotbar_Col_4_Row_8", null, new ljk("Description of 'Activate Hotbar Col 4, Row 8'")), new jov(nHW, "Gui_Hotbar_Col_4_Row_9", null, new ljk("Description of 'Activate Hotbar Col 4, Row 9'")), new jov(nHW, "Gui_Hotbar_Col_4_Row_0", null, new ljk("Description of 'Activate Hotbar Col 4, Row 0'"))}, {new jov(nHW, "Gui_Hotbar_Col_5_Row_1", null, new ljk("Description of 'Activate Hotbar Col 5, Row 1'")), new jov(nHW, "Gui_Hotbar_Col_5_Row_2", null, new ljk("Description of 'Activate Hotbar Col 5, Row 2'")), new jov(nHW, "Gui_Hotbar_Col_5_Row_3", null, new ljk("Description of 'Activate Hotbar Col 5, Row 3'")), new jov(nHW, "Gui_Hotbar_Col_5_Row_4", null, new ljk("Description of 'Activate Hotbar Col 5, Row 4'")), new jov(nHW, "Gui_Hotbar_Col_5_Row_5", null, new ljk("Description of 'Activate Hotbar Col 5, Row 5'")), new jov(nHW, "Gui_Hotbar_Col_5_Row_6", null, new ljk("Description of 'Activate Hotbar Col 5, Row 6'")), new jov(nHW, "Gui_Hotbar_Col_5_Row_7", null, new ljk("Description of 'Activate Hotbar Col 5, Row 7'")), new jov(nHW, "Gui_Hotbar_Col_5_Row_8", null, new ljk("Description of 'Activate Hotbar Col 5, Row 8'")), new jov(nHW, "Gui_Hotbar_Col_5_Row_9", null, new ljk("Description of 'Activate Hotbar Col 5, Row 9'")), new jov(nHW, "Gui_Hotbar_Col_5_Row_0", null, new ljk("Description of 'Activate Hotbar Col 5, Row 0'"))}, {new jov(nHW, "Gui_Hotbar_Col_6_Row_1", null, new ljk("Description of 'Activate Hotbar Col 6, Row 1'")), new jov(nHW, "Gui_Hotbar_Col_6_Row_2", null, new ljk("Description of 'Activate Hotbar Col 6, Row 2'")), new jov(nHW, "Gui_Hotbar_Col_6_Row_3", null, new ljk("Description of 'Activate Hotbar Col 6, Row 3'")), new jov(nHW, "Gui_Hotbar_Col_6_Row_4", null, new ljk("Description of 'Activate Hotbar Col 6, Row 4'")), new jov(nHW, "Gui_Hotbar_Col_6_Row_5", null, new ljk("Description of 'Activate Hotbar Col 6, Row 5'")), new jov(nHW, "Gui_Hotbar_Col_6_Row_6", null, new ljk("Description of 'Activate Hotbar Col 6, Row 6'")), new jov(nHW, "Gui_Hotbar_Col_6_Row_7", null, new ljk("Description of 'Activate Hotbar Col 6, Row 7'")), new jov(nHW, "Gui_Hotbar_Col_6_Row_8", null, new ljk("Description of 'Activate Hotbar Col 6, Row 8'")), new jov(nHW, "Gui_Hotbar_Col_6_Row_9", null, new ljk("Description of 'Activate Hotbar Col 6, Row 9'")), new jov(nHW, "Gui_Hotbar_Col_6_Row_0", null, new ljk("Description of 'Activate Hotbar Col 6, Row 0'"))}, {new jov(nHW, "Gui_Hotbar_Col_7_Row_1", null, new ljk("Description of 'Activate Hotbar Col 7, Row 1'")), new jov(nHW, "Gui_Hotbar_Col_7_Row_2", null, new ljk("Description of 'Activate Hotbar Col 7, Row 2'")), new jov(nHW, "Gui_Hotbar_Col_7_Row_3", null, new ljk("Description of 'Activate Hotbar Col 7, Row 3'")), new jov(nHW, "Gui_Hotbar_Col_7_Row_4", null, new ljk("Description of 'Activate Hotbar Col 7, Row 4'")), new jov(nHW, "Gui_Hotbar_Col_7_Row_5", null, new ljk("Description of 'Activate Hotbar Col 7, Row 5'")), new jov(nHW, "Gui_Hotbar_Col_7_Row_6", null, new ljk("Description of 'Activate Hotbar Col 7, Row 6'")), new jov(nHW, "Gui_Hotbar_Col_7_Row_7", null, new ljk("Description of 'Activate Hotbar Col 7, Row 7'")), new jov(nHW, "Gui_Hotbar_Col_7_Row_8", null, new ljk("Description of 'Activate Hotbar Col 7, Row 8'")), new jov(nHW, "Gui_Hotbar_Col_7_Row_9", null, new ljk("Description of 'Activate Hotbar Col 7, Row 9'")), new jov(nHW, "Gui_Hotbar_Col_7_Row_0", null, new ljk("Description of 'Activate Hotbar Col 7, Row 0'"))}, {new jov(nHW, "Gui_Hotbar_Col_8_Row_1", null, new ljk("Description of 'Activate Hotbar Col 8, Row 1'")), new jov(nHW, "Gui_Hotbar_Col_8_Row_2", null, new ljk("Description of 'Activate Hotbar Col 8, Row 2'")), new jov(nHW, "Gui_Hotbar_Col_8_Row_3", null, new ljk("Description of 'Activate Hotbar Col 8, Row 3'")), new jov(nHW, "Gui_Hotbar_Col_8_Row_4", null, new ljk("Description of 'Activate Hotbar Col 8, Row 4'")), new jov(nHW, "Gui_Hotbar_Col_8_Row_5", null, new ljk("Description of 'Activate Hotbar Col 8, Row 5'")), new jov(nHW, "Gui_Hotbar_Col_8_Row_6", null, new ljk("Description of 'Activate Hotbar Col 8, Row 6'")), new jov(nHW, "Gui_Hotbar_Col_8_Row_7", null, new ljk("Description of 'Activate Hotbar Col 8, Row 7'")), new jov(nHW, "Gui_Hotbar_Col_8_Row_8", null, new ljk("Description of 'Activate Hotbar Col 8, Row 8'")), new jov(nHW, "Gui_Hotbar_Col_8_Row_9", null, new ljk("Description of 'Activate Hotbar Col 8, Row 9'")), new jov(nHW, "Gui_Hotbar_Col_8_Row_0", null, new ljk("Description of 'Activate Hotbar Col 8, Row 0'"))}, {new jov(nHW, "Gui_Hotbar_Col_9_Row_1", null, new ljk("Description of 'Activate Hotbar Col 9, Row 1'")), new jov(nHW, "Gui_Hotbar_Col_9_Row_2", null, new ljk("Description of 'Activate Hotbar Col 9, Row 2'")), new jov(nHW, "Gui_Hotbar_Col_9_Row_3", null, new ljk("Description of 'Activate Hotbar Col 9, Row 3'")), new jov(nHW, "Gui_Hotbar_Col_9_Row_4", null, new ljk("Description of 'Activate Hotbar Col 9, Row 4'")), new jov(nHW, "Gui_Hotbar_Col_9_Row_5", null, new ljk("Description of 'Activate Hotbar Col 9, Row 5'")), new jov(nHW, "Gui_Hotbar_Col_9_Row_6", null, new ljk("Description of 'Activate Hotbar Col 9, Row 6'")), new jov(nHW, "Gui_Hotbar_Col_9_Row_7", null, new ljk("Description of 'Activate Hotbar Col 9, Row 7'")), new jov(nHW, "Gui_Hotbar_Col_9_Row_8", null, new ljk("Description of 'Activate Hotbar Col 9, Row 8'")), new jov(nHW, "Gui_Hotbar_Col_9_Row_9", null, new ljk("Description of 'Activate Hotbar Col 9, Row 9'")), new jov(nHW, "Gui_Hotbar_Col_9_Row_0", null, new ljk("Description of 'Activate Hotbar Col 9, Row 0'"))}, {new jov(nHW, "Gui_Hotbar_Col_0_Row_1", null, new ljk("Description of 'Activate Hotbar Col 0, Row 1'")), new jov(nHW, "Gui_Hotbar_Col_0_Row_2", null, new ljk("Description of 'Activate Hotbar Col 0, Row 2'")), new jov(nHW, "Gui_Hotbar_Col_0_Row_3", null, new ljk("Description of 'Activate Hotbar Col 0, Row 3'")), new jov(nHW, "Gui_Hotbar_Col_0_Row_4", null, new ljk("Description of 'Activate Hotbar Col 0, Row 4'")), new jov(nHW, "Gui_Hotbar_Col_0_Row_5", null, new ljk("Description of 'Activate Hotbar Col 0, Row 5'")), new jov(nHW, "Gui_Hotbar_Col_0_Row_6", null, new ljk("Description of 'Activate Hotbar Col 0, Row 6'")), new jov(nHW, "Gui_Hotbar_Col_0_Row_7", null, new ljk("Description of 'Activate Hotbar Col 0, Row 7'")), new jov(nHW, "Gui_Hotbar_Col_0_Row_8", null, new ljk("Description of 'Activate Hotbar Col 0, Row 8'")), new jov(nHW, "Gui_Hotbar_Col_0_Row_9", null, new ljk("Description of 'Activate Hotbar Col 0, Row 9'")), new jov(nHW, "Gui_Hotbar_Col_0_Row_0", null, new ljk("Description of 'Activate Hotbar Col 0, Row 0'"))}};
        nIs = new jov(nHW, "Gui_Window_Backpack_Toggle", "Keyboard:B", new ljk("Description"));
        nIt = new jov(nHW, "Gui_Window_Boards_Toggle", null, new ljk("Description"));
        nIu = new jov(nHW, "Gui_Window_Chat_Toggle", null, new ljk("Description"));
        nIv = new jov(nHW, "Gui_Window_Clans_Toggle", null, new ljk("Description"));
        nIw = new jov(nHW, "Gui_Window_Conquest_Toggle", null, new ljk("Description"));
        nIx = new jov(nHW, "Gui_Window_Description_Toggle", null, new ljk("Description"));
        nIy = new jov(nHW, "Gui_Window_Help_Toggle", null, new ljk("Description"));
        nIz = new jov(nHW, "Gui_Window_Hotbar_Toggle", null, new ljk("Description"));
        nIA = new jov(nHW, "Gui_Window_Journal_Toggle", null, new ljk("Description"));
        nIB = new jov(nHW, "Gui_Window_Minimap_Toggle", null, new ljk("Description"));
        nIC = new jov(nHW, "Gui_Window_Options_Toggle", null, new ljk("Description"));
        nID = new jov(nHW, "Gui_Window_Playerstats_Toggle", null, new ljk("Description"));
        nIE = new jov(nHW, "Gui_Window_Paperdoll_Toggle", "Keyboard:P", new ljk("Description"));
        nIF = new jov(nHW, "Gui_Window_Skills_Toggle", null, new ljk("Description"));
        nIG = new jov(nHW, "Gui_Window_Spells_Toggle", null, new ljk("Description"));
        nIH = new jov(nHW, "Gui_Window_Vitalstats_Toggle", null, new ljk("Description"));
        nII = new jov(nHW, "Gui_Window_Compass_Toggle", null, new ljk("Description"));
        nIJ = new jov(nHW, "Gui_Window_Worldmap_Toggle", "Keyboard:M", new ljk("Description"));
        nIK = new jov(nHW, "Gui_Window_ItemCounter_Toggle", "Keyboard:I", new ljk("Description"));
        nIL = new jov(nHW, "Gui_Minimap_Zoom_In", "Keyboard:EQUALS", new ljk("Description"));
        nIM = new jov(nHW, "Gui_Minimap_Zoom_Out", "Keyboard:MINUS", new ljk("Description"));
        nIN = new jov(nHW, "Gui_Worldmap_Zoom_In", "RIGHT_SHIFT+Keyboard:EQUALS", new ljk("Description"));
        nIO = new jov(nHW, "Gui_Worldmap_Zoom_Out", "RIGHT_SHIFT+Keyboard:MINUS", new ljk("Description"));
        nIP = new jov(nHW, "Gui_Hotbar_Expanded_Toggle", null, new ljk("Description"));
        nIQ = Arrays.asList(nIs, nIt, nIu, nIv, nIx, nIy, nIz, nIA, nIB, nIC, nID, nIE, nIF, nIG, nIH, nII, nIJ, nIK, nIf, nIh, nIL, nIM, nIN, nIO);
        nIR = new jov(nIb, "Gui_Test_1", "LEFT_SHIFT+Keyboard:F1", new ljk("Description of GUI Test action 1"));
        nIS = new jov(nIb, "Gui_Test_2", "LEFT_SHIFT+Keyboard:F2", new ljk("Description of GUI Test action 2"));
        nIT = new jov(nIb, "Gui_Test_3", "LEFT_SHIFT+Keyboard:F3", new ljk("Description of GUI Test action 3"));
        nIU = new jov(nIb, "Gui_Test_4", "LEFT_SHIFT+Keyboard:F4", new ljk("Description of GUI Test action 4"));
        nIV = new jov(nIb, "Gui_Test_5", "LEFT_ALT+Keyboard:F1", new ljk("Description of GUI Test action 5"));
        nIW = new jov(nIb, "Gui_Test_6", "LEFT_ALT+Keyboard:F2", new ljk("Description of GUI Test action 6"));
        nIX = new jov(nIb, "Gui_Test_7", "LEFT_ALT+Keyboard:F3", new ljk("Description of GUI Test action 7"));
        nIY = new jov(nHZ, "Input_Inverted_Mouse_Toggle", null, new ljk("Description of 'Inverted Mouse Toggle'"));
        nIZ = new jov(nHZ, "a_Screenshot", "LEFT_ALT+Keyboard:S", new ljk("Description of 'Screenshot'"));
        nJa = new jov(nHX, "a_Run_Forward", "Keyboard:W", new ljk("Description of a_Run_Forward"));
        nJb = new jov(nHX, "a_Run_Backward", "Keyboard:S", new ljk("Description of a_Run_Backward"));
        nJc = new jov(nHX, "a_Run_Left", "Keyboard:A", new ljk("Description of a_Run_Left"));
        nJd = new jov(nHX, "a_Run_Right", "Keyboard:D", new ljk("Description of a_Run_Right"));
        nJe = new jov(nHX, "a_Jump", "Keyboard:SPACE", new ljk("Description of a_Jump"));
        nJf = new jov(nHX, "a_Crouch", "Keyboard:C", new ljk("Description of a_Crouch"));
        nJg = new jov(nHX, "a_Sprint", "LEFT_SHIFT+Keyboard:LEFT_SHIFT", new ljk("Description of a_Sprint"));
        nJh = new jov(nHX, "a_Walk", "LEFT_CTRL+Keyboard:LEFT_CTRL", new ljk("Description of a_Walk"));
        nJi = new jov(nHX, "a_Rotate_Up", "Keyboard:UP", new ljk("Description of a_Rotate_Up"));
        nJj = new jov(nHX, "a_Rotate_Down", "Keyboard:DOWN", new ljk("Description of a_Rotate_Down"));
        nJk = new jov(nHX, "a_Rotate_Left", "Keyboard:LEFT", new ljk("Description of a_Rotate_Left"));
        nJl = new jov(nHX, "a_Rotate_Right", "Keyboard:RIGHT", new ljk("Description of a_Rotate_Right"));
        nJm = new jov(nIa, "a_Toggle_Camera_Relation", "Keyboard:F8", new ljk("Description of a_Toggle_Camera_Relation"));
        nJn = new jov(nIa, "a_Toggle_Move_Camera", "Keyboard:F7", new ljk("Description of a_Toggle_Move_Camera"));
        nJo = new jov(nHZ, "a_Toggle_Mousesmoothing", null, new ljk("Description of a_Toggle_Mousesmoothin"));
        nJp = new jov(nHY, "a_Use", "Keyboard:F", new ljk("Description of a_Use"));
        nJq = new jov(nHY, "a_Alternative_Use", "Keyboard:G", new ljk("Description of a_Alternative_Use"));
        nJr = new jov(nHY, "a_Parry", "Keyboard:V", new ljk("Description of a_Parry"));
        nJs = new jov(nHY, "a_Trigger_Current_Item", "Mouse:BUTTON_0", new ljk("Description of a_Trigger_Current_Item"));
        nJt = new jov(nHX, "a_Toggle_AutoCrouch", "LEFT_ALT+Keyboard:C", new ljk("Description of a_Toggle_AutoCrouch"));
        nJu = new jov(nHX, "a_Toggle_AutoRun", "Keyboard:NUMLOCK", new ljk("Description of a_Toggle_AutoRun"));
        nJv = new jov(nHZ, "a_Toggle_Camera_View", "Keyboard:F12", new ljk("Description of a_Toggle_Camera_View"));
        nJw = new jov(nHY, "a_Toggle_Unsheathe_Object", "Keyboard:R", new ljk("Description of a_Toggle_Unsheathe_Object"));
        nJx = new jou(nHX, "a_Rotate_Along_X_Axis", "Mouse:AXIS_X_0", new ljk("Description of a_Rotate_Along_X_Axis"));
        nJy = new jou(nHX, "a_Rotate_Along_Y_Axis", "Mouse:AXIS_Y_0", new ljk("Description of a_Rotate_Along_Y_Axis"));
        nJz = new jov(nHX, "a_Lean_Left", "Keyboard:Q", new ljk("Description of a_Lean_Left"));
        nJA = new jov(nHX, "a_Lean_Right", "Keyboard:E", new ljk("Description of a_Lean_Right"));
        nJB = new jov(nHY, "a_Select_Default_Skill", "LEFT_ALT+Keyboard:D", new ljk("Description of a_Select_Default_Skill"));
        nJC = new jov(nHY, "a_Select_Previous_Skill", "LEFT_ALT+Keyboard:P", new ljk("Description of a_Select_Previous_Skill"));
        nJD = new jov(nHY, "a_Select_Gank_Skill", "Keyboard:X", new ljk("Description of a_Select_Gank_Skill"));
        nJE = new jov(nHY, "a_Select_Revive_Skill", "Keyboard:Z", new ljk("Description of a_Select_Revive_Skill"));
        nJF = new jou(nIb, "a_Set_Camera_Speed", "Mouse:AXIS_Z_0", new ljk("Description of a_Set_Camera_Speed"));
        nJG = new jov(nIb, "a_Request_EngineData", "LEFT_ALT+Keyboard:E", new ljk("Description of 'Request Engine Data'"));
        nJH = new jov(nHY, "a_Unsheathe_Object", null, new ljk("Description of a_Unsheathe_Object"));
        nJI = new jov(nHY, "a_Rest", "Keyboard:H", new ljk("Sheathes any equiped items and starts the rest skill, thereby entering the rest state"));
        nJJ = new jov(nHY, "a_Toggle_Enable_Alternative_Attack", "Keyboard:T", new ljk("Description of a_Toggle_Enable_Alternative_Attack"));
        nJK = new jov(nIb, "a_TestAction1", "LEFT_SHIFT+Keyboard:F10", new ljk("Description of a_TestAction1"));
        nJL = new jov(nIb, "a_TestAction2", "LEFT_SHIFT+Keyboard:F11", new ljk("Description of a_TestAction2"));
        nJM = new jov(nIb, "a_TestAction3", "LEFT_SHIFT+Keyboard:F12", new ljk("Description of a_TestAction3"));
        nJN = new jov(nIb, "a_TestAction4", "LEFT_ALT+Keyboard:F12", new ljk("Description of a_TestAction4"));
        nJO = new jov(nIb, "a_Add_fixed_modifier", "LEFT_ALT+Keyboard:F9", new ljk("Description of a_Add_fixed_modifier"));
        nJP = new jov(nIb, "a_Add_random_modifier", "LEFT_ALT+Keyboard:F10", new ljk("Description of a_Add_random_modifier"));
        nJQ = new jov(nIb, "a_Toggle_Third_Person_View", "Keyboard:F11", new ljk("Description of a_Toggle_Third_Person"));
        nJR = new jov(nIb, "a_Toggle_First_Person_Hands", "Keyboard:F10", new ljk("Description of .."));
        nJS = new jov(nIb, "a_Do_Camera_Front_View", "Keyboard:F6", new ljk("Description of .."));
        nJT = new jov(nIb, "a_Do_Camera_Left_View", "Keyboard:F7", new ljk("Description of .."));
        nJU = new jov(nIb, "a_Do_Camera_Back_View", "Keyboard:F8", new ljk("Description of .."));
        nJV = new jov(nIb, "a_Do_Camera_Right_View", "Keyboard:F9", new ljk("Description of .."));
        nJW = new jov(nIb, "gl_Test1", "LEFT_CTRL+Keyboard:F1", new ljk("Description of Test1"));
        nJX = new jov(nIb, "gl_Test2", "LEFT_CTRL+Keyboard:F2", new ljk("Description of Test2"));
        nJY = new jov(nIb, "gl_Test3", "LEFT_CTRL+Keyboard:F3", new ljk("Description of Test3"));
        nJZ = new jov(nIb, "gl_Test4", "LEFT_CTRL+Keyboard:F4", new ljk("Description of Test4"));
        nKa = new jov(nIb, "gl_Test5", "LEFT_CTRL+Keyboard:F5", new ljk("Description of Test5"));
    }
}

