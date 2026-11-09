/*
 * Decompiled with CFR.
 */
public class kzc {
    private jzw qnv = null;

    public kzc() {
        try {
            this.start();
        }
        catch (bg bg2) {
            lfn.log("SFInventoryTester", bg2);
        }
    }

    private void start() {
        this.qnv = new jzw();
        jzo jzo2 = new jzo();
        jzo2.dTX();
        this.ejZ();
        this.eka();
    }

    private void ejZ() {
        String string = "xml-files/server/resourcecontainers/shop inventory/inv_simple.xml";
        this.qnv.M(string, true);
    }

    private void eka() {
        String string = "paperdoll_inventory2.xml";
        this.qnv.vM(string);
    }
}

