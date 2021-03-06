package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {

    @BeforeEach
    public void befor(){
        System.out.println("Test Case: Began");
    }
    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suite: began");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Test Suite: end");
    }
    @DisplayName(
            "When created SimpleUser with name, " +
                    "then getUsername should return correct name"
    )
    @Test
    void testCaseUsername(){


        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Adam Smith");

        //When
        String result = simpleUser.getUserName();

        String expectedResult = "theForumUser";

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName(
            "When created SimpleUser with realName, " +
             "then getUsername should return correct realName"
    )

    @Test
    void testCaseRealname(){


        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Adam Smith");

        //When
        String result = simpleUser.getRealName();

        String expectedResult = "Adam Smith";

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}


