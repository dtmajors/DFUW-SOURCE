/*
 * Decompiled with CFR.
 */
public class dte {
    public static final int NORMAL = 0;
    public static final int hbn = 1;
    public static final int SYSTEM = 2;
    public static final int hbo = 3;
    public static final int hbp = 4;
    public static final int hbq = 5;
    public static final int hbr = 6;
    public static final int hbs = 7;
    public static final int hbt = 8;
    public static final int hbu = 9;
    public static final int hbv = 10;
    public static final int hbw = 11;
    public static final int hbx = 12;
    public static final int hby = 13;
    public static final int hbz = 14;
    public static final int hbA = 15;
    public static final int hbB = 16;
    public static final int hbC = 17;
    public static final int hbD = 18;
    public static final int hbE = 19;
    public static final int hbF = 20;
    public static final int hbG = 21;
    public static final int hbH = 22;
    public static final int hbI = 23;
    public static final int hbJ = 24;
    public static final int hbK = 25;
    public static final int hbL = 26;
    public static final int hbM = 27;
    public static final int hbN = 28;
    public static final int hbO = 28;
    public static final int hbP = 29;
    public static final int hbQ = 30;
    public static final int hbR = 31;
    public static final int hbS = 32;
    public static final int hbT = 33;
    public static final int hbU = 34;
    public static final int hbV = 35;
    public static final int hbW = 36;
    public static final int hbX = 37;
    public static final int hbY = 38;
    public static final int hbZ = 39;
    public static final int hca = 40;
    public static final int hcb = 41;
    public static final int hcc = 42;
    public static final int hcd = 43;
    public static final int hce = 44;
    public static final int hcf = 45;
    private static final String[] Types = new String[]{"Normal", "Tile", "System", "WB Camera", "Temp (no saving)", "WB Specific", "Clan", "Specialeffects", "A.I.", "Client Environment", "Boats", "Guns", "Mounts", "SpawnPoints", "Interactions", "Character Test", "Tanks", "Party", "BindStone", "Building", "GuardTower", "City", "Vendor", "Corpse", "Quest", "Portal", "Missile", "Engine Testing", "Gamelogic Node Message Forwarder", "Houses", "Control Points", "Player Village", "Teleporter", "Fortress System", "Stations", "Generic Physical Objects", "TradeRoute System", "Local Storage Object", "Slot Machine", "Track Flag", "Generic Object", "Gui", "HID", "Totem", "Airships"};

    public static String Cc(int n) {
        if (n >= 0 && n < Types.length) {
            return Types[n];
        }
        return "Invalid OS Type";
    }

    private dte() {
    }
}

