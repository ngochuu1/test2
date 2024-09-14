<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>

<body>
    <h1>Thanks for joining our email list</h1>

    <p>Here is the information that you entered:</p>

    <label>First Name:</label>
    <span>${user.firstName}</span><br>
    <label>Last Name:</label>
    <span>${user.lastName}</span><br>
    <label>Email:</label>
    <span>${user.email}</span><br>
    <label>Date of Birth:</label>
    <span>
        <c:choose>
            <c:when test="${not empty user.dob}">
                <fmt:formatDate value="${user.dob}" pattern="dd/MM/yyyy" />
            </c:when>
            <c:otherwise>
                Not provided
            </c:otherwise>
        </c:choose>
    </span><br>
    <label>You hear about us:</label>
    <span>${user.heardFrom}</span><br>
    <label>Announcements:</label>
    <span>${user.wantsUpdates ? 'YES, I\'d like that' : 'NO'}</span><br>
    <label>Contact you:</label>
    <span>${user.contactVia}</span><br>
    <p>To enter another email address, click on the Back 
    button in your browser or the Return button shown 
    below.</p>
    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>

</body>
</html>
