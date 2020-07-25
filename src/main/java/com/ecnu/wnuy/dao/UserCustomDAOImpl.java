package com.ecnu.wnuy.dao;

import com.ecnu.wnuy.domain.UserDTO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * @Author Shen Lei
 * @Date 2020/7/23 23:45
 */
public class UserCustomDAOImpl implements UserCustomDAO {

    @PersistenceContext
    EntityManager em;

    @Override
    public UserDTO findUserById(String id) {
        TypedQuery<UserDTO> query = em.createQuery(
                "select new com.ecnu.wnuy.domain.UserDTO(" +
                        "u.id, u.nickname, g.description) from " +
                        "User u, Gender g where u.gender=g.id and u.id=?1", UserDTO.class);
        query.setParameter(1, id);
        return query.getSingleResult();
    }

}
