# S3
Các ví dụ liên quan đến việc S3 từ cơ bản đến nâng cao

Mỗi nhánh trong Repo sẽ là 1 ví dụ/ giải pháp/ project mẫu trong S3

# Môi trường phát triển
- Sử dụng môi trường MINIO trên Docker để thực  hành
```
    docker version
------------------------------------------------------------
    Version:           20.10.11
    Server: Docker Engine - Community
```

- Cài đặt Minio dựa vào `docker-compose.yml`, Docker Image: `minio/minio:RELEASE.2023-09-07T02-05-02Z`
<br/>(Lưu ý là thư mục chứa `docker-compose.yml` cần có folder con `minio-data` là nơi chứa các Buckets cần xử lý)
```
version: '3'
services:
  minio_server:
    image: minio/minio:RELEASE.2023-09-07T02-05-02Z
    volumes:
      - ./minio-data:/data
    ports:
      - "9000:9000"
      - "9001:9001"
    environment:
      MINIO_ROOT_USER: minio
      MINIO_ROOT_PASSWORD: minio-1234
    command: server --console-address ":9001" /data
    
    networks:
      - common-network

networks:
    common-network:
      external: true
```

- Login vào UI quản lý Minio
    - HomePage: http://127.0.0.1:9001/
    - User: minio
    - Pass: minio-1234
    
# Folder liên quan trên Windows
```
D:\Projects\S3
```
==============================================================
