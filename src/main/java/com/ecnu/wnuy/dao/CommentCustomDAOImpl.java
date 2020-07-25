package com.ecnu.wnuy.dao;

import com.ecnu.wnuy.domain.CommentDTO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @Author Shen Lei
 * @Date 2020/7/24 0:29
 */
public class CommentCustomDAOImpl implements CommentCustomDAO {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<CommentDTO> findCommentsByResturantId(String id) {
        TypedQuery<CommentDTO> query = em.createQuery(
                "select new com.ecnu.wnuy.domain.CommentDTO(" +
                   "c.id, c.userId, c.resturantId, c.rating, c.content, c.parentId, u.nickname) " +
                   "from Comment c, User u where c.userId=u.id and c.resturantId=?1 and c.parentId=-1", CommentDTO.class);
        query.setParameter(1, id);
        return query.getResultList();
    }

    @Override
    public List<CommentDTO> findCommentsById(int id) {
        TypedQuery<CommentDTO> query = em.createQuery(
                "select new com.ecnu.wnuy.domain.CommentDTO(" +
                        "c.id, c.userId, c.resturantId, c.rating, c.content, c.parentId, u.nickname) " +
                        "from Comment c, User u where c.userId=u.id and c.id=?1", CommentDTO.class);
        query.setParameter(1, id);
        return query.getResultList();
    }

}
