���� Overview
==================

Ayada��һ����ȫ����web������jsp&jstl���棬��������jsp&jstl��ȫ�����ܡ�


* �﷨��ȫͬjsp�﷨��֧��java�ű���jstl��ǩ������ʹ��jstl������˵û���κ�ѧϰ�ɱ���
* �����ã�����Ҫ�κ������ļ���Ҳ����ָ�������ļ��������ļ������ˡ�
* �ɲ�ε�ģ����ƣ�ģ����ط�ʽ��el���棬����ģʽ����ͨ����ͬ��ʵ���滻��
* ���ַ�ʽ�Զ����ǩ��ԭ����java�����Զ����ǩ����ֱ��ͨ��ҳ���Զ����ǩ��
* ֧���Զ���elת�룬����Ҫ��el���ʽ�������htmlת�룬��ֹxssע�롣
* �򵥿��ٵı�ǩ��д���ܣ�ר�������ģ������ģ�塣
* ֧��java�ű��ͱ�ǩ���ģʽ�������jspһ�£������׷����������ô������ȫʹ��java�ű���дģ�档
* ֧�ֽ���ģʽ�ͱ���ģʽ������ģʽ�ʺ�ֻ��Ҫ���ڴ������е�ģ�塣����ģʽ���ܸ��á�

�ĵ� Documents
=================

docs/html/index.html

��ĿĿ¼�ṹ��
=================

    src - Դ��
    release - ���շ�����
    docs/html - ����ĵ�


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

    <sql:connect var="connection" url="jdbc:mysql://localhost:3306?user=root&password=1234&characterEncoding=utf8" driverClass="com.mysql.jdbc.Driver">
        <sql:execute>...</sql:execute>
        <sql:execute sql="update mytest2 set a=1 where b=1">...</sql:execute>
        <sql:execute file="/user/db/create.sql">...</sql:execute>
    </sql:connect>

sql:execute

    <sql:execute>...</sql:execute>
    <sql:execute sql="update mytest2 set a=1 where b=1">...</sql:execute>
    <sql:execute file="/user/db/create.sql">...</sql:execute>

sql:query

    <sql:query var="resultSet" sql="select * from my_test2 where my_id > 1001" offset="2">...</sql:query>

c:include

    <c:include page="/include/mytest.jsp">
        <c:param name="user" value="${user}"/>
    </c:include>

c:macro

    <c:macro name="myTestMacro">
        <c:param name="user" value="${user}"/>
    </c:macro>

import a tag, scope: current page

t:include

<t:include file="/include/mytest.jsp"/>

include a page

����˵��:
ayada-default.properties

    ayada.compile.source-factory=com.skin.ayada.template.DefaultSourceFactory  # �ű�����factory, ���ļ�ϵͳ����
    ayada.compile.source-pattern=jsp,jspf,jspx,tpl                             # �ű���չ��, �������͵��ļ��ᱻ��Ϊ�Ǿ�̬�ļ�
    ayada.compile.ignore-jsptag=true                                           # ����jsp��ǩ
    ayada.compile.fast-jstl=true                                               # �Ƿ�ʹ��fast-jstl

ayada-default.properties

    set util=com.skin.ayada.jstl.util.BeanUtil                                 # ����һ��ȫ�ֹ�����

el���ʽת��

    ��ayada-default.properties�ļ������һ��
    set ELEncoder=com.skin.ayada.jstl.util.HtmlEncoder                         # �����е�el���ʽ�����ʹ��html����֮�������

�ڽű�������ű�

��ʱ�����ǻ�ϣ���ڽű�������ű�, ����ҳ�������һ��ģ��, ���ģ����js����ʹ��jsģ�����������Ⱦ, ��������¿���ʹ��t:textָ��

    <t:text escape="xml">
        <c:if test="${1 == 1}"></c:if>
    </t:text>

t:text��ǩ�е��κ����ݶ�����Ϊ��̬����ԭ�����, ���escape="xml", ��ô���е����ݻ��ᱻ��html����
t:text�Ǳ���ָ����ת�����ڱ����ڽ��е�, �Ժ�ÿ��ִ�ж�ֱ�����



java: https://github.com/xuesong123/ayada
javascript: https://github.com/xuesong123/javascript-template