java-template
===================

java template jstl

Ayada is a "template engine"; a generic tool to generate text output (anything from HTML to autogenerated source code) based on templates. It's a Java package, a class library for Java programmers. It's not an application for end-users in itself, but something that programmers can embed into their products.

Tag Example
===================

c:if

    <c:if test="${1 == 1}">1 == 1</c:if>

out:
    1 == 1

c:forEach & c:each

    <c:forEach items="${1, 2, 3}" var="myvar" varStatus="status">
        ${status.index}: ${myvar}
    </c:forEach>

out:
    0: 1
    1: 2
    2: 3

c:forEach & c:each

    <c:forEach begin="1" end="3" step="1" var="myvar" varStatus="status">
        ${status.index}: ${myvar}
    </c:forEach>

out:
    0: 1
    1: 2
    2: 3

c:forEach & c:each
    var varList = [1, 2, 3];

    <c:forEach items="${varList}" var="myvar" varStatus="status">
        ${status.index}: ${myvar}
    </c:forEach>

out:
    0: 1
    1: 2
    2: 3

c:set

    <c:set var="myvar1" value="${myvar}"/>
    <c:set var="myvar1" value="1,2,3"/>

c:out

    <c:out value="${myvar}" defaultValue="1,2,3" escapeXml="true"/>

out:
    1,2,3

c:choose & c:when & c:otherwise

    <c:choose>
        <c:when test="${userList.length > 6}"><div>test1</div></c:when>
        <c:when test="${userList.length > 7}"><div>test2</div></c:when>
        <c:otherwise><div>test3</div></c:otherwise>
    </c:choose>

c:comment

    <c:comment>
        ...
    </c:comment>

fmt:formatDate

    <fmt:formatDate var="mydate1" value="${mydate}" pattern="yyyy-MM-dd"/>

sql:connect

    <sql:connect var="connection" url="jdbc:mysql://localhost:3306?user=root&password=1234&characterEncoding=utf8" driverClass="com.mysql.jdbc.Driver">...</sql:connect>

sql:execute
    <sql:execute out="${pageContext.getOut()}">...</sql:execute>

    <sql:execute sql="update mytest2 set a=1 where b=1">...</sql:execute>

    <sql:execute file="/user/db/create.sql">...</sql:execute>

sql:query

    <sql:query var="resultSet" sql="select * from my_test2 where my_id > 1001" offset="2">...</sql:query>

t:import

    <t:import name="app:cache" className="com.mytest.taglib.CacheTag"/>

import a tag, scope: current page

t:include

<t:include file="/include/mytest.jsp"/>

include a page

API Example
===================

    // demo1
    Source source = new Source("", "<c:out value=\"123\"/>", 0);
    SourceFactory sourceFactory = new MemorySourceFactory(source);
    TagLibrary tagLibrary = TagLibraryFactory.getStandardTagLibrary();
    TemplateCompiler compiler = new TemplateCompiler(sourceFactory);
    compiler.setTagLibrary(tagLibrary);
    Template template = compiler.compile("", "UTF-8");
    StringWriter writer = new StringWriter();

    TemplateContext templateContext = new TemplateContext("");
    PageContext pageContext = JspFactory.getPageContext(templateContext, writer);
    List<User> userList = UserHandler.getUserList(16);
    pageContext.setAttribute("userList", userList);
    DefaultExecutor.execute(template, pageContext);  
    System.out.println(writer.toString()); 

    // demo2
    TemplateContext templateContext = new TemplateContext(home);
    Template template = templateContext.getTemplate(file);
    StringWriter writer = new StringWriter();
    PageContext pageContext = getPageContext(writer);
    DefaultExecutor.execute(template, pageContext);
    System.out.println("-------------- source --------------");
    System.out.println(TemplateUtil.toString(template));
    System.out.println("-------------- result --------------");
    System.out.println(writer.toString());

    // demo3
    SourceFactory sourceFactory = new DefaultSourceFactory("webapp");
    TagLibrary tagLibrary = TagLibraryFactory.getStandardTagLibrary();
    TemplateCompiler compiler = new TemplateCompiler(sourceFactory);
    compiler.setTagLibrary(tagLibrary);

    Template template = compiler.compile("/large.html", "UTF-8");

    StringWriter writer = new StringWriter();
    PageContext pageContext = getPageContext(writer);
    DefaultExecutor.execute(template, pageContext);

    System.out.println("------------- result -------------");
    System.out.println(writer.toString());

    // demo4
    String home = "com/skin/ayada/demo";
    SourceFactory sourceFactory = new ClassPathSourceFactory(home);
    TemplateContext templateContext = new TemplateContext(home);
    templateContext.setSourceFactory(sourceFactory);

    Template template = templateContext.getTemplate("/hello.jsp");
    StringWriter writer = new StringWriter();
    PageContext pageContext = JspFactory.getPageContext(writer);

    System.out.println("-------------- source --------------");
    System.out.println(TemplateUtil.toString(template));

    System.out.println("-------------- System.out.print --------------");
    DefaultExecutor.execute(template, pageContext);

    System.out.println("-------------- result --------------");
    System.out.println(writer.toString());


    <!-- TemplateFilter -->
    <filter>
        <filter-name>TemplateFilter</filter-name>
        <filter-class>com.skin.ayada.filter.TemplateFilter</filter-class>
        <init-param>
            <param-name>home</param-name>
            <param-value>/template</param-value>
        </init-param>
    </filter>

    <!-- filter mapping -->
    <filter-mapping>
        <filter-name>TemplateFilter</filter-name>
        <url-pattern>/template/*</url-pattern>
        <dispatcher>FORWARD</dispatcher>
    </filter-mapping>

java: https://github.com/xuesong123/ayada
javascript: https://github.com/xuesong123/javascript-template