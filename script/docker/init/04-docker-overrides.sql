update sys_oss_config
set endpoint = 'minio:9000',
    domain = 'http://localhost:19000'
where config_key in ('minio', 'image');
