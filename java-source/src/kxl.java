/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  com.mysql.jdbc.Connection
 *  com.mysql.jdbc.Statement
 */
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class kxl {
    private static final String qgp = "com.mysql.jdbc.Driver";
    private String qgt = null;
    private int qgu = 3306;
    private String qgv = null;
    private String qgw = null;
    private String hD = null;
    private Connection qgx = null;
    private Statement qgy = null;
    private Statement qgz = null;

    public String eih() {
        return this.qgt;
    }

    public void xk(String string) {
        this.qgt = string;
    }

    public int eii() {
        return this.qgu;
    }

    public void aaO(int n) {
        this.qgu = n;
    }

    public String getDatabaseName() {
        return this.qgv;
    }

    public void setDatabaseName(String string) {
        this.qgv = string;
    }

    public String getUsername() {
        return this.qgw;
    }

    public void setUsername(String string) {
        this.qgw = string;
    }

    public String getPassword() {
        return this.hD;
    }

    public void setPassword(String string) {
        this.hD = string;
    }

    public kxl() {
    }

    public kxl(kxj kxj2, String string) {
        this.setDatabaseName(string);
        switch (kxj2) {
            case qgl: {
                this.xk("devsql");
                this.setUsername("dfserver");
                this.setPassword("dfserver");
                this.aaO(3306);
                break;
            }
            case qgm: {
                this.xk("sql001.internal.darkfallonline.com");
                this.setUsername("root");
                this.setPassword("twit6nul");
                this.aaO(3306);
                break;
            }
            case qgn: {
                this.xk("sql.us.darkfallonline.com");
                this.setUsername("root");
                this.setPassword("twit6nul");
                this.aaO(3306);
            }
        }
    }

    public kxl(kxl kxl2) {
        if (kxl2 != null) {
            this.qgt = kxl2.qgt;
            this.qgu = kxl2.qgu;
            this.qgw = kxl2.qgw;
            this.hD = kxl2.hD;
            this.qgv = kxl2.qgv;
        }
    }

    public boolean eij() {
        if (this.qgt == null || this.qgw == null || this.hD == null || this.qgv == null) {
            return false;
        }
        if (this.qgx != null || this.qgy != null) {
            return false;
        }
        try {
            Class.forName(qgp);
        }
        catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Failed to Load JDBC Driver Class!!!... Driver Class Name = com.mysql.jdbc.Driver");
            classNotFoundException.printStackTrace();
            return false;
        }
        String string = "jdbc:mysql://" + this.qgt + ":" + Integer.toString(this.qgu) + "/" + this.qgv;
        try {
            this.qgx = (Connection)DriverManager.getConnection(string, this.qgw, this.hD);
        }
        catch (SQLException sQLException) {
            System.err.println("Failed to Open Database Connection!!!... Connection URL = " + string);
            sQLException.printStackTrace();
            this.closeConnection();
            return false;
        }
        try {
            this.qgy = (Statement)this.qgx.createStatement(1003, 1008);
        }
        catch (SQLException sQLException) {
            System.err.println("Failed to Create Statement Object!!!");
            sQLException.printStackTrace();
            this.closeConnection();
            return false;
        }
        try {
            this.qgz = (Statement)this.qgx.createStatement(1003, 1008);
        }
        catch (SQLException sQLException) {
            System.err.println("Failed to Create Update Statement Object!!!");
            sQLException.printStackTrace();
            this.closeConnection();
            return false;
        }
        return true;
    }

    public void closeConnection() {
        if (this.qgy != null) {
            try {
                this.qgy.close();
            }
            catch (SQLException sQLException) {
                // empty catch block
            }
            this.qgy = null;
        }
        if (this.qgx != null) {
            try {
                this.qgx.close();
            }
            catch (SQLException sQLException) {
                // empty catch block
            }
            this.qgx = null;
        }
    }

    public ResultSet xl(String string) {
        if (this.qgx == null || this.qgy == null || string == null || string.isEmpty()) {
            System.err.println("Database Connection Must Be Opened Before Executing SQL Queries!!!");
            return null;
        }
        try {
            return this.qgy.executeQuery(string);
        }
        catch (SQLException sQLException) {
            System.err.println("Error Executing Query!!!... SQL = " + string);
            sQLException.printStackTrace();
            return null;
        }
    }

    public boolean xm(String string) {
        if (this.qgx == null || this.qgy == null || string == null || string.isEmpty()) {
            System.err.println("Database Connection Must Be Opened Before Executing SQL Queries!!!");
            return false;
        }
        try {
            return this.qgz.executeUpdate(string) > 0;
        }
        catch (SQLException sQLException) {
            System.err.println("Error Executing Query!!!... SQL = " + string);
            sQLException.printStackTrace();
            return false;
        }
    }
}

