<sql:parse name="myTable">
create table game_app(
    id              bigint(20) unsigned not null comment '����',
    gmt_create      datetime not null comment '����ʱ��',
    gmt_modified    datetime not null comment '�޸�ʱ��',
    game_id         bigint(20) unsigned not null comment '��Ϸid',
    market          bigint(20) unsigned not null comment '�г�-android,ios',
    channel         bigint(20) unsigned comment '����-����,����',
    app_key         varchar(64) comment 'TOP App Key',
    app_secret      varchar(64) comment 'TOP App Secret',
    os_require      varchar(256) comment 'ϵͳҪ��',
    download_url    varchar(256) comment '���ص�ַ',
    size            varchar(64) comment '����С',
    xiaoer_create   varchar(64) comment '����С��',
    xiaoer_modified varchar(64) comment '�޸�С��',
    attributes      varchar(8192) comment '��չ��Ϣ',
    target_revenue  bigint(20) unsigned comment 'Ŀ������',
    options         bigint(20) unsigned comment '��չ��ʶ',
    identity        varchar(256) comment 'Ψһ��',
    uri             varchar(2048) comment 'androidԤ��',
    detail_url      varchar(2048) comment '����ҳ��ַ',
    logo_url        varchar(2048) comment 'Сͼ���ַ'
);
<c:comment>
create table my_table(
    f1      bigint(20) unsigned not null comment '����',
    f2      datetime not null comment 'ע��',
    f3      datetime not null comment 'ע��',
    f4      bigint(20) unsigned not null comment 'ע��',
    f5      bigint(20) unsigned not null comment 'ע��',
    f6      bigint(20) unsigned comment 'ע��',
    f7      varchar(64) comment 'ע��',
    f8      varchar(64) comment 'ע��',
    f9      varchar(256) comment 'ע��',
    f10     varchar(256) comment 'ע��',
    f11     varchar(64) comment 'ע��',
    f12     varchar(64) comment 'ע��',
    f13     varchar(64) comment 'ע��',
    f14     varchar(8192) comment 'ע��',
    f15     bigint(20) unsigned comment 'ע��',
    f16     bigint(20) unsigned comment 'ע��',
    f17     varchar(256) comment 'ע��',
    f18     varchar(2048) comment 'ע��',
    f19     varchar(2048) comment 'ע��',
    f20     varchar(2048) comment 'ע��',
    primary key (f1)
);
</c:comment>
</sql:parse>
<p>table: ${myTable.tableName}</p>
<c:out value="${myTable.getCreateString('`%s`')}"/>
<c:out value="${myTable.getQueryString()}"/>
<c:out value="${myTable.getInsertString()}"/>
<c:out value="${myTable.getUpdateString()}"/>
