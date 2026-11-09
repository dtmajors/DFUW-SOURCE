/*
 * Decompiled with CFR.
 */
public class lqc
extends lpq {
    private static final lqc rWQ = new lqc();
    @lok(value="General")
    @lpl(value="Name of the tag applied to clans that have not selected a specific category of activity or engage in all types of activity equally")
    public static final lox rUn = rWQ.BC("General");
    @lok(value="PvP")
    @lpl(value="Name of the tag applied to clans that focus their time on player-versus-player activities")
    public static final lox rWR = rWQ.BC("PvP");
    @lok(value="PvE")
    @lpl(value="Name of the tag applied to clans that focus their time on player-versus-environment (monsters) activities")
    public static final lox rWS = rWQ.BC("PvE");
    @lok(value="Crafting")
    @lpl(value="Name of the tag applied to clans that focus their time on crafting activities")
    public static final lox rWT = rWQ.BC("Crafting");
    @lok(value="Mercenary")
    @lpl(value="Name of the tag applied to clans that focus their time on mercenary activities")
    public static final lox rWU = rWQ.BC("Mercenary");
    @lok(value="Conquest")
    @lpl(value="Name of the tag applied to clans that focus their time on conquest activities")
    public static final lox rUx = rWQ.BC("Conquest");
    @lok(value="Hardcore")
    @lpl(value="Name of the tag applied to clans that play the game in a hard core manner")
    public static final lox rWV = rWQ.BC("Hardcore");
    @lok(value="Casual")
    @lpl(value="Name of the tag applied to clans that play the game in a casual manner")
    public static final lox rWW = rWQ.BC("Casual");
    @lok(value="New-Player Friendly")
    @lpl(value="Name of the tag applied to clans that are friendly towards new players")
    public static final lox rWX = rWQ.BC("NewPlayerFriendly");

    protected lqc(String string) {
        super("Tags." + string);
    }

    private lqc() {
        super("Tags");
    }
}

