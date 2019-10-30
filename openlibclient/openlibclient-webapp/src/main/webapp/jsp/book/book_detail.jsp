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
            <h2>Informations Ouvrage</h2>
            <ul>
                <p> Titre: <span style="color: green;"><s:property value="book.bookTitle"/></span></p>
                <p> Année: <span style="color: green;"><s:property value="book.bookYear"/></span></p>
                <p> Editeur: <span style="color: green;"><s:property value="editor.editorName"/></span></p>
                <p> Auteur: <span style="color: green;"><s:property value="author.authorName"/></span></p>
                <p> Genre: <span style="color: green;"><s:property value="genre.genreName"/></span></p>
                <p> Bibliothèque: <span style="color: green;"><s:property value="library.libraryName"/></span></p>
                <p>Copie Disponible : <span style="color: green;"><s:property value="copyNbr"/></span></p>
            </ul>
            <s:set var="userId" value="user.userId"/>
            <s:set var="copyAvailable" value="copyNbr"/>
            <s:set var="AlreadyLoaned" value="alreadyLoaned"/>
            <s:set var="Extended" value="bookloaningExtend"/>
            <div style="background-color: rgba(208, 207, 207, 1.00)"><h4>Option</h4></div>

            <s:if test="%{#userId!=null}">
                <s:if test="%{#copyAvailable==0}">
                    <p style="color: red">Plus d'exemplaires Disponibles</p>

                    <s:a action="reservation_create">Réserver le livre</s:a>


                </s:if>
                <s:elseif test="%{#AlreadyLoaned==true}">
                    <p style="color: red">Ouvrage Emprunté jusqu'au <span style="color: blue;"><s:property
                            value="date"/></span></p>
                    <p>Vous avez déjà fini votre Livre ?</p>
                    <s:a action="book_loaning_delete">Rendre Le Livre</s:a>
                    </br>
                    <p>Besoin de temps pour finir votre lecture ?</p>
                    <s:if test="%{#Extended==false}">
                        <s:a action="book_loaning_update">Prolonger Emprun</s:a>
                    </s:if>
                    <s:else>
                        <p style="color: red">Vous ne pouvez prolongez qu'une seule fois</p>
                    </s:else>
                    </br></br>
                </s:elseif>
                <s:else>
                    <s:a action="book_loaning_create">Emprunter un exemplaire</s:a>
                </s:else>
            </s:if>
            <s:elseif test="%{#userId==null}">
                <p style="color: red">Pas d'options Disponibles</p>
            </s:elseif>
            <s:else>
                <p style="color: red">Pas D'options Disponibles</p>
            </s:else>
        </section>
        <%@include file="../_include/sidebar.jsp" %>
    </div>
    <div id="footerbar">
    </div>
</div>
</body>
</html>
