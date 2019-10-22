<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
<body>
<div id="mainwrapper">
    <header>
    </header>
    <div id="content">

        <section id="mainContent">
            <s:set var="users" value="users"/>
            <s:if test="%{#users.size() == 0 }">
                <p>NULL USERS</p></br>
            </s:if>
            <s:else>
                <ul>
                    <s:iterator value="users">
                        <s:property value="userName"/><br>
                    </s:iterator>
                </ul>
            </s:else>
            <s:else>
                <p></p>
            </s:else>
        </section>
    </div>
</div>
</div>
</body>
</html>