package spring.forum;

import forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForumUserTestSuite {
    @Test
    public void testGetUsername() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(".spring");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String username = forumUser.getUsername();
        //Then
        Assert.assertEquals("John Smith", username);
    }

}
