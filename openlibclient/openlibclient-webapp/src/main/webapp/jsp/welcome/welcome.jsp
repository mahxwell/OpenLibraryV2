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
            <h1>OpenLibrary</h1>
            <h3>La Première Bibliothèque en ligne en France</h3>
            <div id="bannerImage"><img src="css/images/books.png" alt=""/></div>
            <p>Empruntez des centaines d'ouvrages et étanchez votre soif de lecture avec ce système d'emprun
                révolutionnaire !</p>
            <p>Salutations de l'équipe OpenLibrary !</p>
            <aside id="authorInfo">
                <!-- The author information is contained here -->
                <h2>Mahxwell</h2>
                <p>Expert en Développement Java et passionné de littérature depuis son enfance,
                    Jack White,
                    aussi connu sous le nom de "Mahxwell" décide
                    de créer la première bibliothèque en ligne en Mai 2019. Si il débuta cette aventure seul,
                    il est maintenant à la tête d'une entreprise de plus de mille salariés ...</p>
            </aside>
        </section>
        <%@include file="../_include/sidebar.jsp" %>
    </div>
    <div id="footerbar">
    </div>
</div>
</body>


</html>