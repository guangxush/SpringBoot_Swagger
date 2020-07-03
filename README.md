## Spring Boot Swagger
### Swagger介绍
Swagger是最流行的API开发工具，它遵循OpenAPI Specification（OpenAPI规范，简称OAS）。Swagger可以贯穿于整个API生态，如API的设计、编写API文档、测试和部署。

Swagger是一个规范和完整的框架，用于生成、描述、调用和可视化 RestFul 风格的 Web 服务。总体目标是使客户端和文件系统作为服务器以同样的速度来更新。文件的方法、参数和模型紧密集成到服务器端的代码，允许API来始终保持同步。

可以用于接口文档在线生成以及功能测试。

### 1. pom.xml引入相关jar包
```xml
<!-- swagger-ui -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.8.0</version>
</dependency>
<!-- swagger -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.8.0</version>
</dependency>
```

### 2. 编写相关配置类
```java
@Api(value = "/api", description = "swagger示例接口", tags = "example")
@RestController
@RequestMapping(value = "/api", produces = {"application/json"})
public class Swagger2Configuration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()//build模式,返回一个建造者
                .apis(RequestHandlerSelectors.any())//api的配置路径
                .paths(PathSelectors.any())//扫描路径选择
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("title") //文档标题
                .description("description")//接口概述
                .version("1.0") //版本号
                .termsOfServiceUrl(String.format("url"))//服务的域名
                .license("LICENSE")//证书
                .licenseUrl("http://www.guangxu.com")//证书的url
                .build();
    }
}
```

### 3. Controller引入相关注解
```java
@Api(description = "学生接口 ")
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    /** 学生服务 */
    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "登录")
    @ApiImplicitParams({@ApiImplicitParam(name = "userId", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String")})
    @PostMapping("/login")
    public Student login(String userId, String password){
        return studentService.query(userId, password);
    }

}
```

### 4. Application加入注解
```java
@SpringBootApplication
@EnableSwagger2
public class SwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class, args);
    }

}
```

### 5. 运行并访问如下链接, 即可进行查看和测试

http://localhost:8080/swagger-ui.html


### Swagger注解说明

- @Api：用在类上，说明该类的作用。

- @ApiOperation：给API增加方法说明。

- @ApiImplicitParams : 用在方法上包含多个参数说明。

- @ApiImplicitParam：用在方法上包含一个参数说明。

```text
paramType：指定参数放在哪个地方。
name：参数名
dataType：参数类型
required：参数是否必须传
value：说明参数
defaultValue：参数的默认值
```
注：paramType类型

```text
 
header：请求参数放置于Request Header，使用@RequestHeader 获取。
query：请求参数放置于请求地址，使用@RequestParam获取
path：用于restful接口。
@PathVariable：获取请求参数。
body
form
```
- @ApiResponses：用于表示一组响应。

- @ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息。
```text

code：数字，例如400
message：信息，例如"请求参数没填好"。
response：抛出异常的类
```

- @ApiModel：描述一个Model的信息（一般用在请求参数无法使用@ApiImplicitParam注解进行描述的时候）。

- @ApiModelProperty：描述一个model的属性。
