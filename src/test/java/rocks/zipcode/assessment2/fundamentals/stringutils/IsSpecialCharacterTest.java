package rocks.zipcode.assessment2.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.StringUtils;

/**
 * @author leon on 28/11/2018.
 */
public class IsSpecialCharacterTest {
    @Test
    public void alphaStringTest1() {
        // Given
        String alphaString = "FHIAFAF";

        // When
        boolean outcome = StringUtils.isSpecialCharacterString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }

    @Test
    public void alphaStringTest2() {
        // Given
        String alphaString = "FAHWEIFEJNWALFE";

        // When
        boolean outcome = StringUtils.isSpecialCharacterString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void numericStringTest1() {
        // Given
        String alphaString = "89461468";

        // When
        boolean outcome = StringUtils.isSpecialCharacterString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void numericStringTest2() {
        // Given
        String alphaString = "4684131684";

        // When
        boolean outcome = StringUtils.isSpecialCharacterString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void specialCharacterStringTest1() {
        // Given
        String alphaString = "*!(@$&!@";

        // When
        boolean outcome = StringUtils.isSpecialCharacterString(alphaString);

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void specialCharacterStringTest2() {
        // Given
        String alphaString = "!&@$)@!@$#";

        // When
        boolean outcome = StringUtils.isSpecialCharacterString(alphaString);

        // Then
        Assert.assertTrue(outcome);
    }
}
