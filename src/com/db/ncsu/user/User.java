package com.db.ncsu.user;

import com.db.ncsu.command.*;

public  class User {

	private Command[] salesCommands;
	private Command[] billingCommands;
	private Command[] stockingCommands;
	private Command[] managerCommands;
	private Command[] franchiseCommands;

	
	public User()
	{
		salesCommands = new Command[]{ new InsertSpecialOrder(), new UpdateStoreMerchandise(), new UpdateAccount(), new CreateAccount(), new CreateEmployee(), new ShowEmployees(), new CreateVendor(), new CreateStore(), new CreateMerchandise(), new AddVendorPayment(), new AddStoreItem(), new ReviewStoreInventory(), new CheckItemAtStore(), new CheckMerchandiseAvailability(), new ShowStore(), new ReviewBills(), new ViewAllCustomerSpecialOrders(), new GenerateCustomerPurchaseHistory(), new GenerateVendorPurchaseHistory(), new ReviewASpecialOrder(), new VendorStorePurchaseHistory(), new CustomerStorePurchaseHistory(), new ShowTotalInventory(), new ShowAllCustomerBills(), new ShowAllVendorBills(), new UpdateCustomerBillingCycle(), new UpdateSpecialOrderItemStatus(), new UpdateVendor(), new UpdateEmployee(), new CreateBillingCycle()};
		billingCommands = new Command[]{ new CreateAccount(), };

		//Add Insert VendorBills, so they can order	
		//Update VendorBill Status 
		//ViewAllCustomerSpecialOrdersByType ... type on open, order
		stockingCommands = new Command[]{ new AddStoreItem(), new UpdateStoreMerchandise(), new CreateMerchandise(), new CreateVendor(),
				new UpdateVendor(), new ReviewStoreInventory(), 
				new ShowAllVendorBills(), new UpdateSpecialOrderItemStatus(), 
				new ViewAllCustomerSpecialOrders(), };
	

		
		managerCommands = new Command[]{ new CreateEmployee(), new UpdateEmployee(), new ShowEmployeesByStore(), new ShowAllCustomerBills(), new ShowAllVendorBills() };
		franchiseCommands = new Command[]{ new CreateStore(),new ShowStore(), new CreateEmployee(), new ShowEmployees(), new ShowAllCustomerBillsByStore(), new ShowAllVendorBillsByStores()};

	}
	
	public Command[] getSalesCommands() {
		return salesCommands;
	}

	public Command[] getFranchiseCommands() {
		return franchiseCommands;
	}

	
	public Command[] billingCommands() {
		return billingCommands;
	}
	
	public Command[] managerCommands() {
		return managerCommands;
	}
	
	public Command[] franchiseManagerCommands() {
		return salesCommands;
	}
	
	public Command[] stockingCommands() {
		return stockingCommands;
	}
	
}
