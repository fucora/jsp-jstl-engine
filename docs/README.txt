Ayada��һ��java���ģ������, ֧��jstl�﷨, ֧��el���ʽ. ֧���Զ����ǩ

1. ����ʹ��
// webapp����Ӧ�ø�Ŀ¼
// ���ҳ��ʹ����t:includeָ��, ���Ŀ¼����ָ��
// TemplateContext��ģ����й���, Ĭ�������ģ�����޸�5����֮�����±���,
// ���TemplateContext������Ӧ����Ӧ���ǵ���.
TemplateContext templateContext = new TemplateContext("webapp");
Template template = templateContext.getTemplate("/user/userList.tml");
StringWriter writer = new StringWriter();
PageContext pageContext = JspFactory.getPageContext(templateContext, writer);
DefaultExecutor.execute(template, pageContext);

System.out.println(writer.toString());

2. �Զ����ǩ
��classesĿ¼�½�taglib.tld�ļ�, ��������:
## ---- compile tag ----
t:taglib       com.skin.ayada.jstl.core.LibTag

## ---- jstl.core ----
## default tag support
c:if           com.skin.ayada.jstl.core.IfTag
c:set          com.skin.ayada.jstl.core.SetTag
c:out          com.skin.ayada.jstl.core.OutTag
c:each         com.skin.ayada.jstl.core.ForEachTag
c:forEach      com.skin.ayada.jstl.core.ForEachTag
c:choose       com.skin.ayada.jstl.core.ChooseTag
c:when         com.skin.ayada.jstl.core.WhenTag
c:otherwise    com.skin.ayada.jstl.core.OtherwiseTag
c:comment      com.skin.ayada.jstl.core.CommentTag

���ոø�ʽ����Զ����ǩ����.

�Զ����ǩ֧���������뷽ʽ.
ȫ������: ��taglib.tld�ļ��ж���Ķ���ȫ�ֱ�ǩ
�ֲ�����: ��ҳ��������, ʹ��<t:taglib name="my:hello" className="test.tag.HelloTag"/>
          �ֲ�����ķ�ʽҪ�����ȫ������t:taglib(t:taglib������taglib.tld�ļ����޸�Ϊ��������)

����ʹ��ȫ������ķ�ʽ.

3. el���ʽ
    el���ʽ�������õ���ognl, ognl�ڶԲ����ڵĶ�����н�����ʱ������쳣, Ϊ�˱�����ҳ�����й����null���
    ��˶������쳣����������

4. ģ��ҳ��ʾ��
------------------------------------------------------------
<t:import name="my:hello1" className="test.tag.HelloTag1"/>
<t:import name="my:hello2" className="test.tag.HelloTag2"/>
<t:import name="my:hello3" className="test.tag.HelloTag3"/>
<html>
<head>
<title>test</title>
</head>
<body>
<h1>c:cout test</h1>
<c:out value="${user.userName}"></c:out>
<c:out><div>${user.userName}</div></c:out>
<c:out id="1" escapeXml="true">
    <div><c:out id="2" value="${user.userName}"></c:out></div>
</c:out>

<h1>c:if test</h1>
<c:if test="${1 == 1}">1 == 1</c:if>

<h1>c:each test</h1>

<c:each items="1,2,3" var="varValue"><p>${varValue}</p></c:each>

<c:forEach items="${userList}" var="user">
    <c:choose>
        <c:when test="${user.age == 0}">0</c:when>
        <c:when test="${user.age == 1}">1</c:when>
        <c:when test="${user.age == 2}">2</c:when>
        <c:when test="${user.age == 3}">3</c:when>
        <c:otherwise>other: ${user.age}</c:otherwise>
    </c:choose>
</c:forEach>
<h1>my:hello test</h1>
<my:hello1/>
<my:hello2/>
<my:hello3/>
</body>
</html>



http://ayada.googlecode.com/svn/trunk/