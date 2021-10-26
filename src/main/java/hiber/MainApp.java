package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import hiber.service.UserServiceImp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      System.out.println(userService.getModelCar("Toyota"));
      System.out.println(userService.getSeries(3));

//      userService.add(new User("Azamat", "Baitashov", "ajsdh@gmail.com", new Car("Toyota", 7)));
//      userService.add(new User("Talant", "Lastname2", "user2@mail.ru", new Car("Honda", 5)));
//      userService.add(new User("Aizhan", "Lastname3", "user3@mail.ru", new Car("Nissan", 3)));
//      userService.add(new User("Sezim", "Lastname4", "user4@mail.ru", new Car("Mitsubishi", 4)));
//      userService.add(new User("Beksultan", "Lastname5", "user4@mail.ru", new Car("Porsche", 2)));
//
//
//
//      List<User> users = userService.listUsers();
//      for (User user : users) {
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         System.out.println();
//      }

      context.close();
   }
}
