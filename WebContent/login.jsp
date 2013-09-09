<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Nguyen Phan Labs Dashboard | Stats Center</title>

<script type="text/javascript" src="scripts/jquery.js"></script>
<script type="text/javascript">
			/* $(document).ready(function() {
				if (!($.browser.safari || $.browser.mozilla)) {
					$("form").hide();
					$("<div class='error' />").html("<h2>Browser Not Supported</h2>The VietnamArena Labs Dashboard utilizes cutting-edge browser technologies.<br /><br />We currently only support <ul><li>Firefox (version &gt; 3.5 recommended)</li><li>Safari (version &gt; 3 recommended)</li></ul>").appendTo('#login-content');
				}
			}); */
</script>
<style type="text/css">
* {
	font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
}

body {
	margin: 0;
	pading: 0;
	color: #fff;
	background: url('bg-login.png') repeat #1b1b1b;
	font-size: 14px;
	text-shadow: #050505 0 -1px 0;
	font-weight: bold;
}

li {
	list-style: none;
}

#dummy {
	position: absolute;
	top: 0;
	left: 0;
	border-bottom: solid 3px #777973;
	height: 250px;
	width: 100%;
	background: url('bg-login-top.png') repeat #fff;
	z-index: 1;
}

#dummy2 {
	position: absolute;
	top: 0;
	left: 0;
	border-bottom: solid 2px #545551;
	height: 252px;
	width: 100%;
	background: transparent;
	z-index: 2;
}

#login-wrapper {
	margin: 0 0 0 -160px;
	width: 320px;
	text-align: center;
	z-index: 99;
	position: absolute;
	top: 0;
	left: 50%;
}

#login-top {
	height: 120px;
	padding-top: 140px;
	text-align: center;
}

label {
	width: 70px;
	float: left;
	padding: 8px;
	line-height: 14px;
	margin-top: -4px;
}

input.text-input {
	width: 200px;
	float: right;
	-moz-border-radius: 4px;
	-webkit-border-radius: 4px;
	border-radius: 4px;
	background: #fff;
	border: solid 1px transparent;
	color: #555;
	padding: 8px;
	font-size: 13px;
}

input.button {
	float: right;
	padding: 6px 10px;
	color: #fff;
	font-size: 14px;
	background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#a4d04a),
		to(#459300) );
	text-shadow: #050505 0 -1px 0;
	background-color: #459300;
	-moz-border-radius: 4px;
	-webkit-border-radius: 4px;
	border-radius: 4px;
	border: solid 1px transparent;
	font-weight: bold;
	cursor: pointer;
	letter-spacing: 1px;
}

input.button:hover {
	background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#a4d04a),
		to(#a4d04a), color-stop(80%, #76b226) );
	text-shadow: #050505 0 -1px 2px;
	background-color: #a4d04a;
	color: #fff;
}

div.error {
	padding: 8px;
	background: rgba(52, 4, 0, 0.4);
	-moz-border-radius: 8px;
	-webkit-border-radius: 8px;
	border-radius: 8px;
	border: solid 1px transparent;
	margin: 6px 0;
}
</style>
</head>

<body id="login">

	<div id="login-wrapper" class="png_bg">
		<div id="login-top">
			<img src="images/StanfordLogo.png" alt="Student Manager Dashboard"
				title="Powered By Nguyen Phan Labs" />
		</div>

		<div id="login-content">
			<form action="doLogin.action" method="post" id="doLoginFrm">
				<div id="errorMssg">
					<s:actionerror />
				</div>
				<p>
					<label>Username</label> <input value="" name="username"
						class="text-input" type="text" />
				</p>
				<br style="clear: both;" />
				<p>
					<label>Password</label> <input name="password" class="text-input"
						type="password" />
				</p>
				<br style="clear: both;" />
				<p>
					<input class="button" type="submit" value="Sign In" />
				</p>
				<br style="clear: both;" />
				<p>Click <a href="loginWithSocialAccount.jsp">here</a> to log in by using your Social Network account.</p>
			</form>
		</div>
	</div>
	<div id="dummy"></div>
	<div id="dummy2"></div>
	
</body>
</html>
