package app.qwertz.luxxit.event;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LuxEventHandler {
    EventPriority priority() default EventPriority.NORMAL;
}
