/*
 * Decompiled with CFR.
 */
public class hwk {
    private String _prefix = "";
    private int hf = -1;
    private double lin = -1.0;
    private double lio = -1.0;
    private double lip = -1.0;
    private double liq = -1.0;

    public hwk(String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        String[] stringArray = string.split(";");
        if (stringArray == null) {
            return;
        }
        if (stringArray.length == 0) {
            return;
        }
        int n = 1;
        try {
            this.hf = Integer.valueOf(stringArray[0]);
        }
        catch (NumberFormatException numberFormatException) {
            this._prefix = stringArray[0];
            if (this._prefix == null) {
                this._prefix = "";
            }
            if (stringArray.length == 1) {
                return;
            }
            try {
                this.hf = Integer.valueOf(stringArray[1]);
            }
            catch (NumberFormatException numberFormatException2) {
                this.hf = -1;
            }
            n = 2;
        }
        if (stringArray.length == n) {
            return;
        }
        try {
            this.lin = Double.valueOf(stringArray[n]);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        if (stringArray.length == ++n) {
            return;
        }
        try {
            this.lio = Double.valueOf(stringArray[n]);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        if (stringArray.length == ++n) {
            return;
        }
        try {
            this.lip = Double.valueOf(stringArray[n]);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        if (stringArray.length == ++n) {
            return;
        }
        try {
            this.liq = Double.valueOf(stringArray[n]);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    public String getPrefix() {
        return this._prefix;
    }

    public int getId() {
        return this.hf;
    }

    public double cBe() {
        return this.lin;
    }

    public double cBf() {
        return this.lio;
    }

    public double getX() {
        return this.lip;
    }

    public double getY() {
        return this.liq;
    }

    public boolean cBg() {
        return this._prefix.equals("folder");
    }

    public boolean cBh() {
        return this._prefix.equals("movie");
    }

    public boolean cBi() {
        return this._prefix != null && !this._prefix.isEmpty();
    }
}

