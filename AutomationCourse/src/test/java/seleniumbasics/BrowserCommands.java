package seleniumbasics;

public class BrowserCommands extends Base{

	public void verifyBrowserCommands() {
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String handleid = driver.getWindowHandle();
		System.out.println(handleid);
		
		String source = driver.getPageSource();
		System.out.println(source);
	}
	
	public void verifyNavigationCommands(){
		driver.navigate().to("https://www.amazon.in/");	
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		
		BrowserCommands commands = new BrowserCommands();
		commands.browserLaunch();
		commands.verifyBrowserCommands();
		commands.verifyNavigationCommands();
		
	}

}
