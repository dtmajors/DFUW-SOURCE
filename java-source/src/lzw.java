/*
 * Decompiled with CFR.
 */
public class lzw
extends lzq {
    private static final lzw tYR = new lzw();
    @lok(value="There is already a pending request for player $(PlayerName)")
    @lpl(value="Displayed when a player name change request is already pending for the player")
    public static final lox tYS = tYR.a("RequestAlreadyPending", lzw.Bk("PlayerName"));
    @lok(value="Invalid Parameters: $(Parameters)")
    @lpl(value="Displayed when a player name change request for a player contains invalid parameters")
    public static final lox tYT = tYR.a("InvalidParameters", lzw.Bk("Parameters"));
    @lok(value="Another player already has the name $(PlayerName)")
    @lpl(value="Displayed when a player name change request fails because the new name is already being used by another player")
    public static final lox tYU = tYR.a("NameInUse", lzw.Bk("PlayerName"));
    @lok(value="Invalid Name: $(PlayerName)")
    @lpl(value="Displayed when a player name change request fails because the new name is invalid")
    public static final lox tYj = tYR.a("InvalidName", lzw.Bk("PlayerName"));
    @lok(value="Changing the name of player $(OldName) to $(NewName) failed!!!... Reason: $(Reason)")
    @lpl(value="Displayed when a player name change request fails for the indicated reason")
    public static final lox tYV = tYR.a("Failed", lzw.Bk("OldName"), lzw.Bk("NewName"), lzw.b("Reason", cu.b.class));
    @lok(value="Changing the name of player $(OldName) to $(NewName) failed due to a database error!!!... Error Code: $(ErrorCode)")
    @lpl(value="Displayed when a player name change request fails for the indicated reason")
    public static final lox tYW = tYR.a("FailedSQLError", lzw.Bk("OldName"), lzw.Bk("NewName"), lzw.Bh("ErrorCode"));
    @lok(value="Player name changed successfully from $(OldName) to $(NewName)")
    @lpl(value="Displayed to an admin/GM when they change the name of a player")
    public static final lox scW = tYR.a("Success", lzw.Bk("OldName"), lzw.Bk("NewName"));
    @lok(value="Player $(OldName) is not connected")
    @lpl(value="Displayed to an admin when tries to change the name of a player who is not online")
    public static final lox tYX = tYR.a("PlayerIsNotConnected", lzw.Bk("OldName"));

    protected lzw(String string) {
        super("NameChange." + string);
    }

    private lzw() {
        super("NameChange");
    }
}

