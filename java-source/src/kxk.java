/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 *  lcw
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class kxk {
    private static final String qgp = "com.mysql.jdbc.Driver";
    private List<kxl> qgq = lcn.emv();
    private Map<ldv, kxh> qgr = lcn.emw();
    private Map<ldv, kxi> dih = lcn.emw();
    private kxj qgs = kxj.qgl;
    private int fd = 1;
    private int fe = 5;

    public static void main(String[] stringArray) {
        block2: {
            kxk kxk2 = new kxk();
            try {
                kxk2.eie();
            }
            catch (SQLException sQLException) {
                if ($assertionsDisabled) break block2;
                throw new AssertionError();
            }
        }
    }

    public void eie() {
        boolean bl = this.eif();
        if (!bl) {
            System.err.println("Failed to Load JDBC Driver Class!!!... Driver Class Name = com.mysql.jdbc.Driver");
            return;
        }
        this.initialize();
        kxl kxl2 = new kxl(this.qgs, "df_persistence_read");
        if (!kxl2.eij()) {
            System.err.print("Failed to connect to database : df_persistence_read");
            kxl2.closeConnection();
            return;
        }
        boolean bl2 = this.a(kxl2);
        if (!bl2) {
            System.err.print("Wall data collection failed");
            kxl2.closeConnection();
            return;
        }
        bl2 = this.b(kxl2);
        if (!bl2) {
            System.err.print("City data collection failed");
            kxl2.closeConnection();
            return;
        }
        this.eig();
        bl2 = this.c(kxl2);
        if (!bl2) {
            System.err.print("Deletion of wall elements failed. Database table should be reverted.");
            kxl2.closeConnection();
            return;
        }
        this.d(kxl2);
        kxl2.closeConnection();
    }

    private boolean eif() {
        boolean bl = false;
        try {
            Class.forName(qgp);
            bl = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        return bl;
    }

    private void initialize() {
        lcw.qLa = "dfdata";
        lcw.qLb = "dfdata";
        lcw.qHF = 3;
        juf juf2 = new juf();
        juf2.uf("xml-files/gamelogicinfo/resourcetree.xml");
        cug.anZ();
        ldx.enG().bN(3);
        lcr.fQ((int)1001, (int)301);
    }

    private boolean a(kxl kxl2) {
        String string = "SELECT CityGUID, ElementGUID, ElementResourceTypeName FROM city_element WHERE GameID = " + this.fd + " And WorldID = " + this.fe + " AND (ElementResourceTypeName Like \"%r_clan wall%\" Or ElementResourceTypeName Like \"%r_Clan Tower Cannon%\" OR ElementResourceTypeName Like \"%r_Clan Scaffhold%\")";
        ResultSet resultSet = kxl2.xl(string);
        try {
            while (resultSet.next()) {
                ldv ldv2 = ldv.zp(resultSet.getString("CityGUID"));
                ldv ldv3 = ldv.zp(resultSet.getString("ElementGUID"));
                String string2 = resultSet.getString("ElementResourceTypeName");
                int n = lea.enW().getType(string2);
                if (!(lea.enW().isDescendant(n, cug.fpp) || lea.enW().isDescendant(n, cug.fnB) || lea.enW().isDescendant(n, cug.fpk))) {
                    System.err.println("Resource : " + string2 + " is not a child of walls.");
                    continue;
                }
                kxh kxh2 = this.qgr.get(ldv2);
                if (kxh2 == null) {
                    kxh2 = new kxh(ldv2);
                    this.qgr.put(ldv2, kxh2);
                }
                kxh2.a(new kxg(ldv2, ldv3, string2, n));
                System.out.println("Element : " + string2 + " was added at city : " + ldv2);
            }
            return true;
        }
        catch (SQLException sQLException) {
            sQLException.printStackTrace();
            return false;
        }
    }

    private boolean b(kxl kxl2) {
        if (this.qgr.isEmpty()) {
            System.err.println("There are no cities with wall elements builded!!!!");
            return false;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (ldv object2 : this.qgr.keySet()) {
            stringBuffer.append("\"" + object2.fk() + "\",");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String string = "SELECT CityGUID, ClanOwnerGUID, ClanOwnerName, CityFileName FROM city WHERE GameID = " + this.fd + " And WorldID = " + this.fe + " AND CityGUID IN (" + stringBuffer + ")";
        ResultSet resultSet = kxl2.xl(string);
        try {
            while (resultSet.next()) {
                kxi kxi2;
                ldv sQLException = ldv.zp(resultSet.getString("CityGUID"));
                String string2 = resultSet.getString("ClanOwnerGUID");
                if (string2 == null || string2.trim().isEmpty()) continue;
                ldv ldv2 = ldv.zp(string2);
                String string3 = resultSet.getString("ClanOwnerName");
                String string4 = resultSet.getString("CityFileName");
                kxh kxh2 = this.qgr.get(sQLException);
                assert (kxh2 != null) : "There is no city info for CityGUID : " + sQLException;
                if (kxh2 != null) {
                    kxh2.a(string4, string3, ldv2);
                    System.out.println("City with GUID : " + sQLException + " and file name : " + string4 + " belongs to clan : " + string3 + " with GUID : " + ldv2);
                }
                if ((kxi2 = this.dih.get(ldv2)) == null) {
                    kxi2 = new kxi(ldv2, string3);
                    this.dih.put(ldv2, kxi2);
                    System.out.println("Clan : " + ldv2 + " with GUID : " + ldv2 + " was added.");
                }
                kxi2.tN(sQLException);
                System.out.println("City : " + sQLException + " was added to clan : " + string3 + " with GUID : " + ldv2 + " was added.");
            }
            return true;
        }
        catch (SQLException sQLException) {
            sQLException.printStackTrace();
            return false;
        }
    }

    private void eig() {
        if (this.dih.isEmpty()) {
            System.err.println("There are no clans!!!!");
            return;
        }
        for (kxi kxi2 : this.dih.values()) {
            kxi2.Z(this.qgr);
        }
    }

    private boolean c(kxl kxl2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (kxh kxh2 : this.qgr.values()) {
            List<kxg> list = kxh2.YG();
            for (kxg kxg2 : list) {
                stringBuffer.append("\"" + kxg2.getGUID().fk() + "\",");
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String string = "Delete  FROM city_element WHERE GameID = " + this.fd + " And WorldID = " + this.fe + " AND ElementGUID IN (" + stringBuffer.toString() + ")";
        return kxl2.xm(string);
    }

    private boolean d(kxl kxl2) {
        long l2 = this.e(kxl2);
        if (l2 == -1L) {
            System.err.println("Could not acquire Max Item ID.");
            return false;
        }
        String string = lea.enW().getName(cug.fqf);
        int n = bqm.b.dEp.ordinal();
        String string2 = "Insert INTO inventory(GameID,WorldID,OwnerGUID,ItemID,InventoryType,ParentID,ResourceType,Quantity,LayerSlotNumber,Attributes) VALUES ";
        StringBuffer stringBuffer = new StringBuffer();
        for (kxi kxi2 : this.dih.values()) {
            stringBuffer.append("(");
            stringBuffer.append("'" + this.fd + "','" + this.fe + "','" + kxi2.getGUID().fk() + "','" + ++l2 + "','" + n + "','" + 1 + "','" + string + "','" + kxi2.eid() + "','" + -1 + "','" + "" + "'),");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return kxl2.xm("Insert INTO inventory(GameID,WorldID,OwnerGUID,ItemID,InventoryType,ParentID,ResourceType,Quantity,LayerSlotNumber,Attributes) VALUES " + stringBuffer.toString());
    }

    private long e(kxl kxl2) {
        String string = "SELECT MAX(ItemID) AS MaxID FROM inventory";
        ResultSet resultSet = kxl2.xl("SELECT MAX(ItemID) AS MaxID FROM inventory");
        long l2 = -1L;
        try {
            if (resultSet.next()) {
                l2 = resultSet.getLong("MaxID");
            }
        }
        catch (SQLException sQLException) {
            sQLException.printStackTrace();
            return -1L;
        }
        return l2;
    }
}

