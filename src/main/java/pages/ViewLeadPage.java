package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}
	

		@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleverifyCName;
	
		public ViewLeadPage verifyCompanyName(String data) {
			verifyPartialText(eleverifyCName, data);
			return this;		
		}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

