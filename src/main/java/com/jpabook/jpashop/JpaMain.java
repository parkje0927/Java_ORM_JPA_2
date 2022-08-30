package com.jpabook.jpashop;

import com.jpabook.jpashop.domain.Order;
import com.jpabook.jpashop.domain.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager(); //db connection 하나 받아왔다고 생각하면 된다.

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            //대략 수도 코드
            Order order = new Order();
            order.addOrderItem(new OrderItem());
            //단방향 코드를 잘 사용하도록 하자!!! 필요시 양방향 관계로 하기



            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
