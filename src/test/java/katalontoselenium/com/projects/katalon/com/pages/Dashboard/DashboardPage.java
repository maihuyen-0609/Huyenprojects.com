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
    public By buttonGetstartedQM=By.xpath("//a[normalize-space()='Get started']");
    public By buttonViewademo=By.xpath("//a[normalize-space()='View a demo']");
    public By buttonLearnmorePlan=By.xpath("//a[@data-event-name='Get started Plan Button Clicked']");
    public By buttonLearnmoreAuthor =By.xpath("//a[@data-event-name='Get started Author Button Clicked']");
    public By buttonLearnmoreOrganize =By.xpath("//a[@data-event-name='Get started Organize Button Clicked']");
    public By buttonLearnmoreExecute  =By.xpath("//a[@data-event-name='Get started Execute Button Clicked']");
    public By buttonLearnmoreAnalyze =By.xpath("//a[@data-event-name='Get started Analyze Button Clicked']");
    public By buttonGetstartedtradeoff =By.xpath("//div[@data-event-name='Get started High quality Low cost Button Clicked']");
    public By buttonGetstartedfooter=By.xpath("//div[@data-event-name='Get started footer Button Clicked']");


    public By dropdownWhykatalon= By.xpath("//div[@class='top_nav_title'][normalize-space()='Why Katalon']");
    public By dropdownPlatform= By.xpath("//div[@class='top_nav_title'][normalize-space()='Platform']");
    public By dropdownSolutions= By.xpath("//div[@class='top_nav_title'][normalize-space()='Solutions']");
    public By dropdownIntegrations= By.xpath("//div[@class='top_nav_title'][normalize-space()='Integrations']");
    public By dropdownPricing= By.xpath("//div[@class='top_nav_title'][normalize-space()='Pricing']");
    public By dropdownResources= By.xpath("//div[@class='top_nav_title'][normalize-space()='Resources']");
    public By dropdownwhykatalonreadmore= By.xpath("//div[@class='why_katalon_read_more']");
    public By dropdownBO= By.xpath("//div[normalize-space()='Business Outcomes']");
    public By dropdownSS= By.xpath("//div[normalize-space()='Success Stories']");
    public By dropdownES= By.xpath("//div[normalize-space()='Easy, speed']");
    public By dropdownFS= By.xpath("//div[normalize-space()='Flexibility, Scalability']");
    public By dropdownV= By.xpath("//div[normalize-space()='Visibility']");
    public By dropdownIA= By.xpath("//div[normalize-space()='Innovation & AI']");
    public By dropdownQMP= By.xpath("//span[normalize-space()='quality management platform']");
    public By dropdownPO= By.xpath("//div[normalize-space()='Platform Overview']");
    public By dropdownKS= By.xpath("//div[normalize-space()='Katalon Studio']");
    public By dropdownKT= By.xpath("//div[normalize-space()='Katalon TestOps']");
    public By dropdownKatalonTestCloud= By.xpath("//div[normalize-space()='Katalon TestCloud']");
    public By dropdownKatalonRuntimeEngine= By.xpath("//div[normalize-space()='Katalon Runtime Engine']");
    public By dropdownKatalonTestOps= By.xpath("//div[normalize-space()='Katalon TestOps']");
    public By dropdownAIVisualTesting= By.xpath("//span[normalize-space()='AI Visual Testing']");
    public By dropdownSolutionsOverview= By.xpath("//div[@class='solutions_title']");
    public By dropdownWebTesting= By.xpath("//div[normalize-space()='Web Testing']");
    public By dropdownDesktopTesting= By.xpath("//div[normalize-space()='Desktop Testing']");
    public By dropdownAPITesting= By.xpath("//div[normalize-space()='API Testing']");
    public By dropdownVisualTesting= By.xpath("//div[normalize-space()='Visual Testing']");
    public By dropdownMobileTesting= By.xpath("//span[normalize-space()='Mobile Testing']");
    public By dropdownAcademy= By.xpath("//span[normalize-space()='Academy']");
    public By dropdownBlogs= By.xpath("//div[normalize-space()='Blogs']");
    public By dropdownWebinars= By.xpath("//div[normalize-space()='Webinars']");
    public By dropdownCommunity= By.xpath("//div[normalize-space()='Community']");
    public By dropdownTechnicalSupport= By.xpath("//div[normalize-space()='Technical Support']");
    public By dropdownViewaDemo= By.xpath("//div[normalize-space()='View a Demo']");
    public By dropdownGettingStarted= By.xpath("//div[normalize-space()='Getting Started']");
    public By dropdownDocumentation= By.xpath("//span[normalize-space()='Documentation']");
    public By dropdownSampleProjectsonGitHub= By.xpath("//div[@class='Sample Projects on GitHub']");
    public By dropdownImageLibraryDocker= By.xpath("//div[normalize-space()='Image Library on Docker']");
    public By dropdownAboutUs= By.xpath("//div[normalize-space()='About Us']");
    public By dropdownNews= By.xpath("//div[normalize-space()='News']");
    public By dropdownEvents= By.xpath("//div[normalize-space()='Events']");
    public By dropdownPartners= By.xpath("//span[normalize-space()='Partners']");

    public By linkTestOpsPlan=By.xpath("//p[contains(text(),'Keep quality in focus and in sync by connecting')]//a[@class='green_bold'][normalize-space()='TestOps']");
    public By linkKatalonStudio=By.xpath("//a[@class='green_bold'][normalize-space()='Katalon Studio']");
    public By linkTestOpsOrganize=By.xpath("//p[contains(text(),'organizes your test artifacts all in one place: te')]//a[@class='green_bold'][normalize-space()='TestOps']");
    public By linkTestClouds=By.xpath("//a[contains(text(),'TestCloud’s')]");
    public By linkRuntimeEngine=By.xpath("//a[normalize-space()='Runtime Engine']");
    public By linkAPITesting=By.xpath("//a[@href='/resources-center/blog/api-testing-tips']");
    public By linkRegressionTesting=By.xpath("//a[@href='/resources-center/blog/regression-testing']");
    public By linkendtoendtesting=By.xpath("//a[@href='/resources-center/blog/end-to-end-e2e-testing']");
    public By linkcicdtools=By.xpath("//a[@href='/resources-center/blog/ci-cd-tools']");
    public By linkIntegrations=By.xpath("//a[normalize-space()='integrations']");
    public By linklla=By.xpath("//a[@href='/case-studies/lla']");
    public By linkcarelogistics=By.xpath("//a[@href='/case-studies/care-logistics']");
    public By linkgedigital=By.xpath("//a[@href='/case-studies/ge-digital']");
    public By linktunaiku=By.xpath("//a[@href='/case-studies/tunaiku']");

    public By linkBO=By.xpath("//a[@class='link why-katalon-link'][normalize-space()='Business Outcomes']");
    public By linkSpeed=By.xpath("//a[normalize-space()='Speed']");
    public By linkFlexibilityScalability=By.xpath("//a[normalize-space()='Flexibility & Scalability']");
    public By linkVisibility=By.xpath("//a[normalize-space()='Visibility']");
    public By linkInnovationAI=By.xpath("//a[normalize-space()='Innovation & AI']");
    public By linkAffordabilityROI=By.xpath("//a[normalize-space()='Affordability & ROI']");
    public By linkSuccessStories=By.xpath("//a[normalize-space()='Success Stories']");
    public By linkPlatformOverview=By.xpath("//a[normalize-space()='Platform Overview']");
    public By linkKatalonTestOps=By.xpath("//a[normalize-space()='Katalon TestOps']");
    public By linkKatalonTestCloud=By.xpath("//a[normalize-space()='Katalon TestCloud']");
    public By linkPricing=By.xpath("//a[normalize-space()='Pricing']");
    public By linkVisualTesting=By.xpath("//a[normalize-space()='Visual Testing']");
    public By linkWebTesting=By.xpath("//a[normalize-space()='Web Testing']");
    public By linkfooterAPITesting=By.xpath("//a[normalize-space()='API Testing']");
    public By linkMobileTesting=By.xpath("//a[normalize-space()='Mobile Testing']");
    public By linkDesktopTesting=By.xpath("//a[normalize-space()='Desktop Testing']");
    public By linkfooterIntegrations=By.xpath("//a[normalize-space()='Integrations']");
    public By linkAcademy=By.xpath("//a[normalize-space()='Academy']");
    public By linkBlog=By.xpath("//a[normalize-space()='Blog']");
    public By linkCommunity=By.xpath("//a[normalize-space()='Community']");
    public By linkTechnicalSupport=By.xpath("//a[normalize-space()='Technical Support']");
    public By linkWebinars=By.xpath("//a[normalize-space()='Webinars']");
    public By linkDownloadKatalonStudio=By.xpath("//a[normalize-space()='Download Katalon Studio']");
    public By linkDocumentation=By.xpath("//a[normalize-space()='Documentation']");
    public By linkGettingStarted=By.xpath("//a[normalize-space()='Getting Started']");
    public By linkImageLibraryonDocker=By.xpath("//a[normalize-space()='Image Library on Docker']");
    public By linkSampleProjectsonGitHub=By.xpath("//a[normalize-space()='Sample Projects on GitHub']");
    public By linkAboutKatalon=By.xpath("//a[normalize-space()='About Katalon']");
    public By linkCareers=By.xpath("//a[normalize-space()='Careers']");
    public By linkEvents=By.xpath("//a[normalize-space()='Events']");
    public By linkNews=By.xpath("//a[normalize-space()='News']");
    public By linkPartners=By.xpath("//a[normalize-space()='Partners']");
    public By linkfacebook=By.xpath("//i[@class='fa-brands fa-facebook-f']");
    public By linktwitter=By.xpath("//i[@class='fa-brands fa-twitter']");
    public By linklinkedin=By.xpath("//i[@class='fa-brands fa-linkedin-in']");
    public By linkYoutube=By.xpath("//i[@class='fa-brands fa-youtube']");
    public By linkTerms=By.xpath("//a[normalize-space()='Terms']");
    public By linkPrivacyPolicy=By.xpath("//a[normalize-space()='Privacy Policy']");
    public By linkLicenseAgreement=By.xpath("//a[normalize-space()='License & Agreement']");
    public By linkSecurity=By.xpath("//a[normalize-space()='Security']");

    public DashboardPage openDashboardPage(){
        WebUI.
    }
}
public Dash
