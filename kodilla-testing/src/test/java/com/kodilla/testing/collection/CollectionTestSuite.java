package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.*;

public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeAll
    public  static void beforeAll(){
        System.out.println("All Tests begin");
    }
    @AfterAll
    public  static void afterAll(){
        System.out.println("All Tests Complite");
    }
    @DisplayName(
            "When created emptyList, " +
                    "then oddNumbersExterminator should return emptyList"
    )
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddnumbersexterminator = new OddNumbersExterminator();
        //When
        List<Integer> myList = oddnumbersexterminator.exterminate(new ArrayList<Integer>());
        //Then
        Assertions.assertEquals(new ArrayList<Integer>(), myList);


    }
    @DisplayName(
            "When created NormalList, " +
                    "then oddNumbersExterminator should return even"
    )

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddnumbersexterminator = new OddNumbersExterminator();
        //When
        List<Integer> myList = oddnumbersexterminator.exterminate(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)));
        //Then
        Assertions.assertEquals(new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8)), myList);
    }
}
