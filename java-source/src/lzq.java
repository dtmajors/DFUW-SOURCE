/*
 * Decompiled with CFR.
 */
public class lzq
extends lzj {
    private static final lzq tXx = new lzq();
    @lok(value="Player name not provided")
    @lpl(value="Displayed to an admin/GM when they enter a player-specific command, but fail to provide the required player name")
    public static final lox tXy = tXx.BC("PlayerNameNotProvided");
    @lok(value="Player not found $(PlayerName)")
    @lpl(value="Displayed to an admin/GM when they issue a command to/for a specific player, and the player cannot be found")
    public static final lox tWX = tXx.a("NotFound", lzq.Bk("PlayerName"));
    @lok(value="Player $(PlayerName) is not online")
    @lpl(value="Displayed to an admin/GM when they request a player monitor for an offline player")
    public static final lox rXl = tXx.a("PlayerNotOnline", lzq.Bk("PlayerName"));
    @lok(value="Inventory wipe scheduled for next log-on")
    @lpl(value="Displayed when an admin/GM requests an inventory wipe operation, and the operation is scheduled for the next character log-on")
    public static final lox tXz = tXx.BC("InventoryWipeScheduled");
    @lok(value="Inventoy wiped")
    @lpl(value="Displayed when an admin/GM requests an inventory wipe operation, and the operation is completed")
    public static final lox tXA = tXx.BC("InventoryWipePerformed");
    @lok(value="Camp flag for $(PlayerName) has been reset")
    @lpl(value="Displayed when an admin/GM resets the camp flag for a player")
    public static final lox tXB = tXx.a("CampFlagReset", lzq.Bk("PlayerName"));
    @lok(value="Player $(PlayerName) is online... Camp flag can only be reset for offline players")
    @lpl(value="Displayed when an admin/GM attempts to reset the camp flag for an online player")
    public static final lox tXC = tXx.a("CampFlagCannotBeResetForOnlinePlayers", lzq.Bk("PlayerName"));
    @lok(value="Asked for recall of player $(PlayerName)")
    @lpl(value="Displayed when an admin/GM initiates a player recall, but the player must accept")
    public static final lox tXD = tXx.a("RecallRequested", lzq.Bk("PlayerName"));
    @lok(value="Started recall of player $(PlayerName)")
    @lpl(value="Displayed when an admin/GM initiates a player recall, and the player does not need to accept")
    public static final lox tXE = tXx.a("RecallStarted", lzq.Bk("PlayerName"));
    @lok(value="No skill name provided")
    @lpl(value="Displayed to an admin/GM when they enter a skill-specific command, but do not provide the required skill name")
    public static final lox tXF = tXx.BC("SkillNameNotProvided");
    @lok(value="Invalid Skill Name $(SkillName)")
    @lpl(value="Displayed to an admin/GM when they enter an invalid skill name as part of a skill-specific command")
    public static final lox tXG = tXx.a("SkillNameInvalid", lzq.Bk("SkillName"));
    @lok(value="Requested change of $(Skill.NameSingular) level to $(SkillLevel) for player $(PlayerName)")
    @lpl(value="Displayed when an admin/GM requests the skill level of another player's skill be changed")
    public static final lox tXH = tXx.a("SkillLevelChangeRequested", lzq.Bm("Skill"), lzq.ah("SkillLevel", 2), lzq.Bk("PlayerName"));
    @lok(value="Requested addition of skill $(Skill.NameSingular) to player $(PlayerName)")
    @lpl(value="Displayed when an admin/GM requests a skill be added to a player")
    public static final lox tXI = tXx.a("SkillAddRequested", lzq.Bm("Skill"), lzq.Bk("PlayerName"));
    @lok(value="Your skill level of $(Skill.NameSingular) has been changed to $(SkillLevel)")
    @lpl(value="Displayed to a player when an admin/GM sets the level of one of their skills")
    public static final lox tXJ = tXx.a("SkillLevelChanged", lzq.Bm("Skill"), lzq.ah("SkillLevel", 2));
    @lok(value="Pop-up tell sent to player $(PlayerName)")
    @lpl(value="Displayed when an admin/GM sends a pop-up tell to a player")
    public static final lox tXK = tXx.a("PopupTellSent", lzq.Bk("PlayerName"));
    @lok(value="Prowess for $(PlayerName) = $(AvailablePlayerPoints) / $(TotalPlayerPoints) [Available / Total]")
    @lpl(value="Displayed to an admin/GM when a player-points alter command completes successfully")
    public static final lox tXL = tXx.a("ProwessAlterCompleted", lzq.Bk("PlayerName"), lzq.Bh("AvailablePlayerPoints"), lzq.Bh("TotalPlayerPoints"));
    @lok(value="Prowess failed to be set for $(PlayerName)!!!... Result = $(Result)")
    @lpl(value="Displayed to an admin/GM when a player-points alter command fails to complete")
    public static final lox tXM = tXx.a("ProwessAlterFailed", lzq.Bk("PlayerName"), lzq.b("Result", tu.class));
    @lok(value="Player $(PlayerName) is currently bound to the bind-stone $(BindstoneName)")
    @lpl(value="Displayed to an admin/GM when they request the name of the bind-stone that a player is bound to, and the player is currently bound to a bind-stone")
    public static final lox tXN = tXx.a("BindstonePrintBound", lzq.Bk("PlayerName"), lzq.Bk("BindstoneName"));
    @lok(value="Player $(PlayerName) is not currently bound to a bind-stone")
    @lpl(value="Displayed to an admin/GM when they request the name of the bind-stone that a player is bound to, and the player is not currently bound to a bind-stone")
    public static final lox tXO = tXx.a("BindstonePrintUnbound", lzq.Bk("PlayerName"));
    @lok(value="The trial account status of $(PlayerName) is $(IsTrialAccount)")
    @lpl(value="Displayed to an admin/GM when they request the trial account status of a player")
    public static final lox tXP = tXx.a("TrialAccountStatusPrint", lzq.Bk("PlayerName"), lzq.Bk("IsTrialAccount"));
    @lok(value="The trial account status of $(PlayerName) has been set to $(IsTrialAccount)")
    @lpl(value="Displayed to an admin/GM when they set the trial account status of a player")
    public static final lox tXQ = tXx.a("TrialAccountStatusSet", lzq.Bk("PlayerName"), lzq.Bk("IsTrialAccount"));
    @lok(value="Player online sensor already exists for $(PlayerName)")
    @lpl(value="Displayed to an admin/GM when they request a player online status sensor for a player, but a sensor for that player is already active")
    public static final lox tXR = tXx.a("SensorAlreadyExists", lzq.Bk("PlayerName"));
    @lok(value="Player online sensor does not exist for player $(PlayerName)")
    @lpl(value="Displayed to an admin/GM when they request the removal of an online sensor for a player, but a sensor for the player does not exist")
    public static final lox tXS = tXx.a("SensorDoesNotExist", lzq.Bk("PlayerName"));
    @lok(value="You have been given a gift by an administrator... check your backpack")
    @lpl(value="Displayed to a player when an admin/GM adds an item gift to their inventory")
    public static final lox tXT = tXx.BC("ItemGiftGiven");

    protected lzq(String string) {
        super("Players." + string);
    }

    private lzq() {
        super("Players");
    }
}

