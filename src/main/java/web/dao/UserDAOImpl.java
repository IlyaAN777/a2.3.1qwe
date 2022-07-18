package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.models.User;
import web.service.UserService;
import web.service.UserServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@Transactional
public class UserDAOImpl implements UserDAO {
@PersistenceContext
private EntityManager entityManager;
    @Override
    public List<User> getAllUsers() {

        return entityManager.createQuery("select a from User a", User.class).getResultList();
    }
}
