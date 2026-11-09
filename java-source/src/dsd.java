/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcw
 */
import com.thoughtworks.xstream.XStream;

public class dsd
extends dqk {
    private String gXf = "";
    private boolean gXg = true;
    private bfw gXh = null;

    public dsd() {
        this.ObjectType = 140;
    }

    public dsd(bfw bfw2) {
        this.gXh = bfw2;
        this.ObjectType = 140;
    }

    public void initialize() {
        if (!lcw.qHe) {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "initialize() : Represantation objects should only be created from the worldbuilder");
            return;
        }
        this.ObjectDescriptionFilename = "gizmos\\gizmo_spawnpoint_01.xml";
        this.Rotation = new lgl();
        super.initialize();
    }

    public String bxz() {
        return this.gXf;
    }

    public void jj(String string) {
        this.gXf = string;
    }

    public boolean bxA() {
        return this.gXg;
    }

    public void jk(boolean bl) {
        this.gXg = bl;
    }

    public void b(bfw bfw2) {
        this.gXh = bfw2;
    }

    public bfw bxB() {
        return this.gXh;
    }

    public void b(dqn dqn2) {
        this.gXh.c(this.av());
        XStream xStream = bfy.de(true);
        String string = xStream.toXML(this.gXh);
        XStream xStream2 = bfy.de(false);
        bfw bfw2 = (bfw)xStream2.fromXML(string);
        dsd dsd2 = (dsd)((Object)dqn2);
        dsd2.b(bfw2);
        dsd2.jj(this.gXf);
        dsd2.jk(this.gXg);
        super.b(dqn2);
    }

    public void b(jrw jrw2) {
        this.gXh.c(this.av());
        XStream xStream = bfy.de(true);
        String string = xStream.toXML(this.gXh);
        jry.a(jrw2, "<SFGlobalEventTemplate>\r\n" + string + "\r\n</SFGlobalEventTemplate>");
    }

    public static dsd jk(String string) {
        String string2 = null;
        try {
            string2 = jry.ti(string);
        }
        catch (Exception exception) {
            lfn.b(5, "SFGlobalEventRepresentationObject", "createFromTemplate() : faliled to load template file " + string);
            return null;
        }
        int n = string2.indexOf(">");
        int n2 = string2.indexOf("</SFGlobalEventTemplate>");
        string2 = string2.substring(n + 1, n2 - 1);
        XStream xStream = bfy.de(false);
        bfw bfw2 = (bfw)xStream.fromXML(string2);
        if (bfw2 == null) {
            lfn.b(5, "SFGlobalEventRepresentationObject", "createFromTemplate() : failed to parse global event  ");
            return null;
        }
        dsd dsd2 = new dsd(bfw2);
        dsd2.jj(string);
        dsd2.jk(false);
        return dsd2;
    }
}

