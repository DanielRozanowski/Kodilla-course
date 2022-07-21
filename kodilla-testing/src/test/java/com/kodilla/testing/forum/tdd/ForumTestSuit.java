package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suit \uD83D\uDE01")
public class ForumTestSuit {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforAllTests(){
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforEveryTests(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    void testAddPost(){
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        forumUser.addPost("mrsmith", "Hello everyone, this is my first contribution here!");
        Assertions.assertEquals(1, forumUser.getPostsQuantity());
    }
    @Test
    void testAddComment(){
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone," + "this is my first contribution here", "mrsmith");

        forumUser.addComment(thePost, "mrsmith", "Thank you for all good words.");

        Assertions.assertEquals(1, forumUser.getCommentsQuantity());
    }
    @Test
    void testGetPost(){
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone," +
                "this is my first contribution here", "mrsmith");
        forumUser.addPost(thePost.getAuthor(),thePost.getPostBody());

        ForumPost retrivedPost;
        retrivedPost = forumUser.getPost(0);

        Assertions.assertEquals(thePost, retrivedPost);

    }
    @Test
    void testGetComment() {

        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        ForumComment retrievedComment = forumUser.getComment(0);

        Assertions.assertEquals(theComment, retrievedComment);
    }

    @Test
    void testRemovePostNotExisting() {

        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");

        boolean result = forumUser.removePost(thePost);

        Assertions.assertFalse(result);
    }
    @Test
    void testRemoveCommentNotExisting() {

        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");

        boolean result = forumUser.removeComment(theComment);

        Assertions.assertFalse(result);
    }
    @Test
    void testRemovePost() {

        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        boolean result = forumUser.removePost(thePost);

        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getPostsQuantity());
    }
    void testRemoveComment() {

        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");
                forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        boolean result = forumUser.removeComment(theComment);

        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getCommentsQuantity());
    }






}
