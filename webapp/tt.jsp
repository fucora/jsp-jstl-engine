<!-- t:taglib prefix="d" uri="http://localhost/ayada-taglib-default"/ -->
<t:rename name="d:if" from="c:if"/>
<c:comment>����һ����ģ������ģ���ʾ��</c:comment>

<d:if test="${1 == 1}">
    <c:if test="${?a > 1}">
        <h1>${?user.name}</h1>
    </c:if>
</d:if>

