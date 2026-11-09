/*
 * Decompiled with CFR.
 */
public class mad
extends mab {
    private static final mad uaJ = new mad();
    @lok(value="Ok")
    @lpl(value="Description of the character name check result 'Ok'")
    public static final lox uaK = uaJ.BC("Ok");
    @lok(value="First Name Too Short")
    @lpl(value="Description of the character name check result 'FirstNameTooShort'")
    public static final lox uaL = uaJ.BC("FirstNameTooShort");
    @lok(value="First Name Too Long")
    @lpl(value="Description of the character name check result 'FirstNameTooLong'")
    public static final lox uaM = uaJ.BC("FirstNameTooLong");
    @lok(value="Last Name Too Short")
    @lpl(value="Description of the character name check result 'LastNameTooShort'")
    public static final lox uaN = uaJ.BC("LastNameTooShort");
    @lok(value="Last Name Too Long")
    @lpl(value="Description of the character name check result 'LastNameTooLong'")
    public static final lox uaO = uaJ.BC("LastNameTooLong");
    @lok(value="First Name Must Start With Uppercase")
    @lpl(value="Description of the character name check result 'FirstNameMustStartWithUppercase'")
    public static final lox uaP = uaJ.BC("FirstNameMustStartWithUppercase");
    @lok(value="Last Name Must Start With Uppercase")
    @lpl(value="Description of the character name check result 'LastNameMustStartWithUppercase'")
    public static final lox uaQ = uaJ.BC("LastNameMustStartWithUppercase");
    @lok(value="First Name Contains Invalid Characters")
    @lpl(value="Description of the character name check result 'FirstNameContainsInvalidCharacters'")
    public static final lox uaR = uaJ.BC("FirstNameContainsInvalidCharacters");
    @lok(value="Last Name Contains Invalid Characters")
    @lpl(value="Description of the character name check result 'LastNameContainsInvalidCharacters'")
    public static final lox uaS = uaJ.BC("LastNameContainsInvalidCharacters");
    @lok(value="First Name Contains Invalid Character Combination")
    @lpl(value="Description of the character name check result 'FirstNameContainsInvalidCharacterCombination'")
    public static final lox uaT = uaJ.BC("FirstNameContainsInvalidCharacterCombination");
    @lok(value="Last Name Contains Invalid Character Combination")
    @lpl(value="Description of the character name check result 'LastNameContainsInvalidCharacterCombination'")
    public static final lox uaU = uaJ.BC("LastNameContainsInvalidCharacterCombination");
    @lok(value="First Name Is Black-Listed")
    @lpl(value="Description of the character name check result 'FirstNameIsBlacklisted'")
    public static final lox uaV = uaJ.BC("FirstNameIsBlacklisted");
    @lok(value="Last Name Is Black-Listed")
    @lpl(value="Description of the character name check result 'LastNameIsBlacklisted'")
    public static final lox uaW = uaJ.BC("LastNameIsBlacklisted");
    @lok(value="Name Is Taken")
    @lpl(value="Description of the character name check result 'NameIsTaken'")
    public static final lox uaX = uaJ.BC("NameIsTaken");
    @lok(value="Internal Error")
    @lpl(value="Description of the character name check result 'InternalError'")
    public static final lox sWD = uaJ.BC("InternalError");

    protected mad(String string) {
        super("NameCheckResults." + string);
    }

    private mad() {
        super("NameCheckResults");
    }
}

