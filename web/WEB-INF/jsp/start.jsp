<%--
  Created by IntelliJ IDEA.
  User: Justin
  Date: 17/10/2019
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>commencer a jouer</title>
</head>
<body>
<c:forEach items="${ScoreBean.allScore()}" var="v">
    <c:out value="${v.getScore()}"></c:out>

</c:forEach>

</body>
</html>
