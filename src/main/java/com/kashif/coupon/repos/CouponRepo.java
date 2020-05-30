package com.kashif.coupon.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kashif.coupon.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
