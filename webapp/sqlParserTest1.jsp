<sql:parse name="myTable">
create table `my_table`(
    `f1`      bigint(20) unsigned not null comment '����',
    `f2`      datetime not null comment 'ע��',
    `f3`      datetime not null comment 'ע��',
    primary key (f1)
);
</sql:parse>
<p>table: ${myTable.tableName}</p>
<c:out value="${myTable.getCreateString('`%s`')}"/>
<c:out value="${myTable.getQueryString()}"/>
<c:out value="${myTable.getInsertString()}"/>
<c:out value="${myTable.getUpdateString()}"/>
