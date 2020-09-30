package cn.edu.nuaa.springproject1.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;
@Component
//@ConfigurationProperties(prefix = "person")---使用yaml配置
//加载指定配置文件,如果是properties要在属性前配@Value来一一配置
//@PropertySource(value = "classpath:person.properties")
@ConfigurationProperties(prefix = "person")
@Validated//数据校验
public class Person {
//    @Value("${name}")
    private String name;
//    @Value("${age}")
    private Integer age;
    private Map<String,Object> maps;
    private List<String> list;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Person(String name, Integer age, Map<String, Object> maps, List<String> list) {
        this.name = name;
        this.age = age;
        this.maps = maps;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", maps=" + maps +
                ", list=" + list +
                '}';
    }
}
