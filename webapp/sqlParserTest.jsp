<sql:parse name="myTable">
create table my_table(
    my_id          int(11) auto_increment not null comment '����',
    my_name        varchar(64) not null default '' comment '����',
    create_time    datetime not null default 0     comment '����ʱ��'
)  dsafdsafdsf ;
</sql:parse>
<c:out value="${myTable.getInsertString()}"/>