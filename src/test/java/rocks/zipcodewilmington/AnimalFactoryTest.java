package rocks.zipcodewilmington;

import org.junit.Assert;
import
        org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    Dog dog;
    String name;
    Date birthDate;
    Integer id;

    Cat cat;

    @Before
    public void setUp() {
        name = "Joe";
        Date birthDate = new Date();
        id = 0;

        Dog dog = new Dog(name, birthDate, id);
        Cat cat = new Cat(name, birthDate, id);
    }

    @Test
    public void Testcreatedog() {

        Dog dog = new Dog(name, birthDate, id);
        //Given
        String expectedName = name;
        Date expectedBirthDate = birthDate;
        //When
        AnimalFactory.createDog(expectedName, expectedBirthDate);
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);

    }

    @Test
    public void Testcreatecat() {

        Cat cat = new Cat(name, birthDate, id);
        //Given
        String expectedName = name;
        Date expectedBirthDate = birthDate;
        //When
        AnimalFactory.createCat(expectedName, expectedBirthDate);
        String actualName = cat.getName();
        Date actualBirthDate = cat.getBirthDate();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

}

