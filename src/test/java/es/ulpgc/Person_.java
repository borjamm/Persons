package es.ulpgc;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Person_ {
    @Test
    public void give_me_your_name(){
        Person person = new Person("Jose", 23);
        assertThat(person.getName()).isEqualTo("Jose");
    }

    @Test
    public void give_me_your_age(){
        Person person = new Person("Lucy", 29);
        assertThat(person.getAge()).isEqualTo(29);
    }

    @Test
    public void give_me_the_sum_of_ages(){
        Person person1 = new Person("Juana", 10);
        Person person2 = new Person("Laura", 23);
        assertThat(getSumAge(person1,person2)).isEqualTo(33);
     }

    public int getSumAge(Person person1, Person person2){
        return person1.getAge() + person2.getAge();
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

    }
}
