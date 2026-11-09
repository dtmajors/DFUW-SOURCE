/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jxu {
    private Document cn = null;
    private String oZR = "";
    private String aNb = "";
    private jrw oZS = new jrw(lcw.qLb + "xml-files/server/vendor/" + "vendors/");
    private Node oYC = null;
    private jrw oZT = new jrw(lcw.qLb + "xml-files/gamelogicinfo/quests/complex/");
    private List<String> oZU = null;

    public String dUG() {
        this.oZU = lcn.emv();
        for (int i2 = 0; i2 < this.oZT.dRT().length; ++i2) {
            this.oZU.add(this.oZT.dRT()[i2].getName());
        }
        this.oZR = this.oZR + "\n Parsing Vendor  Files......";
        jrw[] jrwArray = this.oZS.dRT();
        if (jrwArray != null) {
            for (int i3 = 0; i3 < jrwArray.length; ++i3) {
                String string;
                if (!jrwArray[i3].isFile() || !(string = jrwArray[i3].getName()).endsWith(".xml")) continue;
                this.I(jrwArray[i3]);
            }
        }
        this.oZR = this.oZR + "\n" + this.aNb + "\n\n Validation Finished";
        return this.oZR;
    }

    private void I(jrw jrw2) {
        try {
            this.cn = jsy.n(jrw2);
            this.oYC = jsy.d("SFInteractionTemplate", this.cn);
            this.J(jrw2);
        }
        catch (bo bo2) {
            String string = bo2.getMessage();
            this.aNb = this.aNb + "Parse Exception  [" + jrw2.getAbsolutePath() + "] " + string;
        }
        catch (bg bg2) {
            bg2.printStackTrace();
        }
    }

    private void J(jrw jrw2) {
        Node node = jsy.a("SFInteraction", this.oYC);
        Node node2 = jsy.a("InteractionQuestList", node);
        List<Node> list = jsy.c("InteractionQuestFile", node2);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            boolean bl = false;
            String string = jsy.m(list.get(i2));
            if (this.oZU.contains(string)) continue;
            if (!bl) {
                this.aNb = this.aNb + "\n****************************************";
                this.aNb = this.aNb + "\nVendor  [" + jrw2.getName() + "]";
                bl = true;
            }
            this.aNb = this.aNb + "\n Complex Quest [" + string + "] Doesn't Exist";
        }
    }

    public String dUH() {
        return this.oZR;
    }
}

