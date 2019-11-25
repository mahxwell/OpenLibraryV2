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
            <h1>Profile</h1>
            <s:set var="userId" value="user.userId"/>
            <s:set var="loaningId" value="bookloaning.bookLoaningId"/>
            <s:if test="%{#userId!=null}">
                <p style="color:rgba(146, 146, 146, 1.00);font-family:  montserrat, sans-serif;
    font-style: normal">Un changement de situation ?</p>
                <s:a action="user_update">Mettre à jour votre Profil</s:a>
                <p style="color:rgba(146, 146, 146, 1.00);font-family:  montserrat, sans-serif;
    font-style: normal">Quitte notre Réseau de Bibliothèque ?</p>
                <s:if test="%{#loaningId==null}">
                    <s:a action="user_delete">Supprimer votre Profil</s:a>
                </s:if>
                <s:else>
                    <p style="color:red;font-family:  montserrat, sans-serif;
    font-style: normal">Vous
                        ne pouvez pas supprimer votre compte si vous avez des empruns en cours</p>
                </s:else>
            </s:if>
            <s:else>
                <p style="color:rgba(146, 146, 146, 1.00);font-family:  montserrat, sans-serif;
    font-style: normal">Rejoingez le plus grand réseau de Bibliothèques</p>
                <s:a action="user_create"><p style="text-decoration: none">Créer votre Profil</p></s:a><br>
            </s:else>
        </section>
        <%@include file="../_include/sidebar.jsp" %>
    </div>
    <div id="footerbar">
    </div>
</div>
</body>

</html>