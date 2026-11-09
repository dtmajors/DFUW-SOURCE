/*
 * Decompiled with CFR.
 */
public class lzp
extends lzn {
    private static final lzp tXo = new lzp();
    @lok(value="Skill Gain XP Modifier for category $(Category) is $(Value)")
    @lpl(value="Displayed to an admin/GM when they request the values of all skill gain XP modifiers")
    public static final lox tXp = tXo.a("Print", lzp.b("Category", cxn.class), lzp.ah("Value", 2));
    @lok(value="XP-Gain Categories Print Command Parameter Contains Invalid Entries!!!")
    @lpl(value="Displayed when a skill gain XP modifiers print command contains invalid parameters")
    public static final lox tXq = tXo.BC("PrintInvalidParameters");
    @lok(value="Skill Gain XP Modifier for category $(Category) has been successfully changed from $(OldValue) to $(NewValue)... Gamelogic server count: $(ServerCount)")
    @lpl(value="Displayed to an admin/GM when they request the value of a skill gain XP modifier be changed")
    public static final lox tXr = tXo.a("SetTotalSuccess", lzp.b("Category", cxn.class), lzp.ah("OldValue", 2), lzp.ah("NewValue", 2), lzp.Bh("ServerCount"));
    @lok(value="Skill Gain XP Modifier for category $(Category) has been partially changed from $(OldValue) to $(NewValue)... Gamelogic servers: success = $(SuccessServerCount), failure = $(FailureServerCount)")
    @lpl(value="Displayed to an admin/GM when they request the value of a skill gain XP modifier be changed")
    public static final lox tXs = tXo.a("SetPartialSuccess", lzp.b("Category", cxn.class), lzp.ah("OldValue", 2), lzp.ah("NewValue", 2), lzp.Bh("SuccessServerCount"), lzp.Bh("FailureServerCount"));
    @lok(value="Skill Gain XP Modifier for category $(Category) failed to be changed from $(OldValue)... Gamelogic server count: $(FailureServerCount)")
    @lpl(value="Displayed to an admin/GM when they request the value of a skill gain XP modifier be changed")
    public static final lox tXt = tXo.a("SetTotalFailure", lzp.b("Category", cxn.class), lzp.ah("OldValue", 2), lzp.Bh("FailureServerCount"));
    @lok(value="Error: $(ErrorMessage)")
    @lpl(value="Displayed to an admin/GM when they request the value of a skill gain XP modifier be changed")
    public static final lox tXu = tXo.a("SetFailureError", lzp.Bk("ErrorMessage"));
    @lok(value="Another skill gain XP modifier set command is currently being processed")
    @lpl(value="Displayed to an admin/GM when they request the value of a skill gain XP modifier be changed, but another request is already being processed")
    public static final lox tXv = tXo.BC("SetRequestInProgress");
    @lok(value="XP-Gain Categories Set Command Parameter Contains Invalid Entries!!!")
    @lpl(value="Displayed when a skill gain XP modifiers set command contains invalid parameters")
    public static final lox tXw = tXo.BC("SetInvalidParameters");

    protected lzp(String string) {
        super("SkillXPGains." + string);
    }

    private lzp() {
        super("SkillXPGains");
    }
}

