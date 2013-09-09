// This method is activated when the page is loaded
function onLoad() {
	// register for login event
	gigya.socialize.addEventHandlers({
		context : {
			str : 'Congrats on your'
		},
		onLogin : onLoginHandler,
		onLogout : onLogoutHandler
	});
}

// onLogin Event handler
function onLoginHandler(eventObj) {
	//alert(eventObj.context.str + ' ' + eventObj.eventName + ' to ' + eventObj.provider
	//    + '!\n' + eventObj.provider + ' user ID: ' +  eventObj.user.identities[eventObj.provider].providerUID);
	// verify the signature ...
	verifyTheSignature(eventObj.UID, eventObj.timestamp, eventObj.signature);

	// Check whether the user is new by searching if eventObj.UID exists in your database
	var newUser = true; // lets assume the user is new

	if (newUser) {
		// 1. Register user
		// 2. Store new user in DB
		// 3. link site account to social network identity
		//   3.1 first construct the linkAccounts parameters
		var dateStr = Math.round(new Date().getTime() / 1000.0); // Current time in Unix format
		//(i.e. the number of seconds since Jan. 1st 1970)

		var siteUID = 'uTtCGqDTEtcZMGL08w'; // siteUID should be taken from the new user record
		// you have stored in your DB in the previous step
		var yourSig = createSignature(siteUID, dateStr);

		var params = {
			siteUID : siteUID,
			timestamp : dateStr,
			cid : '',
			signature : yourSig
		};

		//   3.1 call linkAccounts method:
		gigya.socialize.notifyRegistration(params);
	}

	// Call our servlet
	var request = new XMLHttpRequest();
	request
			.open(
					"POST",
					"http://localhost:8080/StanfordStudentManager/doLogin.action",
					true);

	var postParam = "uidInfo=" + eventObj.UID;
	request.setRequestHeader("Content-Type",
			"application/x-www-form-urlencoded; charset=UTF-8");

	request.send(postParam);

	document.getElementById('status').style.color = "green";
	document.getElementById('status').innerHTML = "Status: You are now signed in. You will be redirected to main page in 2 sec.";
	setTimeout('redirectToHomepage()', 2000);

}

// Note: the actual signature calculation implementation should be on server side
function createSignature(UID, timestamp) {
	encodedUID = encodeURIComponent(UID); // encode the UID parameter before sending it to the server.
	// On server side use decodeURIComponent() function to decode an encoded UID
	return '';
}

// Note: the actual signature calculation implementation should be on server side
function verifyTheSignature(UID, timestamp, signature) {
	encodedUID = encodeURIComponent(UID); // encode the UID parameter before sending it to the server.
	// On server side use decodeURIComponent() function to decode an encoded UID
	//alert('Your UID: ' + UID + '\n timestamp: ' + timestamp + '\n signature: ' + signature + '\n Your UID encoded: ' + encodedUID);
}

// Logout from Gigya platform. This method is activated when "Logout" button is clicked
function logoutFromGS() {
	//alert("logout 1");
	gigya.services.socialize.logout(); // logout from Gigya platform
	//alert("logout 2");
	window.location.href = "http://localhost:8080/StanfordStudentManager/doLogout.action";
}

// onLogout Event handler
function onLogoutHandler(eventObj) {
	document.getElementById('status').style.color = "red";
	document.getElementById('status').innerHTML = "Status: You are now signed out";
}

function redirectToHomepage() {
	window.location.href = "http://localhost:8080/StanfordStudentManager";
}