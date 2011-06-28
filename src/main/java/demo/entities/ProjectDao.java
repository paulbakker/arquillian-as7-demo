package demo.entities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ProjectDao {
    @PersistenceContext
    EntityManager em;

    public List<Project> listProject() {
        return em.createQuery("select p from Project p").getResultList();
    }
}
