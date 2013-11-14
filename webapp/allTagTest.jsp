<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<t:import name="app:scrollpage" className="test.com.skin.ayada.taglib.ScrollPage"/>
<t:import name="app:test" className="test.com.skin.ayada.taglib.TestTag"/>
<html>
<head>
<title>test</title>
</head>
<body version="1.0">
<%!
    public void hello(){
        System.out.println("Hello, Ayada !");
    }
%>

<%
    int mytest = 0;
    System.out.println("Hello, Ayada !");
%>

<%=mytest%>

<c:set var="myVar" value="Hello, Ayada!"/>
<h1>${myVar}</h1>

<c:out value="c:out: Hello, Ayada!"/>
<div style="background-color: #c0c0c0;"></div>
<c:out value="<div>Hello Ayada!</div>" escapeXml="true"/>
<c:out escapeXml="true"><h1>Hello Ayada!</h1></c:out>

<c:if test="${1 == 1}">c:if test</c:if>

<c:forEach items="1,2,3,4,5" var="mynum">${mynum}</c:forEach>

<c:forEach items="${userList}" var="user" varStatus="status">
    <p>user: ${user.userName}</p>
    <c:choose>
        <c:when test="${user.userName == 'test1'}"><p>test1, good man !</p></c:when>
        <c:when test="${user.userName == 'test2'}"><p>test2, good man !</p></c:when>
        <c:when test="${user.userName == 'test3'}"><p>test3, good man !</p></c:when>
        <c:otherwise><p>unknown user! Do you known 'bad egg'? You! Are!</p></c:otherwise>
    </c:choose>
</c:forEach>

<c:choose>
    <c:when test="${1 == 1}">1</c:when>
    <c:when test="${2 == 2}">2</c:when>
    <c:when test="${3 == 3}">3</c:when>
    <c:otherwise>otherwise</c:otherwise>
</c:choose>


<app:scrollpage count="254" pageNum="2" pageSize="10"/>

<app:test myInt="-1.0" myFloat="1.0f" myDouble="1.0d" myLong="1L" myString="Hello"/>
<app:test myInt="-1.0" myFloat="1.0F" myDouble="1.0D" myLong="1L" myString="Hello"/>
<app:test myInt="-1.0" myFloat="1.0" myDouble="1e3" myLong="1e3" myString="Hello"/>
<app:test myInt="-1.0" myFloat="1.0" myDouble="1.2e3" myLong="1.2e3" myString="Hello"/>
</body>
</html>