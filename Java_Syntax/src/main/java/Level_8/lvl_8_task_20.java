package Level_8;

/*
Множество всех животных
*/

import java.util.HashSet;
import java.util.Set;

public class lvl_8_task_20 {
  public static void main(String[] args) {
    Set<Cat> cats = createCats();
    Set<Dog> dogs = createDogs();

    Set<Object> pets = join(cats, dogs);
    printPets(pets);

    removeCats(pets, cats);
    printPets(pets);
  }

  public static Set<Cat> createCats() {
    HashSet<Cat> result = new HashSet<Cat>();

    //напишите тут ваш код
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();
    Cat cat4 = new Cat();
    result.add(cat1);
    result.add(cat2);
    result.add(cat3);
    result.add(cat4);
    return result;
  }

  public static Set<Dog> createDogs() {
    //напишите тут ваш код
    HashSet<Dog> result = new HashSet<Dog>();
    Dog dog1 = new Dog();
    Dog dog2 = new Dog();
    Dog dog3 = new Dog();
    result.add(dog1);
    result.add(dog2);
    result.add(dog3);
    return result;
  }

  public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
    //напишите тут ваш код
    HashSet<Object> pets = new HashSet<Object>();
    pets.addAll(cats);
    pets.addAll(dogs);
    return pets;
  }

  public static void removeCats(Set<Object> pets, Set<Cat> cats) {
    //напишите тут ваш код
    pets.removeAll(cats);
  }

  public static void printPets(Set<Object> pets) {
    //напишите тут ваш код
    for (Object n : pets){
      System.out.println(n);
    }
  }

  //напишите тут ваш код
  public static class Cat{

  }

  public static class Dog{

  }
}
