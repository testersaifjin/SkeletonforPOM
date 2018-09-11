import com.Hamza.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends DriverManager {

    DriverManager dm = new DriverManager();

    @Before
    public void invokeBrowser() throws IOException
    {
        dm.getProperties();
        dm.openBrowser();
    }

    @After
    public void tearDown() throws IOException
    {
        dm.closeBrowser();

    }
}
