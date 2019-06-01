package es.ulpgc;

import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void give_me_the_names_with_vocals(){
        Person person1 = new Person("Juana", 10);
        Person person2 = new Person("Laura", 23);
        Person person3 = new Person("Tym", 23);
        assertThat(getNamesVocal(person1,person2,person3)).isEqualTo("Juana Laura ");
    }

    public String getNamesVocal(Person person1, Person person2, Person person3){
        String result = "", name;
        char character;
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        for (int i = 0; i < persons.size(); i++) {
            name = persons.get(i).getName();
            for (int j = 0; j < name.length(); j++) {
                character = name.charAt(j);
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    result += name + " ";
                    break;
                }
            }
        }

        return result;
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
