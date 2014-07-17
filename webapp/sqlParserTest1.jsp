<sql:parse name="myTable">
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
</sql:parse>
<p>table: ${myTable.tableName}</p>
<c:out value="${myTable.getCreateString('`%s`')}"/>
<c:out value="${myTable.getQueryString()}"/>
<c:out value="${myTable.getInsertString()}"/>
<c:out value="${myTable.getUpdateString()}"/>
