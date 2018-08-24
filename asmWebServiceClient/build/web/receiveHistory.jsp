d<%-- 
    Document   : history
    Created on : Aug 23, 2018, 4:44:07 PM
    Author     : DeltaDivine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Sender ID</td>
                <td>Fee</td>
                <td>Date</td>
                <td>Received Amount:</td>
                <td>Bill ID</td>
            </tr>
            <c:forEach items="${ListTransaction}" var="u">
                <tr>
                    <td><c:out value="${u.id}"/></td>
                    <td><c:out value="${u.transactionName}"/></td>
                    <td><c:out value="${u.senderId}"/></td>
                    <td><c:out value="${u.transactionFee}"/></td>
                    <td><c:out value="${u.transactionDate}"/></td>
                    <td><c:out value="${u.receiveAmount}"/></td>
                    <td><c:out value="${u.biillId}"/></td>
                </tr>
            </c:forEach> 
        </table>
        <a href="menu.jsp?id=${id}&name=${name}">Back to Menu</a>
    </body>
</html>
