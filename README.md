DatabaseProj
============

Script

Sales (UserId 4)
Sales: Hello how can I help you
Customer: I'd like to purchase these two books (The Help, two copies)
Sales: Great do you have an Account with us?
Customer: No, I don't
Sales: Let's set one up
- 2. Create an Account from Menu (Should create ID 5)
Sales: Now that you have an account I'll ring up your purchases
Customer: Hands Sales clerk Two Copies of "The Help" Id 1
- 7. Ring up Purchases 
    using CustomerID 5, MerchandiseId 1, Quantity 2, Price 2.25
Customer: I didn't see the Dictionary on the shelves, do you have it in stock?
Sales: Let me look up that item
- 3. Check for Merchandise Dictionary
     use Name=Dictionary, Find that it has ID 3
- 4. Check Store Inventory for Dictionary
     use ID=3
Sales: We don't have it in stock or at the warehouse.  WOuld you like me to place a special order for you?
Customer: Yes!
- 5. Make a Special Order 
      use CustomerID=5,merchandiseId=3,quantity=2
- 6. View Special order
      use CustomerID=5
Sales: Here you can see your special order, we will call you when it comes in
Customer: Great, how do I pay for my purchases
Sales: You are billed monthly.  For information on Billing, you need to see the Billing department

Billing (UserId 1)
Customer: I'd like to know my Bill for the month
Billing: Sure let me look up your history
- 4. Show Billing Cycles By Customer
   using CustomerID=5 ***NOTE THE BILLING CYCLE ID IS 5
Billing: Looking at the screen I see you have one billing cycle open and owe 4.50 
Customer: What did I buy to make up that total:
Billing: I'll show you
- 5. Show Billing Activity (Show User)
    using BillingCycle=5
Customer: I'd like to pay know.  
Billing: Okay I'll enter your payment
- 6. Insert Payment (updates cycle status)
    using BillingCycle=5, Payment="Cash"
Billing: Your bill is paid.  Here are what your billing cycles look like now
- 4. Show Billing Cycles By Customer
    using CustomerId=5
Additional Info... Billing Staff can also see all cycles by type, edit a cycle, create a cycle

Stocking (UserId 5) 
Stocking: As part of stocking I check for special order requests and order the items for customers
- 9. View Special Orders By Status (Save Special Order Id, merchandise Id, Quantity)
    using status=open
Stocking: I can see someone has a special order for 'Dictionary' last entry specialOrderId=5 merchandiseId = 3 and vendorId = 2.  I'll order it from the Vendor Now.  I see they have id 2, let me look up their info.  
- 12. Show all Vendors
      Find the phone number for vendor id 2
Stocking: (Calling Vendor, I'd like to place an order for 2 copies of the Dictionary)
- 10. Buy From Vendor
       using Vendorid=2,PaymentInfo=Cash,ConfirmationCode=123,merchandiseId=3,quantity=2,price=1.11
- 7. Update Special Order Item Status (Update Status to ordered)
      using vendor=7,specialorderid=5,merchandiseid=3,status=ordered
Stocking: Now let me show you what happens when a vendor bill comes in
- 11. Show all Vendor Bills by Type (received), lets the last one came in...   
Stocking: Now I can update the order and the Store Merchandise, to have the 2 Dictionaries merchandise Id 3
- 8. Update vendor bill (switch make received)
- 9. View Special Orders By Status (find one to update and set status = received)
- 2. Update Store Merchandise (2 Dictionaries for store 1)
Stocking: Now I'd call the customer and say.. Your order is in.  If they call to check on their order they'll also see it has been recieved
Stocking:  I can also add items to the store, add new merchandise, create vendors, Review all the Inventory in the store

Manager (UserId 3)
Manager: I can use my interface to see how much i've sold, and how much I bought ** Add Date Check
- 4. Show all Customer Bills grouped by Customer
- 5. Show all Vendor Bills groups by Vendor
Manager: I can also Create/Update Employees, or show all the employees for my Store

Franchise Manager (UserId 2)
Franchise Manager: I can use my interface to see how much each store has sold, and how they bought bought ** Add Date Check
- 4. Show all Customer Bills grouped by Customer
- 5. Show all Vendor Bills groups by Vendor
Franchise Manager: I can also Show all employees, Create an Employee, Show all Stores or Create a Store

