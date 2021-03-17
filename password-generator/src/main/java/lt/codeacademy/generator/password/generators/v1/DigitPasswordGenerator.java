package lt.codeacademy.generator.password.generators.v1;

import java.math.BigInteger;

public final class DigitPasswordGenerator implements PasswordGenerator<BigInteger> {

    @Override
    public BigInteger generate() {
        return new BigInteger("123456789012");
    }
}
