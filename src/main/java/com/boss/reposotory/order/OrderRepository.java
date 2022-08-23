package com.boss.reposotory.order;

import com.boss.domain.Order;
import com.boss.reposotory.CRUDRepository;

import java.util.Map;

public interface OrderRepository extends CRUDRepository <Long, Order> {

    Map<String, Object> getMapOfOrder();
}
