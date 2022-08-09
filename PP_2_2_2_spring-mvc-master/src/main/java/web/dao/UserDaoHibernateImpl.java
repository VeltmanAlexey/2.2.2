package web.dao;

import org.springframework.stereotype.Component;
import web.Model.User;

import javax.persistence.EntityManager;

import java.util.List;
@Component
public class UserDaoHibernateImpl implements UserDAO {

    public EntityManager em;

    public List<User> getUsers() {
        return em.createQuery("SELECT u FROM User u",User.class).getResultList();
    }

    public User getById(int id) {
        return em.find(User.class,id);

    }

    public void save(User user){
        em.persist(user);
    }

    public void update(int id, User newUser) {
        em.merge(newUser);

    }

    public void delete(int id){
        em.remove(getById(id));
    }
}
