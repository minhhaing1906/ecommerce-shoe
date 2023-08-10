package com.minhhaing.application.service.impl;//package com.minhhaing.application.service.impl;
//
//import com.minhhaing.application.entity.Product;
//import com.minhhaing.application.entity.Rate;
//import com.minhhaing.application.entity.User;
//import com.minhhaing.application.exception.InternalServerException;
//import com.minhhaing.application.model.request.CreateRateProductRequest;
//import com.minhhaing.application.repository.ProductRepository;
//import com.minhhaing.application.repository.RateRepository;
//import com.minhhaing.application.service.RateService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.sql.Timestamp;
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class RateServiceImpl implements RateService {
//
//    @Autowired
//    private RateRepository rateRepository;
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Override
//    public Rate createRate(CreateRateProductRequest createRateProductRequest, long userId) {
//        Rate rate = new Rate();
//        rate.setRating(createRateProductRequest.getRate());
//        rate.setCreatedAt(new Timestamp(System.currentTimeMillis()));
//        Product product = new Product();
//        product.setId(createRateProductRequest.getProductId());
//        rate.setProduct(product);
//        User user = new User();
//        user.setId(userId);
//        rate.setUser(user);
//        try {
//            rateRepository.save(rate);
//        }catch (Exception e){
//            throw new InternalServerException("Có lỗi khi đánh giá");
//        }
//        return rate;
//    }
//
//}
