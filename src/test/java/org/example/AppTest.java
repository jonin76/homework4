/*package org.example;

import ch.qos.logback.classic.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.LoggerFactory;

import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
/*public class AppTest
{
    private static Logger logger = (Logger) LoggerFactory.getLogger(AppTest.class);

    /**
     * Rigorous Test :-)
     */
   /* @Test
    public void shouldAnswerWithTrue()
    {
        logger.error("error+++++++++++");
        assertTrue( true );
    }
    @Test
    void testMy () {
        System.out.println("My ");
    }
    @DisplayName("Слово является палиндромом")
    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba"})
    public void isPalindromeTest(String word){
        //Assertions.assertTrue((functions.isPalindrome(word)));
    }
    @ParameterizedTest
    @EnumSource(value = TimeUnit.class, names = {"DAYS", "HOURS"})
    void testWithEnumInclude(TimeUnit timeUnit) {
        assertTrue(EnumSet.of(TimeUnit.DAYS, TimeUnit.HOURS).contains(timeUnit));
    }
    /*@ParameterizedTest
    @CsvFileSource({"foo, 1", "bar, 2", "'baz, qux'", 3})
    //или @CsvFileSource(resources = "/two-fsdf.csv")
    void testWithCsvSource(String first, int second) {
        assertNotNull(first);
        assertNotEquals(0, second);
    }
} */
