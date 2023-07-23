package com.makcom.in.BProj.RepositoryE;

import com.makcom.in.BProj.Order.Order;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderPagingRepository extends PagingAndSortingRepository<Order,Integer> {
}
