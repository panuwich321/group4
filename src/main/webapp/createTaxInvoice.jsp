<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>สร้างใบกำกับภาษีอิเล็กทรอนิกส์</h1>
    <from action = "createTaxInvoice" method = "post">
            <jsp:include page="seller.jsp" />
            <jsp:include page="buyer.jsp" />    
            <jsp:include page="products.jsp" />
            <input type="submit" value="ออกใบกำกับภาษีอิเล็กทรอนิกส์" />
    </from>        
    </body>
</html>
