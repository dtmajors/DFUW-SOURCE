/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdk
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jth {
    public boolean v() {
        return this.b("xml-files/config/configuration.xml");
    }

    public boolean b(String string) {
        Document document = jsy.tK(string);
        if (document == null) {
            return false;
        }
        try {
            this.e(document);
        }
        catch (Exception exception) {
            return false;
        }
        return true;
    }

    private byte[] tQ(String string) {
        if (string == null) {
            return null;
        }
        if (string.length() == 0) {
            return null;
        }
        if (string.length() % 2 != 0) {
            return null;
        }
        byte[] byArray = new byte[string.length() / 2];
        for (int i = 0; i < string.length(); i += 2) {
            int n = Character.digit(string.charAt(i), 16);
            if (n < 0) {
                return null;
            }
            int n2 = Character.digit(string.charAt(i + 1), 16);
            if (n2 < 0) {
                return null;
            }
            byArray[i / 2] = (byte)((n << 4) + n2);
        }
        return byArray;
    }

    private void e(Document document) {
        String string;
        float f;
        Node node = jsy.a("SFConfiguration", (Node)document);
        if (node == null) {
            throw new bn("SFConfiguration");
        }
        Node node2 = jsy.a("UseSeveralObjectSpaceManagers", node);
        if (node2 != null) {
            boolean bl;
            lcw.qGU = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("CreateAIObjectSpaceManager", node)) != null) {
            lcw.qGV = jsy.t(node2);
        }
        if ((node2 = jsy.a("CreateClientObjectSpaceManager", node)) != null) {
            lcw.qGW = jsy.t(node2);
        }
        if ((node2 = jsy.a("SkipGhostObject", node)) != null) {
            lcw.qGX = jsy.t(node2);
        }
        if ((node2 = jsy.a("ChangeSkillDirectories", node)) != null) {
            lcw.qGY = jsy.t(node2);
        }
        if ((node2 = jsy.a("UserName", node)) == null) {
            throw new bn("UserName Not found!");
        }
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bn("UserName is invalid.");
        }
        dsv.byP().aQ(string2);
        node2 = jsy.a("WorldDataFile", node);
        if (node2 == null) {
            throw new bn("WorldDataFile Not found!");
        }
        lcw.qHG = jsy.m(node2);
        node2 = jsy.a("WorldDataFileAI", node);
        if (node2 == null) {
            throw new bn("WorldDataFileAI Not found!");
        }
        lcw.qHH = jsy.m(node2);
        node2 = jsy.a("WorldBuilderMode", node);
        if (node2 == null) {
            throw new bn("WorldBuilderMode Not found!");
        }
        lcw.qHe = jsy.t(node2);
        node2 = jsy.a("WB_NormalSpeedMultiplyer", node);
        if (node2 != null) {
            float f2;
            lcw.qGF = f2 = jsy.o(node2);
        }
        if ((node2 = jsy.a("WB_SuperSpeedMultiplyer", node)) != null) {
            float f3;
            lcw.qGG = f3 = jsy.o(node2);
        }
        if ((node2 = jsy.a("UseDynamicLoading", node)) != null) {
            boolean bl;
            lcw.qGK = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("UseLoadingScreen", node)) != null) {
            boolean bl;
            bth.dKO = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("SpawnFromBindstones", node)) != null) {
            lcw.qFM = true;
        }
        if ((node2 = jsy.a("EnableCharacterCreator", node)) != null) {
            lcw.bn = jsy.t(node2);
        }
        if ((node2 = jsy.a("ActiveZone", node)) != null) {
            String string3;
            lcw.qGO = string3 = jsy.m(node2);
        }
        if ((node2 = jsy.a("UseGUI", node)) != null) {
            boolean bl;
            lcw.qOQ = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("EnableGuiExtraSpam", node)) != null) {
            boolean bl;
            hdk.jLX = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("StartInitManager", node)) != null) {
            boolean bl;
            lcw.qHf = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("UseEnvironmentSystem", node)) != null) {
            boolean bl;
            lcw.qHg = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("EnvironmentRealsSecondsInGametimeSeconds", node)) != null) {
            int n = jsy.r(node2);
            lcw.qPM = n;
        }
        if ((node2 = jsy.a("EnvironmentDefaultConfig", node)) != null) {
            lcw.qPL = jsy.m(node2);
        }
        if ((node2 = jsy.a("StartFullscreen", node)) != null) {
            boolean bl;
            lcw.qGS = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("ResolutionWidth", node)) != null) {
            int n;
            lcw.qFT = n = jsy.r(node2);
        }
        if ((node2 = jsy.a("ResolutionHeight", node)) != null) {
            int n;
            lcw.qFU = n = jsy.r(node2);
        }
        if ((node2 = jsy.a("CashShopBaseURLKR", node)) != null) {
            lcw.qPh = jsy.m(node2);
        }
        if ((node2 = jsy.a("CashShopEncKeyKR", node)) != null) {
            lcw.qPi = this.tQ(jsy.m(node2));
        }
        if ((node2 = jsy.a("CashShopEncIVKR", node)) != null) {
            lcw.qPj = this.tQ(jsy.m(node2));
        }
        if ((node2 = jsy.a("CashShopBaseURLJP", node)) != null) {
            lcw.qPk = jsy.m(node2);
        }
        if ((node2 = jsy.a("CashShopEncKeyJP", node)) != null) {
            lcw.qPl = this.tQ(jsy.m(node2));
        }
        if ((node2 = jsy.a("CashShopEncIVJP", node)) != null) {
            lcw.qPm = this.tQ(jsy.m(node2));
        }
        if ((node2 = jsy.a("BrowserUrlBase", node)) != null) {
            String string4;
            lcw.qPe = string4 = jsy.m(node2);
        }
        if ((node2 = jsy.a("BrowserUrlBoards", node)) != null) {
            String string5;
            lcw.qPf = string5 = jsy.m(node2);
        }
        if ((node2 = jsy.a("BrowserUrlClanBoards", node)) != null) {
            String string6;
            lcw.qPg = string6 = jsy.m(node2);
        }
        if ((node2 = jsy.a("LoadObjectSpecialEffectFiles", node)) != null) {
            boolean bl;
            lcw.qFR = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("AreaOfInterestRadius", node)) != null && (f = jsy.o(node2)) >= 5.0f) {
            in.agb = f;
        }
        if ((node2 = jsy.a("LoadDynamicAIFromLevel", node)) != null) {
            boolean bl;
            lcw.qGQ = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("EnableQuickstart", node)) != null) {
            boolean bl;
            lcw.qGR = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("ChangeTileCheckSeconds", node)) != null) {
            int n;
            lcw.qGj = n = jsy.r(node2);
        }
        if ((node2 = jsy.a("UseNewQuestGUI", node)) != null) {
            boolean bl;
            lcw.qFA = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("GamelogicConfigFileName", node)) != null && (string = jsy.m(node2)) != null && !string.trim().equals("") && !string.equalsIgnoreCase("NULL")) {
            lcw.qJQ = string;
        }
        if ((node2 = jsy.a("BuildType", node)) != null) {
            int n;
            lcw.bcB = n = jsy.r(node2);
        }
        if ((node2 = jsy.a("UpdateMarketTables", node)) != null) {
            lcw.qGt = jsy.t(node2);
        }
    }
}

