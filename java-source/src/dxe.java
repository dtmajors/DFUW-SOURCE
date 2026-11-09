/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.sql.Timestamp;

public abstract class dxe
extends dvx {
    protected dxe() {
    }

    public static String a(Timestamp timestamp, int n2, ljq ljq2, String string, boolean bl) {
        return timestamp == null || ljq2 == null || string == null ? null : "INSERT INTO resource_summoning_log (GameID, WorldID, TimeStamp, CharacterID, PositionX, PositionY, PositionZ, ResourceName, IsSpawn, TileID) VALUES(" + lcw.qGe + ", " + lcw.qGf + ", " + dxe.aD(timestamp.toString()) + ", " + n2 + ", " + ljq2.x + ", " + ljq2.y + ", " + ljq2.rlV + ", " + dxe.aD(string) + ", " + (bl ? 1 : 0) + ", " + dxe.aD(dxe.cB(ljq2)) + ")";
    }

    public static String a(Timestamp timestamp, int n2, ljq ljq2, String string, int n3, String string2, float f2) {
        return timestamp == null || ljq2 == null || string == null || string2 == null ? null : "CALL updateCraftingOverviewTable(" + lcw.qGe + ", " + lcw.qGf + ", " + dxe.aD(timestamp.toString()) + ", " + n2 + ", " + ljq2.x + ", " + ljq2.y + ", " + ljq2.rlV + ", " + dxe.aD(string) + ", " + n3 + ", " + dxe.aD(string2) + ", " + dxe.aD(dxe.cB(ljq2)) + ", " + f2 + ")";
    }

    public static String a(Timestamp timestamp, int n2, ljq ljq2, String string, String string2, String string3, int n3, float f2, float f3) {
        return timestamp == null || ljq2 == null || string == null || string2 == null || string3 == null ? null : "CALL updateEnchantingTable(" + lcw.qGe + ", " + lcw.qGf + ", " + dxe.aD(timestamp.toString()) + ", " + n2 + ", " + ljq2.x + ", " + ljq2.y + ", " + ljq2.rlV + ", " + dxe.aD(string) + ", " + dxe.aD(string2) + ", " + dxe.aD(string3) + ", " + n3 + ", " + f2 + ", " + f3 + ", " + dxe.aD(dxe.cB(ljq2)) + ")";
    }
}

