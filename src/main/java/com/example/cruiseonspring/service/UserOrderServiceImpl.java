package com.example.cruiseonspring.service;

import com.example.cruiseonspring.dto.UserOrderDto;
import com.example.cruiseonspring.entity.User;
import com.example.cruiseonspring.entity.UserOrder;
import com.example.cruiseonspring.mapper.UserOrderMapper;
import com.example.cruiseonspring.repository.UserorderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserOrderServiceImpl implements UserOrderService {
    private final UserorderRepository userorderRepository;
    private final UserOrderMapper userorderMapper;


    @Override
    public List<UserOrderDto> getAllUserOrders(User user) {
        return userorderRepository.findAllByUser(user)
                .stream()
                .map(userorderMapper)
                .collect(Collectors.toList());
    }


    @Override
    public UserOrderDto saveUserOrder(UserOrder userOrder) {
        return userorderMapper.apply(userorderRepository.save(userOrder));
    }

    @Override
    public UserOrderDto updateUserOrder(UserOrder userOrder) {
        return userorderMapper.apply(userorderRepository.save(userOrder));
    }

    @Override
    public void deleteUserOrder(Integer id) {
        userorderRepository.deleteById(id);
    }
}
