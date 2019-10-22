<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<head>
    <%@include file="../_include/head.jsp" %>
</head>

<body>
<header>
    <div id="logo">
        <a href="#" title="Link">
            <s:a action="welcome">OpenLibrary</s:a>
        </a>
    </div>
    <nav>
        <s:if test="#session.user">
            <p>Utilisateur :
                <s:property value="#session.user.userName"/>
                <s:property value="#session.user.userSurame"/> |
                <s:a action="logout"> <font color="red"> Déconnection</font></s:a></p>
        </s:if>
        <s:else>
            <s:a action="login">Connection</s:a>
        </s:else>
    </nav>
</header>
</body>