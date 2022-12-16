package katalontoselenium.com.projects.katalon.com.pages.Dashboard;

import katalontoselenium.com.projects.katalon.com.pages.Tasks.CommonPage;
import org.openqa.selenium.By;

public class DashboardPage  extends CommonPage {
    public DashboardPage(){

    }
    public By buttonSupport=By.xpath("//a[normalize-space()='Support']");
    public By buttonMyaccount=By.xpath("//a[normalize-space()='My account']");
    public By buttonContactus=By.xpath("//a[normalize-space()='Contact us']");
    public By buttonStartfreetrial=By.xpath("//a[normalize-space()='Start free trial']");
    public By buttonGetstarted=By.xpath("//a[normalize-space()='Get started']");
    public By buttonViewademo=By.xpath("//a[normalize-space()='View a demo']");
    public By buttonViewademoS=By.xpath("//a[@data-event-name='Get started Plan Button Clicked']");

    public By dropdownWhykatalon= By.xpath("//div[@class='top_nav_title'][normalize-space()='Why Katalon']");
    public By dropdownPlatform= By.xpath("//div[@class='top_nav_title'][normalize-space()='Platform']");
    public By dropdownSolutions= By.xpath("//div[@class='top_nav_title'][normalize-space()='Solutions']");
    public By dropdownIntegrations= By.xpath("//div[@class='top_nav_title'][normalize-space()='Integrations']");
    public By dropdownPricing= By.xpath("//div[@class='top_nav_title'][normalize-space()='Pricing']");
    public By dropdownResources= By.xpath("//div[@class='top_nav_title'][normalize-space()='Resources']");

    public By linkTestOps=By.xpath("//p[contains(text(),'Keep quality in focus and in sync by connecting')]//a[@class='green_bold'][normalize-space()='TestOps']");
    public By linkTestOps


}
