package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // 적용대상 TYPE => class
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
