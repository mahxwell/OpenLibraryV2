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
            <h1>Recherche</h1>
            <s:set var="books" value="books"/>
            <s:if test="%{#books.size() == 0}">
                <p>Pas de Résultat</p>
            </s:if>
            <s:else>
                <s:iterator value="books">
                    <s:a action="bookDetail">
                        <s:param name="bookId" value="bookId"/>
                        <s:property value="bookTitle"/><br>
                    </s:a>
                </s:iterator>
            </s:else>
        </section>
        <%@include file="../_include/sidebar.jsp" %>
    </div>
    <div id="footerbar">
    </div>
</div>
</body>
</html>