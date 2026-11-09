/*
 * Decompiled with CFR.
 */
public class mbv
extends lzh {
    private static final mbv uof = new mbv();
    @lok(value="Your $(Attribute) is $(Value).")
    @lpl(value="Prints out the attribute name and its current value.")
    public static final lox uog = uof.a("AttributePrint", mbv.Bo("Attribute"), mbv.Bk("Value"));
    @lok(value="Your alignment has been set to $(AlingmentValue).")
    @lpl(value="Notification that your alignment value has been set to another value.")
    public static final lox uoh = uof.a("PropertyAlignmentSet", mbv.Bh("AlingmentValue"));
    @lok(value="Your alignment is $(AlingmentValue).")
    @lpl(value="Prints your alignment value.")
    public static final lox uoi = uof.a("PropertyAlignmentPrint", mbv.Bh("AlingmentValue"));
    @lok(value="You have been playing Darkfall Unholy Wars for $(NumberOfHours) hours. Maybe you should take a break?")
    @lpl(value="Displays a warning to the player about how many hours he has been playing.")
    public static final lox uoj = uof.a("HoursWarning", mbv.Bh("NumberOfHours"));
    @lok(value="You have been Away From Keyboard for $(AFKTime) minutes. If you don't play the game you will be kicked in $(KickTime) minutes.")
    @lpl(value="Displays a warning to the player about how many hours he has been playing.")
    public static final lox uok = uof.a("AFKWarning", mbv.Bh("AFKTime"), mbv.Bh("KickTime"));

    protected mbv(String string) {
        super("Generic." + string);
    }

    private mbv() {
        super("Generic");
    }
}

