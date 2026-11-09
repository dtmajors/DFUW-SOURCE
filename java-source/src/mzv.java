/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class mzv {
    public boolean v() {
        return this.b("worldbuilder/worldbuilder_configuration.xml");
    }

    public boolean b(String string) {
        jrw jrw2 = jry.to(lcw.qLb + string);
        if (!jrw2.exists()) {
            mzw mzw2 = new mzw();
            mzw2.eTA();
            return false;
        }
        Document document = jsy.tK(string);
        if (document == null) {
            lfn.b(5, "SFWorldbuilderConfigParser", "parseConfigurationFile() : Invalid Document: [" + string + "]");
            return false;
        }
        try {
            this.e(document);
        }
        catch (Exception exception) {
            lfn.log("", exception);
            return false;
        }
        return true;
    }

    private void e(Document document) {
        Node node = jsy.a("SFConfiguration", (Node)document);
        if (node == null) {
            throw new bn("SFConfiguration");
        }
        String string = "OneClickObjectSelect";
        Node node2 = jsy.a(string, node);
        if (node2 != null) {
            mje.DAX = jsy.t(node2);
        } else {
            lfn.b(4, this.getClass().getName(), "getConfigData() : Could not Find Node = " + string);
        }
        string = "ShowThumbNails";
        node2 = jsy.a(string, node);
        if (node2 != null) {
            mje.DAY = jsy.t(node2);
        } else {
            lfn.b(4, this.getClass().getName(), "getConfigData() : Could not Find Node = " + string);
        }
        string = "SelectFromAll";
        node2 = jsy.a(string, node);
        if (node2 != null) {
            mje.DAZ = jsy.t(node2);
        } else {
            lfn.b(4, this.getClass().getName(), "getConfigData() : Could not Find Node = " + string);
        }
        string = "OptimizeMeshForFullPreprocess";
        node2 = jsy.a(string, node);
        if (node2 != null) {
            mje.DBa = jsy.t(node2);
        } else {
            lfn.b(4, this.getClass().getName(), "getConfigData() : Could not Find Node = " + string);
        }
        string = "ShowPreProcessMessages";
        node2 = jsy.a(string, node);
        if (node2 != null) {
            mje.DBb = jsy.t(node2);
        } else {
            lfn.b(4, this.getClass().getName(), "getConfigData() : Could not Find Node = " + string);
        }
        string = "SetShaderOnSelect";
        node2 = jsy.a(string, node);
        if (node2 != null) {
            mje.DBc = jsy.t(node2);
        } else {
            lfn.b(4, this.getClass().getName(), "getConfigData() : Could not Find Node = " + string);
        }
        string = "SetLastLoadedObjectSelected";
        node2 = jsy.a(string, node);
        if (node2 != null) {
            mje.DBd = jsy.t(node2);
        } else {
            lfn.b(4, this.getClass().getName(), "getConfigData() : Could not Find Node = " + string);
        }
        string = "OnlyOneInstance";
        node2 = jsy.a(string, node);
        if (node2 != null) {
            mje.DBj = jsy.t(node2);
        } else {
            lfn.b(4, this.getClass().getName(), "getConfigData() : Could not Find Node = " + string);
        }
        string = "PowerUser";
        node2 = jsy.a(string, node);
        if (node2 != null) {
            mje.DBk = jsy.t(node2);
        } else {
            lfn.b(4, this.getClass().getName(), "getConfigData() : Could not Find Node = " + string);
        }
        string = "ValidateQuests";
        node2 = jsy.a(string, node);
        if (node2 != null) {
            lcw.qHa = jsy.t(node2);
        }
        if ((node2 = jsy.a(string = "PreloadQuestResources", node)) != null) {
            lcw.qHb = jsy.t(node2);
        }
        if ((node2 = jsy.a(string = "MouseWheelSensitivity", node)) != null) {
            mje.DBf = jsy.o(node2);
        } else {
            lfn.b(4, this.getClass().getName(), "getConfigData() : Could not Find Node = " + string);
        }
        string = "FrameDelay";
        node2 = jsy.a(string, node);
        if (node2 != null) {
            mje.DBe = jsy.r(node2);
        } else {
            lfn.b(4, this.getClass().getName(), "getConfigData() : Could not Find Node = " + string);
        }
        string = "RandomRotateNatureObjects";
        node2 = jsy.a(string, node);
        if (node2 != null) {
            mje.DBh = jsy.t(node2);
        } else {
            lfn.b(4, this.getClass().getName(), "getConfigData() : Could not Find Node = " + string);
        }
    }
}

