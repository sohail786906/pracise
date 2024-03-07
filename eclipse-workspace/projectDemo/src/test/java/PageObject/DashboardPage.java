package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage{
    public String isDashboardPage;
	public static WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickCustomersDropdown() {
        WebElement customersDropdown = driver.findElement(By.cssSelector("body.sidebar-mini.layout-fixed.control-sidebar-slide-open.sidebar-open:nth-child(2) div.wrapper:nth-child(3) aside.main-sidebar.sidebar-dark-primary.elevation-4:nth-child(2) div.sidebar.os-host.os-theme-light.os-host-overflow.os-host-overflow-y.os-host-resize-disabled.os-host-scrollbar-horizontal-hidden.os-host-transition div.os-padding:nth-child(4) div.os-viewport.os-viewport-native-scrollbars-invisible div.os-content nav.mt-2 ul.nav.nav-pills.nav-sidebar.flex-column.nav-legacy li.nav-item.has-treeview.menu-open:nth-child(4) a.nav-link.active > p:nth-child(2)"));
        customersDropdown.click();
    }

    public static  void clickAddNewCustomer() {
        WebElement addNewCustomerButton = driver.findElement(By.cssSelector("body.sidebar-mini.layout-fixed.control-sidebar-slide-open.sidebar-open:nth-child(2) div.wrapper:nth-child(3) aside.main-sidebar.sidebar-dark-primary.elevation-4:nth-child(2) div.sidebar.os-host.os-theme-light.os-host-resize-disabled.os-host-scrollbar-horizontal-hidden.os-host-transition.os-host-overflow.os-host-overflow-y div.os-padding:nth-child(4) div.os-viewport.os-viewport-native-scrollbars-invisible div.os-content nav.mt-2 ul.nav.nav-pills.nav-sidebar.flex-column.nav-legacy li.nav-item.has-treeview.menu-is-opening.menu-open:nth-child(4) ul.nav.nav-treeview li.nav-item:nth-child(1) a.nav-link.active > p:nth-child(2)"));
        addNewCustomerButton.click();
    }

		   public void logout() {
		        
		        WebElement logoutButton = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		        logoutButton.click();
		
	}

		   public static boolean isDashboardPageDisplayed() {
		        WebElement dashboardHeader = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
		        return dashboardHeader.isDisplayed();
		}

			
		}

		
			
		



