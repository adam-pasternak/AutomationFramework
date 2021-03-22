package pages;

import org.openqa.selenium.By;
import utils.PageObject;

public class Footer extends PageObject {

    public Footer() {
        final String pageName = "Footer";
        addPageObject(pageName,"TWITTER_ICON", By.xpath("//li[@class='social_twitter']"));
        addPageObject(pageName,"FACEBOOK_ICON", By.xpath("//li[@class='social_facebook']"));
        addPageObject(pageName,"LINKEDIN_ICON", By.xpath("//li[@class='social_linkedin']"));
    }
}