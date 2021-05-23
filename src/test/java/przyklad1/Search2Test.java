package przyklad1;
// żeby odpalić projekt spakowany z Git Huba trzeba kliknąć file --> Invalidate Casches
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search2Test {
    //Maven nie rozumie jeżeli klasa nie będzie .......cośTEst,
    // klasa nie może mieć innej nazwy niż fisdufisduTest,
    //invalidateCasches nie lubi spacji rebuild the project,
    //może wywalić exception za 1 razem,
    //
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        //   driver = new FirefoxDriver + kolejne system property
        //konstruktor klasy Chrome Driver
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("http://www.bing.com");
    }
    @Test //adnotacja Frameworku JUnit
    public void testGoogleSearch() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("q"));
        // Wyczyść teskst zapisany w elemencie
        element.clear();
        //get wchodzi na stronę
        // Wpisz informacje do wyszukania
        element.sendKeys("Testowanie Selenium WebDriver"); //wpisuje literka po literce
        //keys.enter, keys.alt wciskanie klawiszy

        // Prześlij formularz
        element.submit();
    }
    @After //adnotacja frameworku JUnit
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        // driver.quit();
    }
}