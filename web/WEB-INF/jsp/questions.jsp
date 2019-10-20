<%--
  Created by IntelliJ IDEA.
  User: Martin
  Date: 17/10/2019
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Questions</title>
    </head>
    <body>
    <form method="POST" action="envoieReponse">
        <div class="form-icons">
            <h4>Login</h4>
            <div class="input-group">
                <p> Question </p>
            </div>
            <div class="input-group">
                <input class="input-group-field" type="text" placeholder="réponse" name="form-rep"
                       value=""/>
            </div>
        </div>
        <button class="button expanded">Valider</button>
    </form>
    </body>
</html>
