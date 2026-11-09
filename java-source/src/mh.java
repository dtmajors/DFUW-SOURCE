/*
 * Decompiled with CFR.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface mh {
    public String qC();

    public String key();

    public String qD() default "";

    public int qE() default 200;
}

