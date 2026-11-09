/*
 * Decompiled with CFR.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class kzh {
    public static final String qnM = "styx.office.aventurine.gr";
    public static final String qnN = "skilltree_beta";
    public static final String qnO = "mbouclas";
    public static final String qnP = "magicj";
    public static final String qnQ = "com.mysql.jdbc.Driver";
    private String ZQ = null;
    private String hD = null;
    private boolean Wv = false;
    private Connection qnR;
    private Statement qnS;

    public boolean ekc() {
        return this.ao(qnO, qnP);
    }

    public boolean ao(String string, String string2) {
        try {
            if (this.Wv) {
                lfn.b(2, "SFDatabaseProxy", "connectMySQL() A connection has already been established.");
                return true;
            }
            Class.forName(qnQ);
            Properties properties = new Properties();
            properties.put("user", string);
            properties.put("password", string2);
            String string3 = "jdbc:mysql://styx.office.aventurine.gr/skilltree_beta";
            lfn.b(0, "SFDatabaseProxy", "connectMySQL() '" + string3 + "'");
            this.qnR = DriverManager.getConnection(string3, properties);
            this.qnS = this.qnR.createStatement();
            this.Wv = true;
            this.ZQ = string;
            this.hD = string2;
            lfn.b(2, "SFDatabaseProxy", "connectMySQL() A connection to the database has been established.");
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            lfn.b(5, "SFDatabaseProxy", "connectMySQL() Could not find the database driver.");
            lfn.log("SFDatabaseProxy", classNotFoundException);
            return false;
        }
        catch (SQLException sQLException) {
            lfn.b(5, "SFDatabaseProxy", "connectMySQL() Unable to create a connection to the database.");
            lfn.log("SFDatabaseProxy", sQLException);
            return false;
        }
    }

    public boolean am(int n, boolean bl) {
        assert (n > 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Update tree_data_link_properties_values set value='");
        stringBuilder.append(bl);
        stringBuilder.append("' where tree_id='");
        stringBuilder.append(n);
        stringBuilder.append("' and tree_type='resourcetree' and property_value_id='21'");
        try {
            int n2 = this.qnS.executeUpdate(stringBuilder.toString());
            return n2 == 1;
        }
        catch (SQLException sQLException) {
            lfn.b(5, "SFDatabaseProxy", "changeResourceNodeInfo() The update failed.");
            lfn.log("SFDatabaseProxy", sQLException);
            return false;
        }
    }

    public boolean Z(int n, String string) {
        assert (n > 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Update tree_data_link_properties_values set value='");
        stringBuilder.append(string);
        stringBuilder.append("' where tree_id='");
        stringBuilder.append(n);
        stringBuilder.append("' and tree_type='resourcetree' and property_value_id='19'");
        try {
            int n2 = this.qnS.executeUpdate(stringBuilder.toString());
            return n2 == 1;
        }
        catch (SQLException sQLException) {
            lfn.b(5, "SFDatabaseProxy", "changeResourceNodeInfo() The update failed.");
            lfn.log("SFDatabaseProxy", sQLException);
            return false;
        }
    }

    public boolean xS(String string) {
        assert (string != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("INSERT INTO special_properties_fields VALUES ('','17','");
        stringBuilder.append(string);
        stringBuilder.append("'");
        try {
            int n = this.qnS.executeUpdate(stringBuilder.toString());
            return n == 1;
        }
        catch (SQLException sQLException) {
            lfn.b(5, "SFDatabaseProxy", "insertSpecialEffectName() The insert failed.");
            lfn.log("SFDatabaseProxy", sQLException);
            return false;
        }
    }

    public boolean xT(String string) {
        assert (string != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT * FROM special_properties_fields WHERE special_property_id='17' and title='");
        stringBuilder.append(string);
        stringBuilder.append("'");
        try {
            ResultSet resultSet = this.qnS.executeQuery(stringBuilder.toString());
            int n = 0;
            while (resultSet.next()) {
                ++n;
            }
            assert (n <= 1);
            return n == 1;
        }
        catch (SQLException sQLException) {
            lfn.b(5, "SFDatabaseProxy", "findSpecialEffectName() The query failed.");
            lfn.log("SFDatabaseProxy", sQLException);
            return false;
        }
    }

    public List ekd() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT * FROM special_properties_fields WHERE special_property_id='17'");
        try {
            ResultSet resultSet = this.qnS.executeQuery(stringBuilder.toString());
            ArrayList<String> arrayList = lcn.emv();
            while (resultSet.next()) {
                arrayList.add(resultSet.getString("title"));
            }
            return arrayList;
        }
        catch (SQLException sQLException) {
            lfn.b(5, "SFDatabaseProxy", "selectAllSpecialEffectNames() The query failed.");
            lfn.log("SFDatabaseProxy", sQLException);
            return null;
        }
    }

    public void abp(int n) {
        assert (n > 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Select * from tree_data_link_properties_values where tree_id='");
        stringBuilder.append(n);
        stringBuilder.append("' and tree_type='resourcetree' and property_value_id='21'");
        try {
            ResultSet resultSet = this.qnS.executeQuery(stringBuilder.toString());
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int n2 = resultSetMetaData.getColumnCount();
            while (resultSet.next()) {
                for (int i2 = 1; i2 <= n2; ++i2) {
                    lfn.b(0, "SFDatabaseProxy", "selectTest() '" + resultSetMetaData.getColumnName(i2) + "'");
                }
                lfn.b(0, "SFDatabaseProxy", "selectTest() Value='" + resultSet.getString("value") + "'");
            }
        }
        catch (SQLException sQLException) {
            lfn.b(5, "SFDatabaseProxy", "selectTest() The query failed.");
            lfn.log("SFDatabaseProxy", sQLException);
        }
    }
}

