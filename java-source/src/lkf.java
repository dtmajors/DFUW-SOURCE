/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.List;

public class lkf {
    private static lkf rqq = null;
    private List<lke> rqr = lcn.emA();

    private lkf() {
    }

    public static lkf ets() {
        if (rqq == null) {
            rqq = new lkf();
        }
        return rqq;
    }

    public void c(lke lke2) {
        this.rqr.add(lke2);
    }

    public void d(lke lke2) {
        boolean bl = this.rqr.remove(lke2);
    }

    public boolean b(String string, String string2, double d2) {
        lke lke2 = null;
        for (lke cloneable2 : this.rqr) {
            if (!cloneable2.etq().getFileName().toLowerCase().contains(string.toLowerCase())) continue;
            lke2 = cloneable2;
            break;
        }
        if (lke2 == null) {
            lfn.b(5, "SFAnimationDistanceTimerSupremeCommander", "modifyDeltaTimePrUnit() Could not find the mesh substring: " + string);
            return false;
        }
        lfn.b(0, "SFAnimationDistanceTimerSupremeCommander", "modifyDeltaTimePrUnit() Found mesh: " + lke2.etq().getFileName());
        string2 = string2.toLowerCase();
        if (lke2.etr().containsKey(string2)) {
            lfn.b(0, "SFAnimationDistanceTimerSupremeCommander", "modifyDeltaTimePrUnit() Found already registered set!");
            lkd lkd2 = lke2.etr().get(string2);
            assert (lkd2 != null);
            lkd2.dK(d2);
            return true;
        }
        int n = lkv.AG((String)string2);
        if (n < 0) {
            lfn.b(5, "SFAnimationDistanceTimerSupremeCommander", "modifyDeltaTimePrUnit() NOT a valid setname: " + string2);
            return false;
        }
        lkd lkd2 = new lkd();
        lkd2.Xs(0);
        lkd2.wI(string2);
        lkd2.dK(d2);
        lke2.etr().put(string2, lkd2);
        return true;
    }

    public void ett() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BEGIN ANIMATIONDISTANCETIMERLIST\n\n");
        for (lke object2 : this.rqr) {
            lfn.b(0, "SFAnimationDistanceTimerSupremeCommander", "printAllTimers() MESH NAME: " + object2.etq().getFileName());
            stringBuilder.append("\nMeshName: ");
            stringBuilder.append(object2.etq().getFileName());
            stringBuilder.append("\n\n");
            for (lkd lkd2 : object2.etr().values()) {
                lfn.b(0, "SFAnimationDistanceTimerSupremeCommander", "printAllTimers() SETNAME : " + lkd2.dZF());
                lfn.b(0, "SFAnimationDistanceTimerSupremeCommander", "printAllTimers() DELTATIME: " + lkd2.dZo());
                stringBuilder.append("SetName: ");
                stringBuilder.append(lkd2.dZF());
                stringBuilder.append("\nDeltaTime:      ");
                stringBuilder.append(lkd2.dZo());
                stringBuilder.append("\n");
            }
            stringBuilder.append("\n\n");
        }
        stringBuilder.append("\n\n");
        stringBuilder.append("END ANIMATIONDISTANCETIMERLIST\n");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(stringBuilder.toString());
        clipboard.setContents(stringSelection, null);
    }
}

