

#  工程目录说明
    com.shitouren.core.autogenerate 为自动生成的目录，请勿在此包下的任何类做修改，否则下次生成的时候会直接覆盖

#  请求资源权限


# 自定义业务异常

```java
     @GetMapping("/exception")
     @Access(value = false)
     public String exception(){
         throw new CloudException(ExceptionConstant.调用端和提供端返回数据格式不一致);
     }
```

## 免登陆

所有的登录权限都在给用户提供接口的工程里面控制，在对应工程中的controller上添加@Access(value = false)即可

```java
@GetMapping("/getUser/list/{name}")
@Access(value = false) // 免登录权限验证
public List<User> getList(@PathVariable("name") String name){
    return testServiceFeign.getUserList(name);
}
```

```java
@GetMapping("/getUser/list/{name}")
@Access(authentication = false) // 需要登录，但是免其他权限校验
public List<User> getList(@PathVariable("name") String name){
    return testServiceFeign.getUserList(name);
}
```

# 用户

## 关于用户token

   用户token的验证和存放均放在具体对用户提供接口的服务上，也就是controller层，如果api服务需要用用户信息，通过调用端传用户的对应信息过去即可，
这样可以方便一个API端可以处理各种各样的用户请求；

## 将token对应的数据放到对象中
   在controller上添加 @GetLoginUser 注解，然后在controller参数中，加入对应的用户参数接收类， 统一类型叫：SysUserParam （企业后台叫：SysUserParam） 
需要注意，不同的工程，引入对应的包下的这个类，否则会报错；




# mybatis自动生成使用

首次使用的时候需要先  

```
mvn clean install
```

然后在idea的maven中选择mybatis-generator 执行即可

