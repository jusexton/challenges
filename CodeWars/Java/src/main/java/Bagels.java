import helpers.Bagel;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class Bagels {
    public static Bagel getBagel() {
        try {
            Field f = Boolean.class.getField("TRUE");
            Field modifiers = Field.class.getDeclaredField("modifiers");
            modifiers.setAccessible(true);
            modifiers.setInt(f, f.getModifiers() & ~Modifier.FINAL);
            f.set(null, false);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return new Bagel();
    }
}
