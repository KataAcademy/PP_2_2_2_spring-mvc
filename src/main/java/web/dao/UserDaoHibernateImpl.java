package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoHibernateImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User updateUser(int id, User updatedUser) {
        User userToBeUpdated = getUserById(id);
        userToBeUpdated.setFirstName(updatedUser.getFirstName());
        userToBeUpdated.setLastName(updatedUser.getLastName());
        userToBeUpdated.setEmail(updatedUser.getEmail());
        return entityManager.merge(userToBeUpdated);
    }

    @Override
    public void deleteUser(int id) {
        entityManager.remove(getUserById(id));
    }
}
