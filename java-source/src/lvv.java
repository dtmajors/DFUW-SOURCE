/*
 * Decompiled with CFR.
 */
public class lvv
extends lvt {
    private static final lvv tax = new lvv();
    @lok(value="boolean")
    @lpl(value="Used in chat command messages to describe command parameters of type boolean.")
    public static final lox tay = tax.BC("TypeBoolean");
    @lok(value="float")
    @lpl(value="Used in chat command messages to describe command parameters of type float.")
    public static final lox taz = tax.BC("TypeFloat");
    @lok(value="double")
    @lpl(value="Used in chat command messages to describe command parameters of type double.")
    public static final lox taA = tax.BC("TypeDouble");
    @lok(value="integer")
    @lpl(value="Used in chat command messages to describe command parameters of type integer.")
    public static final lox taB = tax.BC("TypeInteger");
    @lok(value="string")
    @lpl(value="Used in chat command messages to describe command parameters of type string.")
    public static final lox taC = tax.BC("TypeString");
    @lok(value="player name")
    @lpl(value="Used in chat command messages as the description for a chat command parameter that should contain a player's name.")
    public static final lox taD = tax.BC("NamePlayerName");
    @lok(value="first name")
    @lpl(value="Used in chat command messages as the description for a chat command parameter that should contain a player's first name.")
    public static final lox taE = tax.BC("NamePlayerFirstName");
    @lok(value="last name")
    @lpl(value="Used in chat command messages as the description for a chat command parameter that should contain a player's last name.")
    public static final lox taF = tax.BC("NamePlayerLastName");
    @lok(value="message text")
    @lpl(value="Used in chat command messages as the description for a chat command parameter that should contain the message text.")
    public static final lox taG = tax.BC("NameMessageText");
    @lok(value="upper endpoint")
    @lpl(value="Used in chat command messages as the description for the roll chat command parameter.")
    public static final lox taH = tax.BC("NameUpperEndpoint");

    protected lvv(String string) {
        super("Parameters." + string);
    }

    private lvv() {
        super("Parameters");
    }
}

