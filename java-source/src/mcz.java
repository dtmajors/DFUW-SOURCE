/*
 * Decompiled with CFR.
 */
public class mcz
extends lzh {
    private static final mcz uDC = new mcz();
    @lok(value="You have already placed a starting track flag")
    @lpl(value="Displayed to a player when they try to place a fun flag track start flag, but have already placed one")
    public static final lox uDD = uDC.BC("StartFlagAlreadyPlaced");
    @lok(value="You can not place fun flags in dungeons")
    @lpl(value="Displayed to a player when they try to place a fun flag track flag inside a dungeon")
    public static final lox uDE = uDC.BC("CannotPlaceInDungeon");
    @lok(value="You need to place a starting track flag before you place a middle track flag")
    @lpl(value="Displayed to a player when they try to place a fun flag track middle flag, but have not yet placed a start flag")
    public static final lox uDF = uDC.BC("StartFlagMustBePlacedBeforeMiddleFlag");
    @lok(value="You can't place a middle flag after you have placed the end flag")
    @lpl(value="Displayed to a player when they try to place a fun flag track middle flag, but they have already placed the end flag")
    public static final lox uDG = uDC.BC("CannotPlaceMiddleFlagAfterEndFlag");
    @lok(value="You can't place an end flag before you have placed a start flag")
    @lpl(value="Displayed to a player when they try to place a fun flag track end flag, but have not yet placed a start flag")
    public static final lox uDH = uDC.BC("StartFlagMustBePlacedBeforeEndFlag");
    @lok(value="You have already placed an end flag!")
    @lpl(value="Displayed to a player when they try to place a fun flag track end flag, but have already placed one")
    public static final lox uDI = uDC.BC("EndFlagAlreadyPlaced");
    @lok(value="You need at least one middle flag before you can place the end flag")
    @lpl(value="Displayed to a player when they try to place a fun flag track end flag, but have not placed any middle flags")
    public static final lox uDJ = uDC.BC("CannotPlaceEndFlagWithoutMiddleFlags");
    @lok(value="You can not place any more middle flags... You must now place the end flag")
    @lpl(value="Displayed to a player when they try to place a fun flag track middle flag, but have already placed the maximum number of middle flags")
    public static final lox uDK = uDC.BC("MaximumNumberOfFlagsPlaced");
    @lok(value="You can not place a track flag here")
    @lpl(value="Displayed to a player when they try to place a fun flag track flag in an invalid location")
    public static final lox uDL = uDC.BC("CannotFindSuitablePlacement");
    @lok(value="You can not place a flag this close to your other flags")
    @lpl(value="Displayed to a player when they try to place a fun flag track flag too close to already placed flags")
    public static final lox uDM = uDC.BC("TooCloseToOtherFlags");
    @lok(value="There are too many starting flags placed in this area")
    @lpl(value="Displayed to a player when they try to place a fun flag track start flag, but too many start flags have already been placed in the local area")
    public static final lox uDN = uDC.BC("TooManyStartFlagsInArea");
    @lok(value="Your fun flags have disintegrated and have been removed from the world")
    @lpl(value="Displayed to the player that placed the fun flag track flags, when they have been in the world for too long")
    public static final lox uDO = uDC.BC("RemovingTimeOutPersonal");
    @lok(value="The fun flags belonging to $(PlayerName) have disintegrated and no longer exist in the world")
    @lpl(value="Displayed to other fun flag race participants when the fun flag track flags placed by a player have been in the world for too long")
    public static final lox uDP = uDC.a("RemovingTimeOut", mcz.Bk("PlayerName"));
    @lok(value="$(PlayerName) passed your starting flag")
    @lpl(value="Displayed to the player that placed the fun flag track, when a player passes the start flag")
    public static final lox uDQ = uDC.a("PlayerPassedStartFlagPersonal", mcz.Bk("PlayerName"));
    @lok(value="$(PlayerName) passed the starting flag of the track set out by $(OwnerName)")
    @lpl(value="Displayed to other fun flag race participants when a player passes the start flag")
    public static final lox uDR = uDC.a("PlayerPassedStartFlag", mcz.Bk("PlayerName"), mcz.Bk("OwnerName"));
    @lok(value="$(PlayerName) passed flag number $(FlagNumber)")
    @lpl(value="Displayed to the player that placed the fun flag track when a player passes a middle flag")
    public static final lox uDS = uDC.a("PlayerPassedMiddleFlagPersonal", mcz.Bk("PlayerName"), mcz.Bh("FlagNumber"));
    @lok(value="$(PlayerName) passed flag number $(FlagNumber) of the track set out by $(OwnerName)")
    @lpl(value="Displayed to other fun flag race participants when a player passes a middle flag")
    public static final lox uDT = uDC.a("PlayerPassedMiddleFlag", mcz.Bk("PlayerName"), mcz.Bh("FlagNumber"), mcz.Bk("OwnerName"));
    @lok(value="$(PlayerName) passed the end flag!")
    @lpl(value="Displayed to the player that placed the fun flag track when a player passes the end flag")
    public static final lox uDU = uDC.a("PlayerPassedEndFlagPersonal", mcz.Bk("PlayerName"));
    @lok(value="$(PlayerName) passed the end flag of the track set out by $(OwnerName)")
    @lpl(value="Displayed to other fun flag race participants when a player passes the end flag")
    public static final lox uDV = uDC.a("PlayerPassedEndFlag", mcz.Bk("PlayerName"), mcz.Bk("OwnerName"));
    @lok(value="$(PlayerName) is the winner!")
    @lpl(value="Displayed to the player that placed the fun flag track when the winner passes the end flag")
    public static final lox uDW = uDC.a("WinnerPassedEndFlagPersonal", mcz.Bk("PlayerName"));
    @lok(value="$(PlayerName) has won the race on the track set out by $(OwnerName)")
    @lpl(value="Displayed to other fun flag race participants when the winner passes the end flag")
    public static final lox uDX = uDC.a("WinnerPassedEndFlag", mcz.Bk("PlayerName"), mcz.Bk("OwnerName"));
    @lok(value="Your fun flag track race will start in $(CountDown)")
    @lpl(value="Displayed to the player that placed the fun flag track when the race will begin soon")
    public static final lox uDY = uDC.a("RaceStartingSoonPersonal", mcz.Bi("CountDown"));
    @lok(value="The fun flag track race laid out by $(OwnerName) will start in $(CountDown)!")
    @lpl(value="Displayed to other fun flag race participants when the race will begin soon")
    public static final lox uDZ = uDC.a("RaceStartingSoon", mcz.Bk("OwnerName"), mcz.Bi("CountDown"));
    @lok(value="Your fun flag track race has started")
    @lpl(value="Displayed to the player that placed the fun flag track when the race has started")
    public static final lox uEa = uDC.BC("RaceStartedPersonal");
    @lok(value="The fun flag track race laid out by $(OwnerName) has started!")
    @lpl(value="Displayed to other fun flag race participants when the race has started")
    public static final lox uEb = uDC.a("RaceStarted", mcz.Bk("OwnerName"));
    @lok(value="The fun flag race you started has ended... Results:")
    @lpl(value="Displayed to the player that placed the fun flag track when the race has ended")
    public static final lox uEc = uDC.BC("RaceEndedPersonal");
    @lok(value="The fun flag race started by $(OwnerName) has ended... Results:")
    @lpl(value="Displayed to other fun flag race participants when the race has ended")
    public static final lox uEd = uDC.a("RaceEnded", mcz.Bk("OwnerName"));
    @lok(value="$(PlayerName): Placed $(Position)")
    @lpl(value="Displayed to all fun flag race participants, and the player that placed the fun flag track, after the race has ended, to list the order that the participants finished in")
    public static final lox uEe = uDC.a("ResultList", mcz.Bk("PlayerName"), mcz.Bh("Position"));
    @lok(value="You are not the owner of this fun flag track, so you can not activate it")
    @lpl(value="Displayed to a player when they try to activate a fun flag race track that they did not place")
    public static final lox uEf = uDC.BC("CannotActivateFlagNotOwner");
    @lok(value="You can not start the fun flag race at this point")
    @lpl(value="Displayed to a player when they try to activate a fun flag race track but the system is not ready")
    public static final lox uEg = uDC.BC("CannotActivateFlagAtThisTime");
    @lok(value="You can now start the fun flag race by pressing use on any of your fun flags")
    @lpl(value="Displayed to a player when they complete the placement of all fun flags in a fun flag race track, to indicate how to activate the race")
    public static final lox uEh = uDC.BC("PressUseToStartRace");

    protected mcz(String string) {
        super("TrackFlags." + string);
    }

    private mcz() {
        super("TrackFlags");
    }
}

