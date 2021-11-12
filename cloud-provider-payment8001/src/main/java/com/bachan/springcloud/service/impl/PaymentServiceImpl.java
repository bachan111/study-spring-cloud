package com.bachan.springcloud.service.impl;

import com.bachan.springcloud.dao.PaymentDao;
import com.bachan.springcloud.entities.Payment;
import com.bachan.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author bachan
 * @desc
 * @date 2021/11/11
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
