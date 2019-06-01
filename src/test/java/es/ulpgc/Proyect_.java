package es.ulpgc;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Proyect_ {
    @Test
    public void give_me_your_name(){
        Proyect proyect = new Proyect("Jose", 23);
        assertThat(proyect.getName()).isEqualTo("Jose");
    }

    @Test
    public void give_me_your_age(){
        Proyect proyect = new Proyect("Lucy", 29);
        assertThat(proyect.getAge()).isEqualTo(29);
    }

    public static class Proyect {
        private String name;
        private int age;

        public Proyect(String name, int age){
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
