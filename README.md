DatabaseProj
============

Script

Sales (UserId 3)
Sales: Hello, how can I help you?
Customer: I'd like to purchase these two books (Computer Networking, two copies)
Sales: *Why would you need two?* ...Great, do you have an Account with us?
Customer: No, I don't.
Sales: Let's set one up.
- 2. Create an Account from Menu (Should create ID 5)
Sales: Now that you have an account I'll ring up your purchases.
Customer: Hands Sales clerk Two Copies of "Computer Networking" Id 1234
- 7. Ring up Purchases 
    using CustomerID 5, MerchandiseId 1234, Quantity 2, Price 2.25
Customer: I didn't see Operating System Concepts on the shelves, do you have it in stock?
Sales: Let me look up that item
- 3. Check for Merchandise Operating System Concepts
     use Name=Operating System Concepts, Find that it has ID 1235
- 4. Check Store Inventory for Operating System Concepts
     use ID=1235
Sales: We don't have it in stock (the warehouse is on strike).  Would you like me to place a special order for you?
Customer: Yes!
- 5. Make a Special Order 
      use CustomerID=5,merchandiseId=1235,quantity=2,price=3
- 6. View Special order
      use CustomerID=5
Sales: Here you can see your special order, we will call you when it comes in.
Customer: Great, how do I pay for my purchases?
Sales: You are billed monthly.  I can help you with that, or the billing department can.
Customer: No problem, I'll talk to the billing department. *You smell like patchouli.*
ADDITIONAL COMMANDS: Update a Customer Account

Meanwhile, in the franchise manager's office...
Franchise Manager (UserId 2)
Franchise Manager: Morale in the office is down! Also I don't have any managers, billing, or stocking staff! Time to hire some more comedians!
- 3. Create a new employee (creates staffID=7, set storeID=1, other stuff, name=Dave Chappelle, other stuff, department=Manager, other stuff)
- 3. Create a new employee (creates staffID=8, set storeID=1, other stuff, name=Daniel Tosh, other stuff, department=Billing, other stuff)
- 3. Create a new employee (creates staffID=9, set storeID=1, other stuff, name=Aziz Ansari, other stuff, department=Stocking, other stuff)
Franchise Manager: Phew, now that that's done, I can use my interface to see how much each store has sold, and what they bought.
- 5. Show all Customer Bills grouped by Store (startDate=01/01/1990, endDate=12/12/2012)
- 6. Show all Vendor Bills groups by Vendor (ditto)
ADDITIONAL COMMANDS: I can also Show all employees, Create an Employee, Show all Stores or Create a Store

Back at the store!
Stocking (UserId 9) 
Stocking: As part of stocking I check for special order requests and order the items for customers!
Customer: *I was just going to ask for directions to billing...*
- 9. View Special Orders By Status (Save Special Order Id (5), merchandise Id (1235), Quantity (2))
    using status=open
Stocking: I can see someone has a special order for 'Operating System Concepts'. It is the last entry, with specialOrderId=5, merchandiseId = 3, and vendorId = 2. (I've memorized all of the book ids because I'm secretly a genius.) 
I'll order it from the Vendor now.  I see they have id 2, let me look up their info.  
- 12. Show all Vendors
      Find the phone number for vendor id 2 (234-432-9485)
Stocking: (Calling Vendor, I'd like to place an order for 2 copies of Operating System Concepts.)
- 10. Buy From Vendor
       using Vendorid=2,PaymentInfo=Cash,ConfirmationCode=123,merchandiseId=1235,quantity=2,price=1.11
- 7. Update Special Order Item Status (Update Status to ordered)
      using specialorderid=5,merchandiseid=1235,status=ordered
Stocking: Now let me show you what happens when a vendor bill comes in
Customer: Do I have a choice?
- 11. Show all Vendor Bills by Type (received), lets the last one came in...   
Stocking: Now I can update the order and the Store Merchandise, to have the 2 Operating System Concepts merchandise Id 1235
- 8. Update vendor bill (2, merchandiseid=1235, switch to received)
- 13. Now I'll send the Special Order to the Customer and Bill them
     using specialorderid=5,merchandiseid=1235
- 9. It now appears under sent items View Special Orders By Status (Save Special Order Id, merchandise Id, Quantity)
    using status=sent  (If you look at the billing cycle the item now appears there too, with the staffid as the stock person)
     
ADDITIONAL COMMANDS:  I can also add items to the store, add new merchandise, create vendors, Review all the Inventory in the store


Billing (UserId 8)
Customer: Phew, finally got away! I'd like to know my Bill for the month, please.
Billing: Sure, let me look up your history.
- 4. Show Billing Cycles By Customer
   using CustomerID=5 ***NOTE THE BILLING CYCLE ID IS 5*** XorX6X
Billing: Looking at the screen I see you have one billing cycle open and owe 10.50 [4.50 (purchase in store) and 6 (purchase that was an order)]
Customer: What did I buy to make up that total:
Billing: I'll show you!
- 5. Show Billing Activity (Show User)
    using BillingCycle=5
Customer: I'd like to pay now.  
Billing: Okay, I'll enter your payment.
- 6. Insert Payment (updates cycle status)
    using BillingCycle=5, Payment="Cash"
Billing: Your bill is paid.  Here is what your billing cycles look like now.
- 4. Show Billing Cycles By Customer
    using CustomerId=5
ADDITIONAL COMMANDS: Billing Staff can also see all cycles by type, edit a cycle, create a cycle



Manager (UserId 7)
Customer: Well would you look at that! Can I leave now?
Manager: WAIT! I can use my interface to see how much I've sold, and how much I've bought.
- 4. Show all Customer Bills grouped by Customer (startDate=01/01/1990, endDate=12/12/2012)
- 5. Show all Vendor Bills groups by Vendor (ditto)
- 3. Show all employees for my store
Customer: (starts edging towards the door)
- 6. Show All Customer Bills, Vendor Bills, and Special Orders Done By a Staff Member
    using 9, should see the vendor order and the customer bill (for the special order)
- 6. Show All Customer Bills, Vendor Bills, and Special Orders Done By a Staff Member
    using 3, should see the Bill and Special Order for first customer
Customer: (leaves without manager noticing)
- 6. Show All Customer Bills, Vendor Bills, and Special Orders Done By a Staff Member
    using 8, should see the Payment
ADDITIONAL COMMANDS: I can also Create/Update Employees, or show all the employees for my Store.
Manager: (Looks around) Man, I did it again, didn't I? (exit stage left)

