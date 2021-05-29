package semi.example.spring_bouncer.security.application.valueObject;

/**
 * AccessLevel for security context.
 * If
 * - PUBLIC - Bouncer will allow everyone to get in
 * - PROTECTED - Bouncer will allow only authenticated and authorized users to get in. To define identification
 * process create your own implementation of SimpleBouncerInterface
 * - PRIVATE - Bouncer will not allow any external users to get in. Only for bouncer internal usage. You will not
 * need this.
 */
public class AccessLevel {
    public static final String PUBLIC = "public";
    public static final String PROTECTED = "protected";
    public static final String PRIVATE = "private";
}
