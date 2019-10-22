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
            <h1>Recherche Avancée</h1>
            <div style="text-align: right; width: 350px;margin-top: 70px">
                <s:set var="libraries" value="libraries"/>
                <s:form action="advanced_search" theme="simple">

                    <label for="title">Titre</label>
                    <input name="title" type="text" class="form-control"
                           id="title" placeholder="Titre" required="required"
                           style="text-align: left">
                    <br>

                    <label for="author_name">Auteur</label>
                    <input name="author_name" type="text" class="form-control"
                           id="author_name" placeholder="Auteur" required="required"
                           style="text-align: left">
                    <br>

                    <label for="library_name">Biblothèque</label>
                    <input list="library_name" required="required" name="library_name"
                           placeholder="Nom Bibliothèque">
                    <datalist id="library_name">
                        <option value="libraryName0">
                        <option value="libraryName1">
                        <option value="libraryName2">
                        <option value="libraryName3">
                        <option value="libraryName4">
                    </datalist>
                    </br>

                    <label for="editor_name">Editeur</label>
                    <input list="editor_name" required="required" name="editor_name"
                           placeholder="Editeurr">
                    <datalist id="editor_name">
                        <option value="editorName0">
                        <option value="editorName1">
                        <option value="editorName2">
                        <option value="editorName3">
                        <option value="editorName4">
                    </datalist>
                    </br>

                    <label for="genre_name">Style</label>
                    <input list="genre_name" required="required" name="genre_name"
                           placeholder="Style">
                    <datalist id="genre_name">
                        <option value="genreName0">
                        <option value="genreName1">
                        <option value="genreName2">
                        <option value="genreName3">
                        <option value="genreName4">
                    </datalist>
                    </br>

                    </br></br></br>
                    <s:submit key="Rechercher" theme="simple" class="btn btn-primary btn-sm"/>
                    <s:a action="welcome"> <input type="button" value="Annuler"/></s:a><br>
                </s:form>
            </div>
            <s:set var="books" value="books"/>
            <s:if test="%{#books.size() == 0}">
                <p>Aucun résultat</p>
            </s:if>
            <s:else>
                <h3><p>Résultats de la recherche</p></h3>
                <ul>
                    <s:iterator value="books">
                        <s:a action="bookDetail">
                            <s:param name="bookId" value="bookId"/>
                            <s:property value="bookTitle"/><br>
                        </s:a>
                    </s:iterator>
                </ul>
            </s:else>
        </section>
        <%@include file="../_include/sidebar.jsp" %>
    </div>
    <div id="footerbar">
    </div>
</div>
</body>
</html>