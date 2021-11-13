package builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonCreator {

 //  public static Logger logger = LoggerFactory.getLogger(PersonCreator.class);

    public static void main(String[] args) {



        Person person = new PersonBuilderImpl().setName("Kiril").setAge(34).setSex("male").build();

        System.out.println(person.toString());

   //     logger.info("Пользователь создан");


    }
}
