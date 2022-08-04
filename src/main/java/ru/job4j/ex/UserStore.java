package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
                System.out.println("User " + user.getUsername() + " found.");
                break;
            } else {
                throw new UserNotFoundException("User not found.");
            }
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() >= 3) {
            System.out.println("User " + user.getUsername() + " passed validation.");
            return true;
        } else {
            throw new UserInvalidException("User " + user.getUsername() + " found, but it did not pass validation.");
        }
    }

    public static void main(String[] args) {
        User[] users = {new User("Anton", false)};
        try {
            User user = findUser(users, "An");
            if (validate(user)) {
                System.out.println("This user has in access");
            }
        } catch (UserNotFoundException i) {
            i.printStackTrace();
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        }
    }
}

