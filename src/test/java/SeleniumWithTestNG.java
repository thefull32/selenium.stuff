import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SeleniumWithTestNG {

    private SeleniumExample seleniumExample;
    private String expectedTitle = "About Baeldung | Baeldung";

    @BeforeSuite
    public void setUp() {
        seleniumExample = new SeleniumExample();
    }

    @AfterSuite
    public void tearDown() {
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
