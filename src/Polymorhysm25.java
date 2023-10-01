public class Polymorhysm25 {
    public static void main(String[] args) {
        Browser obj=new Chrome();// it can be any class Browser, Safari, Chrome
        anyBrowser(obj, "Google.com");

    }

    public static void anyBrowser(Browser browser, String url) {
        browser.openWebSite(url);
    }
}

class Browser {
    public void openWebSite(String url) {
        System.out.println("Opening Website in a generic browser");
    }
}

class Chrome extends Browser {
    public void openWebSite(String url) {
        System.out.println("Opening Website in a CHROME browser");
    }
}

class Safari extends Browser {
    public void openWebSite(String url) {
        System.out.println("Opening Website in a SAFARI browser");
    }
}
