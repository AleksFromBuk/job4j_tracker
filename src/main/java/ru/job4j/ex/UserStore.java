package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] user, String login) throws UserNotFoundException {
        for (int i = 0; i < user.length; i++) {
            if (user[i].getUsername().equals(login)) {
                return user[i];
            }
        }
        throw new UserInvalidException("user not found...");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValide() || user.getUsername().length() < 3) {
            throw new UserInvalidException("user not valid...");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an acces");
            }
        } catch (UserInvalidException l) {
            l.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
