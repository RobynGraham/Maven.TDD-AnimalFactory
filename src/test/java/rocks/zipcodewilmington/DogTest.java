package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    Dog dog;

    String name;
    Date birthDate;
    Integer id;

    @Before

    public void setUp() {
        name = "Joe";
        birthDate = new Date();
        id = 0;

        dog = new Dog(name, birthDate, id);
    }

    @Test
    public void constructorTest(){

        // Given (dog data)
        String givenName = "Rex";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }



    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDateTest(){
        //Given
        Date expected = new Date();

        //When
        Date actual = dog.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){

        //Given
        String expected =  "bark!";

        //When
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest() {
        Food food = new Food();
        //Given
        Integer expected = (1);

        //When
        dog.eat(food);
        Integer actual = dog.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest(){
        //Given
        Integer expected = 0;
        //When
        Integer actual = dog.getId();
        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void instanceOfAnimalTest(){

        Assert.assertTrue(dog instanceof Animal);
    }
    @Test
    public void instanceOfMammalTest(){
        Assert.assertTrue(dog instanceof Mammal);
    }
    }





