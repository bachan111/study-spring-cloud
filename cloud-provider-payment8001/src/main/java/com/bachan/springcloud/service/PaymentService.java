package com.bachan.springcloud.service;

import com.bachan.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author bachan
 * @desc
 * @date 2021/11/11
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
