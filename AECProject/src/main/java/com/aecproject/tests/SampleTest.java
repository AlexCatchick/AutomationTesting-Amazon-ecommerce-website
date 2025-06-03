import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SampleTest {
    
    private AECProject aecProject;

    @Before
    public void setUp() {
        aecProject = new AECProject();
        // Initialize WebDriver and other necessary setups
    }

    @Test
    public void testAmazonSearch() {
        // Example test case for searching on Amazon
        aecProject.openAmazon();
        aecProject.searchForItem("laptop");
        // Add assertions to verify search results
    }

    @Test
    public void testFlipkartSearch() {
        // Example test case for searching on Flipkart
        aecProject.openFlipkart();
        aecProject.searchForItem("smartphone");
        // Add assertions to verify search results
    }

    @After
    public void tearDown() {
        // Close WebDriver and clean up resources
        aecProject.closeBrowser();
    }
}