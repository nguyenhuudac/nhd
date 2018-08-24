<%-- 
    Document   : menu
    Created on : Aug 23, 2018, 10:27:42 AM
    Author     : DeltaDivine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Transaction</title>
    </head>
    <body>
        <h1>Welcome ${name}</h1>
        <a href="payment.jsp?id=${id}&name=${name}">Create New Transaction</a> 
        <div>
        <form action="ReceiveHistory">
            <input type="hidden" value="${id}" name="id"/>
            <input type="hidden" value="${name}" name="name"/>
            <input type="submit" value="View Receive Transaction History"/>
        </form>
        </div>
    </body>
</html>
