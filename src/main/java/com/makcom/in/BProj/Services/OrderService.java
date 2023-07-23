package com.makcom.in.BProj.Services;

import com.makcom.in.BProj.Order.Order;
import com.makcom.in.BProj.RepositoryE.OrderPagingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderPagingRepository repo;

    public List<Order> getAllOrder(Integer pageNo,Integer pageSize)
    {
        Pageable paging = PageRequest.of(pageNo,pageSize);
        Page<Order> pageResult = repo.findAll(paging);
        if(pageResult.hasContent()){
            return  pageResult.getContent();
        }
        else {
            return new ArrayList<Order>();
        }
    }
}
