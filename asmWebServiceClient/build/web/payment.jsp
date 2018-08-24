<%-- 
    Document   : payment
    Created on : Aug 23, 2018, 11:37:31 AM
    Author     : DeltaDivine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Payment</title>
    </head>
    <body>
        <form action="paymentConfirm.jsp" method="GET">
            <h1><span>NEW</span><lable> Payment </lable></h1>
            <input type="hidden" value="<%=request.getParameter("id")%>" name="id"/>

            <label for="id">Partner ID:</label>
            <input type="text" name="partnerId" placeholder="" maxlength="20" required/><br>
            
            <label for="biillId">Bill ID:</label>
            <input type="text" placeholder="" name="biillId" maxlength="20" required/><br>
            
            <label for="accountId">Account ID:</label>
            <input type="text" name="accountId" placeholder="" maxlength="20" required/><br>
            
            <label for="accountPin">Partner's PIN Code:</label>
            <input type="text" name="accountPin" placeholder="" maxlength="20" required/><br>
            
            <label for="id">Transaction Name:</label>
            <input type="text" name="transactionName" placeholder="" maxlength="20" required/><br>
            
            <label for="transactionAmount">Payment Amount:</label>
            <input type="text" name="transactionAmount" placeholder="" required/><br>
            
            <label for="feePayer">Fee Payer:</label>
            <select name="feePayer">
                <option value="1">sender(partner)</option>
                <option value="2">receiver(you)</option>
            </select><br>
            
            <%
                String id = request.getParameter("id");
                request.setAttribute("id", request.getParameter("id"));
            %>
            
            <input type="submit" value="Next step"/>
            <a href="menu.jsp?id=${id}&name=${name}">Cancel</a>

        </form>
    </body>
</html>
