<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h3>Search students by name</h3>
<s:form action="doSearchStudent" method="GET">
	<tr>
		<td>
			<s:textfield name="name" maxlength="50" theme="simple" cssStyle="width: 520px;"/>
		</td>
	</tr>	
	<tr>
	    <td colspan="2">
	      <s:submit value="Search" theme="simple" cssClass="button" />
	      <s:reset value="Reset" theme="simple" cssClass="button" />
	    </td>
  	</tr> 
</s:form>
(*: Please let the textfield be empty to search all student.)
<br />
<br />
<br />
<a href="home.action" class="button next">Back to Home Page</a>