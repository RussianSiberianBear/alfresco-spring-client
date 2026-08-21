# Alfresco Content Services Spring Client

Полный типизированный Java-клиент Alfresco Content Services REST API, сгенерированный из официальных Swagger 2.0 спецификаций Alfresco API Explorer (`alfresco-core.yaml`, `alfresco-auth.yaml`, `alfresco-discovery.yaml`, `alfresco-search.yaml`).

## Целевая платформа

- **JDK 25**
- **Spring Boot 4.1.0**
- Spring Framework 7.x
- Spring `RestClient`
- Spring HTTP Service Clients (`@HttpExchange`, `@GetExchange`, `@PostExchange`, ...)
- Jackson 3 (DTO продолжают использовать совместимые `com.fasterxml.jackson.annotation` аннотации)

Клиент использует специальный Boot 4 starter `spring-boot-starter-restclient`, а HTTP-интерфейсы регистрируются современным механизмом `@ImportHttpServices` как единая группа `alfresco`.

## Подключение

Можно подключить этот проект Maven-модулем или скопировать пакет `com.ecorp.alfresco` в основной проект.

Минимальная конфигурация:

```yaml
spring:
  http:
    serviceclient:
      alfresco:
        base-url: "http://localhost:8080"
        connect-timeout: 10s
        read-timeout: 60s

alfresco:
  username: admin
  password: admin
```

`base-url`, connect/read timeout и прочие HTTP-настройки задаются через штатные properties Spring Boot 4.1 для HTTP Service Client group. Учетные данные Alfresco находятся в собственном namespace `alfresco.*`.

## Использование

Все интерфейсы из `com.ecorp.alfresco.api` автоматически становятся Spring beans.

```java
@Service
public class DocumentService {

    private final NodesApi nodesApi;

    public DocumentService(NodesApi nodesApi) {
        this.nodesApi = nodesApi;
    }

    public NodeEntry getNode(String id) {
        return nodesApi.getNode(id, null, null, null);
    }
}
```

## Пакеты

- `api` — интерфейсы всех REST endpoint'ов, сгруппированные по тегам Alfresco.
- `dto.core` — модели Core API.
- `dto.auth` — Authentication API.
- `dto.search` — Search API.
- `dto.discovery` — Discovery API.
- `config` — Boot 4.1 auto-configuration, регистрация HTTP Service clients и Basic Auth.
- `exception` — единое исключение для HTTP ошибок Alfresco.
- `swagger` — исходные официальные YAML, по которым создан клиент.

## Бинарный контент

Методы загрузки бинарного содержимого принимают `byte[]`; методы получения бинарного ответа возвращают `byte[]`.

## Важное замечание по API Explorer

Спецификация `createNode` у Alfresco декларирует и `application/json`, и `multipart/form-data`, но body описан как `NodeBodyCreate`. Основной типизированный метод соответствует JSON-сценарию. Для загрузки содержимого можно создать node и затем вызвать `updateNodeContent(...)` с `byte[]`.

## Maven

`pom.xml` уже настроен на:

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>4.1.0</version>
</parent>

<properties>
    <java.version>25</java.version>
    <maven.compiler.release>25</maven.compiler.release>
</properties>
```
