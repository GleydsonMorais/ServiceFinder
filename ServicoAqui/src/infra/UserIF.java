package infra;

import business.model.User;

/**
 *
 * @author GM
 */
public interface UserIF {
    
    public abstract void addUser(User u) throws Exception;
    public abstract User findUser(String login) throws Exception;
    public abstract void removeUser(String login) throws Exception;
    public abstract void updateUser(User uOld, User uNew) throws Exception;
}
