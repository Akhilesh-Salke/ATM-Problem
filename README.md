# ATM-Problem💵
## OOPs concept Brush up

In this code we had developed the small appliction for conducting smooth ATM transaction.
Basically here we have replicated the actual ATM system's workflow.

**In realtime There will be a possibilities of two scenarios**
*1.User have account*
*2.User don't have account*

-> If user don't have account in our system, then he will be able to check our system's rate of interests and all other bank details that are needfull for an individual
  There is one catch here : user will not be able to see his balance..as he don't have account in our ATM system...😊😊

  User is requsted to open an account in system..and if he or she wishes to open account then their unique account id will be generated.It is shown as below ::

  `public static int generateCard() {
		ATMcardno=(int)(Math.random()*9000000)+1000000;
		return ATMcardno;
	}`

->If user already have an account in system then he will be able to access the all basic functionality that any ordinary bank has.


  
