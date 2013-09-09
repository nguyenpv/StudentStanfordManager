<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html lang="en">
<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/main.css" type="text/css"
	media="screen" />
<script type="text/javascript"
	src="../StanfordStudentManager/scripts/jquery.js"></script>
<script type="text/javascript">
		$(document).ready(function(){
			$('.bordered tr').mouseover(function(){
			    $(this).addClass('highlight');
			}).mouseout(function(){
			    $(this).removeClass('highlight');
			});
			$(".zebra tbody tr:even").addClass('alternate');
			
			setInterval(function() {
			    //call $.ajax here
				$.ajax({
				    type: "POST",
				    url: "retrieveWeatherInfo.action", 
				  	data: "",
				    contentType: "text/html",
				    success: function(msg) {
					    $("#weather").empty().html(msg);
				    },
				    error: function(err) {
				    	$("#weather").empty().html('Error:' + err.responseText + '  Status: ' + err.status);
				    }
				});
			}, 5000);
		});
</script>
<script type="text/javascript"
	src="http://cdn.gigya.com/js/socialize.js?apiKey=3_9WAxsuFmQWNE-4UQYE9gBMgMityqda6Vhl_xde7WTrQw7YOM9AZMP6K5twR70UTG">
	{
		siteName: 'fpt.com.vn (Default site)'
		,enabledProviders: 'facebook,twitter,googleplus,linkedin,yahoo,messenger,aol,foursquare,orkut,instagram,vkontakte,renren,QQ,Sina,kaixin'
	}
</script>
<script type="text/javascript" src="scripts/gigya.js">                     
</script>
</head>
<body>

	<header>
		<tiles:insertAttribute name="header" />
	</header>
	<nav>
		<ul>
			<li class="selected"><a href="home.action">Home</a></li>
			<li><a href="#">Menu Item 1</a></li>
			<li><a href="#">Menu Item 2</a></li>
			<li><a href="#">Menu Item 3</a></li>
			<li class="subscribe"><a onclick="logoutFromGS()" >Log out</a></li>
		</ul>
	</nav>
	<section id="intro">
		<header>
			<h2>Today Weather Info</h2>
		</header>
		<%-- <p><s:action name="retrieveWeatherInfo" /></p> --%>
		<div id="weather"></div>
	</section>
	<div id="content">
		<div id="mainContent">
			<tiles:insertAttribute name="body" />
		</div>
		<aside>
			<tiles:insertAttribute name="menu" />
		</aside>
	</div>
	<footer>
		<div>
			<tiles:insertAttribute name="footer" />
		</div>
	</footer>

</body>
</html>