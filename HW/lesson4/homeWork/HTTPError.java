package lesson4.homeWork;

public enum HTTPError {
	Error400("Equivalent to HTTP status 400. \n"
			+ "BadRequest indicates that the request could not be understood by the server. \n"
			+ "BadRequest is sent when no other error is applicable, \n"
			+ "or if the exact error is unknown or does not have its own error code. "),
	Error401("Equivalent to HTTP status 401. \n" + 
			"Unauthorized indicates that the requested resource requires authentication.\n" + 
			"The WWW-Authenticate header contains the details of how to perform the authentication."), 
	Error402("402 Payment Required \n" + 
			"Reserved for future use. The original intention was that this code might be used as part of \n"
			+ "some form of digital cash or micropayment scheme, as proposed, for example, by GNU Taler,\n"
			+ "but that has not yet happened, and this code is not widely used. Google Developers API uses \n"
			+ "this status if a particular developer has exceeded the daily limit on requests.\n"
			+ "Sipgate uses this code if an account does not have sufficient funds to start a call.\n"
			+ "Shopify uses this code when the store has not paid their fees and is temporarily disabled.\n"
			+ "Stripe uses this code for failed payments where parameters were correct, for example blocked \n"
			+ "fraudulent payments."), 
	Error403("Equivalent to HTTP status 403. \n"
			+ "Forbidden indicates that the server refuses to fulfill the request."), 
	Error404("Equivalent to HTTP status 404. \n"
			+ "NotFound indicates that the requested resource does not exist on the server.");
	
	private  String error;
	
	
	HTTPError(String error){
		this.error = error;
		
	}

	public String getError() {
		return error;
	}


	
	

}
