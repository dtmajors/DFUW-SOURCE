/*
 * Decompiled with CFR.
 */
public class lzt
extends lzq {
    private static final lzt tYq = new lzt();
    @lok(value="There is already a pending kick request for player, $(PlayerName)!")
    @lpl(value="Displayed when a kick request is already being processed for the indicated player")
    public static final lox tYr = tYq.a("KickRequestExists", lzt.Bk("PlayerName"));
    @lok(value="Kicked $(PlayerName)")
    @lpl(value="Displayed when a kick request is completed")
    public static final lox tYs = tYq.a("KickRequestCompleted", lzt.Bk("PlayerName"));
    @lok(value="Kicking of player $(PlayerName) failed due to a database error!!!... SQL Error Code = $(ErrorCode)")
    @lpl(value="Displayed to an admin/GM when a kick request for a player fails because of a database error")
    public static final lox tYt = tYq.a("KickRequestFailedSQLError", lzt.Bk("PlayerName"), lzt.Bh("ErrorCode"));
    @lok(value="There is already a pending kick and ban request for player, $(PlayerName)!")
    @lpl(value="Displayed when a kick and ban request is already being processed for the indicated player")
    public static final lox tYu = tYq.a("BanRequestExists", lzt.Bk("PlayerName"));
    @lok(value="Kicking and banning of player $(PlayerName) failed due to a database error!!!... SQL Error Code = $(ErrorCode)")
    @lpl(value="Displayed to an admin/GM when a kick and ban request for a player fails because of a database error")
    public static final lox tYv = tYq.a("BanRequestFailedSQLError", lzt.Bk("PlayerName"), lzt.Bh("ErrorCode"));
    @lok(value="Kicked and Banned $(PlayerName)")
    @lpl(value="Displayed when a kick and ban request is completed")
    public static final lox tYw = tYq.a("BanRequestCompleted", lzt.Bk("PlayerName"));
    @lok(value="Invalid duration. Use <N>m|h|d|w e.g. 10m, 3h, 1d, 2w")
    @lpl(value="Displayed when a kick and ban request contains an invalid duration")
    public static final lox tYx = tYq.BC("BanRequestInvalidDuration");
    @lok(value="Invalid duration. You can place at most $(MaxDurationLength) minute bans")
    @lpl(value="Displayed when a kick and ban request contains a duration that is greater than the maximum duration that the admin/GM is allowed to set")
    public static final lox tYy = tYq.a("BanRequestDurationTooLarge", lzt.Bh("MaxDurationLength"));

    protected lzt(String string) {
        super("KickBan." + string);
    }

    private lzt() {
        super("KickBan");
    }
}

