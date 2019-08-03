# rick's community
##资料        
https://www.bilibili.com/video/av50200264?p=4       
https://github.com/ricklee135/mycommunity       
https://spring.io/guidesgit     

##工具        
https://github.com/ricklee135/mycommunity  
https://flywaydb.org/getstarted/firststeps/maven#adding-a-second-migration
https://www.projectlombok.org/     

##脚本
```sql
create table user
(
	id int auto_increment primary key,
	account_id varchar(100),
	name varchar(50),
	token char(36),
	gmt_create bigint,
	gmt_modified bigint 
);
```
```
mvn flyway:migrate
```