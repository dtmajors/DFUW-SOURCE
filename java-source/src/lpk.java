/*
 * Decompiled with CFR.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface lpk {
    public String value();

    public String exP() default "";

    public double exQ() default 0.0;
}

