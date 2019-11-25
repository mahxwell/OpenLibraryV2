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
            <h1>Menu des Ouvrages</h1>
            <s:a action="listBook">Tous les Livres</s:a>
            <s:set var="userId" value="user.userId"/>
            <s:if test="%{#userId!=null}">
                <p style="color:rgba(146, 146, 146, 1.00);font-family:  montserrat, sans-serif;
    font-style: normal">Consulter Vos empruns</p>
                <s:a action="loanedListBook">Livres Empruntés</s:a>
                <p style="color:rgba(146, 146, 146, 1.00);font-family:  montserrat, sans-serif;
    font-style: normal">Consulter Vos Réservations</p>
                <s:a action="reservedListBook">Livres Réservés</s:a>
            </s:if>
            <s:else>
            </s:else>
        </section>
        <%@include file="../_include/sidebar.jsp" %>
    </div>
    <div id="footerbar">
    </div>
</div>
</body>

</html>