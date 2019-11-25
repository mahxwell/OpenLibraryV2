<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <%@include file="../_include/head.jsp" %>
</head>
<body>
<div id="mainwrapper">
    <header>
        <%@include file="../_include/header.jsp" %>
    </header>
    <div id="content">
        <div class="notOnDesktop">
            <!-- This search box is displayed only in mobile and tablet laouts and not in desktop layouts -->
            <input type="text" placeholder="Search">
        </div>
        <section id="mainContent">
            <s:form action="user_create" theme="simple">
            <h1>Informations</h1>

            <div style="text-align: right; width: 250px;margin-top: 70px">
                <h3 style="text-align: center">Entrez vos informations personnelles</h3>
                <label for="user.userName" style=" color: grey;font-family: montserrat, sans-serif;font-style: normal;">
                    Nom</label>
                <input name="user.userName" type="text" class="form-control"
                       id="user.userName" placeholder="Entrer Nom" required="required">
                </br>

                <label for="user.userSurname"
                       style=" color: grey;font-family: montserrat, sans-serif;font-style: normal;">
                    Prénom</label>
                <input name="user.userSurname" type="text" class="form-control"
                       id="user.userSurname" placeholder="Entrer Prénom" required="required"
                       style=" alignment: right">
                </br>

                <label for="user.userPseudo"
                       style=" color: grey;font-family: montserrat, sans-serif;font-style: normal;">
                    Pseudo</label>
                <input name="user.userPseudo" type="text" class="form-control"
                       id="user.userPseudo" placeholder="Entrer Pseudo" required="required">
                </br>

                <label for="exampleInputEmail1"
                       style=" color: grey;font-family: montserrat, sans-serif;font-style: normal;">
                    Email</label>
                <input name="user.userEmail" type="email" class="form-control"
                       id="exampleInputEmail1" aria-describedby="emailHelp" required="required"
                       placeholder="Entrer Adresse Email">
                </br>

                <label for="user.userPassword"
                       style=" color: grey;font-family: montserrat, sans-serif;font-style: normal;">
                    MdP</label>
                <input name="user.userPassword" type="password" class="form-control"
                       id="user.userPassword" placeholder="Entrer Mot de Passe" required="required">
                </br>

                <label for="user.userPhone"
                       style=" color: grey;font-family: montserrat, sans-serif;font-style: normal;">
                    Téléphone</label>
                <input name="user.userPhone" type="text" class="form-control"
                       id="user.userPhone" placeholder="Entrer numéro téléphone" required="required">

                </br>
                </br></br></br>

                <s:submit key="Créer" theme="simple" class="btn btn-primary btn-sm"/>
                <s:a action="welcome">
                    <button type="button" class="btn btn-primary">Annuler</button>
                </s:a>
                </s:form>
            </div>
        </section>
        <%@include file="../_include/sidebar.jsp" %>
    </div>
    <div id="footerbar">
    </div>
</div>
</body>
</html>