/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcw
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFInputBindingsDTO")
public class SFInputBindingsDTO
extends SFXMLSerializable {
    public List<String> actions = lcn.emv();
    public List<String> bindings = lcn.emv();
    public List<String> displays = lcn.emv();
    public static final String NULL_BINDING_STRING = "---";

    public SFInputBindingsDTO() {
        this.cDD();
    }

    public SFInputBindingsDTO(SFInputBindingsDTO sFInputBindingsDTO) {
        this.cDD();
        for (int i = 0; i < this.actions.size(); ++i) {
            int n = sFInputBindingsDTO.actions.indexOf(this.actions.get(i));
            if (n < 0) continue;
            this.bindings.set(i, sFInputBindingsDTO.bindings.get(n));
            this.displays.set(i, sFInputBindingsDTO.displays.get(n));
        }
    }

    public SFInputBindingsDTO(String string) {
        assert (string != null);
        String[] stringArray = string.split("\n");
        assert (stringArray.length > 0);
        assert (stringArray.length % 3 == 0);
        this.actions = lcn.emv();
        this.bindings = lcn.emv();
        this.displays = lcn.emv();
        for (int i = 0; i < stringArray.length; i += 3) {
            this.actions.add(stringArray[i + 0]);
            this.bindings.add(stringArray[i + 1]);
            this.displays.add(stringArray[i + 2]);
        }
    }

    public String toString() {
        assert (this.actions.size() == this.bindings.size());
        assert (this.actions.size() == this.displays.size());
        String string = "";
        for (int i = 0; i < this.actions.size(); ++i) {
            string = string + this.actions.get(i) + "\n";
            string = string + this.bindings.get(i) + "\n";
            string = string + this.displays.get(i) + "\n";
        }
        return string;
    }

    public static jmv.a b(jmq jmq2) {
        for (jmv.a a2 : jmv.nCe) {
            if (a2.iMe != jmq2) continue;
            return a2;
        }
        return null;
    }

    public void e(String string, String string2, String string3) {
        assert (this.actions.size() == this.bindings.size());
        assert (this.bindings.size() == this.displays.size());
        if (string3 == null) {
            return;
        }
        this.actions.add(string);
        this.bindings.add(string2);
        this.displays.add(string3);
    }

    public void a(jmq jmq2, String string) {
        this.e(jmq2.getKey(), jjd.a(SFInputBindingsDTO.b(jmq2)), string);
    }

    public void cDD() {
        this.actions = lcn.emv();
        this.bindings = lcn.emv();
        this.displays = lcn.emv();
        this.a(jmq.nzd, lxo.tuS.bD(new Object[0]).exA());
        this.a(jmq.nze, lxo.tuT.bD(new Object[0]).exA());
        this.a(jmq.nzi, lxo.ttn.bD(new Object[0]).exA());
        this.a(jmq.nzj, lxo.tto.bD(new Object[0]).exA());
        this.a(jmq.nzk, lxo.ttp.bD(new Object[0]).exA());
        this.a(jmq.nzl, lxo.ttq.bD(new Object[0]).exA());
        this.a(jmq.nzm, lxo.ttr.bD(new Object[0]).exA());
        this.a(jmq.nzn, lxo.tts.bD(new Object[0]).exA());
        this.a(jmq.nzo, lxo.ttt.bD(new Object[0]).exA());
        this.a(jmq.nzp, lxo.ttu.bD(new Object[0]).exA());
        this.a(jmq.nzu, lxo.ttx.bD(new Object[0]).exA());
        this.a(jmq.nzw, lxo.ttz.bD(new Object[0]).exA());
        this.a(jmq.nzx, lxo.ttA.bD(new Object[0]).exA());
        this.a(jmq.nzy, lxo.ttB.bD(new Object[0]).exA());
        this.a(jmq.nzz, lxo.ttC.bD(new Object[0]).exA());
        this.a(jmq.nzA, lxo.ttD.bD(new Object[0]).exA());
        this.a(jmq.nzC, lxo.ttE.bD(new Object[0]).exA());
        this.a(jmq.nzD, lxo.ttF.bD(new Object[0]).exA());
        this.a(jmq.nzE, lxo.ttG.bD(new Object[0]).exA());
        this.a(jmq.nzF, lxo.ttH.bD(new Object[0]).exA());
        this.a(jmq.nzI, lxo.ttJ.bD(new Object[0]).exA());
        this.a(jmq.nzJ, lxo.tva.bD(new Object[0]).exA());
        this.a(jmq.nzK, lxo.tvb.bD(new Object[0]).exA());
        this.a(jmq.nzL, lxo.tvc.bD(new Object[0]).exA());
        this.a(jmq.nzM, lxo.ttK.bD(new Object[0]).exA());
        this.a(jmq.nzN, lxo.ttL.bD(new Object[0]).exA());
        this.a(jmq.nzO, lxo.ttM.bD(new Object[0]).exA());
        this.a(jmq.nzP, lxo.ttN.bD(new Object[0]).exA());
        lea.epQ();
        if (ayc.avz) {
            this.a(jmq.nzQ, lxo.ttO.bD(cug.fww).exA());
        }
        this.a(jmq.nAc, lxo.tua.bD(new Object[0]).exA());
        this.a(jmq.nAd, lxo.tub.bD(new Object[0]).exA());
        this.a(jmq.nAe, lxo.tuc.bD(new Object[0]).exA());
        this.a(jmq.nAg, lxo.tud.bD(new Object[0]).exA());
        this.a(jmq.nAf, lxo.tue.bD(new Object[0]).exA());
        this.a(jmq.nAh, lxo.tuf.bD(new Object[0]).exA());
        this.a(jmq.nAi, lxo.tug.bD(new Object[0]).exA());
        this.a(jmq.nAj, lxo.tuh.bD(new Object[0]).exA());
        this.a(jmq.nAk, lxo.tui.bD(new Object[0]).exA());
        this.a(jmq.nAl, lxo.tuj.bD(new Object[0]).exA());
        this.a(jmq.nAm, lxo.tuk.bD(new Object[0]).exA());
        this.a(jmq.nAn, lxo.tul.bD(new Object[0]).exA());
        this.a(jmq.nAo, lxo.tum.bD(new Object[0]).exA());
        this.a(jmq.nAp, lxo.tun.bD(new Object[0]).exA());
        this.a(jmq.nAq, lxo.tuo.bD(new Object[0]).exA());
        this.a(jmq.nAr, lxo.tup.bD(new Object[0]).exA());
        this.a(jmq.nAR, lxo.tuK.bD(new Object[0]).exA());
        this.a(jmq.nAS, lxo.tuL.bD(new Object[0]).exA());
        this.a(jmq.nAT, lxo.tuM.bD(new Object[0]).exA());
        this.a(jmq.nAU, lxo.tuN.bD(new Object[0]).exA());
        this.a(jmq.nAV, lxo.tuO.bD(new Object[0]).exA());
        this.a(jmq.nAW, lxo.tuP.bD(new Object[0]).exA());
        this.a(jmq.nAX, lxo.tuQ.bD(new Object[0]).exA());
        this.a(jmq.nAY, lxo.tuR.bD(new Object[0]).exA());
        this.a(jmq.nAs, lxo.tuq.bD(new Object[0]).exA());
        this.a(jmq.nAt, lxo.tur.bD(new Object[0]).exA());
        this.a(jmq.nAu, lxo.tus.bD(new Object[0]).exA());
        this.a(jmq.nAv, lxo.tut.bD(new Object[0]).exA());
        this.a(jmq.nAw, lxo.tuu.bD(new Object[0]).exA());
        this.a(jmq.nAx, lxo.tuv.bD(new Object[0]).exA());
        this.a(jmq.nAy, lxo.tuw.bD(new Object[0]).exA());
        this.a(jmq.nAz, lxo.tux.bD(new Object[0]).exA());
        this.a(jmq.nAA, lxo.tuy.bD(new Object[0]).exA());
        this.a(jmq.nAB, lxo.tuz.bD(new Object[0]).exA());
        this.a(jmq.nAC, lxo.tuA.bD(new Object[0]).exA());
        this.a(jmq.nAD, lxo.tuB.bD(new Object[0]).exA());
        this.a(jmq.nAE, lxo.tuC.bD(new Object[0]).exA());
        this.a(jmq.nAF, lxo.tuD.bD(new Object[0]).exA());
        this.a(jmq.nAG, lxo.tuE.bD(new Object[0]).exA());
        this.a(jmq.nAH, lxo.tuF.bD(new Object[0]).exA());
        this.a(jmq.nAI, lxo.tuG.bD(new Object[0]).exA());
        this.a(jmq.nAJ, lxo.tuH.bD(new Object[0]).exA());
        this.a(jmq.nAK, lxo.tuI.bD(new Object[0]).exA());
        this.a(jmq.nAL, lxo.tuJ.bD(new Object[0]).exA());
        this.a(jmq.nAZ, lxo.tuU.bD(new Object[0]).exA());
        this.a(jmq.nBa, lxo.tuV.bD(new Object[0]).exA());
        this.a(jmq.nyX, lxo.tti.bD(new Object[0]).exA());
        this.a(jmq.nyY, lxo.ttj.bD(new Object[0]).exA());
        this.a(jmq.nzR, lxo.tuY.bD(new Object[0]).exA());
        this.a(jmq.nzS, lxo.ttP.bD(new Object[0]).exA());
        this.a(jmq.nBC, lxo.ttQ.bD(new Object[0]).exA());
        this.a(jmq.nzT, lxo.ttR.bD(new Object[0]).exA());
        this.a(jmq.nzV, lxo.tuX.bD(new Object[0]).exA());
        this.a(jmq.nzW, lxo.ttT.bD(new Object[0]).exA());
        if (lcw.aQH()) {
            this.a(jmq.nzX, lxo.ttU.bD(new Object[0]).exA());
            this.a(jmq.nzU, lxo.ttV.bD(new Object[0]).exA());
        } else {
            this.a(jmq.nzU, lxo.ttS.bD(new Object[0]).exA());
        }
        this.a(jmq.nzY, lxo.ttW.bD(new Object[0]).exA());
        this.a(jmq.nzZ, lxo.ttX.bD(new Object[0]).exA());
        this.a(jmq.nAa, lxo.tuW.bD(new Object[0]).exA());
        this.a(jmq.nAb, lxo.ttY.bD(new Object[0]).exA());
        this.a(jmq.nAQ, lxo.ttZ.bD(new Object[0]).exA());
        this.a(jmq.nBb, lxo.tuZ.bD(new Object[0]).exA());
        this.a(jmq.nBe, lxo.tvf.bD(new Object[0]).exA());
        this.a(jmq.nBf, lxo.tvg.bD(new Object[0]).exA());
        this.a(jmq.nBg, lxo.tvh.bD(new Object[0]).exA());
        this.a(jmq.nBh, lxo.tvi.bD(new Object[0]).exA());
        this.a(jmq.nBi, lxo.tvj.bD(new Object[0]).exA());
        this.a(jmq.nBj, lxo.tvk.bD(new Object[0]).exA());
        this.a(jmq.nBk, lxo.tvl.bD(new Object[0]).exA());
        this.a(jmq.nBl, lxo.tvm.bD(new Object[0]).exA());
        this.a(jmq.nBm, lxo.tvn.bD(new Object[0]).exA());
        this.a(jmq.nBn, lxo.tvo.bD(new Object[0]).exA());
        this.a(jmq.nBo, lxo.tvp.bD(new Object[0]).exA());
        this.a(jmq.nBp, lxo.tvq.bD(new Object[0]).exA());
        this.a(jmq.nBq, lxo.tvr.bD(new Object[0]).exA());
        this.a(jmq.nBr, lxo.tvs.bD(new Object[0]).exA());
        this.a(jmq.nBs, lxo.tvt.bD(new Object[0]).exA());
        this.a(jmq.nBt, lxo.tvu.bD(new Object[0]).exA());
        this.a(jmq.nBu, lxo.tvv.bD(new Object[0]).exA());
        this.a(jmq.nBv, lxo.tvw.bD(new Object[0]).exA());
        this.a(jmq.nBw, lxo.tvx.bD(new Object[0]).exA());
        this.a(jmq.nBx, lxo.tvy.bD(new Object[0]).exA());
        this.a(jmq.nBy, lxo.tvz.bD(new Object[0]).exA());
        this.a(jmq.nBz, lxo.tvA.bD(new Object[0]).exA());
        this.a(jmq.nBA, lxo.tvB.bD(new Object[0]).exA());
        this.a(jmq.nBB, lxo.tvC.bD(new Object[0]).exA());
        this.a(jmq.nBD, lxo.tvD.bD(new Object[0]).exA());
        this.a(jmq.nBE, lxo.tvE.bD(new Object[0]).exA());
        this.a(jmq.nBF, lxo.tvF.bD(new Object[0]).exA());
        this.a(jmq.nBG, lxo.tvG.bD(new Object[0]).exA());
        this.a(jmq.nBH, lxo.tvH.bD(new Object[0]).exA());
        this.a(jmq.nBI, lxo.tvI.bD(new Object[0]).exA());
        this.a(jmq.nBJ, lxo.tvJ.bD(new Object[0]).exA());
        this.a(jmq.nBK, lxo.tvK.bD(new Object[0]).exA());
        this.a(jmq.nBL, lxo.tvL.bD(new Object[0]).exA());
        this.a(jmq.nBM, lxo.tvM.bD(new Object[0]).exA());
    }

    public boolean verify() {
        if (this.actions.size() != this.bindings.size()) {
            return false;
        }
        return this.bindings.size() == this.displays.size();
    }

    public static String nU(String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = string.split(",");
        if (stringArray.length == 0) {
            return NULL_BINDING_STRING;
        }
        Arrays.sort(stringArray, new Comparator<String>(){

            public int compare(String string, String string2) {
                if (string.contains("_CTRL") || string.contains("_ALT") || string.contains("_SHIFT")) {
                    return -1;
                }
                if (string2.contains("_CTRL") || string2.contains("_ALT") || string2.contains("_SHIFT")) {
                    return 1;
                }
                return 0;
            }
        });
        String string2 = SFInputBindingsDTO.nV(stringArray[0]);
        for (int i = 1; i < stringArray.length; ++i) {
            string2 = string2 + " + " + SFInputBindingsDTO.nV(stringArray[i]);
        }
        return string2;
    }

    public static String nV(String string) {
        if (string.indexOf(".") < 0) {
            return string;
        }
        String string2 = string.substring(string.indexOf(".") + 1);
        string2 = string2.replaceAll("LEFT_", "L");
        string2 = string2.replaceAll("RIGHT_", "R");
        string2 = string2.replaceAll("CONTROL", "CTRL");
        if ((string2 = string2.replaceAll("_", " ")).equals("PRIOR")) {
            string2 = "PAGE UP";
        }
        if (string2.equals("NEXT")) {
            string2 = "PAGE DOWN";
        }
        if (string2.equals("DIVIDE")) {
            string2 = "NUMPAD /";
        }
        if (string2.equals("MULTIPLY")) {
            string2 = "NUMPAD *";
        }
        if (string2.equals("SUBTRACT")) {
            string2 = "NUMPAD -";
        }
        if (string2.equals("ADD")) {
            string2 = "NUMPAD +";
        }
        if (string2.equals("NUMPADENTER")) {
            string2 = "NUMPAD ENTER";
        }
        if (string2.equals("GRAVE")) {
            string2 = "`";
        }
        if (string2.equals("MINUS")) {
            string2 = "-";
        }
        if (string2.equals("EQUALS")) {
            string2 = "=";
        }
        if (string2.equals("SLASH")) {
            string2 = "/";
        }
        if (string2.equals("PERIOD")) {
            string2 = ".";
        }
        if (string2.equals("COMMA")) {
            string2 = ",";
        }
        if (string2.equals("RBRACKET")) {
            string2 = "]";
        }
        if (string2.equals("LBRACKET")) {
            string2 = "[";
        }
        if (string2.equals("BACKSLASH")) {
            string2 = "\\";
        }
        if (string2.equals("APOSTROPHE")) {
            string2 = "'";
        }
        if (string2.equals("SEMICOLON")) {
            string2 = ";";
        }
        return string2;
    }

    public void cDE() {
        for (int i = 0; i < this.bindings.size(); ++i) {
            this.bindings.set(i, SFInputBindingsDTO.nU(this.bindings.get(i)));
        }
    }

    public static boolean D(String string, String string2) {
        TreeSet<String> treeSet = new TreeSet<String>();
        for (String string3 : string.split(",")) {
            treeSet.add(string3);
        }
        TreeSet treeSet2 = new TreeSet();
        for (String string4 : string2.split(",")) {
            treeSet2.add(string4);
        }
        return treeSet.equals(treeSet2);
    }

    public SFInputBindingsDTO cDF() {
        SFInputBindingsDTO sFInputBindingsDTO = new SFInputBindingsDTO();
        for (int i = 0; i < this.actions.size(); ++i) {
            int n = sFInputBindingsDTO.actions.indexOf(this.actions.get(i));
            if (n < 0) continue;
            sFInputBindingsDTO.bindings.set(n, this.bindings.get(i));
        }
        return sFInputBindingsDTO;
    }
}

