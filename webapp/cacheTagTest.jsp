<t:comment>
����һ��cache��ʾ��
cacheClientӦ�ôӿ��Ʋ㴫�ݹ������˴�Ϊ�˲��Է��㣬��ҳ���϶�����һ��cacheClient
cacheClient��Ӧ�ö��壬����Ҫ�̳��κ��ֻ࣬��Ҫ�������·������ɣ�
    public Object getCache(String key);
    public void setCache(String key, int expires, Object value);

c:cache�Ĳ�����
    cache - ��ѡ��һ��cache���󣬱������ getCache��setCache���������Ϊ�գ���pageContext�����ȡ����ΪcacheClient�Ķ���
    key - ��ѡ�����Ϊ�գ���ִ�л����߼���ֱ��������ݡ�
    expires - ��ѡ�����Ϊ�ջ���С��1����ִ�л����߼���ֱ��������ݡ�
</t:comment>

<h1>CacheTag Test</h1>
<c:bean name="cacheClient" className="test.com.skin.ayada.util.CacheClient"/>
<t:comment>
�Ȼ�������
</t:comment>

<div>
    <c:cache key="keyTest" expires="120">
    <h1>1. Hello World !</h1>
    </c:cache>

    <t:comment>
    ������������
    </t:comment>

    <c:cache key="keyTest" expires="120">
        <h1>2. Hello World !</h1>
    </c:cache>
</div>
