<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<body>
	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />

		<br>
		<br> 
		
		Last name: <form:input path="lastName" />

		<br>
		<br>
		
		Country: 
		 <form:select path="country">

			<form:options items="${theCountryOptions}" />
		</form:select>

		<br>
		<br>
	
	Java <form:radiobutton path="favouriteLanguage" value="Java" />
	C++ <form:radiobutton path="favouriteLanguage" value="C++" />
	Pearl <form:radiobutton path="favouriteLanguage" value="Pearl" />
	Kotlin <form:radiobutton path="favouriteLanguage" value="Kotlin" />
		<br>
		<br>
		
		Windows <form:checkbox path="operatingSystems" value="Windows" />
		Mac <form:checkbox path="operatingSystems" value="Mac" />	
		Linux <form:checkbox path="operatingSystems" value="Linux" />


		<br>
		<br>



		<input type="submit" value="Submit">
	</form:form>

</body>

</html>