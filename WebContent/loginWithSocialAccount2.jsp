<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Nguyen Phan Labs Dashboard | Stats Center</title>

<script type="text/javascript" src="scripts/jquery.js"></script>
<!-- socialize.js script should only be included once -->
<script type="text/javascript"
	src="http://cdn.gigya.com/js/socialize.js?apiKey=3_9WAxsuFmQWNE-4UQYE9gBMgMityqda6Vhl_xde7WTrQw7YOM9AZMP6K5twR70UTG">
	{
		siteName: 'fpt.com.vn (Default site)'
		,enabledProviders: 'facebook,twitter,googleplus,linkedin,yahoo,messenger,aol,foursquare,orkut,instagram,vkontakte,renren,QQ,Sina,kaixin'
	}
</script>
<script type="text/javascript">
	// Changing the default look and behavior of the plugin using the 'params' object:
	var params =
	{
	    showTermsLink:false, // 'terms' link is hidden
	    headerText:"Please Login using one of the following providers:", // adding header text
	    height:145, // changing default plugin size
	    width:700,  // changing default plugin size
	    cid:'',      
	    containerID:"loginDiv", // The plugin will embed itself inside the "loginDiv" DIV (will not be a popup)
	    // Changes to the default design of the plugin's design
	    //Background color is changed to purple, text color to gray and button size is set to 40 pixels:   
	    UIConfig:'<config><body><texts color="#DFDFDF"></texts><controls><snbuttons buttonsize="40"></snbuttons></controls><background background-color="#51286D"></background></body></config>',
	    // Change the buttons design style to the 'fullLogo' style:
	    buttonsStyle:'fullLogo',
	    // After successful login - the user will be redirected to "https://www.MySite.com/welcome.html" :  
	    redirectURL: "http://localhost:8080/StanfordStudentManager/doLogin.action"
	}
</script>
</head>
<body onload="onLoad()">
	<br />
	<h4>Please sign in using one of the following providers:</h4>
	<br />
	<br />
	<div id="loginDiv"></div>
	<script type="text/javascript">
                        gigya.socialize.showLoginUI({
                            height: 100
                            ,width: 330
                            ,showTermsLink:false // remove 'Terms' link
                            ,hideGigyaLink:true // remove 'Gigya' link
                            ,buttonsStyle: 'fullLogo' // Change the default buttons design to "Full Logos" design
                            ,showWhatsThis: true // Pop-up a hint describing the Login Plugin, when the user rolls over the Gigya link.
                            ,containerID: 'loginDiv' // The component will embed itself inside the loginDiv Divs
                            ,cid:''
                            });
    </script>
	<br />
	<br />
	<br />
	<br />
<!-- 	<h4>Click the button below to sign out from Gigya platform:</h4>
	<br />
	<br />
	<input id="btnLogout" type="button" value="Sign Out"
		onclick="logoutFromGS()" /> -->
	<br />
	<br />
	<div id="status"></div>

</body>
</html>
