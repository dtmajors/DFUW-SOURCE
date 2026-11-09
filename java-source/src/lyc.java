/*
 * Decompiled with CFR.
 */
public class lyc
extends lyb {
    private static final lyc tCS = new lyc();
    @lok(value="Mentors")
    @lpl(value="Used in the header of a social panel. The name of the mentors panel.")
    public static final lox tCT = tCS.BC("MentorsHeader");
    @lok(value="Apprentices")
    @lpl(value="Used in the header of a social panel. The name of the apprentices panel.")
    public static final lox tCU = tCS.BC("ApprenticesHeader");
    @lok(value="Register as a mentor")
    @lpl(value="Label text.")
    public static final lox tCV = tCS.BC("MentorRegister");
    @lok(value="Unregister")
    @lpl(value="Label text.")
    public static final lox tCW = tCS.BC("MentorUnRegister");
    @lok(value="Request a Mentor")
    @lpl(value="Label text.")
    public static final lox tCX = tCS.BC("MentorRequest");
    @lok(value="Name")
    @lpl(value="Mentor name label text.")
    public static final lox tCY = tCS.BC("MentorName");
    @lok(value="Rating")
    @lpl(value="Mentor rating label text.")
    public static final lox tCZ = tCS.BC("MentorRating");
    @lok(value="Reason")
    @lpl(value="Mentor reason label text.")
    public static final lox tDa = tCS.BC("MentorReason");

    protected lyc(String string) {
        super("Mentoring." + string);
    }

    private lyc() {
        super("Mentoring");
    }
}

