package com.lrz.springcloud.service.impl;

import com.lrz.springcloud.dao.PaymentDao;

import com.lrz.springcloud.service.PaymentService;
import com.lrz.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author L1ENO
 * @create 2023/06/03 - 16:08
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
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
