package seminars.third.tdd;

import org.junit.jupiter.api.Test;
import seminars.third.hw.SomeService;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
class UserTest {
    @Test
    void checkNotAddUser() {
        User user = new User("Ivan", "123", false);
        user.authenticate("Ivan", "111");
        assertThat(user.isAuthenticate == false);
    }

    @Test
    void checkAddUser() {
        User user = new User("Ivan", "123", false);
        user.authenticate("Ivan", "123");
        assertThat(user.isAuthenticate == false);
    }
    @Test
    void checkAuthUser() {
        User user = new User("Ivan", "123", false);
        user.authenticate("Ivan", "123");
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(user);
        assertThat(userRepository.findByName("Ivan"));
    }
    @Test
    void checkNotAuthUser() {
        User user = new User("Ivan", "123", false);
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(user);
        assertThat(userRepository.findByName("Ivan") == false);
    }
    @Test
    void checkOutUserToAdmin() {
        User user1 = new User("Ivan", "123", false);
        user1.authenticate("Ivan", "123");
        User user2 = new User("Admin", "741", true);
        user2.authenticate("Admin", "741");
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.outForUsers();
        assertThat(userRepository.findByName("Ivan") == false && userRepository.findByName("Admin") == true);
    }
    @Test
    void checkOutUserNotAdmin() {
        User user1 = new User("Ivan", "123", false);
        user1.authenticate("Ivan", "123");
        User user2 = new User("Admin", "741", false);
        user2.authenticate("Admin", "741");
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.outForUsers();
        assertThat(userRepository.findByName("Ivan") == true);
    }
}