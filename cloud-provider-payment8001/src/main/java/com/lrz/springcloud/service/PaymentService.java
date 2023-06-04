package com.lrz.springcloud.service;

import com.lrz.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author L1ENO
 * @create 2023/06/03 - 16:08
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
