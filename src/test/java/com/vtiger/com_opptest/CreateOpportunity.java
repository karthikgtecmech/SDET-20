package com.vtiger.com_opptest;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.vtiger.com_generic_utility.BaseClass;
import com.vtiger.com_pom_repository.CreateNewOpportunity;
import com.vtiger.com_pom_repository.CreateNewOrganization;
import com.vtiger.com_pom_repository.HomePage;
import com.vtiger.com_pom_repository.OpportunityInfo;
import com.vtiger.com_pom_repository.OpportunityPage;
import com.vtiger.com_pom_repository.OrganizationsPage;

//@Listeners(com.vtiger.com_generic_utility.ListenerClassUtility.class)
public class CreateOpportunity extends BaseClass{
	@Test (groups = {"smokeTesting" , "regressionTesting"})
	public void CreateOpportunity_tc_07_Test() throws Throwable {
		
		/*Test Script Data*/
		String oppName = sheet.getDataFromExcel("Sheet1", 1, 3);
		String expSuccMsg = sheet.getDataFromExcel("Sheet1", 1, 3);
		String orgName = sheet.getDataFromExcel("Sheet1", 1, 2);
		String relatedToDropDownvalue = sheet.getDataFromExcel("Sheet1", 1, 4);
		String assignedToDropDowntext = sheet.getDataFromExcel("Sheet1", 1, 5);
		
		HomePage home = new HomePage(driver);
		home.getOrganizationsLink().click();
		OrganizationsPage orgPg = new OrganizationsPage(driver);
		orgPg.getCreateOrgImg().click();		
		CreateNewOrganization newOrg = new CreateNewOrganization(driver);
		newOrg.getOrgName(orgName);
		newOrg.saveBtn();
		web.waitAndClick(home.getOpportunityLink());
		OpportunityPage oppPg = new OpportunityPage(driver);
		oppPg.getCreateOppImg().click();		
		CreateNewOpportunity newOpp = new CreateNewOpportunity(driver);	
		newOpp.getOpportunityName(oppName);
		newOpp.selectRelatedToDropDown(relatedToDropDownvalue);
		newOpp.selectRelatedToLookUp();
		newOpp.selectAssignedToGroup();		
		newOpp.selectAssignedToDropDown(assignedToDropDowntext);
		newOpp.saveBtn();
		
		OpportunityInfo oppInfo = new OpportunityInfo(driver);
		boolean actSuccMsg = oppInfo.getSuccessMsg().getText().contains(expSuccMsg); 
		assertTrue(actSuccMsg);	
	}
	
	@Test (groups = {"smokeTesting" , "regressionTesting"})
	public void CreateOpportunity_tc_08_Test() throws Throwable {
		
		/*Test Script Data*/
		String oppName = sheet.getDataFromExcel("Sheet1", 2, 3);
		String expSuccMsg = sheet.getDataFromExcel("Sheet1", 2, 3);
		String orgName = sheet.getDataFromExcel("Sheet1", 2, 2);
		String relatedToDropDownvalue = sheet.getDataFromExcel("Sheet1", 2, 4);
		String assignedToDropDowntext = sheet.getDataFromExcel("Sheet1", 2, 5);
		HomePage home = new HomePage(driver);
		home.getOrganizationsLink().click();
		OrganizationsPage orgPg = new OrganizationsPage(driver);
		orgPg.getCreateOrgImg().click();		
		CreateNewOrganization newOrg = new CreateNewOrganization(driver);
		newOrg.getOrgName(orgName);
		newOrg.saveBtn();
		web.waitAndClick(home.getOpportunityLink());
		OpportunityPage oppPg = new OpportunityPage(driver);
		oppPg.getCreateOppImg().click();		
		CreateNewOpportunity newOpp = new CreateNewOpportunity(driver);	
		newOpp.getOpportunityName(oppName);
		newOpp.selectRelatedToDropDown(relatedToDropDownvalue);
		newOpp.selectRelatedToLookUp();
		newOpp.selectAssignedToGroup();		
		newOpp.selectAssignedToDropDown(assignedToDropDowntext);
		newOpp.saveBtn();
		
		OpportunityInfo oppInfo = new OpportunityInfo(driver);
		boolean actSuccMsg = oppInfo.getSuccessMsg().getText().contains(expSuccMsg);
		assertTrue(actSuccMsg);
	}
	
	@Test (groups = {"smokeTesting" , "regressionTesting"})
	public void CreateOpportunity_tc_09_Test() throws Throwable {
		
		/*Test Script Data*/
		String oppName = sheet.getDataFromExcel("Sheet1", 3, 3);
		String expSuccMsg = sheet.getDataFromExcel("Sheet1", 3, 3);
		String orgName = sheet.getDataFromExcel("Sheet1", 3, 2);
		String relatedToDropDownvalue = sheet.getDataFromExcel("Sheet1", 3, 4);
		String assignedToDropDowntext = sheet.getDataFromExcel("Sheet1", 3, 5);
		HomePage home = new HomePage(driver);
		home.getOrganizationsLink().click();
		OrganizationsPage orgPg = new OrganizationsPage(driver);
		orgPg.getCreateOrgImg().click();		
		CreateNewOrganization newOrg = new CreateNewOrganization(driver);
		newOrg.getOrgName(orgName);
		newOrg.saveBtn();
		web.waitAndClick(home.getOpportunityLink());
		OpportunityPage oppPg = new OpportunityPage(driver);
		oppPg.getCreateOppImg().click();		
		CreateNewOpportunity newOpp = new CreateNewOpportunity(driver);	
		newOpp.getOpportunityName(oppName);
		newOpp.selectRelatedToDropDown(relatedToDropDownvalue);
		newOpp.selectRelatedToLookUp();
		newOpp.selectAssignedToGroup();		
		newOpp.selectAssignedToDropDown(assignedToDropDowntext);
		newOpp.saveBtn();
		
		OpportunityInfo oppInfo = new OpportunityInfo(driver);
		boolean actSuccMsg = oppInfo.getSuccessMsg().getText().contains(expSuccMsg);
		assertTrue(actSuccMsg);	
	}
}
