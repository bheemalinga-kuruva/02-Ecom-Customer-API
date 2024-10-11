package com.bhim.service;

import org.springframework.stereotype.Service;

import com.bhim.dto.Login;
import com.bhim.model.Customer;
import com.bhim.repository.CustomerRepository;

@Service
public class LoginServiceImpl implements LoginService{

    private CustomerRepository customerRepo;

    public LoginServiceImpl(CustomerRepository customerRepo){
        this.customerRepo=customerRepo;
    }

    @Override
    public Login loginHandle(Login login) {
        Customer customer=customerRepo.findByEmailAndPassword(login.getEmail(),login.getPassword());
        Login login1=new Login();
        if(customer!=null){
            login1.setEmail(customer.getEmail());
            login1.setPassword(customer.getPassword());
            return login1;
        }
        System.out.println(login1.getEmail()+" "+login1.getPassword());
        return login1;
    }
}
