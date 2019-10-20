<%--
  Created by IntelliJ IDEA.
  User: Justin
  Date: 17/10/2019
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html class="no-js" lang="en">
<head>
    <title>commencer a jouer</title>
</head>
<body>
<div class="row small-8 small-centered">

    <c:forEach var="v" items="${ sessionScope.scores }" varStatus="status">
        <tr>
            <td>${v.score}</td>
        </tr>
    </c:forEach>

</div>

</body>
</html>
