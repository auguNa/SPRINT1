package S1_04.N2Ejercicio1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.is;

public class StringLengthMatcher extends FeatureMatcher<String, Integer> {

    public StringLengthMatcher(Matcher<? super Integer> matcher) {
        super(matcher, "a string with length", "length");
    }

    @Override
    protected Integer featureValueOf(String actual) {
        return actual.length();
    }

    // Factory method for easier usage
    public static Matcher<String> hasLength(int length) {
        return new StringLengthMatcher(is(length));
    }
}