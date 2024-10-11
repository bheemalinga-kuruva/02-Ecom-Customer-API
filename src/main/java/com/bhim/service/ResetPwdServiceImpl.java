package com.bhim.service;

import org.springframework.stereotype.Service;

import com.bhim.dto.ResetPassword;
import com.bhim.dto.RestResponse;
import com.bhim.model.Customer;
import com.bhim.repository.CustomerRepository;

@Service
public class ResetPwdServiceImpl implements ResetPwdService{
    
    private CustomerRepository customerRepo;
    public ResetPwdServiceImpl(CustomerRepository customerRepo){
        this.customerRepo=customerRepo;
    }
    
    RestResponse response=new RestResponse();

    Customer customer=new Customer();

    public String  resetPassword(ResetPassword resetPassword){
        System.out.println(resetPassword);
        String response;
        customer=customerRepo.findByEmail(resetPassword.getEmail());
        if(customer==null){
            response="Please enter registered email id";
            System.out.println(response);
            return response;
        }
        if(!resetPassword.getNewPwd().equals(resetPassword.getConfirmNewPwd())){
            response="Passwords must match";
            System.out.println(response);
            return response;


        }else {
            customer.setEmail(customer.getEmail());
            customer.setPassword(resetPassword.getNewPwd());
            customerRepo.save(customer);
            response="Password updated please try to login now";
            System.out.println(response);
            return response;

        }
    }

}
