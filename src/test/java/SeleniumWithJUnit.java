import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*

public class SeleniumWithJUnit {
    private static SeleniumExample seleniumExample;
    private String expectedTitle = "About Baeldung | Baeldung";

    @BeforeClass
    public static void setUp() {
        seleniumExample = new SeleniumExample();
    }

    @AfterClass
    public static void tearDown() {
        seleniumExample.closeWindow();
    }

    @Test
    public void exampleTest() {
        seleniumExample.getAboutBaeldungPage();
        String actualTitle = seleniumExample.getTitle();

        assertNotNull(actualTitle);
        assertEquals(expectedTitle, actualTitle);
        assertTrue(seleniumExample.isAuthorInformationAvailable());
    }
}
