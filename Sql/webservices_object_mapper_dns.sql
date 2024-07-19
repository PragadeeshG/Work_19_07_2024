create table if not exists webservices_object_mapper_dns(
object_mapper_name varchar(255) not null,
object_mapper_id varchar(255) null,
source_ip varchar(255) null,
object_mapper_entry_type varchar(255) null,
health_check_status varchar(255) null,
primitive_resource_id varchar(255) null,
primitive_resource_name varchar(255) null,
public_subnet varchar(255) null,
private_subnet varchar(255) null,
status varchar(255) null,
constraint webservices_object_mapper_dns_pk primary key(object_mapper_name));