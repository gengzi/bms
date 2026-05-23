# bms

bms 是一个前后端一体的多租户业务管理系统。后端基于 Spring Boot 3、Sa-Token、MyBatis-Plus、SnailJob、Warm-Flow 等组件，前端基于 Vue 3、TypeScript、Element Plus 和 Vite。

## 模块

- `bms-admin`：主应用入口与认证接口
- `bms-common`：公共能力模块
- `bms-modules`：业务模块、系统模块、代码生成、任务与工作流
- `bms-extend`：监控与 SnailJob Server 扩展服务
- `bms-ui`：前端管理界面
- `script`：数据库初始化、Docker 与启动脚本

## 环境

- JDK 17+
- Maven 3.8+
- Node.js 20.19+
- MySQL、Redis
- Docker / Docker Compose（可选，用于隔离测试部署）

## Docker Compose 测试部署

项目根目录提供了一个自包含的测试编排：

```bash
docker compose up -d --build
```

访问地址：

```text
前端：http://127.0.0.1:18080
MinIO 控制台：http://127.0.0.1:19001 （bms / bms12345）
```

该编排会创建独立的 `bms-test` 网络和 Docker volumes。MySQL、Redis、后端服务默认不暴露到宿主机，只通过前端 Nginx 在 Docker 网络内访问，避免占用本机常用的 `3306`、`6379`、`8080`、`80` 端口。

查看日志：

```bash
docker compose logs -f backend
docker compose logs -f frontend
```

停止服务：

```bash
docker compose down
```

停止并清空测试数据：

```bash
docker compose down -v
```

## 后端

```bash
mvn -DskipTests compile
mvn -pl bms-admin -am spring-boot:run
```

后端默认地址：

```text
http://localhost:8080
```

## 前端

```bash
cd bms-ui
npm install
npm run dev
```

前端默认地址：

```text
http://localhost:80
```

生产构建：

```bash
cd bms-ui
npm run build:prod
```

## 说明

项目标识已统一为 `bms`，Maven 模块、应用配置、脚本、Docker、SQL 初始化数据、Java 包根和前端工程均使用 bms 命名。
