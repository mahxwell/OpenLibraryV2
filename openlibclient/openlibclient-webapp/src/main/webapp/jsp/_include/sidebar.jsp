<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<head>
    <%@include file="../_include/head.jsp" %>
</head>

<body>
<section id="sidebar">
    <center>
        <s:form action="quick_search" theme="simple">
            <input name="book_title" type="text" class="form-control"
                   id="book_title" placeholder="Titre de Livre" required="required"
                   style="text-align: center">
            <br> <s:submit key="Chercher" theme="simple" class="btn btn-primary btn-sm"/>
        </s:form>
        <s:a action="advanced_search">Recherche Avancée</s:a>
        <h3>Menu</h3>
        <nav>
            <ul>
                <li><a href="#" title="Link"><s:a action="welcome_profile">Profil</s:a></a>
                </li>
                <li><a href="#" title="Link"><s:a action="welcome_book">Livres</s:a></a>
                </li>
            </ul>
        </nav>

    </center>
</section>
</body>