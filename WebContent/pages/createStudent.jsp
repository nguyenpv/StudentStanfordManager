<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h3>Create Student Info:</h3>
<s:form action="createStudent" method="POST" validate="true">
	<font color="red"><s:actionerror /></font>
	<s:textfield name="student.firstname" label="First name" maxlength="30" required="true" />
	<s:textfield name="student.lastname" label="Last name" maxlength="30" required="true" />
	<s:textfield name="student.email" label="Email address" maxlength="30" />
	<s:textfield name="student.phoneNumber" label="Phone number" maxlength="30" />
	<s:textfield name="student.address" label="Address" maxlength="30" />
	<tr><td colspan="2">&nbsp;</td></tr>
	<tr>
		<td colspan="2" align="center">
			<s:submit value="Create" theme="simple" cssClass="button" />
			<s:reset value="Reset" theme="simple" cssClass="button" />
		</td>
	</tr>
</s:form>
<br />
<a href="home.action" class="button next">Back to Home Page</a>