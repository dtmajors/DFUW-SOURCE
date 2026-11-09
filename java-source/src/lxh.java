/*
 * Decompiled with CFR.
 */
public class lxh
extends lvn {
    private static final lxh tpE = new lxh();
    @lok(value="Leader Boards")
    @lpl(value="Title for the leader boards window")
    public static final lox tce = tpE.BC("Title");
    @lok(value="Lifetime Kills")
    @lpl(value="Title for the lifetime kills tab-page in the leader boards window")
    public static final lox tpF = tpE.BC("LifetimeKills");
    @lok(value="Term")
    @lpl(value="Title for the term standings tab-page in the leader boards window")
    public static final lox tpG = tpE.BC("Term");
    @lok(value="Season")
    @lpl(value="Title for the season standings tab-page in the leader boards window")
    public static final lox tpH = tpE.BC("Season");
    @lok(value="Winners")
    @lpl(value="Title for the previous season's winners tab-page in the leader boards window")
    public static final lox tpI = tpE.BC("Winners");
    @lok(value="Refresh")
    @lpl(value="Tooltip for the refresh button")
    public static final lox tpJ = tpE.BC("Refresh");
    @lok(value="Top Lifetime Kills")
    @lpl(value="Title for top-players list in the lifetime kills tab of the leader boards window'")
    public static final lox tpK = tpE.BC("TopLifetimeKills");
    @lok(value="Top Term Standings")
    @lpl(value="Title for the top-players list in the term standings tab of the leader boards window")
    public static final lox tpL = tpE.BC("TopTermStandings");
    @lok(value="Top Season Standings")
    @lpl(value="Title for the top-players list in the season standings tab of the leader boards window")
    public static final lox tpM = tpE.BC("TopSeasonStandings");
    @lok(value="Last Season's Top Players")
    @lpl(value="Title for the top-players list in the season winners tab of the leader boards window")
    public static final lox tpN = tpE.BC("TopSeasonWinners");
    @lok(value="Current Term Ends In $(Days) Day(s)")
    @lpl(value="Text to display the amount of time remaining in the current term")
    public static final lox tpO = tpE.a("TimeTerm", lxh.Bh("Days"));
    @lok(value="Current Term Ends In $(Minutes) Minute(s)")
    @lpl(value="Text to display the amount of time remaining in the current term, in debug-builds")
    public static final lox tpP = tpE.a("TimeTermDebug", lxh.Bh("Minutes"));
    @lok(value="Current Season Ends In $(Days) Day(s)")
    @lpl(value="Text to display the amount of time remaining in the current season")
    public static final lox tpQ = tpE.a("TimeSeason", lxh.Bh("Days"));
    @lok(value="Current Season Ends In $(Minutes) Minute(s)")
    @lpl(value="Text to display the amount of time remaining in the current season, in debug-builds")
    public static final lox tpR = tpE.a("TimeSeasonDebug", lxh.Bh("Minutes"));
    @lok(value="Player")
    @lpl(value="Header text of player name columns in top-player lists")
    public static final lox tpS = tpE.BC("Player");
    @lok(value="#")
    @lol(value="No Text to Translate!")
    public static final lox tpT = tpE.BC("Standing");
    @lok(value="+/-")
    @lol(value="No Text to Translate!")
    public static final lox tpU = tpE.BC("StandingDelta");
    @lok(value="Kills")
    @lpl(value="Header text of kills columns in top-player lists")
    public static final lox tpV = tpE.BC("Kills");
    @lok(value="Today Kills")
    @lpl(value="Text to display in the 1st column of rows that contain kill values for today")
    public static final lox tpW = tpE.BC("KillsToday");
    @lok(value="Yesterday Kills")
    @lpl(value="Text to display in the 1st column of rows that contain kill values for the previous day")
    public static final lox tpX = tpE.BC("KillsYesterday");
    @lok(value="Last 7 Days Kills")
    @lpl(value="Text to display in the 1st column of rows that contain kill values for the previous 7 days")
    public static final lox tpY = tpE.BC("Kills7Days");
    @lok(value="Last 30 Days Kills")
    @lpl(value="Text to display in the 1st column of rows that contain kill values for the previous 30 days")
    public static final lox tpZ = tpE.BC("Kills30Days");
    @lok(value="Lifetime Kills")
    @lpl(value="Text to display in the 1st column of rows that contain kill values for a player's lifetime")
    public static final lox tqa = tpE.BC("KillsLifetime");
    @lok(value="Rank")
    @lpl(value="Header text of rank columns in top-player lists")
    public static final lox toj = tpE.BC("Rank");
    @lok(value="Current Rank")
    @lpl(value="Text to display in the 1st column of rows that contain a player's current rank")
    public static final lox tqb = tpE.BC("RankCurrent");
    @lok(value="Highest Rank")
    @lpl(value="Text to display in the 1st column of rows that contain a player's highest ever achieved rank")
    public static final lox tqc = tpE.BC("RankHighest");
    @lok(value="Points")
    @lpl(value="Header text of points columns in top-player lists")
    public static final lox tqd = tpE.BC("Points");
    @lok(value="Change")
    @lpl(value="Header text of points changed columns in top-player lists")
    public static final lox tqe = tpE.BC("PointsDelta");
    @lok(value="Current Points")
    @lpl(value="Text to display in the 1st column of rows that contain a player's current point total")
    public static final lox tqf = tpE.BC("PointsCurrent");
    @lok(value="Previous Points")
    @lpl(value="Text to display in the 1st column of rows that contain a player's point total at the end of the previous time period")
    public static final lox tqg = tpE.BC("PointsPrevious");
    @lok(value="Highest Points")
    @lpl(value="Text to display in the 1st column of rows that contain a player's highest ever point total during any time preiods")
    public static final lox tqh = tpE.BC("PointsHighest");
    @lok(value="You")
    @lpl(value="Header text of columns that display the current player's values")
    public static final lox tqi = tpE.BC("ThisPlayer");
    @lok(value="Player Name")
    @lpl(value="Header text of columns that display another player's values, also shown in the search text-box used to determine which other player to display the values for")
    public static final lox tqj = tpE.BC("OtherPlayer");

    private lxh() {
        super("LeaderBoards");
    }

    protected lxh(String string) {
        super("LeaderBoards." + string);
    }
}

