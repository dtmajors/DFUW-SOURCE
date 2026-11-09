/*
 * Decompiled with CFR.
 */
public class lvs
extends lvr {
    private static final lvs sZD = new lvs();
    @lok(value="Combat Log")
    @lpl(value="Used in the header of a chat channel. The name of the combat log channel.")
    public static final lox sZE = sZD.BC("NameCombatLog");
    @lok(value="Global Channel")
    @lpl(value="Used in the header of a chat channel. The name of the global channel.")
    public static final lox sZF = sZD.BC("NameGlobalChannel");
    @lok(value="Global Channel Japan")
    @lpl(value="Used in the header of a chat channel. The name of the global japanese channel.")
    public static final lox sZG = sZD.BC("NameGlobalChannelJapan");
    @lok(value="Global Channel Korea")
    @lpl(value="Used in the header of a chat channel. The name of the global korean channel.")
    public static final lox sZH = sZD.BC("NameGlobalChannelKorea");
    @lok(value="Area Channel")
    @lpl(value="Used in the header of a chat channel. The name of the area channel.")
    public static final lox sZI = sZD.BC("NameAreaChannel");
    @lok(value="Party Channel")
    @lpl(value="Used in the header of a chat channel. The name of the party channel.")
    public static final lox sZJ = sZD.BC("NamePartyChannel");
    @lok(value="Private Chat")
    @lpl(value="Used in the header of a chat channel. The name of the private channel.")
    public static final lox sZK = sZD.BC("NamePrivateChannel");
    @lok(value="Clan Channel")
    @lpl(value="Used in the header of a chat channel. The name of the clan channel.")
    public static final lox sZL = sZD.BC("NameClanChannel");
    @lok(value="Clan Alliance Channel")
    @lpl(value="Used in the header of a chat channel. The name of the clan alliance channel.")
    public static final lox sZM = sZD.BC("NameClanAllianceChannel");
    @lok(value="Log")
    @lpl(value="Used in the chat input area. The name of the combat log channel.")
    public static final lox sZN = sZD.BC("ShortNameCombatLog");
    @lok(value="Global")
    @lpl(value="Used in the chat input area. The name of the global channel.")
    public static final lox sZO = sZD.BC("ShortNameGlobalChannel");
    @lok(value="Area")
    @lpl(value="Used in the chat input area. The name of the area channel.")
    public static final lox sZP = sZD.BC("ShortNameAreaChannel");
    @lok(value="Party")
    @lpl(value="Used in the chat input area. The name of the party channel.")
    public static final lox sZQ = sZD.BC("ShortNamePartyChannel");
    @lok(value="Private")
    @lpl(value="Used in the chat input area. The name of the private channel.")
    public static final lox sZR = sZD.BC("ShortNamePrivateChannel");
    @lok(value="Clan")
    @lpl(value="Used in the chat input area. The name of the clan channel.")
    public static final lox sZS = sZD.BC("ShortNameClanChannel");
    @lok(value="Alliance")
    @lpl(value="Used in the chat input area. The name of the clan alliance channel.")
    public static final lox sZT = sZD.BC("ShortNameClanAllianceChannel");
    @lok(value="Korea")
    @lpl(value="Used in the chat input area. The name of the global korean channel.")
    public static final lox sZU = sZD.BC("ShortNameGlobalChannelKorea");
    @lok(value="Japan")
    @lpl(value="Used in the chat input area. The name of the global kapanese channel.")
    public static final lox sZV = sZD.BC("ShortNameGlobalChannelJapan");

    protected lvs(String string) {
        super("Channels." + string);
    }

    private lvs() {
        super("Channels");
    }
}

