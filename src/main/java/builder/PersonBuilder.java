package builder;

public interface PersonBuilder {

    PersonBuilder setName(String name);

    PersonBuilder setAge(Integer age);

    PersonBuilder setSex(String sex);

    Person build();
}
