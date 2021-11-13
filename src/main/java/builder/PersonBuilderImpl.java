package builder;

public class PersonBuilderImpl implements PersonBuilder {

    Person person =new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public PersonBuilder setAge(Integer age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder setSex(String sex) {
        person.setSex(sex);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
