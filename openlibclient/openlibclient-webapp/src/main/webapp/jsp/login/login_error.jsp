<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<div style=" position:absolute;
    width:200px;
    height:200px;
    left:50%;
    top:50%;
    margin-left:-100px;
    margin-top:-200px;
    background-color: rgba(208, 207, 207, 1.00);
    text-align: center;
    font-family: montserrat, sans-serif;">
    <h4 style="color:  rgba(146, 146, 146, 1.00);">Connection</h4>
    <s:form action="login">
        <label for="exampleInputEmail1">Adresse Email : </label>
        <input name="email" type="email" class="form-control"
               id="exampleInputEmail1" aria-describedby="emailHelp"
               placeholder="Entrer Adresse Email" required="required"></br>


        <label for="exampleInputPassword1">Mot de Passe : </label>
        <input name="password" type="password" class="form-control"
               id="exampleInputPassword1" placeholder="Entrer Mot de Passe" required="required"></br>

        <button type="submit" class="btn btn-primary">Entrer</button>
        <s:a action="welcome">
            <button type="button" class="btn btn-primary">Annuler</button>
        </s:a>
    </s:form>
</div>
<p style=" color: red; text-align: center">Mauvais Identifiant</p>
</body>
</html>
