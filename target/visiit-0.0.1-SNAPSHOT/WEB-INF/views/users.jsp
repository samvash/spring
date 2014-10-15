<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<html>
<head><title>Users</title>
	<link href="<c:url value="/resources/form/form.css" />" rel="stylesheet"  type="text/css" />	
	<link href="<c:url value="/resources/form/rios.css" />" rel="stylesheet"  type="text/css" />	

</head>

<body>
<div class="mask-footer">
<div class="layout-container">
<article class="content-section documentation-content">

        <h1 class="h1 type-center">Sign Up to Visiit</h1>
        <hr class="hr-small hr-pink">

<div class="row-fluid">
	<div class="span6 first">
				<h2 class="h2 type-pink">
					<strong>User Sign up Form </strong>
				</h2>
			<form:form id="form" method="post" modelAttribute="user" action="/user/saveuser">
                    <fieldset>

                        <div class="form-row form-label-prepend">
                            <label for="username">Username</label>
                            <input type="text" required="" name="UserName" id="username" placeholder="">
                        </div>

                        <div class="form-row form-label-prepend">
                            <label for="email">Email</label>
                            <input type="email" name="Email" id="Email" placeholder="">
                        </div>

                        <div class="form-row form-label-prepend">
                            <label for="company-name">Company</label>
                            <input type="text" name="CompanyName" id="CompanyName" placeholder="">
                        </div>

                        <div class="form-row form-label-prepend">
                            <label for="website">Website</label>
                            <input type="text" name="WebsiteUrl" id="WebsiteUrl" placeholder="">
                        </div>

                        <div class="row-fluid">
                            <div class="span6">
                                <div class="form-row form-label-prepend">
                                    <label for="password">Password</label>
                                    <input type="password" name="Password" id="Password" placeholder="">
                                </div>
                            </div>
                            <div class="span6">
                                <div class="form-row form-label-prepend">
                                    <label for="password-validate">Re-enter</label>
                                    <input type="password" name="ConfirmPassword" id="ConfirmPassword" placeholder="">
                                </div>
                            </div>
                        </div>
                        <button class="button button-medium button-3d" type="submit">Sign Up Now</button>
                    </fieldset>
	          </form:form>
	</div>
	
<div class="span6 last">

<ul class="list-unstyled list-flat">
					<s:url var="url" value="/search/search" htmlEscape="true"/>
                    <li class="active"><a href="${url}">Back to Search</a></li>
                </ul>
</div>
</div>
</article>
</div>
</div>
  <h3>Users:</h3>
  <c:forEach var="result" items="${results}">
	<div>${result.searchString}</div>
  </c:forEach>
</body>
</html>