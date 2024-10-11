package com.bhim.service;

import org.springframework.stereotype.Service;

import com.bhim.dto.Register;
import com.bhim.model.Customer;
import com.bhim.repository.CustomerRepository;

@Service
public class RegisterServiceImp implements  RegisterService{

    private CustomerRepository customerRepo;

    Customer customer=new Customer();

    public RegisterServiceImp(CustomerRepository customerRepo){
        this.customerRepo=customerRepo;
    }

    public Boolean register(Register register) {
        customer.setEmail(register.getEmail());
        customer.setPassword(register.getPassword());
        customer.setName(register.getName());
        customer.setPhoneNo(register.getPhoneNo());
        customerRepo.save(customer);
        return true;
    }
}
