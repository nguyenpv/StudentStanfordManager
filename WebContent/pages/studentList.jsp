<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript">
	$(document).ready(function() {
		$("#addBtn").click(function() {
			//alert("Add");
			location.href = "viewStudentCreation.action";
		});
		$("#removeBtn").click(function() {
			var n = $("input:checked").length;
			if (n == 0) {
				alert("Please select at least one record.");
				return;
			}
			if (confirm("Are you sure to remove student?")) {
				var selectedCheckboxValue = "";
		        $('input.selItemsChkboxCls:checked').each(function() {
		            selectedCheckboxValue += $(this).val() + ", ";
		        });
		        //alert("selectedCheckboxValue: " + selectedCheckboxValue); 

				$("#studentIdStrListTxtField").val(selectedCheckboxValue);
				//alert("Prepare to remove:" + $("#studentIdStrListTxtField").val());
				$("#doRemoveFrm").submit();
			} else {
				return;
			}
		});
		
		// Update
		$("#updateBtn").click(function() {
			var n = $("input:checked").length;
			if (n == 0 || n > 1) {
				alert("Please select one record to update.");
				return;
			}
			if (confirm("Are you sure to update student?")) {
				var selectedCheckboxValue = "";
		        $('input.selItemsChkboxCls:checked').each(function() {
		            selectedCheckboxValue = $(this).val();
		        });

				$("#studentIdStrTxtField").val(selectedCheckboxValue);
				$("#viewUpdateFrm").submit();
			} else {
				return;
			}
		});
	});
</script>
<h3>List of students:</h3>
<s:set name="studentList" value="studentList"></s:set>
<s:if test="%{#studentList != null && #studentList.size() > 0}">
<table class="zebra">
	<thead>
		<tr>
			<th>Chk</th><!-- <th>Id</th> --><th>First Name</th><th>Last Name</th>
			<th>Email</th><th>Phone number</th><th>Address</th>
		</tr>
	</thead>
	<tbody>
	<s:iterator value="studentList" status="stat" var="student">
		<tr>
			<td><input type="checkbox" name="chkedItems" class="selItemsChkboxCls" value='<s:property value="%{#student.studentId}"/>'/> </td>
			<%-- <td><s:property value="%{#student.studentId}"/></td> --%>	
			<td><s:property value="%{#student.firstname}"/></td>
			<td><s:property value="%{#student.lastname}"/></td>
			<td><s:property value="%{#student.email}"/></td>	
			<td><s:property value="%{#student.phoneNumber}"/></td>
			<td><s:property value="%{#student.address}"/></td>
		</tr>
	</s:iterator>
	</tbody>
</table>
<div id="buttonsArea">
	<input type="button" id="updateBtn" value="Update" class="button edit" /> &nbsp;
	<input type="button" id="removeBtn" value="Remove" class="button delete" /> &nbsp;
	<input type="button" id="addBtn" value="Add student" class="button add" />
</div>
</s:if>
<s:else>
	<br/>
	No record found!
</s:else>
<div id="removeArea" style="display: none;">
	<s:form action="doRemoveStudents" id="doRemoveFrm" method="POST">
		<s:textfield name="studentIdStrList" id="studentIdStrListTxtField" />
	</s:form>
</div>
<div id="updateArea" style="display: none;">
	<s:form action="viewUpdateStudent" id="viewUpdateFrm" method="POST">
		<s:textfield name="studentIdStr" id="studentIdStrTxtField" />
	</s:form>
</div>

<br />
<a href="home.action" class="button next">Back to Home Page</a>	