<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>Save Product</title>
    <link rel="stylesheet" type="text/css" href="resources/css/main.css">
</head>
<body>
<div id="global">
    <h2>Welcome Home</h2>


    <form action="product" method="get">
        <input id="submit" type="submit"
               value="Add a Product">
    </form>
    <br>
    <a href="${pageContext.request.contextPath}/product/productfind"> Find Product </a>

    <a href="${pageContext.request.contextPath}/product/listproducts"> List Products </a>

</div>

</body>
</html>